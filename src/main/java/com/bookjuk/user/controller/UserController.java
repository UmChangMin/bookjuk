package com.bookjuk.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tools.ant.taskdefs.condition.Http;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.aop.LogAspect;
import com.bookjuk.user.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService mainService;
	
	@RequestMapping(value = "main.do")
	public ModelAndView main(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		mav.addObject("session", session);
		mainService.main(mav);
		
		return mav;
	}
	
	@RequestMapping(value = "location.do")
	public ModelAndView location(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"userlocation");
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("request", request);
		mainService.location(mav);
		
		return mav;
	}
	
	/* �̺�Ʈ �̱���
	@RequestMapping(value = "event.do")
	public ModelAndView event(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		mainService.event(mav);
		
		return mav;
	}
	 */
	
	@RequestMapping(value="main_header.do")
	public ModelAndView main_header( HttpServletResponse response) {
		LogAspect.logger.info(LogAspect.logMsg+"메인헤더");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("response", response);
		mainService.main_header(mav);
		
		return null;
	}
	
	@RequestMapping(value="search_header")
	public ModelAndView search_header(HttpServletResponse response) {
		LogAspect.logger.info(LogAspect.logMsg+"서치헤더");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("response", response);
		mainService.search_header(mav);
		
		return null;
		
	}
	
}
