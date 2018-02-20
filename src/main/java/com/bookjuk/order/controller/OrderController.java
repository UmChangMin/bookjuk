package com.bookjuk.order.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.aop.LogAspect;
import com.bookjuk.order.service.OrderService;

@Controller
@RequestMapping(value = "/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value = "/cart.do", method = RequestMethod.GET)
	public ModelAndView cart(HttpServletRequest request, HttpServletResponse response) {
		LogAspect.logger.info(LogAspect.logMsg + "cart");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		orderService.cart(mav);
		
		return mav;
	}
	
	@RequestMapping(value = "/orderMain.do", method = RequestMethod.GET)
	public ModelAndView orderMain(HttpServletRequest request, HttpServletResponse response) {
		LogAspect.logger.info(LogAspect.logMsg + "cart");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		orderService.orderMain(mav);
		
		return mav;
	}
	
	@RequestMapping(value = "/orderList.do", method = RequestMethod.GET)
	public ModelAndView orderList(HttpServletRequest request, HttpServletResponse response) {
		LogAspect.logger.info(LogAspect.logMsg + "cart");
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		orderService.orderList(mav);
		
		return mav;
	}
}
