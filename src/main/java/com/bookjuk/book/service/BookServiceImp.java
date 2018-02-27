package com.bookjuk.book.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.aop.LogAspect;
import com.bookjuk.book.dao.BookDao;
import com.bookjuk.book.dto.BookDto;

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
		List<BookDto> bookDtoList = bookDao.newList();
		
		mav.addObject("bookDtoList", bookDtoList);
		
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
		
		int book_num = Integer.parseInt(request.getParameter("book_num"));
		BookDto bookDto = bookDao.detail(book_num);
		bookDto.setBook_editor(bookDto.getBook_editor().replace("\n", "<br/>"));
		bookDto.setBook_contents(bookDto.getBook_contents().replace("\n", "<br/>"));
		bookDto.setBook_intro(bookDto.getBook_intro().replace("\n", "<br/>"));
		bookDto.setBook_author_info(bookDto.getBook_author_info().replace("\n", "<br/>"));
		bookDto.setBook_publisher_review(bookDto.getBook_publisher_review().replace("\n", "<br/>"));
		mav.addObject("bookDto", bookDto);
		
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
