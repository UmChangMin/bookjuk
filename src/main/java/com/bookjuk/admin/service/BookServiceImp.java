package com.bookjuk.admin.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.dao.BookDao;

@Component
public class BookServiceImp implements BookService {

	@Autowired
	private BookDao bookDao;
	
	public BookServiceImp() {}

	
	@Override
	public void bookMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/book/bookManager");
		
	}

	
}
