package com.way.wayFramewk.privilege.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.way.framework.model.Pagination;
import com.way.wayFramewk.privilege.entity.SysRole;
import com.way.wayFramewk.privilege.provider.dao.SysRoleMapper;
import com.way.wayFramewk.privilege.provider.dao.extend.SysRoleExtendMapper;
import com.way.wayFramewk.privilege.service.SysRoleService;

@Service("sysRoleService")
public class SysRoleServiceImpl implements SysRoleService {
	@Resource
	private SysRoleMapper sysRoleMapper;

	@Resource
	private SysRoleExtendMapper sysRoleExtendMapper;

	@Override
	public Pagination<SysRole> findByPage(Pagination<SysRole> page, SysRole record) {
		List<SysRole> list = sysRoleExtendMapper.selectByPage(page, record);
		page.setList(list);
		return page;
	}

	@Override
	public SysRole getById(Long id) {
		return sysRoleMapper.selectByPrimaryKey(id);
	}

	@Override
	public SysRole save(SysRole record) {
		Date now = new Date();
		record.setIsDelete(false);
		record.setCreateTime(now);
		record.setUpdateTime(now);
		sysRoleMapper.insertSelective(record);
		return record;
	}

	@Override
	public SysRole update(SysRole record) {
		Date now = new Date();
		record.setUpdateTime(now);
		sysRoleMapper.updateByPrimaryKeySelective(record);
		return record;
	}

	@Override
	public Long delete(Long id) {
		Date now = new Date();
		SysRole update = new SysRole();
		update.setId(id);
		update.setUpdateTime(now);
		update.setIsDelete(true);
		sysRoleMapper.updateByPrimaryKeySelective(update);
		return id;
	}
}