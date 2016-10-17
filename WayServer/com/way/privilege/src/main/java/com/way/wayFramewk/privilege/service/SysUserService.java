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
}