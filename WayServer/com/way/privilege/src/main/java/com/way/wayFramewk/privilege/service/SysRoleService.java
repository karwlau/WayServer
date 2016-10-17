package com.way.wayFramewk.privilege.service;

import java.util.List;

import com.way.framework.model.Pagination;
import com.way.wayFramewk.privilege.entity.SysRole;

public interface SysRoleService {
	/* base CRUD start */
	Pagination<SysRole> findByPage(Pagination<SysRole> page, SysRole record);

	SysRole getById(Long id);

	SysRole save(SysRole record);

	SysRole update(SysRole record);

	Long delete(Long id);
	/* base CRUD start */

	/**
	 * 是否存在用户持有该角色
	 * 
	 * @param roleId
	 * @return
	 */
	boolean existsUser(Long roleId);

	/**
	 * 用户拥有角色列表
	 * 
	 * @param userId
	 * @return
	 */
	List<SysRole> getRolesForUser(Long userId);

	/**
	 * 对用户分配角色
	 * @param roleList
	 * @param userId
	 */
	void divideRole(List<SysRole> roleList, Long userId);

}