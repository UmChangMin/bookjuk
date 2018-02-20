package com.bookjuk.book.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.book.dao.BookDao;

@Component
public class BookServiceImp implements BookService {

	@Autowired
	private BookDao bookDao;

	@Override
	public void bookBest(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("book/book_list/book_best.tiles");
		
	}

	@Override
	public void bookDetail(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("book/book_detail/book_detail.tiles");
		
	}
}
