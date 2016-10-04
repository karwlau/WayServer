package com.way.wayFramewk.privilege.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.way.framework.model.Pagination;
import com.way.wayFramewk.privilege.entity.SysMenu;
import com.way.wayFramewk.privilege.provider.dao.SysMenuMapper;
import com.way.wayFramewk.privilege.provider.dao.extend.SysMenuExtendMapper;
import com.way.wayFramewk.privilege.service.SysMenuService;

@Service("sysMenuService")
public class SysMenuServiceImpl implements SysMenuService {
	@Resource
	private SysMenuMapper sysMenuMapper;

	@Resource
	private SysMenuExtendMapper sysMenuExtendMapper;

	@Override
	public Pagination<SysMenu> findByPage(Pagination<SysMenu> page, SysMenu record) {
		List<SysMenu> list = sysMenuExtendMapper.selectByPage(page, record);
		page.setList(list);
		return page;
	}

	@Override
	public SysMenu getById(Long id) {
		return sysMenuMapper.selectByPrimaryKey(id);
	}

	@Override
	public SysMenu save(SysMenu record) {
		Date now = new Date();
		record.setIsDelete(false);
		record.setCreateTime(now);
		record.setUpdateTime(now);
		sysMenuMapper.insertSelective(record);
		return record;
	}

	@Override
	public SysMenu update(SysMenu record) {
		Date now = new Date();
		record.setUpdateTime(now);
		sysMenuMapper.updateByPrimaryKeySelective(record);
		return record;
	}

	@Override
	public Long delete(Long id) {
		Date now = new Date();
		SysMenu update = new SysMenu();
		update.setId(id);
		update.setUpdateTime(now);
		update.setIsDelete(true);
		sysMenuMapper.updateByPrimaryKeySelective(update);
		return id;
	}
}