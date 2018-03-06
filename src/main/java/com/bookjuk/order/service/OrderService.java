package com.bookjuk.order.service;

import org.springframework.web.servlet.ModelAndView;

public interface OrderService {
	public void cart(ModelAndView mav);
	public void updateAmount(ModelAndView mav);
	public void deleteCart(ModelAndView mav);
	
	public void orderNon(ModelAndView mav);
	public void order(ModelAndView mav);
	public void zipcode(ModelAndView mav);
	public void complete(ModelAndView mav);
	
	public void orderMain(ModelAndView mav);
/*	public void orderOk(ModelAndView mav);*/
	public void orderList(ModelAndView mav);
	public void orderCancle(ModelAndView mav);
	
}
