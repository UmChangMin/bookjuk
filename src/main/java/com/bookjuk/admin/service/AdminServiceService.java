package com.bookjuk.admin.service;

import org.springframework.web.servlet.ModelAndView;

public interface AdminServiceService {

	//자주묻는질문
	public void serviceMove(ModelAndView mav);
	public void serviceWriteMove(ModelAndView mav);
	public void serviceWriteOkMove(ModelAndView mav);
	public void serviceUpdateMove(ModelAndView mav);
	public void serviceUpdateOkMove(ModelAndView mav);
	public void serviceDeleteMove(ModelAndView mav);
	public void serviceDeleteOkMove(ModelAndView mav);
	
	//공지사항
	public void noticeMove(ModelAndView mav);
	public void noticeReadMove(ModelAndView mav);
	public void noticeWriteMove(ModelAndView mav);
	public void noticeWriteOkMove(ModelAndView mav);
	public void noticeUpdateMove(ModelAndView mav);
	public void noticeUpdateOkMove(ModelAndView mav);
	public void noticeDeleteMove(ModelAndView mav);
	public void noticeDeleteOkMove(ModelAndView mav);
	
	
	//1:1문의
	public void contactMove(ModelAndView mav);
	public void contactReadMove(ModelAndView mav);
	public void contactWriteMove(ModelAndView mav);
	public void contactWriteOkMove(ModelAndView mav);
	public void contactUpdateMove(ModelAndView mav);
	public void contactDeleteMove(ModelAndView mav);
	public void contactDeleteOkMove(ModelAndView mav);
	public void serviceDownload(ModelAndView mav);
	
}
