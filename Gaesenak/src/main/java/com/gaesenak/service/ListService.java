package com.gaesenak.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gaesenak.dao.ListVO;

@Service
public interface ListService {

	public  List<ListVO> selectAllList() throws Exception;
	
	public  ListVO selectList(int listNum) throws Exception;
	
	public void updateList(int listNum) throws Exception;
	
	public void deleteList(int listNum) throws Exception;
}
