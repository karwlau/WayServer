package com.way.framewk.privilege.provider.serviceImp;

import java.util.Date;
import java.util.List;

import com.way.framewk.privilege.entity.SysRole;
import com.way.framewk.privilege.entity.SysRoleExample;
import com.way.framewk.privilege.provider.dao.SysRoleMapper;
import com.way.framewk.privilege.provider.service.RoleService;

public class RoleServiceImp implements RoleService {

	private SysRoleMapper sysRoleMapper;

	@Override
	public SysRole findById(Long id) {
		return this.sysRoleMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SysRole> findByCondition(SysRole condition) {
		SysRoleExample example = new SysRoleExample();
		example.createCriteria().andIsDeleteEqualTo(false).andNameLike(condition.getName());
		return this.sysRoleMapper.selectByExample(example);
	}

	@Override
	public SysRole save(SysRole record) {
		Date now = new Date();
		record.setCreateTime(now);
		record.setUpdateTime(now);
		this.sysRoleMapper.insertSelective(record);
		return record;
	}

	@Override
	public SysRole save(SysRole record, Long userId) {
		record.setCreateBy(userId);
		record.setUpdateBy(userId);
		return this.save(record);
	}

	@Override
	public void delete(SysRole record) {
		SysRoleExample example = new SysRoleExample();
		example.createCriteria().andIsDeleteEqualTo(false).andNameEqualTo(record.getName());
		SysRole update = new SysRole();
		update.setIsDelete(true);
		this.sysRoleMapper.updateByExampleSelective(update, example);
	}

	@Override
	public void deleteById(Long id) {
		SysRole update = new SysRole();
		update.setIsDelete(true);
		update.setId(id);
		this.sysRoleMapper.updateByPrimaryKeySelective(update);
	}

	@Override
	public void updateByCondition(SysRole udpate, SysRole condition) {
		SysRoleExample example = new SysRoleExample();
		example.createCriteria().andIsDeleteEqualTo(false).andNameEqualTo(condition.getName());
		this.sysRoleMapper.updateByExampleSelective(udpate, example);
	}

	@Override
	public void updateById(SysRole update, Long id) {
		update.setId(id);
		this.sysRoleMapper.updateByPrimaryKeySelective(update);
	}

}
