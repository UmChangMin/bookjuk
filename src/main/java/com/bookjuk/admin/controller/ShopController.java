package com.bookjuk.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.service.ShopService;
import com.bookjuk.aop.LogAspect;

@Controller
public class ShopController{

	@Autowired
	private ShopService shopService;
	
	public ShopController() {}

	@RequestMapping(value="/admin/shop/shopManager.do",method=RequestMethod.GET)
	public ModelAndView boardWrite(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"shop?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		shopService.shopMove(mav);
		
		return mav;
	}
	
}
