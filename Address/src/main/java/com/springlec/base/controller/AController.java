package com.springlec.base.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base.model.ADto;
import com.springlec.base.service.ADaoService;

@Controller
public class AController {

	@Autowired
	ADaoService service;
	
	@RequestMapping("/list")
	public String listview(Model model) throws Exception{
		List<ADto> listDao=service.listDao();
		model.addAttribute("list",listDao);
		return "viewlist";
	}
	
	@RequestMapping("/write_address")
	public String writeview() throws Exception{
		return "write_address";
	}
	
	@RequestMapping("/write")
	public String write(HttpServletRequest request) throws Exception{
		String name=request.getParameter("name");
		String phone=request.getParameter("phone");
		String address=request.getParameter("address");
		String email=request.getParameter("email");
		String relationship=request.getParameter("relationship");
		
		service.writeDao(name, phone, address, email, relationship);
		
		return "redirect:list";
	}
	
	@RequestMapping("/detail_view")
	public String detailview(HttpServletRequest request, Model model) throws Exception{
		int id=Integer.parseInt(request.getParameter("id"));
		ADto dto=service.viewDao(id);
		model.addAttribute("detail_view", dto);
		return "detail_view";
	}
	
	@RequestMapping("/update")
	public String update(HttpServletRequest request) throws Exception{
		String name=request.getParameter("name");
		String phone=request.getParameter("phone");
		String address=request.getParameter("address");
		String email=request.getParameter("email");
		String relationship=request.getParameter("relationship");
		int id=Integer.parseInt(request.getParameter("id"));
		
		service.updateDao(name, phone, address, email, relationship, id);
		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request) throws Exception{
		int id=Integer.parseInt(request.getParameter("id"));
		service.deleteDao(id);
		
		return "redirect:list";
	}
}
