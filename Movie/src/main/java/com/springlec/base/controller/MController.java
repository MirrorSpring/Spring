package com.springlec.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base.model.MDto;
import com.springlec.base.service.MDaoService;

@Controller
public class MController {

	@Autowired
	MDaoService service;
	
	@RequestMapping("/list")
	public String list(Model model) throws Exception{
		List<MDto> dtos=service.listDao();
		model.addAttribute("list",dtos);
		model.addAttribute("size", dtos.size());
		return "list";
	}
}
