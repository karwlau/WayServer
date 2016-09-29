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
		return list;
	}

	@RequestMapping("/menuExpand")
	public @ResponseBody List<SysMenu> menuExpand(Long sysId, HttpServletRequest request) {
		List<SysMenu> list = new ArrayList<SysMenu>();
		if (sysId != null && sysId == 1L) {
		} else {
		}
		return list;
	}
}
