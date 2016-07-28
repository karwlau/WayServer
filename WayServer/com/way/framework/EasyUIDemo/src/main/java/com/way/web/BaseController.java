package com.way.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/base")
public class BaseController {
	@RequestMapping("/base")
	public String base() {
		return "/content/base.jsp";
	}
}
