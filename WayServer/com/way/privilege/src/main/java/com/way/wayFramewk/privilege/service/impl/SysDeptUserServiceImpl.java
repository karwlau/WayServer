package com.way.wayFramewk.privilege.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.way.wayFramewk.privilege.entity.SysDeptUser;
import com.way.wayFramewk.privilege.provider.dao.SysDeptUserMapper;
import com.way.wayFramewk.privilege.service.SysDeptUserService;

@Service("sysDeptUserService")
public class SysDeptUserServiceImpl implements SysDeptUserService {
	@Resource
	private SysDeptUserMapper sysDeptUserMapper;

	@Override
	public SysDeptUser save(SysDeptUser record) {
		sysDeptUserMapper.insert(record);
		return record;
	}

	@Override
	public SysDeptUser delete(SysDeptUser record) {
		sysDeptUserMapper.delete(record);
		return record;
	}
}