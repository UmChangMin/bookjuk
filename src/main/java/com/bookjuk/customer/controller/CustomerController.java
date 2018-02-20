package com.bookjuk.customer.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.customer.service.CustomerService;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "/customer.do", method = RequestMethod.GET)
	public ModelAndView customer(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		customerService.customer(mav);
		
		return mav;
	}
	
	@RequestMapping(value = "/notice/list.do", method = RequestMethod.GET)
	public ModelAndView noticeList(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		customerService.noticeList(mav);
		
		return mav;
	}
	
	@RequestMapping(value = "/notice/read.do", method = RequestMethod.GET)
	public ModelAndView noticeRead(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		customerService.noticeRead(mav);
		
		return mav;
	}
	
	@RequestMapping(value = "/inquiry/list.do")
	public ModelAndView inquiryList(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		customerService.inquiryList(mav);
		
		return mav;
	}
	
	@RequestMapping(value = "/inquiry/write.do")
	public ModelAndView inquiryWrite(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		customerService.inquiryWrite(mav);
		
		return mav;
	}
	
	@RequestMapping(value = "/inquiry/read.do")
	public ModelAndView inquiryRead(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		customerService.inquiryRead(mav);
		
		return mav;
	}
	
	@RequestMapping(value = "/inquiry/update.do")
	public ModelAndView inquiryUpdate(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		customerService.inquiryUpdate(mav);
		
		return mav;
	}
}
