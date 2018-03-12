package com.bookjuk.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.dto.AdminBookDto;
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
		mav.addObject("response",response);
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
	
	@RequestMapping(value="/admin/book/bookManager_inputOk.do",method=RequestMethod.POST)
	public ModelAndView bookInputOk(HttpServletRequest request, HttpServletResponse response, AdminBookDto adminBookDto) {
		
		LogAspect.logger.info(LogAspect.logMsg+"book-inputOk?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		mav.addObject("adminBookDto",adminBookDto);
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
	
	@RequestMapping(value="/admin/book/book_Download.do",method=RequestMethod.GET)
	public ModelAndView bookDownload(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"book-download?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		mav.addObject("response", response);
		adminBookService.bookDownloadMove(mav);
		
		return null;
	}
	
	
	
	@RequestMapping(value="/admin/book/bookManager_update.do",method=RequestMethod.GET)
	public ModelAndView bookUpdate(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"book-update?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		adminBookService.bookUpdateMove(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/admin/book/bookManager_updateOk.do",method=RequestMethod.POST)
	public ModelAndView bookUpdateOk(HttpServletRequest request, HttpServletResponse response, AdminBookDto adminBookDto) {
		
		LogAspect.logger.info(LogAspect.logMsg+"book-updateOk?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		mav.addObject("adminBookDto", adminBookDto);
		adminBookService.bookUpdateOkMove(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/admin/book/bookManager_delete.do",method=RequestMethod.GET)
	public ModelAndView bookDelete(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"book-delete?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		adminBookService.bookDeleteMove(mav);
		
		return mav;
	}
	 
	@RequestMapping(value="/admin/book/bookManager_deleteOk.do",method=RequestMethod.GET)
	public ModelAndView bookDeleteOk(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"book-deleteOk?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		adminBookService.bookDeleteOkMove(mav);
		
		return mav;
	}
	
	
	//가상경로
	@RequestMapping(value="/admin/book/bookManager_searchKeyword.do",method=RequestMethod.POST)
	public ModelAndView bookSearchKeyword(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"book-search-keyword?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		mav.addObject("response",response);
		adminBookService.bookSearchKeyword(mav);
		
		return null;
	}

	
	
}
