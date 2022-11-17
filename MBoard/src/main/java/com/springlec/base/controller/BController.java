package com.springlec.base.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base.model.BDto;
import com.springlec.base.service.BDaoService;

@Controller
public class BController {

	@Autowired
	BDaoService service;
	
	//게시판 검색
	@RequestMapping("/list")
	public String list(Model model) throws Exception{
		List<BDto> listDao=service.listDao();
		model.addAttribute("list",listDao);
		return "list";
	}
	
	//게시판 입력 화면
	@RequestMapping("/write_view")
	public String writeview() {
		return "write_view";
	}
	
	//게시판 입력 실행
	@RequestMapping("/write")
	public String write(HttpServletRequest request, Model model) throws Exception{
		service.writeDao(request.getParameter("bName"), request.getParameter("bTitle"), request.getParameter("bContent"));
		return "redirect:list";
	}
	
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
