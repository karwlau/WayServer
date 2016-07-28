package com.way.wayFramewk.privilege.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menu")
public class MenuController {
	@RequestMapping("/menu")
	public String baseOne(HttpServletRequest request) {
		return "menu/menu";
	}
}
