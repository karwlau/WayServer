package com.way.wayFramewk.privilege.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public @ResponseBody List<SysMenu> menuExpand(Long sysId, HttpServletRequest request) {
		List<SysMenu> list = new ArrayList<SysMenu>();
		if (sysId != null && Constants.SYS_ROOT.equals(sysId)) {
			//
		} else {
			list = this.sysMenuService.getListByParentId(sysId);
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

}
