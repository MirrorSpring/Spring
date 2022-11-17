package com.springlec.base.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.springlec.base.model.BDto;

public class BDaoImpl implements BDao {
	
	SqlSession sqlSession; //BDao.xml과 연결
	
	public static String nameSpace="com.springlec.base.dao.BDao";

	@Override
	public List<BDto> listDao() throws Exception {
		return sqlSession.selectList(nameSpace + ".listDao");
	}

	public void writeDao(String bName, String bTitle, String bContent) throws Exception{
		sqlSession.insert(nameSpace + ".writeDao");
	}
	
	public BDto viewDao(int bId) throws Exception{
		return (BDto) sqlSession.selectList(nameSpace + ".viewDao");
	}

	public void updateDao(String bName, String bTitle, String bContent, int bId) throws Exception {
		sqlSession.update(nameSpace + ".updateDao");
	}

	public void deleteDao(int bId) throws Exception {
		sqlSession.delete(nameSpace + ".deleteDao");
	}
}
