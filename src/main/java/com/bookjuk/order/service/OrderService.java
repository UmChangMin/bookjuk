package com.bookjuk.order.service;

import org.springframework.web.servlet.ModelAndView;

public interface OrderService {
	public void cart(ModelAndView mav);
	
	public void orderMain(ModelAndView mav);
	public void orderList(ModelAndView mav);
	
}
