package com.springlec.base.service;

import java.util.List;

import com.springlec.base.model.ODto;

public interface ODaoService {
	
	public List<ODto> listDao() throws Exception;
	public void deleteDao(int id) throws Exception;
	public void insertDao(String name, String title) throws Exception;
	
}
