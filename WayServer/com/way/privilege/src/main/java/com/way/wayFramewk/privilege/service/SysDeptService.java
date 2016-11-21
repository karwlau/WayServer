package com.way.wayFramewk.privilege.service;

import com.github.pagehelper.Page;
import com.way.wayFramewk.privilege.entity.SysDept;

public interface SysDeptService {
	/* base CRUD start */
	Page<SysDept> findByPage(Page<SysDept> page, SysDept record);

	SysDept getById(Long id);

	SysDept save(SysDept record);

	SysDept update(SysDept record);

	Long delete(Long id);
	/* base CRUD start */

	/**
	 * 部门下是否存在用户
	 * 
	 * @param deptId
	 * @return
	 */
	boolean existsUser(Long deptId);

	/**
	 * 对用户分配部门
	 * 
	 * @param deptId
	 * @param userId
	 * @param isHead
	 */
	void divideDept(Long deptId, Long userId, boolean isHead);
}