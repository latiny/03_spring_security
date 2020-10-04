package cn.latiny.service;

import cn.latiny.domain.SysRoleDomain;

import java.util.List;

/**
 * @author Latiny
 * @description TODO
 * @create_time 2020-09-26 20:51
 * @since 1.0
 */
public interface SysRoleService {

    List<SysRoleDomain> findRolesByUserName(String userName);

    List<SysRoleDomain> findRolesByResourceId(Long resouceId);
}
