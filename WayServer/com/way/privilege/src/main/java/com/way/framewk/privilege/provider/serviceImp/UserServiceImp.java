package com.way.framewk.privilege.provider.serviceImp;

import java.util.Date;
import java.util.List;

import com.way.framewk.privilege.entity.SysUser;
import com.way.framewk.privilege.entity.SysUserExample;
import com.way.framewk.privilege.provider.dao.SysUserMapper;
import com.way.framewk.privilege.provider.service.UserService;

public class UserServiceImp implements UserService {

	private SysUserMapper sysUserMapper;

	@Override
	public SysUser findById(Long id) {
		return this.sysUserMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SysUser> findByCondition(SysUser condition) {
		SysUserExample example = new SysUserExample();
		example.createCriteria().andIsDeleteEqualTo(false).andNameLike(condition.getName());
		return this.sysUserMapper.selectByExample(example);
	}

	@Override
	public SysUser save(SysUser record) {
		Date now = new Date();
		record.setCreateTime(now);
		record.setUpdateTime(now);
		this.sysUserMapper.insertSelective(record);
		return record;
	}

	@Override
	public SysUser save(SysUser record, Long userId) {
		record.setCreateBy(userId);
		record.setUpdateBy(userId);
		return this.save(record);
	}

	@Override
	public void delete(SysUser record) {
		SysUserExample example = new SysUserExample();
		example.createCriteria().andIsDeleteEqualTo(false).andNameEqualTo(record.getName());
		SysUser update = new SysUser();
		update.setIsDelete(true);
		this.sysUserMapper.updateByExampleSelective(update, example);
	}

	@Override
	public void deleteById(Long id) {
		SysUser update = new SysUser();
		update.setIsDelete(true);
		update.setId(id);
		this.sysUserMapper.updateByPrimaryKeySelective(update);
	}

	@Override
	public void updateByCondition(SysUser udpate, SysUser condition) {
		SysUserExample example = new SysUserExample();
		example.createCriteria().andIsDeleteEqualTo(false).andNameEqualTo(condition.getName());
		this.sysUserMapper.updateByExampleSelective(udpate, example);
	}

	@Override
	public void updateById(SysUser update, Long id) {
		update.setId(id);
		this.sysUserMapper.updateByPrimaryKeySelective(update);
	}

}
