package com.way.wayFramewk.privilege.service;

import java.util.List;

import com.way.framework.model.Pagination;
import com.way.wayFramewk.privilege.entity.SysMenu;
import com.way.wayFramewk.privilege.entity.SysRoleMenu;

public interface SysMenuService {

	/* base CRUD start */
	Pagination<SysMenu> findByPage(Pagination<SysMenu> page, SysMenu record);

	SysMenu getById(Long id);

	SysMenu save(SysMenu record);

	SysMenu update(SysMenu record);

	Long delete(Long id);
	/* base CRUD end */

	/**
	 * 所有系统
	 * 
	 * @return
	 */
	List<SysMenu> getSysList();

	/**
	 * 所有系统(用户权限)
	 * 
	 * @return
	 */
	List<SysMenu> getSysListForUser(Long userId);

	/**
	 * 加载下级菜单-扩展
	 * 
	 * @param parentId
	 * @return
	 */
	List<SysMenu> getListByParentId(Long parentId);

	/**
	 * 加载下级菜单-扩展(用户权限)
	 * 
	 * @param parentId
	 * @param userId
	 * @return
	 */
	List<SysMenu> getListByParentIdForUser(Long parentId, Long userId);

	/**
	 * 系统所有菜单
	 * 
	 * @param sysId
	 * @return
	 */
	List<SysMenu> getListBySysId(Long sysId);

	/**
	 * 系统所有菜单(用户权限)
	 * 
	 * @param sysId
	 * @param userId
	 * @return
	 */
	List<SysMenu> getListBySysIdForUser(Long sysId, Long userId);

	/**
	 * 角色分配检查
	 * 
	 * @param menuId
	 * @return
	 */
	boolean existsRoleForMenu(Long menuId);

	/**
	 * 权限检查过滤
	 * 
	 * @param menuList
	 * @param userId
	 * @return
	 */
	List<SysMenu> privilegeCheck(List<SysMenu> menuList, Long userId);

	/**
	 * 分配权限
	 * 
	 * @param menuList
	 * @param roleId
	 */
	void dividePriv(List<SysMenu> menuList, Long roleId);

	/**
	 * 角色权限
	 * @param roleId
	 * @return
	 */
	List<SysRoleMenu> findRoleMenuByRoleId(Long roleId);


	/**
	 * 分配权限
	 * 
	 * @param roleId
	 * @param has
	 * @param hasnot
	 */
	void duelRoleMenu(Long roleId, List<Long> has, List<Long> hasnot);

	/**
	 * 删除角色清空权限
	 * @param roleId
	 */
	void deleteRoleMenuByRoleId(Long roleId);
}