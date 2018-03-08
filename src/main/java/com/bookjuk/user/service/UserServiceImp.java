package com.bookjuk.user.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.aop.LogAspect;
import com.bookjuk.book.dto.BookDto;
import com.bookjuk.user.dao.UserDao;
import com.bookjuk.user.dto.UserDto;

@Component
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserDao mainDao;

	@Override
	public void main(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		HttpSession session=(HttpSession)map.get("session");
		
		session.getAttribute("member_level");
		session.getAttribute("member_name");
		String nonmember_id = session.getId();
		
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
		
		mav.addObject("nonmember_id", nonmember_id);
		
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
		
		List<UserDto> locationDtoList = mainDao.locationDtoList();
		LogAspect.logger.info(LogAspect.logMsg+locationDtoList.toString());
		
		mav.addObject("locationDtoList", locationDtoList);	
		mav.setViewName("main/location.search");
	}

	@Override
	public void main_header(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();

		HttpServletResponse response = (HttpServletResponse) map.get("response");

		List<BookDto> bookList = mainDao.bookList();
		LogAspect.logger.info(LogAspect.logMsg + bookList.size());

		try {

			JSONArray arrTitle = new JSONArray();
			JSONArray arrName = new JSONArray();
			String jsonStr = null;

			for (int i = 0; i < bookList.size(); i++) {
				BookDto bookDto = bookList.get(i);

				String searchValue = bookDto.getBook_name() + "-" + bookDto.getBook_author();

				arrTitle.add(searchValue);
			}

			jsonStr = JSONValue.toJSONString(arrTitle);
			response.setContentType("application/x-json;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.print(jsonStr);
			out.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}

	@Override
	public void search_header(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();

		HttpServletResponse response = (HttpServletResponse) map.get("response");

		List<BookDto> search_bookList = mainDao.search_bookList();
		LogAspect.logger.info(LogAspect.logMsg + search_bookList.size());

		try {

			JSONArray arrTitle = new JSONArray();
			JSONArray arrName = new JSONArray();
			String jsonStr = null;

			for (int i = 0; i < search_bookList.size(); i++) {
				BookDto bookDto = search_bookList.get(i);

				String searchValue = bookDto.getBook_name() + "-" + bookDto.getBook_author();

				arrTitle.add(searchValue);
			}

			jsonStr = JSONValue.toJSONString(arrTitle);
			response.setContentType("application/x-json;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.print(jsonStr);
			out.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

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
