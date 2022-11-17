package com.springlec.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springlec.base.dao.ADao;
import com.springlec.base.model.ADto;

@Service
public class ADaoServiceImpl implements ADaoService {
	
	@Autowired
	ADao dao;

	@Override
	public List<ADto> listDao() throws Exception {
		return dao.listDao();
	}

	@Override
	public void writeDao(String name, String phone, String address, String email, String relationship) throws Exception {
		dao.writeDao(name, phone, address, email, relationship);
	}

	@Override
	public ADto viewDao(int id) throws Exception {
		return dao.viewDao(id);
	}

	@Override
	public void updateDao(String name, String phone, String address, String email, String relationship, int id)
			throws Exception {
		dao.updateDao(name, phone, address, email, relationship, id);
	}

	@Override
	public void deleteDao(int id) throws Exception {
		dao.deleteDao(id);
	}

}
