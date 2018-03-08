package com.bookjuk.order.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.order.dto.OrderDto;
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
	
	@RequestMapping(value = "/updateAmount.do", method = RequestMethod.GET)
	public ModelAndView updateAmount(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		orderService.updateAmount(mav);
		
		return null;
	}
	
	@RequestMapping(value = "/deleteCart.do", method = RequestMethod.GET)
	public ModelAndView deleteCart(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		orderService.deleteCart(mav);
		
		return null;
	}
	
	@RequestMapping(value = "/order_non.do")
	public ModelAndView orderNon(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		orderService.orderNon(mav);
		
		return mav;
	}
	
	@RequestMapping(value = "/order.do")
	public ModelAndView order(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		orderService.order(mav);
		
		return mav;
	}
	
	@RequestMapping(value = "/zipcode.do")
	public ModelAndView zipcode(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("order/order_zipcode.empty");
	}
	
	@RequestMapping(value = "/complete.do")
	public ModelAndView complete(HttpServletRequest request, HttpServletResponse response, OrderDto orderDto) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		mav.addObject("orderDto", orderDto);
		
		orderService.complete(mav);
		
		return mav;
	}
	
	@RequestMapping(value = "/main.do", method = RequestMethod.GET)
	public ModelAndView orderMain(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		orderService.orderMain(mav);
		
		return mav;
	}
	
/*	@RequestMapping(value="/mainOk.do",method=RequestMethod.POST)
	public ModelAndView orderOk(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		orderService.orderOk(mav);
		
		return mav;
	}*/
	
	@RequestMapping(value="/list.do",method=RequestMethod.GET)
	public ModelAndView orderList(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		orderService.orderList(mav);
		
		return mav;
	}
	
	
	@RequestMapping(value = "/cancle.do", method = RequestMethod.GET)
	public ModelAndView orderCancle(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		orderService.orderCancle(mav);
		
		return mav;
	}
}
