package cn.latiny.service.impl;

import cn.latiny.domain.SysUserDomain;
import cn.latiny.mapper.SysUserDomainMapper;
import cn.latiny.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : Latiny
 * @description : TODO
 * @date : 2020/9/28 9:36
 * @since 1.0.0
 **/
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDomainMapper sysUserDomainMapper;

    @Override
    public List<SysUserDomain> findAll() {
        return null;
    }

    @Override
    public SysUserDomain findUserByUsername(String username) {
        return sysUserDomainMapper.findUserByUsername(username);
    }
}
