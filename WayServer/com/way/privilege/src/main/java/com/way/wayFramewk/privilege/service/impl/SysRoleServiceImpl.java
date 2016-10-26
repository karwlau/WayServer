package com.way.wayFramewk.privilege.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.way.framework.model.Pagination;
import com.way.wayFramewk.privilege.entity.SysRole;
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
	public Pagination<SysRole> findByPage(Pagination<SysRole> page, SysRole record) {
		List<SysRole> list = sysRoleExtendMapper.selectByPage(page, record);
		page.setList(list);
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

}