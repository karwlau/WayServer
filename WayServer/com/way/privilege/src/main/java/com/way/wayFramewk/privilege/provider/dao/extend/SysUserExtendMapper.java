package com.way.wayFramewk.privilege.provider.dao.extend;

import com.way.framework.model.Pagination;
import com.way.wayFramewk.privilege.entity.SysUser;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserExtendMapper {
    List<SysUser> selectByPage(@Param("page") Pagination<SysUser> page, @Param("info") SysUser info);
}