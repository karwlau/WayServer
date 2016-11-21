package com.way.wayFramewk.privilege.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.way.wayFramewk.privilege.entity.SysDept;
import com.way.wayFramewk.privilege.entity.SysDeptUser;
import com.way.wayFramewk.privilege.entity.SysDeptUserExample;
import com.way.wayFramewk.privilege.provider.dao.SysDeptMapper;
import com.way.wayFramewk.privilege.provider.dao.SysDeptUserMapper;
import com.way.wayFramewk.privilege.provider.dao.extend.SysDeptExtendMapper;
import com.way.wayFramewk.privilege.service.SysDeptService;

@Service("sysDeptService")
public class SysDeptServiceImpl implements SysDeptService {
	@Resource
	private SysDeptMapper sysDeptMapper;
	@Resource
	private SysDeptExtendMapper sysDeptExtendMapper;
	@Resource
	private SysDeptUserMapper sysDeptUserMapper;

	@Override
	public Page<SysDept> findByPage(Page<SysDept> page, SysDept record) {
		// TODO page
		// List<SysDept> list = sysDeptExtendMapper.selectByPage(page, record);
		// page.setList(list);
		return page;
	}

	@Override
	public SysDept getById(Long id) {
		return sysDeptMapper.selectByPrimaryKey(id);
	}

	@Override
	public SysDept save(SysDept record) {
		Date now = new Date();
		record.setIsDelete(false);
		record.setCreateTime(now);
		record.setUpdateTime(now);
		sysDeptMapper.insertSelective(record);
		return record;
	}

	@Override
	public SysDept update(SysDept record) {
		Date now = new Date();
		record.setUpdateTime(now);
		sysDeptMapper.updateByPrimaryKeySelective(record);
		return record;
	}

	@Override
	public Long delete(Long id) {
		Date now = new Date();
		SysDept update = new SysDept();
		update.setId(id);
		update.setUpdateTime(now);
		update.setIsDelete(true);
		sysDeptMapper.updateByPrimaryKeySelective(update);
		return id;
	}

	@Override
	public boolean existsUser(Long deptId) {
		SysDeptUserExample example = new SysDeptUserExample();
		example.createCriteria().andDeptIdEqualTo(deptId);
		int count = this.sysDeptUserMapper.countByExample(example);
		return count > 0;
	}

	@Override
	public void divideDept(Long deptId, Long userId, boolean isHead) {
		SysDeptUser record = new SysDeptUser();
		record.setDeptId(deptId);
		record.setUserId(userId);
		record.setIsHead(isHead);
		this.sysDeptUserMapper.insert(record);

	}
}