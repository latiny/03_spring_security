package cn.latiny.security;

import cn.latiny.exception.BusinessException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * @author : Latiny
 * @description : TODO
 * @date : 2020/10/3 11:53
 * @since 1.0.0
 **/
@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {
    Logger logger = LoggerFactory.getLogger(CustomAuthenticationProvider.class);

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = (String) authentication.getCredentials();
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            logger.warn("username or password was empty.");
            throw new BusinessException(102, "用户名或密码错误");
        }
        if (!"123456".equals(password)) {
            throw new BusinessException(102, "用户名或密码错误");
        }
        return null;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
    }
}
