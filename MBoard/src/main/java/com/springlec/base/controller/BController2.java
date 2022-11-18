package com.springlec.base.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base.model.BDto;
import com.springlec.base.service.BDaoService2;

@Controller
public class BController2 {

	@Autowired
	BDaoService2 service;
	
	@RequestMapping("/content_view")
	public String contentView(HttpServletRequest request, Model model) throws Exception{
		BDto contentDto=service.viewDao(Integer.parseInt(request.getParameter("bId")));
		model.addAttribute("content_view", contentDto);
		return "content_view";
	}
	
	@RequestMapping("/modify")
	public String modify(HttpServletRequest request, Model model) throws Exception{
		String bName=request.getParameter("bName");
		String bTitle=request.getParameter("bTitle");
		String bContent=request.getParameter("bContent");
		int bId=Integer.parseInt(request.getParameter("bId"));
		service.updateDao(bName, bTitle, bContent, bId);
		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) throws Exception{
		int bId=Integer.parseInt(request.getParameter("bId"));
		service.deleteDao(bId);
		return "redirect:list";
	}
}
