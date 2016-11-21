package com.way.wayFramewk.privilege.provider.dao.extend;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.way.wayFramewk.privilege.entity.SysUser;

@Repository
public interface SysUserExtendMapper {
	// List<SysUser> selectByPage(@Param("page") Pagination<SysUser> page,
	// @Param("info") SysUser info);

	List<SysUser> selectListByDept(@Param("deptId") Long deptId);
}