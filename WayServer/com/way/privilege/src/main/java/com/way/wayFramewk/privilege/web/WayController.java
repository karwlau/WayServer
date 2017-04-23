package com.way.wayFramewk.privilege.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/way")
public class WayController {

	@RequestMapping("/signature")
	@ResponseBody
	public String signature(Model model, HttpServletRequest request,HttpServletResponse response) {
		String token =  "wayserceslavia";
		String timestamp = request.getParameter("timestamp");
		String nonce = request.getParameter("nonce");
		String signature = request.getParameter("signature");
		//校验signature
		String echostr= request.getParameter("echostr");
		return echostr;
	}

}
