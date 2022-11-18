package com.springlec.base.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springlec.base.model.ADto;

@Service
public interface ADaoService {

	public List<ADto> listDao() throws Exception;
	public void writeDao(String name, String phone, String address, String email, String relationship) throws Exception;
	public ADto viewDao(int id) throws Exception;
	public void updateDao(String name, String phone, String address, String email, String relationship, int id) throws Exception;
	public void deleteDao(int id) throws Exception;
	public List<ADto> searchDao(String condition, String query) throws Exception;
}
