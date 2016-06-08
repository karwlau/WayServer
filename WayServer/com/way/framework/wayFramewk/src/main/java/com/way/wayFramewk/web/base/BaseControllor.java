package com.way.wayFramewk.web.base;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("base")
public class BaseControllor {

	@RequestMapping("baseOne")
	public String baseOne(HttpServletRequest request) {
		return "base/baseOne";
	}

}
