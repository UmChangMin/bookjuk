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
	
	@RequestMapping(value="/book_list/issue.do", method=RequestMethod.GET)
	public ModelAndView bookIssue(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookIssue(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/book_list/new.do", method=RequestMethod.GET)
	public ModelAndView bookNew(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookNew(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/book_list/discount.do", method=RequestMethod.GET)
	public ModelAndView bookDiscount(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookDiscount(mav);
		
		return mav;
	}
	
	
	@RequestMapping(value="/book_list/computer.do", method=RequestMethod.GET)
	public ModelAndView bookComputer(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookComputer(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/book_list/hobby_trip.do", method=RequestMethod.GET)
	public ModelAndView bookHobby(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookHobby(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/book_list/novel.do", method=RequestMethod.GET)
	public ModelAndView bookNovel(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookNovel(mav);
		
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
