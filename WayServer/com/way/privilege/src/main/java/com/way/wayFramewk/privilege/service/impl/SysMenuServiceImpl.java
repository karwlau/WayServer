package com.way.wayFramewk.privilege.service.impl;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.way.framework.model.Pagination;
import com.way.wayFramewk.privilege.constant.Constants;
import com.way.wayFramewk.privilege.entity.SysMenu;
import com.way.wayFramewk.privilege.entity.SysMenuExample;
import com.way.wayFramewk.privilege.entity.SysRoleMenu;
import com.way.wayFramewk.privilege.entity.SysRoleMenuExample;
import com.way.wayFramewk.privilege.provider.dao.SysMenuMapper;
import com.way.wayFramewk.privilege.provider.dao.SysRoleMenuMapper;
import com.way.wayFramewk.privilege.provider.dao.extend.SysMenuExtendMapper;
import com.way.wayFramewk.privilege.service.SysMenuService;

@Service("sysMenuService")
public class SysMenuServiceImpl implements SysMenuService {
	@Resource
	private SysMenuMapper sysMenuMapper;
	@Resource
	private SysMenuExtendMapper sysMenuExtendMapper;
	@Resource
	private SysRoleMenuMapper sysRoleMenuMapper;

	@Override
	public Pagination<SysMenu> findByPage(Pagination<SysMenu> page, SysMenu record) {
		List<SysMenu> list = sysMenuExtendMapper.selectByPage(page, record);
		page.setList(list);
		return page;
	}

	@Override
	public SysMenu getById(Long id) {
		return sysMenuMapper.selectByPrimaryKey(id);
	}

	@Override
	public SysMenu save(SysMenu record) {
		record.setPriCode(record.getCode());
		Date now = new Date();
		record.setIsDelete(false);
		record.setCreateTime(now);
		record.setUpdateTime(now);
		sysMenuMapper.insertSelective(record);
		if(record.getParentId().equals(Constants.SYS_ROOT)){
			record.setPath(String.valueOf(record.getId()));
		}else{
			SysMenu parent = this.getById(record.getParentId());
			record.setBaseUrl(parent.getBaseUrl());
			record.setPath(parent.getPath() + Constants.SEPERATE_CODE + record.getId());
			record.setDepth((short) (parent.getDepth() + 1));
		}
		this.update(record);
		return record;
	}

	@Override
	public SysMenu update(SysMenu record) {
		Date now = new Date();
		record.setUpdateTime(now);
		sysMenuMapper.updateByPrimaryKeySelective(record);
		return record;
	}

	@Override
	public Long delete(Long id) {
		Date now = new Date();
		SysMenu update = new SysMenu();
		update.setId(id);
		update.setUpdateTime(now);
		update.setIsDelete(true);
		sysMenuMapper.updateByPrimaryKeySelective(update);
		return id;
	}

	@Override
	public List<SysMenu> getSysList() {
		return this.getListByParentId(Constants.SYS_ROOT);
	}

	@Override
	public List<SysMenu> getListByParentId(Long parentId) {
		SysMenuExample example = new SysMenuExample();
		example.createCriteria().andIsDeleteEqualTo(false).andParentIdEqualTo(parentId);
		List<SysMenu> list = this.sysMenuMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list;
		}
		return Collections.emptyList();
	}

	@Override
	public List<SysMenu> getListBySysId(Long sysId) {
		SysMenuExample example = new SysMenuExample();
		example.createCriteria().andIsDeleteEqualTo(false)
				.andPathLike(sysId + Constants.SEPERATE_CODE + Constants.LIKE_CODE)
				.andDepthLessThan(Constants.BTN_LEVEL);
		List<SysMenu> list = this.sysMenuMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list;
		}
		return null;
	}

	@Override
	public List<SysMenu> getListBySysIdForUser(Long sysId, Long userId) {
		List<SysMenu> menuList = this.getListBySysId(sysId);
		menuList = this.privilegeCheck(menuList, userId);
		return menuList;
	}

	@Override
	public List<SysMenu> getSysListForUser(Long userId) {
		List<SysMenu> sysList = this.getSysList();
		sysList = this.privilegeCheck(sysList, userId);
		return sysList;
	}

	@Override
	public List<SysMenu> getListByParentIdForUser(Long parentId, Long userId) {
		List<SysMenu> menuList = this.getListByParentId(parentId);
		menuList = this.privilegeCheck(menuList, userId);
		return menuList;
	}

	@Override
	public boolean existsRoleForMenu(Long menuId) {
		SysRoleMenuExample example = new SysRoleMenuExample();
		example.createCriteria().andMenuIdEqualTo(menuId);
		int count = this.sysRoleMenuMapper.countByExample(example);
		return count > 0;
	}

	@Override
	public List<SysMenu> privilegeCheck(List<SysMenu> menuList, Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void dividePriv(List<SysMenu> menuList, Long roleId) {
		if (menuList != null && menuList.size() > 0) {
			SysRoleMenu record = new SysRoleMenu();
			record.setRoleId(roleId);
			for (SysMenu menu : menuList) {
				record.setMenuId(menu.getId());
				this.sysRoleMenuMapper.insert(record);
			}
		}
	}
}