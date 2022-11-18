package com.springlec.base.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlec.base.dao.BDao;
import com.springlec.base.model.BDto;

@Service
public class BDaoServiceImpl2 implements BDaoService2{
	
	@Autowired
	BDao dao;

	public BDto viewDao(int bId) throws Exception {
		return dao.viewDao(bId);
	}

	public void updateDao(String bName, String bTitle, String bContent, int bId) throws Exception{
		dao.updateDao(bName, bTitle, bContent, bId);
	}
	
	public void deleteDao(int bId) throws Exception{
		dao.deleteDao(bId);
	}
}
