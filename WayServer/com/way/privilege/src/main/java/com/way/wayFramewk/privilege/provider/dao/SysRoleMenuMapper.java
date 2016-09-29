package com.way.wayFramewk.privilege.provider.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.way.wayFramewk.privilege.entity.SysRoleMenu;
import com.way.wayFramewk.privilege.entity.SysRoleMenuExample;

@Repository
public interface SysRoleMenuMapper {

	int delete(SysRoleMenu record);

	int insert(SysRoleMenu record);

	List<SysRoleMenu> selectByExample(SysRoleMenuExample example);

}