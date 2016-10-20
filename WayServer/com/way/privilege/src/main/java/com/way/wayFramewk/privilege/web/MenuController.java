package com.way.wayFramewk.privilege.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.way.framework.model.Pagination;
import com.way.wayFramewk.privilege.constant.Constants;
import com.way.wayFramewk.privilege.entity.SysMenu;
import com.way.wayFramewk.privilege.service.SysMenuService;

@Controller
@RequestMapping("/menu")
public class MenuController {
	@Resource
	private SysMenuService sysMenuService;

	@RequestMapping("/menu")
	public String baseOne(Model model, HttpServletRequest request) {
		List<SysMenu> sysList = sysMenuService.getSysList();
		model.addAttribute(Constants.SYS_LIST, sysList);
		return "menu/menu";
	}

	@RequestMapping("/sysList")
	public @ResponseBody List<SysMenu> sysList(HttpServletRequest request) {
		List<SysMenu> sysList = sysMenuService.getSysList();
		return sysList;
	}

	@RequestMapping("/menuExpand")
	public @ResponseBody List<SysMenu> menuExpand(Long sysId, Long id, HttpServletRequest request) {
		List<SysMenu> list = new ArrayList<SysMenu>();
		if (sysId != null && Constants.SYS_ROOT.equals(sysId)) {
			//
		} else if (id == null) {
			list = this.sysMenuService.getListByParentId(sysId);
		} else {
			list = this.sysMenuService.getListByParentId(id);
		}
		return list;
	}

	@RequestMapping("/sysMenuExpand")
	public @ResponseBody List<SysMenu> sysMenuExpand(Long sysId, HttpServletRequest request) {
		List<SysMenu> list = new ArrayList<SysMenu>();
		if (sysId != null && Constants.SYS_ROOT.equals(sysId)) {
			//
		} else {
			list = this.sysMenuService.getListBySysId(sysId);
		}
		return list;
	}

	@RequestMapping("/save")
	@ResponseBody
	public String save(SysMenu record, HttpServletRequest request) {
		this.sysMenuService.save(record);
		return "true";
	}

	@RequestMapping("/update")
	@ResponseBody
	public String update(SysMenu record, HttpServletRequest request) {
		this.sysMenuService.update(record);
		return "true";
	}

	@RequestMapping("/delete")
	@ResponseBody
	public String delete(Long id, HttpServletRequest request) {
		this.sysMenuService.delete(id);
		return "true";
	}

	@RequestMapping("/home")
	public String home(Model model, HttpServletRequest request) {
		return "menu/home";
	}

	@RequestMapping("/system")
	public String menuList(Model model, HttpServletRequest request) {
		return "menu/system";
	}

	@SuppressWarnings("rawtypes")
	@RequestMapping("/findSystem")
	@ResponseBody
	public List<SysMenu> findSystem(SysMenu info, Pagination page, HttpServletRequest request) {
		List<SysMenu> list = this.sysMenuService.getSysList();
		return list;
	}
	
	
}
