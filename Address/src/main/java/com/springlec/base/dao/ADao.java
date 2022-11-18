package com.springlec.base.dao;

import java.util.List;

import com.springlec.base.model.ADto;

public interface ADao {
	public List<ADto> listDao() throws Exception;
	public void writeDao(String name, String phone, String address, String email, String relationship);
	public ADto viewDao(int id) throws Exception;
	public void updateDao(String name, String phone, String address, String email, String relationship, int id) throws Exception;
	public void deleteDao(int id) throws Exception;
	public List<ADto> searchDao(String condition, String query) throws Exception;
}
