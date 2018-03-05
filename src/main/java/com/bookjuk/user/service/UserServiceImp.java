package com.bookjuk.user.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.aop.LogAspect;
import com.bookjuk.book.dto.BookDto;
import com.bookjuk.user.dao.UserDao;

@Component
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserDao mainDao;

	@Override
	public void main(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		HttpSession session=(HttpSession)map.get("session");
		
		String member_level=(String) session.getAttribute("member_level");
		
		String member_name=(String) session.getAttribute("member_name");
		
		//String member_level=request.getParameter("member_level");
		LogAspect.logger.info(LogAspect.logMsg+member_name+","+member_level);
		
		/*베스트셀러*/
		List<BookDto> bookBestList = mainDao.bestList();
		
		/*화제의도서*/
		List<BookDto> bookIssueList = mainDao.issueList();
		
		/*신간도서*/
		List<BookDto> bookNewList = mainDao.newList();
		
		/*할인도서*/
		List<BookDto> bookDiscountList = mainDao.discountList();
		
		/*분야별 베스트*/
		List<BookDto> bookBestComputerList = mainDao.bestComputerList();
		List<BookDto> bookBestHobbyList = mainDao.bestHobbyList();
		List<BookDto> bookBestNovelList = mainDao.bestNovelList();
		
		/*MD 추천*/
		List<BookDto> bookMdList = mainDao.mdList();
		
		mav.addObject("bookBestList", bookBestList);
		mav.addObject("bookIssueList", bookIssueList);
		mav.addObject("bookNewList", bookNewList);
		mav.addObject("bookDiscountList", bookDiscountList);
		
		mav.addObject("bestCom", bookBestComputerList);
		mav.addObject("bestHob", bookBestHobbyList);
		mav.addObject("bestNov", bookBestNovelList);
		
		mav.addObject("bookMdList", bookMdList);
		
		mav.setViewName("main/main.tiles");
	}

	@Override
	public void location(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		mav.setViewName("main/location.search");
	}

	/* �̺�Ʈ �̱���
	@Override
	public void event(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		mav.setViewName("main/event.search");
	}
	*/
	
}
