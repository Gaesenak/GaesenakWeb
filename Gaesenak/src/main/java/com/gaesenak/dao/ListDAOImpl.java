package com.gaesenak.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.gaesenak.dao.ListVO;

@Repository
public class ListDAOImpl implements ListDAO{

	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "com.gaesenak.mapper.So_List_Mapper";
		
	@Override
	public List<ListVO> selectAllList() throws Exception {
		
		return sqlSession.selectList(namespace + ".selectAllList");
	}

	@Override
	public ListVO selectList(int listNum) throws Exception {
		
		return sqlSession.selectOne(namespace + ".selectList", listNum);
	}

	@Override
	public Boolean updateList(int listNum) throws Exception {
		
		sqlSession.update(namespace + ".updateList", listNum);
		return true;
	}

	@Override
	public Boolean deleteList(int listNum) throws Exception {
		
		sqlSession.delete(namespace + ".deleteList", listNum);
		return true;
	}

}
