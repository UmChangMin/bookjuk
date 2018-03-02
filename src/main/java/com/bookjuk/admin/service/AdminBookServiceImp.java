package com.bookjuk.admin.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.dao.AdminBookDao;
import com.bookjuk.admin.dto.AdminBookDto;
import com.bookjuk.aop.LogAspect;

@Component
public class AdminBookServiceImp implements AdminBookService {

	@Autowired
	private AdminBookDao bookDao;

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
		
		String book_name=request.getParameter("book_name");
		
		String book_publisher=request.getParameter("book_publisher");
		String book_author=request.getParameter("book_author");
		
		LogAspect.logger.info(LogAspect.logMsg+book_name+","+book_publisher+","+book_author);
		
		AdminBookDto bookDto=bookDao.search(book_name, book_publisher, book_author);
		LogAspect.logger.info(LogAspect.logMsg+bookDto.toString());
		
		//
		
		/*
		
		LogAspect.logger.info(LogAspect.logMsg+book_MainCate_List+","+book_SubCate_List);*/
		
		mav.addObject("bookList",bookDto);
		//mav.addObject("book_MainCate_List", book_MainCate_List);
		//mav.addObject("book_SubCate_List", book_SubCate_List);
		mav.setViewName("admin/book/bookManager.admin");
		
	}

	@Override
	public void bookUpdateMove(ModelAndView mav) {
		HttpServletRequest request=(HttpServletRequest) mav.getModel().get("request");
		
		long book_num=Integer.parseInt(request.getParameter("book_num"));
		String category_main_eng=request.getParameter("category_main_eng");
		
		AdminBookDto bookDto=bookDao.book_UpSearch(book_num);
		
		List<AdminBookDto>book_MainCate_List=bookDao.book_MainCate_List();
		System.out.println("book_MainCate_List"+book_MainCate_List);
		
		List<AdminBookDto>book_SubCate_List=bookDao.book_SubCate_List(category_main_eng);		
		System.out.println(book_SubCate_List.toString());
		
		//eng를 kor로 변환해주는 
		String change=bookDao.change_engkor(category_main_eng);
		System.out.println("change:"+change);				
		
		mav.addObject("bookList",bookDto);
		mav.addObject("category_main_eng",category_main_eng);
		mav.addObject("book_MainCate_List", book_MainCate_List);
		mav.addObject("book_SubCate_List", book_SubCate_List);
		mav.addObject("change",change);
		
		mav.setViewName("admin/book/bookManager_update.admin");
		
	}
	
	@Override
	public void bookUpdateOkMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest) mav.getModel().get("request");
		AdminBookDto adminBookDto=(AdminBookDto)mav.getModel().get("adminBookDto");
		
		
		LogAspect.logger.info(LogAspect.logMsg+adminBookDto.toString());
		
		
		mav.setViewName("admin/book/bookManager_updateOk.admin");
		
	}

	
}
