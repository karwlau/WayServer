package com.way.wayFramewk.privilege.web;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.way.framework.model.Pagination;
import com.way.wayFramewk.privilege.entity.SysRole;
import com.way.wayFramewk.privilege.entity.SysRoleMenu;
import com.way.wayFramewk.privilege.service.SysMenuService;
import com.way.wayFramewk.privilege.service.SysRoleService;

@Controller
@RequestMapping("/role")
public class RoleController {
	@Resource
	private SysRoleService sysRoleService;
	@Resource
	private SysMenuService sysMenuService;

	@RequestMapping("/role")
	public String home(Model model, HttpServletRequest request) {
		return "role/role";
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping("/roleList")
	@ResponseBody
	public List<SysRole> roleList(Pagination page, SysRole record, HttpServletRequest request) {
		page = this.sysRoleService.findByPage(page, record);
		return page.getList();
	}

	@RequestMapping("/saveOrUpdate")
	@ResponseBody
	public String save(SysRole record, String checks, String unchecks, HttpServletRequest request) {
		List<Long> has = makeList(checks);
		List<Long> hasnot = makeList(unchecks);
		if (record.getIsKeyOwner() == null) {
			record.setIsKeyOwner(false);
		}
		if (record.getId() != null) {
			this.sysRoleService.update(record, has, hasnot);
		} else {
			this.sysRoleService.save(record, has, hasnot);
		}
		return "true";
	}

	/**
	 * 选择取消权限列表
	 * 
	 * @param listStr
	 * @return
	 */
	private static List<Long> makeList(String listStr) {
		if (StringUtils.isNotBlank(listStr)) {
			try {
				String[] arrStr = listStr.split(",");
				List<Long> list = new ArrayList<Long>(arrStr.length);
				for (String str : arrStr) {
					list.add(Long.valueOf(str));
				}
				return list;
			} catch (Exception e) {
				// TODO throw exception
			}
		}
		return null;
	}

	@RequestMapping("/delete")
	@ResponseBody
	public String delete(Long id, HttpServletRequest request) {
		this.sysRoleService.delete(id);
		return "true";
	}

	@RequestMapping("/hasMenu")
	@ResponseBody
	public List<SysRoleMenu> hasMenu(Long roleId) {
		if (roleId == null) {
			return Collections.emptyList();
		}
		List<SysRoleMenu> list = this.sysMenuService.findRoleMenuByRoleId(roleId);
		return list;
	}
}
