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
	public void bookMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/book/bookManager");
		
	}

	
}
