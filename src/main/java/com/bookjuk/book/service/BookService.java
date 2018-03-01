package com.bookjuk.book.service;

import org.springframework.web.servlet.ModelAndView;

public interface BookService {
	
	public void bookSpecial(ModelAndView mav);
	
	public void bookMainCategory(ModelAndView mav);
	public void bookSubCategory(ModelAndView mav);
	
	public void bookDetail(ModelAndView mav);

}
