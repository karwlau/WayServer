package com.way.wayFramewk.privilege.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.way.wayFramewk.privilege.entity.SysDict;
import com.way.wayFramewk.privilege.entity.SysDictExample;
import com.way.wayFramewk.privilege.entity.SysDictExample.Criteria;
import com.way.wayFramewk.privilege.provider.dao.SysDictMapper;
import com.way.wayFramewk.privilege.service.SysDictService;

@Service("sysDictService")
public class SysDictServiceImpl implements SysDictService {
	@Resource
	private SysDictMapper sysDictMapper;

	private SysDictExample buildExample(SysDict record) {
		SysDictExample example = new SysDictExample();
		Criteria c = example.createCriteria().andIsDeleteEqualTo(false);
		if (record != null) {
			if (record.getParentCode() != null) {
				c.andParentCodeEqualTo(record.getParentCode());
			}
		}
		return example;
	}

	@Override
	public Page<SysDict> findByPage(Page<SysDict> page, SysDict record) {
		SysDictExample example = this.buildExample(record);
		page = PageHelper.startPage(page.getPageNum(), page.getPageSize(), true);
		page = sysDictMapper.selectByExample(example);
		return page;
	}

	@Override
	public SysDict getById(Long id) {
		return sysDictMapper.selectByPrimaryKey(id);
	}

	@Override
	public SysDict save(SysDict record) {
		Date now = new Date();
		record.setIsDelete(false);
		record.setCreateTime(now);
		record.setUpdateTime(now);
		sysDictMapper.insertSelective(record);
		return record;
	}

	@Override
	public SysDict update(SysDict record) {
		Date now = new Date();
		record.setUpdateTime(now);
		sysDictMapper.updateByPrimaryKeySelective(record);
		return record;
	}

	@Override
	public Long delete(Long id) {
		Date now = new Date();
		SysDict update = new SysDict();
		update.setId(id);
		update.setUpdateTime(now);
		update.setIsDelete(true);
		sysDictMapper.updateByPrimaryKeySelective(update);
		return id;
	}

	@Override
	public List<SysDict> getListByParentId(Long pid) {
		SysDictExample example = new SysDictExample();
		example.createCriteria().andIsDeleteEqualTo(false).andParentIdEqualTo(pid);
		return this.sysDictMapper.selectByExample(example);
	}

	@Override
	public SysDict update(SysDict record, String oldCode) {
		// 变更code后同步更新下级节点parent_code
		if (StringUtils.isNotBlank(oldCode) && !oldCode.equals(record.getCode())) {
			SysDict update = new SysDict();
			update.setParentCode(record.getCode());
			SysDictExample example = new SysDictExample();
			example.createCriteria().andIsDeleteEqualTo(false).andParentIdEqualTo(record.getId());
			this.sysDictMapper.updateByExampleSelective(update, example);
		}
		return this.update(record);
	}

	@Override
	public List<SysDict> findListByCode(String parentCode) {
		SysDictExample example = new SysDictExample();
		example.createCriteria().andIsDeleteEqualTo(false).andParentCodeEqualTo(parentCode);
		return this.sysDictMapper.selectByExample(example);
	}

	public SysDict findByCode(String code) {
		SysDictExample example = new SysDictExample();
		example.createCriteria().andIsDeleteEqualTo(false).andCodeEqualTo(code);
		List<SysDict> list = this.sysDictMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

}