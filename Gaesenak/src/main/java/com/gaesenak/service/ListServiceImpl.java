package com.gaesenak.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gaesenak.dao.ListDAO;
import com.gaesenak.dao.ListVO;

@Service
public class ListServiceImpl implements ListService{

	private ListDAO listDao;
	
	@Override
	public List<ListVO> selectAllList() throws Exception {
		
		return listDao.selectAllList();
	}

	@Override
	public ListVO selectList(int listNum) throws Exception {
		
		return listDao.selectList(listNum);
	}

	@Override
	public void updateList(int listNum) throws Exception {
		
		Boolean res =  listDao.updateList(listNum);
	}

	@Override
	public void deleteList(int listNum) throws Exception {
		
		Boolean res =  listDao.deleteList(listNum);
	}

}
