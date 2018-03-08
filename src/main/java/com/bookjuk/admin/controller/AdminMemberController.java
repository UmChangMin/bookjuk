package com.bookjuk.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.dto.AdminMemberDto;
import com.bookjuk.admin.service.AdminMemberService;
import com.bookjuk.aop.LogAspect;

@Controller
public class AdminMemberController{

	@Autowired
	private AdminMemberService adminMemberService;
	
	public AdminMemberController() {}

	@RequestMapping(value="/admin/member/memberManager_search.do",method=RequestMethod.GET)
	public ModelAndView customerSearch(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"Member-search?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		adminMemberService.memberSearchMove(mav);
		
		return mav;
	}

	@RequestMapping(value="/admin/member/memberManager.do",method=RequestMethod.GET)
	public ModelAndView customerOutput(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"Member?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		adminMemberService.memberOutputMove(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/admin/member/memberManager_update.do",method=RequestMethod.GET)
	public ModelAndView memberUpdate(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"Member_update?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		adminMemberService.memberUpdate(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/admin/member/memberManager_updateOk.do",method=RequestMethod.POST)
	public ModelAndView memberUpdateOk(HttpServletRequest request, HttpServletResponse response, AdminMemberDto adminMemberDto) {
		
		LogAspect.logger.info(LogAspect.logMsg+"Member_updateOk?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		mav.addObject("adminMemberDto",adminMemberDto);
		adminMemberService.memberUpdateOk(mav);		
		return mav;
	}
	
	@RequestMapping(value="/admin/member/memberManager_delete.do",method=RequestMethod.GET)
	public ModelAndView memberDelete(HttpServletRequest request, HttpServletResponse response) {		
		LogAspect.logger.info(LogAspect.logMsg+"Member_delete?");		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		adminMemberService.memberDelete(mav);		
		return mav;		
	}
	
	@RequestMapping(value="/admin/member/memberManager_deleteOk.do",method=RequestMethod.POST)
	public ModelAndView memberDeleteOk(HttpServletRequest request, HttpServletResponse response) {		
		LogAspect.logger.info(LogAspect.logMsg+"Member_delete?");		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		adminMemberService.memberDeleteOk(mav);		
		return mav;		
	}
}
