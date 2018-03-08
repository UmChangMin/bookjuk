package com.bookjuk.book.service;

import org.springframework.web.servlet.ModelAndView;

public interface BookService {
	
	public void bookSpecial(ModelAndView mav);
	
	public void bookMainCategory(ModelAndView mav);
	public void bookSubCategory(ModelAndView mav);
	
	public void bookDetail(ModelAndView mav);

	public void bookInsertReview(ModelAndView mav);
	public void bookDeleteReview(ModelAndView mav);
	
	public void insertCart(ModelAndView mav);
	
	public void book_search_List(ModelAndView mav);
}
