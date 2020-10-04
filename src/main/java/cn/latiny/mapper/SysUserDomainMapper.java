package cn.latiny.mapper;

import cn.latiny.domain.SysUserDomain;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysUserDomainMapper extends MyMapper<SysUserDomain> {

    SysUserDomain findUserByUsername(String username);
}