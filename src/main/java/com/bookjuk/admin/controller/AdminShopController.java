package com.bookjuk.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.service.AdminShopService;
import com.bookjuk.aop.LogAspect;

@Controller
public class AdminShopController{

	@Autowired
	private AdminShopService adminShopService;
	
	public AdminShopController() {}

	@RequestMapping(value="/admin/shop/shopManager_search.do",method=RequestMethod.GET)
	public ModelAndView shopSearch(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"shop-search?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		adminShopService.shopSearchMove(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/admin/shop/shopManager.do",method=RequestMethod.GET)
	public ModelAndView shopOutput(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"shop-output?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		adminShopService.shopOutputMove(mav);
		
		return mav;
	}
	
}
