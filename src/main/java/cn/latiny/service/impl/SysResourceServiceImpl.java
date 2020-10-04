package cn.latiny.service.impl;

import cn.latiny.domain.SysResourceDomain;
import cn.latiny.mapper.SysResourceDomainMapper;
import cn.latiny.service.SysResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : Latiny
 * @description : TODO
 * @date : 2020/9/28 15:01
 * @since 1.0.0
 **/
@Service
public class SysResourceServiceImpl implements SysResourceService {

    @Autowired
    private SysResourceDomainMapper sysResourceDomainMapper;

    @Override
    public SysResourceDomain findResourceByUrl(String url) {
        return sysResourceDomainMapper.findResourceByUrl(url);
    }
}
