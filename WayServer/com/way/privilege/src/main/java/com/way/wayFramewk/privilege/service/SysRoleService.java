package com.way.wayFramewk.privilege.service;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;
import com.way.wayFramewk.privilege.entity.SysRole;
import com.way.wayFramewk.privilege.entity.SysUserRole;

public interface SysRoleService {
	/* base CRUD start */
	Page<SysRole> findByPage(Page<SysRole> page, SysRole record);

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
	 * 
	 * @param roleList
	 * @param userId
	 */
	void divideRole(List<SysRole> roleList, Long userId);

	/**
	 * 新增角色,分配权限
	 * 
	 * @param record
	 * @param has
	 * @param hasnot
	 */
	void save(SysRole record, List<Long> has, List<Long> hasnot);

	/**
	 * 更新角色,分配权限
	 * 
	 * @param record
	 * @param has
	 * @param hasnot
	 */
	void update(SysRole record, List<Long> has, List<Long> hasnot);

	/**
	 * 所有数据
	 * 
	 * @param record
	 * @return
	 */
	List<SysRole> findList(SysRole record);

	/**
	 * 删除用户,清空权限
	 * @param userId
	 */
	void deleteUserRoleByUserId(Long userId);
	
	/**
	 * 分配权限
	 * 
	 * @param userId
	 * @param has
	 * @param hasnot
	 */
	void duelUserRole(Long userId, List<Long> has, List<Long> hasnot);

	/**
	 * 用户角色
	 * @param userId
	 * @return
	 */
	List<SysUserRole> findUserRoleByUserId(Long userId);

	/**
	 * 所有用户角色
	 * @return
	 */
	List<SysUserRole> getAllUserRole();

	/**
	 * 所有用户角色
	 * @return
	 */
	Map<Long, List<Long>> getAllUserRoleMap();

}