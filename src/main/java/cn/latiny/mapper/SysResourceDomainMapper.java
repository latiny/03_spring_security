package cn.latiny.mapper;

import cn.latiny.domain.SysResourceDomain;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysResourceDomainMapper extends MyMapper<SysResourceDomain> {

    SysResourceDomain findResourceByUrl(String url);
}