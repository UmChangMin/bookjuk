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
	
	
	@RequestMapping(value="/list/best.do", method=RequestMethod.GET)
	public ModelAndView bookBest(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookBest(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/list/issue.do", method=RequestMethod.GET)
	public ModelAndView bookIssue(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookIssue(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/list/new.do", method=RequestMethod.GET)
	public ModelAndView bookNew(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);

		bookService.bookNew(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/list/discount.do", method=RequestMethod.GET)
	public ModelAndView bookDiscount(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookDiscount(mav);
		
		return mav;
	}
	
	/*메인 카테고리*/
	@RequestMapping(value="/list/computer.do", method=RequestMethod.GET)
	public ModelAndView bookComputer(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookMainCategory(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/list/hobby.do", method=RequestMethod.GET)
	public ModelAndView bookHobby(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookMainCategory(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/list/novel.do", method=RequestMethod.GET)
	public ModelAndView bookNovel(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookMainCategory(mav);
		
		return mav;
	}
	
	/*서브 카테고리*/
	@RequestMapping(value="/list/computer/com.do", method=RequestMethod.GET)
	public ModelAndView bookComputerCom(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookSubCategory(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/list/computer/network.do", method=RequestMethod.GET)
	public ModelAndView bookComputerNetwork(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookSubCategory(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/list/computer/security.do", method=RequestMethod.GET)
	public ModelAndView bookComputerSecurity(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookSubCategory(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/list/computer/db.do", method=RequestMethod.GET)
	public ModelAndView bookComputerDb(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookSubCategory(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/list/computer/pro.do", method=RequestMethod.GET)
	public ModelAndView bookComputerPro(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookSubCategory(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/list/computer/graphic.do", method=RequestMethod.GET)
	public ModelAndView bookComputerGraphic(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookSubCategory(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/list/hobby/pet.do", method=RequestMethod.GET)
	public ModelAndView bookHobbyPet(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookSubCategory(mav);
		
		return mav;
	}

	@RequestMapping(value="/list/hobby/fishmount.do", method=RequestMethod.GET)
	public ModelAndView bookHobbyFishmount(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookSubCategory(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/list/hobby/normal.do", method=RequestMethod.GET)
	public ModelAndView bookHobbyNormal(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookSubCategory(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/list/hobby/domestic.do", method=RequestMethod.GET)
	public ModelAndView bookHobbyDomestic(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookSubCategory(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/list/hobby/abroad.do", method=RequestMethod.GET)
	public ModelAndView bookHobbyAbroad(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookSubCategory(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/list/hobby/theme.do", method=RequestMethod.GET)
	public ModelAndView bookHobbyTheme(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookSubCategory(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/list/novel/modern.do", method=RequestMethod.GET)
	public ModelAndView bookNovelModern(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookSubCategory(mav);
		
		return mav;
	}

	@RequestMapping(value="/list/novel/classic.do", method=RequestMethod.GET)
	public ModelAndView bookNovelClassic(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookSubCategory(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/list/novel/mystery.do", method=RequestMethod.GET)
	public ModelAndView bookNovelMystery(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookSubCategory(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/list/novel/romance.do", method=RequestMethod.GET)
	public ModelAndView bookNovelRomance(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookSubCategory(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/list/novel/history.do", method=RequestMethod.GET)
	public ModelAndView bookNovelHistory(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		
		bookService.bookSubCategory(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/list/novel/fantasy.do", method=RequestMethod.GET)
	public ModelAndView bookNovelFantasy(HttpServletRequest request, HttpServletResponse response) {
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
