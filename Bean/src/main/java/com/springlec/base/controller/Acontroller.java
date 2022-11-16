package com.springlec.base.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base.service.calcservice;
import com.springlec.base.service.multiplication;

@Controller
public class Acontroller {

	@Autowired
	calcservice service;
	
	@Autowired
	multiplication mult;

	// input screen
	@RequestMapping("/")
	public String input() {
		return "input";
	}

	@RequestMapping("/addCalc")
	public String add(HttpServletRequest request, Model model) throws Exception {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		int Result = service.addAction(num1, num2);

		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		model.addAttribute("result", Result);
		model.addAttribute("operator", "+");

		return "result";

	}
	
	@RequestMapping("/multCalc")
	public String multiplication(HttpServletRequest request, Model model) throws Exception {
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		int Result = mult.multservice(num1, num2);

		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		model.addAttribute("result", Result);
		model.addAttribute("operator", "*");

		return "result";

	}
}
