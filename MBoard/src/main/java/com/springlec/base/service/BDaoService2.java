package com.springlec.base.service;

import com.springlec.base.model.BDto;

public interface BDaoService2 {
	
	public BDto viewDao(int bId) throws Exception;
	public void updateDao(String bName, String bTitle, String bContent, int bId) throws Exception;
	public void deleteDao(int bId) throws Exception;
}
