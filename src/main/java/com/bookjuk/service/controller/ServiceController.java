package com.bookjuk.service.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.aop.LogAspect;
import com.bookjuk.service.dto.ServiceContactDto;
import com.bookjuk.service.service.ServiceService;
import com.bookjuk.user.service.UserService;

@Controller
@RequestMapping(value = "/service")
public class ServiceController {
	
	@Autowired
	private ServiceService customerService;
	
	@Autowired
	private UserService mainService;
	
	public ModelAndView floating(ModelAndView mav, HttpServletRequest request) {
		mav.addObject("request", request);
		mainService.floating(mav);
		
		return mav;
	}
	
	@RequestMapping(value = "/question.do", method = RequestMethod.GET)
	public ModelAndView customer(HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		customerService.customer(mav);
		
		return floating(mav, request);
	}
	
	@RequestMapping(value = "/notice/list.do", method = RequestMethod.GET)
	public ModelAndView noticeList(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		customerService.noticeList(mav);
		
		return floating(mav, request);
	}
	
	@RequestMapping(value = "/notice/read.do", method = RequestMethod.GET)
	public ModelAndView noticeRead(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		customerService.noticeRead(mav);
		
		return floating(mav, request);
	}
	
	@RequestMapping(value = "/contact/list.do", method=RequestMethod.GET)
	public ModelAndView contactList(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		mav.addObject("session",session);
		
		customerService.contactList(mav);
		
		return floating(mav, request);
	}
	
	@RequestMapping(value = "/contact/write.do", method=RequestMethod.GET)
	public ModelAndView contactWrite(HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		
		customerService.contactWrite(mav);
		
		return floating(mav, request);
	}
	
	@RequestMapping(value = "/contact/writeOk.do", method=RequestMethod.POST)
	public ModelAndView contactWriteOk(HttpServletRequest request, HttpServletResponse response, ServiceContactDto serviceContactDto, HttpSession session) {
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request", request);
		mav.addObject("session", session);
		mav.addObject("serviceContactDto", serviceContactDto);
		
		customerService.contactWriteOk(mav);
		
		return floating(mav, request);
		
	}
	
	@RequestMapping(value = "/contact/read.do", method=RequestMethod.GET)
	public ModelAndView contactRead(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		customerService.contactRead(mav);
		
		return floating(mav, request);
	}
	
	@RequestMapping(value = "/contact/update.do", method=RequestMethod.GET)
	public ModelAndView contactUpdate(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		customerService.contactUpdate(mav);
		
		return floating(mav, request);
	}
	
	@RequestMapping(value="/contact/updateOk.do",method=RequestMethod.POST)
	public ModelAndView contactUpdateOk(HttpServletRequest request,HttpServletResponse response,ServiceContactDto serviceContactDto) {
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		mav.addObject("serviceContactDto",serviceContactDto);
		
		customerService.contactUpdateOk(mav);
		
		return floating(mav, request);
	}
	
	@RequestMapping(value="/contact/download.do",method=RequestMethod.GET)
	public ModelAndView contactDownLoad(HttpServletRequest request, HttpServletResponse response) {
		
		// 다운로드는 response도 !!!
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		mav.addObject("response",response);
	
		customerService.contactDownLoad(mav);
		
		//  페이지 이동없을 시 null
		return null;
	}
	
	@RequestMapping(value = "/contact/delete.do", method=RequestMethod.GET)
	public ModelAndView contactDelete(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		customerService.contactDelete(mav);
		
		return floating(mav, request);
	}
}
