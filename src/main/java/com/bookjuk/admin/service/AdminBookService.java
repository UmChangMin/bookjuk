package com.bookjuk.admin.service;

import org.springframework.web.servlet.ModelAndView;

public interface AdminBookService {

	public void bookSearchMove(ModelAndView mav);
	public void bookInputMove(ModelAndView mav);
	public void bookInputOkMove(ModelAndView mav);
	public void bookOutputMove(ModelAndView mav);
	public void bookUpdateMove(ModelAndView mav);
	public void bookUpdateOkMove(ModelAndView mav);
	
}
