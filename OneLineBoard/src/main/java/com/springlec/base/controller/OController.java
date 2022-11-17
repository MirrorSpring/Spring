package com.springlec.base.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base.model.ODto;
import com.springlec.base.service.ODaoService;

@Controller
public class OController {
	
	@Autowired
	ODaoService service;
	
	@RequestMapping("/list")
	public String list(Model model) throws Exception{
		List<ODto> listDao=service.listDao();
		model.addAttribute("list",listDao);
		return "listview";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request) throws Exception{
		int id=Integer.parseInt(request.getParameter("id"));
		service.deleteDao(id);
		return "redirect:list";
	}
	
	@RequestMapping("/write_view")
	public String writeview() throws Exception{
		return "write_view";
	}
	
	@RequestMapping("/write")
	public String write(HttpServletRequest request) throws Exception{
		String name=request.getParameter("name");
		String title=request.getParameter("title");
		service.insertDao(name, title);
		return "redirect:list";
	}

}
