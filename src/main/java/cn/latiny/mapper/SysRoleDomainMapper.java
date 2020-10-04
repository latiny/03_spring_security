package cn.latiny.mapper;

import cn.latiny.domain.SysRoleDomain;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysRoleDomainMapper extends MyMapper<SysRoleDomain> {

    List<SysRoleDomain> findRolesByUserName(String userName);

    List<SysRoleDomain> findRolesByResourceId(Long resourceId);
}