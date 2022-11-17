package com.springlec.base.service;

import java.util.List;

import com.springlec.base.model.BDto;

public interface BDaoService {
	
	public List<BDto> listDao() throws Exception;
	public void writeDao(String bName, String bTitle, String bContent) throws Exception;
	public BDto viewDao(int bId) throws Exception;
	public void updateDao(String bName, String bTitle, String bContent, int bId) throws Exception;
	public void deleteDao(int bId) throws Exception;
}
