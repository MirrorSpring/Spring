package com.springlec.base;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Form_01 {

	@RequestMapping("/board/confirmId")
	public String confirmId(Model model, HttpServletRequest request) {
		
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "board/confirmid";
	}
	
	@RequestMapping("/board/join")
	public String confirminfo(Member member) {
		
		return "board/checkinfo";
	}
	
	@RequestMapping("/board/checkId")
	public String checkId(Model model, @RequestParam("id") String id, @RequestParam("pw") int pw) { //어트리뷰트를 많이 넘겨받으면 불리
		model.addAttribute("id", id);
		model.addAttribute("pw", pw);
		return "board/confirmid";
	}
}
