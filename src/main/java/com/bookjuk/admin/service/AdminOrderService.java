package com.bookjuk.admin.service;

import org.springframework.web.servlet.ModelAndView;

public interface AdminOrderService {

	public void orderSearchMove(ModelAndView mav);
	public void orderOutputMove(ModelAndView mav);
	public void orderUpdateMove(ModelAndView mav);
	public void orderUpdateOkMove(ModelAndView mav);
	
	
}
