package com.bookjuk.book.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.aop.LogAspect;
import com.bookjuk.book.service.BookService;

@Controller
@RequestMapping(value = "/book")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	
	@RequestMapping(value="/*.do", method=RequestMethod.GET)
	public ModelAndView bookBest(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookSpecial(mav);
		
		return mav;
	}
	
	/*메인 카테고리*/
	@RequestMapping(value="/list/*.do", method=RequestMethod.GET)
	public ModelAndView bookComputer(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookMainCategory(mav);
		
		return mav;
	}
	
	/*서브 카테고리*/
	@RequestMapping(value="/list/*/*.do", method=RequestMethod.GET)
	public ModelAndView bookComputerCom(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookSubCategory(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/list/detail.do", method=RequestMethod.GET)
	public ModelAndView bookDetail(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookDetail(mav);
		
		return mav;
	}
	
}
