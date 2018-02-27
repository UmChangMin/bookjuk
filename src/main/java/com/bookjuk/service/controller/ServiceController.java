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

@Controller
@RequestMapping(value = "/service")
public class ServiceController {
	
	@Autowired
	private ServiceService customerService;
	
	@RequestMapping(value = "/question.do", method = RequestMethod.GET)
	public ModelAndView customer(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"고객센터 자주묻는 질문!");
		
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
	
	@RequestMapping(value = "/contact/list.do")
	public ModelAndView contactList(HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		customerService.contactList(mav);
		
		return mav;
	}
	
	@RequestMapping(value = "/contact/write.do")
	public ModelAndView contactWrite(HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		
		customerService.contactWrite(mav);
		
		return mav;
	}
	
	@RequestMapping(value = "/contact/writeOk.do")
	public ModelAndView contactWriteOk(HttpServletRequest request, HttpServletResponse response, ServiceContactDto serviceContactDto, HttpSession session) {
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request", request);
		mav.addObject("session", session);
		mav.addObject("serviceContactDto", serviceContactDto);
		
		customerService.contactWriteOk(mav);
		
		return mav;
		
	}
	
	@RequestMapping(value = "/contact/read.do")
	public ModelAndView contactRead(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		customerService.contactRead(mav);
		
		return mav;
	}
	
	@RequestMapping(value = "/contact/update.do")
	public ModelAndView contactUpdate(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		customerService.contactUpdate(mav);
		
		return mav;
	}
}
