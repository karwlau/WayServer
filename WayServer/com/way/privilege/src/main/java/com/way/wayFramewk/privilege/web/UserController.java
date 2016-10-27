package com.way.wayFramewk.privilege.web;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.way.framework.model.Pagination;
import com.way.wayFramewk.privilege.entity.SysUser;
import com.way.wayFramewk.privilege.entity.SysUserRole;
import com.way.wayFramewk.privilege.service.SysRoleService;
import com.way.wayFramewk.privilege.service.SysUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private SysUserService sysUserService;
	@Resource
	private SysRoleService sysRoleService;

	@RequestMapping("/user")
	public String home(Model model, HttpServletRequest request) {
		return "user/user";
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping("/userList")
	@ResponseBody
	public List<SysUser> userList(Pagination page, SysUser record, HttpServletRequest request) {
		page = this.sysUserService.findByPage(page, record);
		return page.getList();
	}

	@RequestMapping("/saveOrUpdate")
	@ResponseBody
	public String save(SysUser record, Long[] checks, Long[] unchecks, HttpServletRequest request) {
		List<Long> has = Arrays.asList(checks);
		List<Long> hasnot = Arrays.asList(unchecks);
		if (record.getId() != null) {
			this.sysUserService.update(record, has, hasnot);
		} else {
			this.sysUserService.save(record, has, hasnot);
		}
		return "true";
	}

	@RequestMapping("/delete")
	@ResponseBody
	public String delete(Long id, HttpServletRequest request) {
		this.sysUserService.delete(id);
		return "true";
	}

	@RequestMapping("/hasRole")
	@ResponseBody
	public List<SysUserRole> hasRole(Long userId) {
		if (userId == null) {
			return Collections.emptyList();
		}
		List<SysUserRole> list = this.sysRoleService.findUserRoleByUserId(userId);
		return list;
	}
}
