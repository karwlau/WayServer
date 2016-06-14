package com.way.framewk.privilege.provider.serviceImp;

import java.util.Date;
import java.util.List;

import com.way.framewk.privilege.entity.SysMenu;
import com.way.framewk.privilege.entity.SysMenuExample;
import com.way.framewk.privilege.provider.dao.SysMenuMapper;
import com.way.framewk.privilege.provider.service.MenuService;

public class MenuServiceImp implements MenuService {

	private SysMenuMapper sysMenuMapper;

	@Override
	public SysMenu findById(Long id) {
		return this.sysMenuMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SysMenu> findByCondition(SysMenu condition) {
		SysMenuExample example = new SysMenuExample();
		example.createCriteria().andIsDeleteEqualTo(false).andNameLike(condition.getName());
		return this.sysMenuMapper.selectByExample(example);
	}

	@Override
	public SysMenu save(SysMenu record) {
		Date now = new Date();
		record.setCreateTime(now);
		record.setUpdateTime(now);
		this.sysMenuMapper.insertSelective(record);
		return record;
	}

	@Override
	public SysMenu save(SysMenu record, Long userId) {
		record.setCreateBy(userId);
		record.setUpdateBy(userId);
		return this.save(record);
	}

	@Override
	public void delete(SysMenu record) {
		SysMenuExample example = new SysMenuExample();
		example.createCriteria().andIsDeleteEqualTo(false).andNameEqualTo(record.getName());
		SysMenu update = new SysMenu();
		update.setIsDelete(true);
		this.sysMenuMapper.updateByExampleSelective(update, example);
	}

	@Override
	public void deleteById(Long id) {
		SysMenu update = new SysMenu();
		update.setIsDelete(true);
		update.setId(id);
		this.sysMenuMapper.updateByPrimaryKeySelective(update);
	}

	@Override
	public void updateByCondition(SysMenu udpate, SysMenu condition) {
		SysMenuExample example = new SysMenuExample();
		example.createCriteria().andIsDeleteEqualTo(false).andNameEqualTo(condition.getName());
		this.sysMenuMapper.updateByExampleSelective(udpate, example);
	}

	@Override
	public void updateById(SysMenu update, Long id) {
		update.setId(id);
		this.sysMenuMapper.updateByPrimaryKeySelective(update);
	}

}
