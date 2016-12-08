package com.way.wayFramewk.privilege.web;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.way.wayFramewk.privilege.entity.SysDict;
import com.way.wayFramewk.privilege.service.SysDictService;

@Controller
@RequestMapping("/dict")
public class DictController {
	@Resource
	private SysDictService sysDictService;

	@RequestMapping("/dictTree")
	public String dictTree(Model model, HttpServletRequest request) {
		return "dict/dictTree";
	}

	@RequestMapping("/dictExpand")
	@ResponseBody
	public List<SysDict> dictExpand(Long pid, HttpServletRequest request) {
		List<SysDict> list = new ArrayList<SysDict>();
		if (pid != null) {
			list = this.sysDictService.getListByParentId(pid);
		}
		return list;
	}

	@RequestMapping("/saveOrUpdate")
	@ResponseBody
	public String save(SysDict record,String oldCode, HttpServletRequest request) {
		if (record.getId() != null) {
			this.sysDictService.update(record,oldCode);
		} else {
			this.sysDictService.save(record);
		}
		return "true";
	}

	@RequestMapping("/delete")
	@ResponseBody
	public String delete(Long id, HttpServletRequest request) {
		this.sysDictService.delete(id);
		return "true";
	}

}
