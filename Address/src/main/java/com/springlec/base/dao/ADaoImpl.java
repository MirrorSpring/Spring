package com.springlec.base.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.springlec.base.model.ADto;

public class ADaoImpl implements ADao {

	SqlSession sqlSession;
	
	public static String nameSpace="com.springlec.base.dao.ADao";
	
	@Override
	public List<ADto> listDao() throws Exception {
		return sqlSession.selectList(nameSpace + ".listDao");
	}

	@Override
	public void writeDao(String name, String phone, String address, String email, String relationship) {
		sqlSession.insert(nameSpace + ".writeDao");
	}

	@Override
	public ADto viewDao(int id) throws Exception {
		return (ADto) sqlSession.selectList(nameSpace + ".viewDao");
	}

	@Override
	public void updateDao(String name, String phone, String address, String email, String relationship, int id)
			throws Exception {
		sqlSession.update(nameSpace + ".updateDao");
	}

	@Override
	public void deleteDao(int id) throws Exception {
		sqlSession.delete(nameSpace + ".deleteDao");
	}

	@Override
	public List<ADto> searchDao(String condition, String query) throws Exception {
		return sqlSession.selectList(nameSpace + ".searchDao");
	}

}
