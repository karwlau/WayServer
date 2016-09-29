package com.way.wayFramewk.privilege.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.way.wayFramewk.privilege.entity.SysUserRole;
import com.way.wayFramewk.privilege.provider.dao.SysUserRoleMapper;
import com.way.wayFramewk.privilege.service.SysUserRoleService;

@Service("sysUserRoleService")
public class SysUserRoleServiceImpl implements SysUserRoleService {
	@Resource
	private SysUserRoleMapper sysUserRoleMapper;

	@Override
	public SysUserRole save(SysUserRole record) {
		sysUserRoleMapper.insert(record);
		return record;
	}

	@Override
	public SysUserRole delete(SysUserRole record) {
		sysUserRoleMapper.delete(record);
		return record;
	}
}