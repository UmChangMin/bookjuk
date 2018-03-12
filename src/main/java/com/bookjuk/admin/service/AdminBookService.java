package com.bookjuk.admin.service;

import org.springframework.web.servlet.ModelAndView;

public interface AdminBookService {

	public void bookSearchKeyword(ModelAndView mav); //키워드검색
	public void bookDownloadMove(ModelAndView mav);
	public void bookSearchMove(ModelAndView mav);
	public void bookInputMove(ModelAndView mav);
	public void bookInputOkMove(ModelAndView mav);
	public void bookOutputMove(ModelAndView mav);
	public void bookUpdateMove(ModelAndView mav);
	public void bookUpdateOkMove(ModelAndView mav);
	
	public void bookDeleteMove(ModelAndView mav);
	public void bookDeleteOkMove(ModelAndView mav);
	
}
