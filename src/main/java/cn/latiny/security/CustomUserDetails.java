package cn.latiny.security;

import cn.latiny.domain.SysRoleDomain;
import cn.latiny.domain.SysUserDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Latiny
 * @description TODO
 * @create_time 2020-09-26 20:44
 * @since 1.0
 */
@Component
public class CustomUserDetails implements UserDetails {

    private String username;
    private String password;
    private List<SysRoleDomain> roles;

    public CustomUserDetails() {

    }

    public CustomUserDetails(SysUserDomain user) {
        this.username = user.getUserName();
        this.password = user.getPassword();
    }

    public CustomUserDetails(SysUserDomain user, List<SysRoleDomain> roles) {
        this.username = user.getUserName();
        this.password = user.getPassword();
        this.roles = roles;
    }

    public void setRoles(List<SysRoleDomain> roles) {
        this.roles = roles;
    }

    public List<SysRoleDomain> getRoles(){
        return roles;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        for (SysRoleDomain role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
