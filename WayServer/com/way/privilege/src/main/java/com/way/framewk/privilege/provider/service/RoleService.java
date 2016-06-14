package com.way.framewk.privilege.provider.service;

import java.util.List;

import com.way.framewk.privilege.entity.SysRole;

public interface RoleService {
	public SysRole findById(Long id);

	public List<SysRole> findByCondition(SysRole condition);

	public SysRole save(SysRole record);

	public SysRole save(SysRole record, Long userId);

	public void delete(SysRole record);

	public void deleteById(Long id);

	public void updateByCondition(SysRole udpate, SysRole condition);

	public void updateById(SysRole update, Long id);

}
