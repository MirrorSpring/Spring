package com.springlec.base.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.springlec.base.service.FileService;

@Controller
public class FController {

	@Autowired
	FileService service;
	
	@RequestMapping("/home")
	public String home() {
		return "upload";
	}
	
	@RequestMapping("/upload")
	public String upload(MultipartHttpServletRequest request, @RequestParam("uploadfile") MultipartFile file, Model model) throws Exception{
		service.upload(file, request, model);
		return "uploadresult";
	}
	
	@RequestMapping("/result")
	public String result(HttpServletRequest request, Model model) {
		String filename=request.getParameter("filename");
		model.addAttribute("filename", filename);
		return "uploadresult";
	}
}
