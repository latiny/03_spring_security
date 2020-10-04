package cn.latiny.security;

import cn.latiny.domain.SysResourceDomain;
import cn.latiny.domain.SysRoleDomain;
import cn.latiny.exception.BusinessException;
import cn.latiny.security.constant.SecurityConstant;
import cn.latiny.service.SysResourceService;
import cn.latiny.service.SysRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author : Latiny
 * @description : TODO
 * @date : 2020/9/28 11:50
 * @since 1.0.0
 **/
@Component
public class CustomFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {

    Logger logger = LoggerFactory.getLogger(CustomFilterInvocationSecurityMetadataSource.class);

    @Autowired
    private SysResourceService sysResourceService;
    @Autowired
    private SysRoleService sysRoleService;

    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        // 获取用户请求的URL
        String requestUrl = ((FilterInvocation) object).getRequestUrl();
        List<String> strNoLimits = Arrays.asList(SecurityConstant.NO_LIMITS);
        if (strNoLimits.contains(requestUrl)) {
            return null;
        }
        SysResourceDomain resource = sysResourceService.findResourceByUrl(requestUrl);
        // url匹配不到资源，则禁止访问
        if (resource == null) {
            logger.error("Request url: {}, isn't configured", requestUrl);
            throw new BusinessException(101, "url未配置");
        }
        List<SysRoleDomain> roles = sysRoleService.findRolesByResourceId(resource.getId());
        int size = (roles == null ? 0 : roles.size());
        String[] values = new String[size];
        for (int i = 0; i < size; i++) {
            values[i] = roles.get(i).getRoleName();
        }
        return SecurityConfig.createList(values);
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }
}
