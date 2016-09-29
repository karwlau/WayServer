package com.way.wayFramewk.privilege.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.way.wayFramewk.privilege.entity.SysRoleMenu;
import com.way.wayFramewk.privilege.provider.dao.SysRoleMenuMapper;
import com.way.wayFramewk.privilege.service.SysRoleMenuService;

@Service("sysRoleMenuService")
public class SysRoleMenuServiceImpl implements SysRoleMenuService {
	@Resource
	private SysRoleMenuMapper sysRoleMenuMapper;

	@Override
	public SysRoleMenu save(SysRoleMenu record) {
		sysRoleMenuMapper.insert(record);
		return record;
	}

	@Override
	public SysRoleMenu delete(SysRoleMenu record) {
		sysRoleMenuMapper.delete(record);
		return record;
	}
}