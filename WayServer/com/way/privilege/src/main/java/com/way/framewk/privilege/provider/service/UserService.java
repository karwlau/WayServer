package com.way.framewk.privilege.provider.service;

import java.util.List;

import com.way.framewk.privilege.entity.SysUser;

public interface UserService {
	public SysUser findById(Long id);

	public List<SysUser> findByCondition(SysUser condition);

	public SysUser save(SysUser record);

	public SysUser save(SysUser record, Long userId);

	public void delete(SysUser record);

	public void deleteById(Long id);

	public void updateByCondition(SysUser udpate, SysUser condition);

	public void updateById(SysUser update, Long id);

}
