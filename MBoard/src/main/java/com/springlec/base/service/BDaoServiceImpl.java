package com.springlec.base.service;

import java.util.List;

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
	
	public void writeDao(String bName, String bTitle, String bContent) throws Exception{
		dao.writeDao(bName, bTitle, bContent);
	}

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
