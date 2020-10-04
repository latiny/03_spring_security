package cn.latiny.security;

import cn.latiny.security.constant.SecurityConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;

/**
 * @author Latiny
 * @description TODO
 * @create_time 2020-09-26 11:45
 * @since 1.0
 */
@Configuration
@EnableWebSecurity
public class CustomWebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private CustomUserDetailsService customUserDetailsService;
    @Autowired
    private CustomAuthenticationFailureHandler customAuthenticationFailureHandler;
    @Autowired
    private CustomAccessDecisionManager customAccessDecisionManager;
    @Autowired
    private CustomFilterInvocationSecurityMetadataSource customFilterInvocationSecurityMetadataSource;
    @Autowired
    private CustomAccessDeniedHandler customAccessDeniedHandler;
    @Autowired
    private CustomAuthenticationSuccessHandler customAuthenticationSuccessHandler;
    @Autowired
    private CustomAuthenticationProvider customAuthenticationProvider;

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().passwordEncoder(new MyPasswordEncode())
//                .withUser("user").password(new MyPasswordEncode().encode("abc123")).roles("USER")
//                .and()
//                .withUser("admin").password(new MyPasswordEncode().encode("abc123456")).roles("ADMIN");
        auth.userDetailsService(customUserDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 无需校验的url
        for (String path : SecurityConstant.NO_LIMITS) {
            http.authorizeRequests().antMatchers(path).permitAll();
        }

        // // 关闭CSRF跨域
        http.csrf().disable();
        http.authorizeRequests().withObjectPostProcessor(new ObjectPostProcessor<FilterSecurityInterceptor>() {
            @Override
            public <O extends FilterSecurityInterceptor> O postProcess(O object) {
                object.setSecurityMetadataSource(customFilterInvocationSecurityMetadataSource);
                object.setAccessDecisionManager(customAccessDecisionManager);
                return object;
            }
        });
        http.authorizeRequests().anyRequest().authenticated();
        http.formLogin().loginPage("/login")
                .failureHandler(customAuthenticationFailureHandler)
                .successHandler(customAuthenticationSuccessHandler)
                .defaultSuccessUrl("/index").permitAll()
        .and().exceptionHandling().accessDeniedHandler(customAccessDeniedHandler)
        .and().authenticationProvider(customAuthenticationProvider);
    }

}
