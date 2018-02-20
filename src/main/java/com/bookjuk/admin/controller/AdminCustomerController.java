package com.bookjuk.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.service.AdminCustomerService;
import com.bookjuk.aop.LogAspect;

@Controller
public class AdminCustomerController{

	@Autowired
	private AdminCustomerService adminCustomerService;
	
	public AdminCustomerController() {}

	@RequestMapping(value="/admin/customer/customerManager.do",method=RequestMethod.GET)
	public ModelAndView customerOutput(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"customer?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		adminCustomerService.customerOutputMove(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/admin/customer/customerManager_search.do",method=RequestMethod.GET)
	public ModelAndView customerSearch(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"customer?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		adminCustomerService.customerSearchMove(mav);
		
		return mav;
	}
	
}
