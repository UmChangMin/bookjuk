package com.bookjuk.admin.order.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.order.service.OrderService;
import com.bookjuk.aop.LogAspect;

@Controller
public class OrderController{

	@Autowired
	private OrderService orderService;
	
	public OrderController() {}

	@RequestMapping(value="/admin/order/orderManager.do",method=RequestMethod.GET)
	public ModelAndView boardWrite(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"order?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		orderService.orderMove(mav);
		
		return mav;
	}
	
}
