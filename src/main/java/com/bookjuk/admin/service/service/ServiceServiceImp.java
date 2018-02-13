package com.bookjuk.admin.service.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.service.dao.ServiceDao;

@Component
public class ServiceServiceImp implements ServiceService {

	@Autowired
	private ServiceDao serviceDao;
	
	public ServiceServiceImp() {}

	
	@Override
	public void serviceMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/service/service/serviceManager");
		
	}


	@Override
	public void noticeMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/service/notice/noticeManager");
		
	}


	@Override
	public void contactMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/service/contact/contactManager");
		
	}

	
}
