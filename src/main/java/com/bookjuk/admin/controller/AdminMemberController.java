package com.bookjuk.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.service.AdminMemberService;
import com.bookjuk.aop.LogAspect;

@Controller
public class AdminMemberController{

	@Autowired
	private AdminMemberService adminMemberService;
	
	public AdminMemberController() {}

	@RequestMapping(value="/admin/member/memberManager.do",method=RequestMethod.GET)
	public ModelAndView customerOutput(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"Member?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		adminMemberService.memberOutputMove(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/admin/member/memberManager_search.do",method=RequestMethod.GET)
	public ModelAndView customerSearch(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"Member-search?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		adminMemberService.memberSearchMove(mav);
		
		return mav;
	}
	
}
