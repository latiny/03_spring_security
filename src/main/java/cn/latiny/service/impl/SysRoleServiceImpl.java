package cn.latiny.service.impl;

import cn.latiny.domain.SysRoleDomain;
import cn.latiny.mapper.SysRoleDomainMapper;
import cn.latiny.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Latiny
 * @description : TODO
 * @date : 2020/9/28 9:53
 * @since 1.0.0
 **/
@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleDomainMapper sysRoleDomainMapper;

    @Override
    public List<SysRoleDomain> findRolesByUserName(String userName) {
        return sysRoleDomainMapper.findRolesByUserName(userName);
    }

    @Override
    public List<SysRoleDomain> findRolesByResourceId(Long resourceId) {
        return sysRoleDomainMapper.findRolesByResourceId(resourceId);
    }
}
