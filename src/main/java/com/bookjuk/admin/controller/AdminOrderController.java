package com.bookjuk.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.dto.AdminOrderDto;
import com.bookjuk.admin.service.AdminOrderService;
import com.bookjuk.aop.LogAspect;

@Controller
public class AdminOrderController{

	@Autowired
	private AdminOrderService adminOrderService;
	
	public AdminOrderController() {}

	@RequestMapping(value="/admin/order/orderManager_search.do",method=RequestMethod.GET)
	public ModelAndView orderSearch(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"order-search?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		adminOrderService.orderSearchMove(mav);
		
		return mav;
	}	
	
	@RequestMapping(value="/admin/order/orderManager.do",method=RequestMethod.GET)
	public ModelAndView orderOutput(HttpServletRequest request, HttpServletResponse response, AdminOrderDto orderDto) {
		
		LogAspect.logger.info(LogAspect.logMsg+"order?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		mav.addObject("orderDto",orderDto);
		
		adminOrderService.orderOutputMove(mav);
		
		return mav;
	}
	
}
