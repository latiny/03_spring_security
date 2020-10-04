package cn.latiny.security;

import cn.latiny.domain.SysRoleDomain;
import cn.latiny.domain.SysUserDomain;
import cn.latiny.service.SysRoleService;
import cn.latiny.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Latiny
 * @description TODO
 * @create_time 2020-09-26 20:48
 * @since 1.0
 */
@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private SysUserService userService;
    @Autowired
    private SysRoleService roleService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUserDomain user = userService.findUserByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("用户不存在: " + username);
        }
        List<SysRoleDomain> roles = roleService.findRolesByUserName(username);
        return new CustomUserDetails(user, roles);
    }
}
