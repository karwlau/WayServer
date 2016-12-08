package com.way.wayFramewk.privilege.service;

import java.util.List;

import com.github.pagehelper.Page;
import com.way.wayFramewk.privilege.entity.SysDict;

public interface SysDictService {
	Page<SysDict> findByPage(Page<SysDict> page, SysDict record);

	SysDict getById(Long id);

	SysDict save(SysDict record);

	SysDict update(SysDict record);

	Long delete(Long id);

	List<SysDict> getListByParentId(Long pid);

	SysDict update(SysDict record, String oldCode);

	List<SysDict> findListByCode(String parentCode);

}