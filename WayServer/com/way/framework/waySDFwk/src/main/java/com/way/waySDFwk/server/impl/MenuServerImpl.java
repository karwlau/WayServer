package com.way.waySDFwk.server.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.way.waySDFwk.mapper.SysMenuMapper;
import com.way.waySDFwk.model.SysMenu;
import com.way.waySDFwk.server.MenuServer;

@Repository
public class MenuServerImpl implements MenuServer {
	@Autowired
	private SysMenuMapper mapper;

	public int count(SysMenu record) {
		return mapper.countByExample(record) ;
	}


}