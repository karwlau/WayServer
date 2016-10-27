package com.way.wayFramewk.privilege.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.way.framework.model.Pagination;
import com.way.wayFramewk.privilege.entity.SysUser;
import com.way.wayFramewk.privilege.provider.dao.SysUserMapper;
import com.way.wayFramewk.privilege.provider.dao.extend.SysUserExtendMapper;
import com.way.wayFramewk.privilege.service.SysRoleService;
import com.way.wayFramewk.privilege.service.SysUserService;

@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {
	@Resource
	private SysUserMapper sysUserMapper;
	@Resource
	private SysUserExtendMapper sysUserExtendMapper;
	@Resource
	private SysRoleService sysRoleService;

	@Override
	public Pagination<SysUser> findByPage(Pagination<SysUser> page, SysUser record) {
		List<SysUser> list = this.sysUserExtendMapper.selectByPage(page, record);
		page.setList(list);
		return page;
	}

	@Override
	public SysUser getById(Long id) {
		return this.sysUserMapper.selectByPrimaryKey(id);
	}

	@Override
	public SysUser save(SysUser record) {
		Date now = new Date();
		record.setIsDelete(false);
		record.setCreateTime(now);
		record.setUpdateTime(now);
		this.sysUserMapper.insertSelective(record);
		return record;
	}

	@Override
	public SysUser update(SysUser record) {
		Date now = new Date();
		record.setUpdateTime(now);
		this.sysUserMapper.updateByPrimaryKeySelective(record);
		return record;
	}

	@Override
	public Long delete(Long id) {
		Date now = new Date();
		SysUser update = new SysUser();
		update.setId(id);
		update.setUpdateTime(now);
		update.setIsDelete(true);
		this.sysUserMapper.updateByPrimaryKeySelective(update);
		this.sysRoleService.deleteUserRoleByUserId(id);
		return id;
	}

	@Override
	public List<SysUser> getUsersByDeptId(Long deptId) {
		List<SysUser> list = this.sysUserExtendMapper.selectListByDept(deptId);
		return list;
	}

	@Override
	public SysUser save(SysUser record, List<Long> has, List<Long> hasnot) {
		record = this.save(record);
		this.sysRoleService.duelUserRole(record.getId(), has, hasnot);
		return record;
	}

	@Override
	public SysUser update(SysUser record, List<Long> has, List<Long> hasnot) {
		record = this.update(record);
		this.sysRoleService.duelUserRole(record.getId(), has, hasnot);
		return record;
	}
}