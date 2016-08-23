package com.way.wayFramewk.privilege.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.way.wayFramewk.privilege.entity.SysMenu;

@Controller
@RequestMapping("/menu")
public class MenuController {
	@RequestMapping("/menu")
	public String baseOne(HttpServletRequest request) {
		return "menu/menu";
	}

	@RequestMapping("/sysList")
	public @ResponseBody List<SysMenu> sysList(HttpServletRequest request) {
		List<SysMenu> list = new ArrayList<SysMenu>();
		list.add(new SysMenu(1L, "系统1", 0L));
		list.add(new SysMenu(2L, "系统2", 0L));
		return list;
	}

	@RequestMapping("/menuExpand")
	public @ResponseBody List<SysMenu> menuExpand(Long sysId, HttpServletRequest request) {
		List<SysMenu> list = new ArrayList<SysMenu>();
		if (sysId != null && sysId == 1L) {
			list.add(new SysMenu(3L, "菜单1-1", 1L));
			list.add(new SysMenu(4L, "菜单1-2", 3L));
			list.add(new SysMenu(5L, "菜单1-3", 4L));
			list.add(new SysMenu(6L, "菜单1-1", 1L));
			list.add(new SysMenu(7L, "菜单1-2", 6L));
			list.add(new SysMenu(8L, "菜单1-3", 7L));
		} else {
			list.add(new SysMenu(6L, "菜单2-1", 2L));
			list.add(new SysMenu(7L, "菜单2-2", 6L));
			list.add(new SysMenu(8L, "菜单2-3", 7L));
		}
		return list;
	}
}
