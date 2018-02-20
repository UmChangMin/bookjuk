package com.bookjuk.customer.service;

import org.springframework.web.servlet.ModelAndView;

public interface CustomerService {
	public void customer(ModelAndView mav);
	
	public void noticeList(ModelAndView mav);
	public void noticeRead(ModelAndView mav);
	
	public void inquiryList(ModelAndView mav);
	public void inquiryWrite(ModelAndView mav);
	public void inquiryRead(ModelAndView mav);
	public void inquiryUpdate(ModelAndView mav);
}
