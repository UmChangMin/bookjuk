package com.bookjuk.book.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.book.service.BookService;

@Controller
@RequestMapping(value = "/book")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	
	@RequestMapping(value="/book_list/best.do", method=RequestMethod.GET)
	public ModelAndView bookBest(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookBest(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/book_detail/detail.do", method=RequestMethod.GET)
	public ModelAndView bookDetail(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookDetail(mav);
		
		return mav;
	}
	
}
