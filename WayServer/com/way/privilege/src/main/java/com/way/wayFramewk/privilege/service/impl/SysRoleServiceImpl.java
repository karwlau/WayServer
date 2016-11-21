package com.way.wayFramewk.privilege.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.way.wayFramewk.privilege.entity.SysRole;
import com.way.wayFramewk.privilege.entity.SysRoleExample;
import com.way.wayFramewk.privilege.entity.SysUserRole;
import com.way.wayFramewk.privilege.entity.SysUserRoleExample;
import com.way.wayFramewk.privilege.provider.dao.SysRoleMapper;
import com.way.wayFramewk.privilege.provider.dao.SysUserRoleMapper;
import com.way.wayFramewk.privilege.provider.dao.extend.SysRoleExtendMapper;
import com.way.wayFramewk.privilege.service.SysMenuService;
import com.way.wayFramewk.privilege.service.SysRoleService;

@Service("sysRoleService")
public class SysRoleServiceImpl implements SysRoleService {
	@Resource
	private SysRoleMapper sysRoleMapper;
	@Resource
	private SysRoleExtendMapper sysRoleExtendMapper;
	@Resource
	private SysUserRoleMapper sysUserRoleMapper;
	@Resource
	private SysMenuService sysMenuService;

	@Override
	public Page<SysRole> findByPage(Page<SysRole> page, SysRole record) {
		//TODO page
//		List<SysRole> list = sysRoleExtendMapper.selectByPage(page, record);
//		page.setList(list);
		return page;
	}

	@Override
	public SysRole getById(Long id) {
		return sysRoleMapper.selectByPrimaryKey(id);
	}

	@Override
	public SysRole save(SysRole record) {
		Date now = new Date();
		record.setIsDelete(false);
		record.setCreateTime(now);
		record.setUpdateTime(now);
		sysRoleMapper.insertSelective(record);
		return record;
	}

	@Override
	public SysRole update(SysRole record) {
		Date now = new Date();
		record.setUpdateTime(now);
		sysRoleMapper.updateByPrimaryKeySelective(record);
		return record;
	}

	@Override
	public Long delete(Long id) {
		Date now = new Date();
		SysRole update = new SysRole();
		update.setId(id);
		update.setUpdateTime(now);
		update.setIsDelete(true);
		sysRoleMapper.updateByPrimaryKeySelective(update);
		this.sysMenuService.deleteRoleMenuByRoleId(id);
		return id;
	}

	@Override
	public boolean existsUser(Long roleId) {
		SysUserRoleExample example = new SysUserRoleExample();
		example.createCriteria().andRoleIdEqualTo(roleId);
		int count = this.sysUserRoleMapper.countByExample(example);
		return count > 0;
	}

	@Override
	public List<SysRole> getRolesForUser(Long userId) {
		List<SysRole> roleList = this.sysRoleExtendMapper.selectListByUser(userId);
		return roleList;
	}

	@Override
	public void divideRole(List<SysRole> roleList, Long userId) {
		if (roleList != null && roleList.size() > 0) {
			SysUserRole record = new SysUserRole();
			record.setUserId(userId);
			for (SysRole role : roleList) {
				record.setRoleId(role.getId());
				this.sysUserRoleMapper.insert(record);
			}
		}

	}

	@Override
	public void save(SysRole record, List<Long> has, List<Long> hasnot) {
		record = this.save(record);
		this.sysMenuService.duelRoleMenu(record.getId(), has, hasnot);
	}

	@Override
	public void update(SysRole record, List<Long> has, List<Long> hasnot) {
		record = this.update(record);
		this.sysMenuService.duelRoleMenu(record.getId(), has, hasnot);
	}

	@Override
	public List<SysRole> findList(SysRole record) {
		SysRoleExample example = new SysRoleExample();
		example.createCriteria().andIsDeleteEqualTo(false);
		return this.sysRoleMapper.selectByExample(example);
	}

	@Override
	public void deleteUserRoleByUserId(Long userId) {
		SysUserRoleExample example = new SysUserRoleExample();
		example.createCriteria().andUserIdEqualTo(userId);
		this.sysUserRoleMapper.deleteByExample(example);
	}

	@Override
	public void duelUserRole(Long userId, List<Long> has, List<Long> hasnot) {
		List<SysUserRole> list = this.findUserRoleByUserId(userId);
		List<Long> roleIds = new ArrayList<Long>(list.size());
		for (SysUserRole userRole : list) {
			roleIds.add(userRole.getRoleId());
		}
		SysUserRole record = new SysUserRole();
		record.setUserId(userId);
		if (has != null && has.size() > 0) {
			for (Long hasId : has) {
				if (!roleIds.contains(hasId)) {
					record.setRoleId(hasId);
					this.sysUserRoleMapper.insert(record);
				}
			}
		}
		if (hasnot != null && hasnot.size() > 0) {
			for (Long hasnotId : hasnot) {
				if (roleIds.contains(hasnotId)) {
					record.setRoleId(hasnotId);
					this.sysUserRoleMapper.delete(record);
				}
			}
		}
	}

	@Override
	public List<SysUserRole> findUserRoleByUserId(Long userId) {
		SysUserRoleExample example = new SysUserRoleExample();
		example.createCriteria().andUserIdEqualTo(userId);
		return this.sysUserRoleMapper.selectByExample(example);
	}

	@Override
	public List<SysUserRole> getAllUserRole() {
		SysUserRoleExample example = new SysUserRoleExample();
		return this.sysUserRoleMapper.selectByExample(example);
	}

	@Override
	public Map<Long, List<Long>> getAllUserRoleMap() {
		List<SysUserRole> list = this.getAllUserRole();
		if (list != null && list.size() > 0) {
			Map<Long, List<Long>> map = new HashMap<Long, List<Long>>();
			List<Long> roleList = null;
			for (SysUserRole record : list) {
				roleList = map.get(record.getUserId());
				if (roleList == null) {
					roleList = new ArrayList<Long>();
					map.put(record.getUserId(), roleList);
				}
				roleList.add(record.getRoleId());
			}
			return map;
		}
		return Collections.emptyMap();
	}
}