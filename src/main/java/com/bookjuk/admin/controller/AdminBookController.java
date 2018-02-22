package com.bookjuk.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.service.AdminBookService;
import com.bookjuk.aop.LogAspect;

@Controller
public class AdminBookController{

	@Autowired
	private AdminBookService adminBookService;
	
	public AdminBookController() {}

	@RequestMapping(value="/admin/book/bookManager_search.do",method=RequestMethod.GET)
	public ModelAndView bookSearch(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"book-search?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		adminBookService.bookSearchMove(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/admin/book/bookManager_input.do",method=RequestMethod.GET)
	public ModelAndView bookInput(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"book-input?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		adminBookService.bookInputMove(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/admin/book/bookManager_inputOk.do",method=RequestMethod.GET)
	public ModelAndView bookInputOk(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"book-inputOk?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		adminBookService.bookInputOkMove(mav);
		
		return mav;
	}
	
	
	@RequestMapping(value="/admin/book/bookManager.do",method=RequestMethod.GET)
	public ModelAndView bookOutput(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"book?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		adminBookService.bookOutputMove(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/admin/book/bookManager_update.do",method=RequestMethod.GET)
	public ModelAndView bookUpdate(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"book-update?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		adminBookService.bookUpdateMove(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/admin/book/bookManager_updateOk.do",method=RequestMethod.GET)
	public ModelAndView bookUpdateOk(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"book-updateOk?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		adminBookService.bookUpdateOkMove(mav);
		
		return mav;
	}
}
