package com.gaesenak.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/soList/*")
public class SoListCtrl {

	private static final Logger logger = LoggerFactory.getLogger(SoListCtrl.class);
	
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	public String anonyBoard() throws Exception{
		logger.debug("soList open");
	
		return "soList/soListViewer";
	}
	
}
