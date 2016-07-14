package com.way.wayFramewk.service.impl;

public class SysMenuServiceImpl {

	public Pagination findByPage(Pagination page, SysMenu info) {
		List<SysMenu> list = SysMenuService.selectByPage(page, example);
		page.setList(list);
		return page;
	}

	public abstract SysMenu getById(Long id);

	public abstract SysMenu save(SysMenu record);

	public abstract SysMenu update(SysMenu record);

	public abstract Long delete(Long id);
}