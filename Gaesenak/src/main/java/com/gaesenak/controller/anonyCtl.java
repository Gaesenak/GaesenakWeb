package com.gaesenak.controller;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gaesenak.service.anonySvc;

@Controller
@RequestMapping("/anony/*")
public class anonyCtl {

	private static final Logger logger = LoggerFactory.getLogger(anonyCtl.class);
	
	@Inject
	private anonySvc anonySvc;
	
	
	@RequestMapping(value = "/anonyBoard", method = RequestMethod.GET)
	public ModelAndView anonyBoard(ModelAndView mav) throws Exception {
		logger.debug("anonyBoard Test");
		mav.setViewName("anonyBoard/anonyBoard");
		return mav;
	}
	
	@RequestMapping(value = "/anonyRegi", method = RequestMethod.GET)
	public ModelAndView anonyRegi(ModelAndView mav) throws Exception {
		logger.debug("anonyRegi Test");
		mav.setViewName("anonyBoard/anonyRegi");
		return mav;
	}
	
	@RequestMapping(value = "/anonyRegi", method = RequestMethod.POST)
	public ResponseEntity<String> anonyRegiPost(ModelAndView mav,
			@RequestBody Map<String, Object> paramMap
			) throws Exception {
		ResponseEntity<String> result = null;
		
		Map<String, Object> saveMap = new HashMap<String, Object>();
		saveMap.put("title"		, paramMap.get("title"));
		saveMap.put("writer"	, paramMap.get("writer"));
		saveMap.put("content"	, paramMap.get("content"));
		saveMap.put("password"	, null);
		
		try{
			anonySvc.insertAnonyBoard(saveMap);
			result = new ResponseEntity<String>("success", HttpStatus.OK);
		}catch(Exception e){
			e.printStackTrace();
			result = new ResponseEntity<String>("fail", HttpStatus.BAD_REQUEST);
		}
		
		return result;
	}
}