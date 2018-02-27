package com.bookjuk.service.service;

import org.springframework.web.servlet.ModelAndView;

public interface ServiceService {
	public void customer(ModelAndView mav);

	public void noticeList(ModelAndView mav);
	public void noticeRead(ModelAndView mav);
	
	public void contactList(ModelAndView mav);
	public void contactWrite(ModelAndView mav);
	public void contactWriteOk(ModelAndView mav);
	
	
	public void contactRead(ModelAndView mav);
	public void contactUpdate(ModelAndView mav);
}
