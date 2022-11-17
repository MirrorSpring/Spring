package com.springlec.base.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.springlec.base.model.ODto;

public class ODaoImpl implements ODao {
	
	SqlSession sqlSession;
	
	public static String nameSpace="com.springlec.base.dao.ODao";

	@Override
	public List<ODto> listDao() throws Exception {
		return sqlSession.selectList(nameSpace + ".listDao");
	}

	@Override
	public void deleteDao(int id) throws Exception {
		sqlSession.delete(nameSpace + ".deleteDao");
	}

	@Override
	public void insertDao(String name, String title) throws Exception {
		sqlSession.insert(nameSpace + ".insertDao");
	}

}
