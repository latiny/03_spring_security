package cn.latiny.service;

import cn.latiny.domain.SysResourceDomain;

/**
 * @author : Latiny
 * @description : TODO
 * @date : 2020/9/28 12:00
 * @since 1.0.0
 **/
public interface SysResourceService {

    SysResourceDomain findResourceByUrl(String url);
}
