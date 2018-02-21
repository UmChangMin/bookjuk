package com.bookjuk.order.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.order.service.OrderService;

@Controller
@RequestMapping(value = "/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value = "/cart.do", method = RequestMethod.GET)
	public ModelAndView cart(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		orderService.cart(mav);
		
		return mav;
	}
	
	@RequestMapping(value = "/order_non.do", method = RequestMethod.GET)
	public ModelAndView orderNon(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		orderService.orderNon(mav);
		
		return mav;
	}
	
	@RequestMapping(value = "/order.do", method = RequestMethod.GET)
	public ModelAndView order(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		orderService.order(mav);
		
		return mav;
	}
	
	@RequestMapping(value = "/complete.do", method = RequestMethod.GET)
	public ModelAndView complete(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		orderService.complete(mav);
		
		return mav;
	}
	
	@RequestMapping(value = "/order_main.do", method = RequestMethod.GET)
	public ModelAndView orderMain(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		orderService.orderMain(mav);
		
		return mav;
	}
	
	@RequestMapping(value = "/order_list.do", method = RequestMethod.GET)
	public ModelAndView orderList(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		orderService.orderList(mav);
		
		return mav;
	}
}
