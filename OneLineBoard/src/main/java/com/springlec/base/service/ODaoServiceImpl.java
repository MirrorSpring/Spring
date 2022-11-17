package com.springlec.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlec.base.dao.ODao;
import com.springlec.base.model.ODto;

@Service
public class ODaoServiceImpl implements ODaoService {
	
	@Autowired
	ODao dao;

	@Override
	public List<ODto> listDao() throws Exception {
		return dao.listDao();
	}

	@Override
	public void deleteDao(int id) throws Exception {
		dao.deleteDao(id);
	}

	@Override
	public void insertDao(String name, String title) throws Exception {
		dao.insertDao(name, title);
	}

}
