package com.bookjuk.service.service;

import org.springframework.web.servlet.ModelAndView;

public interface ServiceService {
	
	// 자주묻는질문
	public void customer(ModelAndView mav);

	// 공지사항
	public void noticeList(ModelAndView mav);
	public void noticeRead(ModelAndView mav);
	
	// 1:1문의
	public void contactList(ModelAndView mav);
	public void contactWrite(ModelAndView mav);
	public void contactWriteOk(ModelAndView mav);
	public void contactRead(ModelAndView mav);
	public void contactDownLoad(ModelAndView mav);
	public void contactDelete(ModelAndView mav);
	public void contactUpdate(ModelAndView mav);
	public void contactUpdateOk(ModelAndView mav);
	
	
	
}
