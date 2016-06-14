package com.way.framewk.privilege.provider.service;

import java.util.List;

import com.way.framewk.privilege.entity.SysMenu;

public interface MenuService {
	public SysMenu findById(Long id);

	public List<SysMenu> findByCondition(SysMenu condition);

	public SysMenu save(SysMenu record);

	public SysMenu save(SysMenu record, Long userId);

	public void delete(SysMenu record);

	public void deleteById(Long id);

	public void updateByCondition(SysMenu udpate, SysMenu condition);

	public void updateById(SysMenu update, Long id);

}
