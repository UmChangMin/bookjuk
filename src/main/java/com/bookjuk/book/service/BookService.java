package com.bookjuk.book.service;

import org.springframework.web.servlet.ModelAndView;

public interface BookService {
	
	public void bookBest(ModelAndView mav);
	public void bookIssue(ModelAndView mav);
	public void bookNew(ModelAndView mav);
	public void bookDiscount(ModelAndView mav);
	public void bookComputer(ModelAndView mav);
	public void bookHobby(ModelAndView mav);
	public void bookNovel(ModelAndView mav);
	
	public void bookDetail(ModelAndView mav);

}
