package com.way.wayFramewk.privilege.service;

import java.util.List;

import com.way.framework.model.Pagination;
import com.way.wayFramewk.privilege.entity.SysUser;

public interface SysUserService {
	/* base CRUD start */
	Pagination<SysUser> findByPage(Pagination<SysUser> page, SysUser record);

	SysUser getById(Long id);

	SysUser save(SysUser record);

	SysUser update(SysUser record);

	Long delete(Long id);
	/* base CRUD end */

	/**
	 * 部门下所有用户
	 * 
	 * @param deptId
	 * @return
	 */
	List<SysUser> getUsersByDeptId(Long deptId);

	/**
	 * 创建用户,分配角色
	 * 
	 * @param record
	 * @param has
	 * @param hasnot
	 */
	SysUser save(SysUser record, List<Long> has, List<Long> hasnot);

	/**
	 * 修改用户,分配角色
	 * 
	 * @param record
	 * @param has
	 * @param hasnot
	 */
	SysUser update(SysUser record, List<Long> has, List<Long> hasnot);
}