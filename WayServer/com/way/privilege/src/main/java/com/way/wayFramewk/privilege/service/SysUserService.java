package com.way.wayFramewk.privilege.service;

import com.way.framework.model.Pagination;
import com.way.wayFramewk.privilege.entity.SysUser;

public interface SysUserService {
	Pagination<SysUser> findByPage(Pagination<SysUser> page, SysUser record);

	SysUser getById(Long id);

	SysUser save(SysUser record);

	SysUser update(SysUser record);

	Long delete(Long id);
}