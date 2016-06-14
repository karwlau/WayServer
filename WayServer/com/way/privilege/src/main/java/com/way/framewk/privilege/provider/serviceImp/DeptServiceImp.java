package com.way.framewk.privilege.provider.serviceImp;

import java.util.Date;
import java.util.List;

import com.way.framewk.privilege.entity.SysDept;
import com.way.framewk.privilege.entity.SysDeptExample;
import com.way.framewk.privilege.provider.dao.SysDeptMapper;
import com.way.framewk.privilege.provider.service.DeptService;

public class DeptServiceImp implements DeptService {

	private SysDeptMapper sysDeptMapper;

	@Override
	public SysDept findById(Long id) {
		return this.sysDeptMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SysDept> findByCondition(SysDept condition) {
		SysDeptExample example = new SysDeptExample();
		example.createCriteria().andIsDeleteEqualTo(false).andNameLike(condition.getName());
		return this.sysDeptMapper.selectByExample(example);
	}

	@Override
	public SysDept save(SysDept record) {
		Date now = new Date();
		record.setCreateTime(now);
		record.setUpdateTime(now);
		this.sysDeptMapper.insertSelective(record);
		return record;
	}

	@Override
	public SysDept save(SysDept record, Long userId) {
		record.setCreateBy(userId);
		record.setUpdateBy(userId);
		return this.save(record);
	}

	@Override
	public void delete(SysDept record) {
		SysDeptExample example = new SysDeptExample();
		example.createCriteria().andIsDeleteEqualTo(false).andNameEqualTo(record.getName());
		SysDept update = new SysDept();
		update.setIsDelete(true);
		this.sysDeptMapper.updateByExampleSelective(update, example);
	}

	@Override
	public void deleteById(Long id) {
		SysDept update = new SysDept();
		update.setIsDelete(true);
		update.setId(id);
		this.sysDeptMapper.updateByPrimaryKeySelective(update);
	}

	@Override
	public void updateByCondition(SysDept udpate, SysDept condition) {
		SysDeptExample example = new SysDeptExample();
		example.createCriteria().andIsDeleteEqualTo(false).andNameEqualTo(condition.getName());
		this.sysDeptMapper.updateByExampleSelective(udpate, example);
	}

	@Override
	public void updateById(SysDept update, Long id) {
		update.setId(id);
		this.sysDeptMapper.updateByPrimaryKeySelective(update);
	}

}
