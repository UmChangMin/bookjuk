package com.bookjuk.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.user.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService mainService;
	
	@RequestMapping(value = "main.do")
	public ModelAndView main(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		mainService.main(mav);
		
		return mav;
	}
	
	@RequestMapping(value = "shop.do")
	public ModelAndView shop(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		mainService.shop(mav);
		
		return mav;
	}
	
	/* 이벤트 미구현
	@RequestMapping(value = "event.do")
	public ModelAndView event(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		mainService.event(mav);
		
		return mav;
	}
	 */
}
