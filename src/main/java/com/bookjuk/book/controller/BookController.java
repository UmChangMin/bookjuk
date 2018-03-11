package com.bookjuk.book.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.aop.LogAspect;
import com.bookjuk.book.dto.BookDto;
import com.bookjuk.book.service.BookService;
import com.bookjuk.user.service.UserService;

@Controller
@RequestMapping(value = "/book")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@Autowired
	private UserService mainService;
	
	public ModelAndView floating(ModelAndView mav, HttpServletRequest request) {
		mav.addObject("request", request);
		mainService.floating(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/*.do", method=RequestMethod.GET)
	public ModelAndView bookBest(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookSpecial(mav);
		
		return floating(mav, request);
	}
	
	/*메인 카테고리*/
	@RequestMapping(value="/list/*.do", method=RequestMethod.GET)
	public ModelAndView bookComputer(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookMainCategory(mav);
		
		return floating(mav, request);
	}
	
	/*서브 카테고리*/
	@RequestMapping(value="/list/*/*.do", method=RequestMethod.GET)
	public ModelAndView bookComputerCom(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookSubCategory(mav);
		
		return floating(mav, request);
	}
	
	@RequestMapping(value="/list/detail.do")
	public ModelAndView bookDetail(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request", request);
		mav.addObject("session", session);
		
		bookService.bookDetail(mav);
		
		return floating(mav, request);
	}
	
	@RequestMapping(value="/list/insertReview.do", method=RequestMethod.POST)
	public ModelAndView bookInsertReview(HttpServletRequest request, HttpServletResponse response, BookDto bookDto) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request", request);
		mav.addObject("bookDto", bookDto);
		
		bookService.bookInsertReview(mav);
		
		return null;
	}
	
	@RequestMapping(value="/list/deleteReview.do", method=RequestMethod.POST)
	public ModelAndView bookDeleteReview(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request", request);
		
		bookService.bookDeleteReview(mav);
		
		return null;
	}
	
	@RequestMapping(value="/list/insertCart.do", method=RequestMethod.POST)
	public ModelAndView bookInsertCart(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request", request);
		
		bookService.insertCart(mav);
		
		return null;
	}
	
	@RequestMapping(value="/list/search.do",method=RequestMethod.GET)
	public ModelAndView bookSearch(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		
		bookService.bookSearch(mav);
		
		return floating(mav, request);
	}
}
