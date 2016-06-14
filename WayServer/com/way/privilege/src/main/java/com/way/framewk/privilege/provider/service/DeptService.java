package com.way.framewk.privilege.provider.service;

import java.util.List;

import com.way.framewk.privilege.entity.SysDept;

public interface DeptService {
	public SysDept findById(Long id);

	public List<SysDept> findByCondition(SysDept condition);

	public SysDept save(SysDept record);

	public SysDept save(SysDept record, Long userId);

	public void delete(SysDept record);

	public void deleteById(Long id);

	public void updateByCondition(SysDept udpate, SysDept condition);

	public void updateById(SysDept update, Long id);

}
