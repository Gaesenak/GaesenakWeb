package com.gaesenak.service;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gaesenak.dao.anonyDao;

@Service
public class anonySvc {
	
	@Inject
	private anonyDao dao;
	
	@Transactional
	public void insertAnonyBoard(Map<String, Object> saveMap){
		dao.insertAnonyBoard(saveMap);
	}

}
