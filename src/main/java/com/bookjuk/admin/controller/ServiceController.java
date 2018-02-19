package com.bookjuk.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.service.ServiceService;
import com.bookjuk.aop.LogAspect;

@Controller
public class ServiceController{

	@Autowired
	private ServiceService serviceService;
	
	public ServiceController() {}

	//자주묻는질문 목록
	@RequestMapping(value="/admin/service/service/serviceManager.do",method=RequestMethod.GET)
	public ModelAndView serviceList(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"service?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		serviceService.serviceMove(mav);
		
		return mav;
	}
	
	//자주묻는질문 글쓰기
	@RequestMapping(value="/admin/service/service/serviceManager_write.do",method=RequestMethod.GET)
	public ModelAndView serviceWrite(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"service-write?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		serviceService.serviceWriteMove(mav);
		
		return mav;
	}
	
	//자주묻는질문 수정
	@RequestMapping(value="/admin/service/service/serviceManager_update.do",method=RequestMethod.GET)
	public ModelAndView serviceUpdate(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"service-update?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		serviceService.serviceUpdateMove(mav);
		
		return mav;
	}
	
	//자주묻는질문 삭제
	@RequestMapping(value="/admin/service/service/serviceManager_delete.do",method=RequestMethod.GET)
	public ModelAndView serviceDelete(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"service-delete?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		serviceService.serviceDeleteMove(mav);
		
		return mav;
	}
	
	/*자주묻는질문 끝*/
	/**/
	/**/
	/**/
	/**/
	/**/
	/**/
		
	//공지사항 목록
	@RequestMapping(value="/admin/service/notice/noticeManager.do",method=RequestMethod.GET)
	public ModelAndView noticeList(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"notice?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		serviceService.noticeMove(mav);
		
		return mav;
	}
	
	//공지사항 읽기
	@RequestMapping(value="/admin/service/notice/noticeManager_read.do",method=RequestMethod.GET)
	public ModelAndView noticeRead(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"notice-read?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		serviceService.noticeReadMove(mav);
		
		return mav;
	}
	
	//공지사항 쓰기
	@RequestMapping(value="/admin/service/notice/noticeManager_write.do",method=RequestMethod.GET)
	public ModelAndView noticeWrite(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"notice-write?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		serviceService.noticeWriteMove(mav);
		
		return mav;
	}
	
	//공지사항 수정
	@RequestMapping(value="/admin/service/notice/noticeManager_update.do",method=RequestMethod.GET)
	public ModelAndView noticeUpdate(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"notice-update?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		serviceService.noticeUpdateMove(mav);
		
		return mav;
	}
	
	//공지사항 삭제
	@RequestMapping(value="/admin/service/notice/noticeManager_delete.do",method=RequestMethod.GET)
	public ModelAndView noticeDelete(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"notice-delete?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		serviceService.noticeDeleteMove(mav);
		
		return mav;
	}

	/*공지사항 끝*/
	/**/
	/**/
	/**/
	/**/
	/**/
	/**/
	
	@RequestMapping(value="/admin/service/contact/contactManager.do",method=RequestMethod.GET)
	public ModelAndView contactList(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"contact?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		serviceService.contactMove(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/admin/service/contact/contactManager_read.do",method=RequestMethod.GET)
	public ModelAndView contactRead(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"contact-read?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		serviceService.contactReadMove(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/admin/service/contact/contactManager_write.do",method=RequestMethod.GET)
	public ModelAndView contactWrite(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"contact?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		serviceService.contactWriteMove(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/admin/service/contact/contactManager_update.do",method=RequestMethod.GET)
	public ModelAndView contactUpdate(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"contact-update?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		serviceService.contactUpdateMove(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/admin/service/contact/contactManager_delete.do",method=RequestMethod.GET)
	public ModelAndView contactDelete(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"contact-delete?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		serviceService.contactDeleteMove(mav);
		
		return mav;
	}

	/*1:1문의 끝*/
	/**/
	/**/
	/**/
	/**/
	/**/
	/**/
	
}
