package com.way.waySDFwk.mapper;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import com.way.waySDFwk.model.SysMenu;

public interface SysMenuMapper {

	@Select({ "select", " count(id) as count", "from sys_menu", "where  1=1" })
	@Results({ @Result(column = "count", jdbcType = JdbcType.BIGINT)})
	int countByExample(SysMenu record);

}