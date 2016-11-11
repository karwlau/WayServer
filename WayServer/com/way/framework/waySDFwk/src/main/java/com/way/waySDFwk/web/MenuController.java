package com.way.waySDFwk.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.way.waySDFwk.model.SysMenu;
import com.way.waySDFwk.server.MenuServer;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@Api(value = "用户相关的接口")
@RestController
@RequestMapping("/menu")
public class MenuController {
	@Autowired
	private MenuServer server;

	/**
	 * 添加用户
	 * 
	 * @param user
	 *            用户对象
	 * @since 2016年9月21日21:01:50
	 */
	@RequestMapping("/count")
	@ApiOperation(notes = "添加用户", value = "添加一个用户", httpMethod = "GET")

	@ApiImplicitParam(name = "menu", value = "用户详细实体user", required = true, dataType = "String")
	public String add( String str) {
		SysMenu menu = new SysMenu();
		menu.setId(1L);
		return "hello " + server.count(menu);
	}
}
