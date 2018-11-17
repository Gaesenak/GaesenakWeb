package com.gaesenak.dao;

import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class anonyDao {

	@Inject
	private SqlSession session;
	
	private static String namespace = "anonyMapper";
	
	public void insertAnonyBoard(Map<String, Object> saveMap){
		session.insert(namespace + ".insertAnonyBoard", saveMap);
	}
}
