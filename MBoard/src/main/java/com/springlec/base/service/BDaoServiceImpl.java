package com.springlec.base.service;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlec.base.dao.BDao;
import com.springlec.base.model.BDto;

@Service
public class BDaoServiceImpl implements BDaoService{
	
	@Autowired
	BDao dao;
	
	public List<BDto> listDao() throws Exception{
		return dao.listDao();
	}
	
	public void writeDao(HttpServletRequest request) throws Exception{
		String bName=request.getParameter("bName");
		String bTitle=request.getParameter("bTitle");
		String bContent=request.getParameter("bContent");
		
		HttpSession session=request.getSession();
		ServletContext context=session.getServletContext();
		
		System.out.println(context.getRealPath("/"));
		dao.writeDao(bName, bTitle, bContent);
	}

}
