package com.way.wayFramewk.privilege.provider.dao.extend;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.way.wayFramewk.privilege.entity.SysRole;

@Repository
public interface SysRoleExtendMapper {
	// List<SysRole> selectByPage(@Param("page") Pagination<SysRole> page,
	// @Param("info") SysRole info);

	List<SysRole> selectListByUser(@Param("userId") Long userId);
}