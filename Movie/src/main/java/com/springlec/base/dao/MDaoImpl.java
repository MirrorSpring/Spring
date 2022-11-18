package com.springlec.base.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.springlec.base.model.MDto;

public class MDaoImpl implements MDao {
	
	SqlSession sqlSession;
	public static String nameSpace="com.springlec.base.dao.MDao";

	@Override
	public List<MDto> listDao() throws Exception {
		return sqlSession.selectList(nameSpace + ".listDao");
	}

}
