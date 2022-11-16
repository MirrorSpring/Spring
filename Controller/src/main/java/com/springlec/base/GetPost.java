package com.springlec.base;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GetPost {
	
	@RequestMapping("/input")
	public String input(Model model, HttpServletRequest request) {
		return "student/input";
	}
	
	@RequestMapping("/getpost")
	public String confirmId(Model model, HttpServletRequest request) {
		
		String id=request.getParameter("id");
		
		model.addAttribute("id", id);
		return "student/getpost";
	}
}
