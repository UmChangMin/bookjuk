package com.bookjuk.service.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.service.dao.ServiceDao;

@Component
public class ServiceServiceImp implements ServiceService {

	@Autowired
	private ServiceDao serviceDao;

	@Override
	public void customer(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		mav.setViewName("service/service_question/service_question.search");
	}

	@Override
	public void noticeList(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		mav.setViewName("service/service_notice/service_notice_list.search");
	}
	
	@Override
	public void noticeRead(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		mav.setViewName("service/service_notice/service_notice_read.search");
	}

	@Override
	public void contactList(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		mav.setViewName("service/service_contact/service_contact_list.search");
	}

	@Override
	public void contactWrite(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		mav.setViewName("service/service_contact/service_contact_write.search");
	}

	@Override
	public void contactRead(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		mav.setViewName("service/service_contact/service_contact_read.search");
	}

	@Override
	public void contactUpdate(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		mav.setViewName("service/service_contact/service_contact_update.search");
	}
}
