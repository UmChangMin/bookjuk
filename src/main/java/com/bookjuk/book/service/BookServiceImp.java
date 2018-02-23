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
		
		mav.setViewName("book/book_best.tiles");
		
	}

	@Override
	public void bookIssue(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("book/book_issue.tiles");
		
		
	}

	@Override
	public void bookNew(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		// 0223 
		String pageNumber=request.getParameter("pageNumber");
		if(pageNumber==null) {pageNumber="1";}
		
		int currentPage=Integer.parseInt(pageNumber);
		
		
		
		
		mav.setViewName("book/book_new.tiles");
		
		
		
	}

	@Override
	public void bookDiscount(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("book/book_discount.tiles");
		
		
		
	}
	

	@Override
	public void bookDetail(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("book/book_detail.tiles");
		
	}

	@Override
	public void bookComputer(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("book/book_list_computer.tiles");
		
		
		
	}

	@Override
	public void bookHobby(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("book/book_list_hobby_trip.tiles");
		
		
	}

	@Override
	public void bookNovel(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("book/book_list_novel.tiles");
		
		
	}
}
