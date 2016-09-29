package com.way.wayFramewk.privilege.provider.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.way.wayFramewk.privilege.entity.SysUserRole;
import com.way.wayFramewk.privilege.entity.SysUserRoleExample;

@Repository
public interface SysUserRoleMapper {

	int delete(SysUserRole record);

	int insert(SysUserRole record);

	List<SysUserRole> selectByExample(SysUserRoleExample example);

}