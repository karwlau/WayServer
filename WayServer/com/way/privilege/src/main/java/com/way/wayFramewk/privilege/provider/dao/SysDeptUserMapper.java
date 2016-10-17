package com.way.wayFramewk.privilege.provider.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.way.wayFramewk.privilege.entity.SysDeptUser;
import com.way.wayFramewk.privilege.entity.SysDeptUserExample;

@Repository
public interface SysDeptUserMapper {

	int delete(SysDeptUser record);

	int insert(SysDeptUser record);

	List<SysDeptUser> selectByExample(SysDeptUserExample example);
	
	int countByExample(SysDeptUserExample example);
}