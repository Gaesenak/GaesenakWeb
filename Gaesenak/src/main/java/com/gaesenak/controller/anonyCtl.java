package com.gaesenak.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/anony/*")
public class anonyCtl {

	private static final Logger logger = LoggerFactory.getLogger(anonyCtl.class);
	
	
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
}
