package com.gaesenak.dao;

import java.util.List;

import com.gaesenak.dao.ListVO;

public interface ListDAO {
	
	public List<ListVO> selectAllList() throws Exception;
	
	public ListVO selectList(int listNum) throws Exception;
	
	public Boolean updateList(int listNum) throws Exception;
	
	public Boolean deleteList(int listNum) throws Exception;

}
