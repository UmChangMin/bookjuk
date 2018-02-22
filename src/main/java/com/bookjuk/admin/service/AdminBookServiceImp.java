package com.bookjuk.admin.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.dao.AdminBookDao;

@Component
public class AdminBookServiceImp implements AdminBookService {

	@Autowired
	private AdminBookDao bookDao;
	
	public AdminBookServiceImp() {}

	
	@Override
	public void bookSearchMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/book/bookManager_search.admin");
		
	}
	
	@Override
	public void bookInputMove(ModelAndView mav) {
		
		mav.setViewName("admin/book/bookManager_input.admin");
		
	}
	
	@Override
	public void bookInputOkMove(ModelAndView mav) {
		
		mav.setViewName("admin/book/bookManager_inputOk.admin");
		
	}
	
	@Override
	public void bookOutputMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/book/bookManager.admin");
		
	}

	@Override
	public void bookUpdateMove(ModelAndView mav) {
		
		mav.setViewName("admin/book/bookManager_update.admin");
		
	}
	
	@Override
	public void bookUpdateOkMove(ModelAndView mav) {
		
		mav.setViewName("admin/book/bookManager_updateOk.admin");
		
	}

	
}
