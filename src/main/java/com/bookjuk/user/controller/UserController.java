package com.bookjuk.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.aop.LogAspect;
import com.bookjuk.user.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService mainService;
	
	public ModelAndView floating(ModelAndView mav, HttpServletRequest request) {
		mav.addObject("request", request);
		mainService.floating(mav);
		
		return mav;
	}
	
	@RequestMapping(value = "main.do")
	public ModelAndView main(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		mav.addObject("session", session);
		mainService.main(mav);
		
		return floating(mav, request);
	}
	
	@RequestMapping(value = "location.do")
	public ModelAndView location(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		mainService.location(mav);
		
		return floating(mav, request);
	}
	
	@RequestMapping(value = "**/search.do")
	public ModelAndView headerSearch(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		mav.addObject("response", response);
		mainService.search(mav);
		
		return null;
	}
	
	/*이벤트
	@RequestMapping(value = "event.do")
	public ModelAndView event(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		mainService.event(mav);
		
		return mav;
	}*/
}
