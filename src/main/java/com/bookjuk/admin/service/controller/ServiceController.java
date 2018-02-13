package com.bookjuk.admin.service.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.service.service.ServiceService;
import com.bookjuk.aop.LogAspect;

@Controller
public class ServiceController{

	@Autowired
	private ServiceService serviceService;
	
	public ServiceController() {}

	@RequestMapping(value="/admin/service/service/serviceManager.do",method=RequestMethod.GET)
	public ModelAndView serviceList(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"service?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		serviceService.serviceMove(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/admin/service/notice/noticeManager.do",method=RequestMethod.GET)
	public ModelAndView noticeList(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"notice?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		serviceService.noticeMove(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/admin/service/contact/contactManager.do",method=RequestMethod.GET)
	public ModelAndView contactList(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"contact?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		serviceService.contactMove(mav);
		
		return mav;
	}
	
}
