package com.bookjuk.book.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

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
		
		String viewType = viewType(request);

		/*책 리스트 개수*/
		int count = bookDao.bookCount();

		/*페이징 처리*/
		HashMap<String, Integer> page = page(request, count);
		
		int currentPage = page.get("currentPage");
		int startRow = page.get("startRow");
		int endRow = page.get("endRow");
		
		List<BookDto> bookDtoList = bookDao.bestList(startRow, endRow);
		
		mav.addObject("viewType", viewType);
		mav.addObject("pageCount", page.get("pageCount"));
		mav.addObject("pageBlock", page.get("pageBlock"));
		mav.addObject("startPage", page.get("startPage"));
		mav.addObject("endPage", page.get("endPage"));
		mav.addObject("pageNumber", currentPage);
		mav.addObject("bookDtoList", bookDtoList);
		
		mav.setViewName("book/book_best.tiles");
		
	}

	@Override
	public void bookIssue(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		String viewType = viewType(request);
		
		/*책 리스트 개수*/
		int count = bookDao.bookCount();

		/*페이징 처리*/
		HashMap<String, Integer> page = page(request, count);
		
		int currentPage = page.get("currentPage");
		int startRow = page.get("startRow");
		int endRow = page.get("endRow");
		
		List<BookDto> bookDtoList = bookDao.issueList(startRow, endRow);
		
		mav.addObject("viewType", viewType);
		mav.addObject("pageCount", page.get("pageCount"));
		mav.addObject("pageBlock", page.get("pageBlock"));
		mav.addObject("startPage", page.get("startPage"));
		mav.addObject("endPage", page.get("endPage"));
		mav.addObject("pageNumber", currentPage);
		mav.addObject("bookDtoList", bookDtoList);
		
		mav.setViewName("book/book_issue.tiles");
	}

	@Override
	public void bookNew(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");

		String viewType = viewType(request);
		
		/*책 리스트 개수*/
		int count = bookDao.bookCount();

		/*페이징 처리*/
		HashMap<String, Integer> page = page(request, count);
		
		int currentPage = page.get("currentPage");
		int startRow = page.get("startRow");
		int endRow = page.get("endRow");
		
		List<BookDto> bookDtoList = bookDao.newList(startRow, endRow);
		
		mav.addObject("viewType", viewType);
		mav.addObject("pageCount", page.get("pageCount"));
		mav.addObject("pageBlock", page.get("pageBlock"));
		mav.addObject("startPage", page.get("startPage"));
		mav.addObject("endPage", page.get("endPage"));
		mav.addObject("pageNumber", currentPage);
		mav.addObject("bookDtoList", bookDtoList);
		
		mav.setViewName("book/book_new.tiles");
		
	}

	@Override
	public void bookDiscount(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");

		String viewType = viewType(request);
		
		/*책 리스트 개수*/
		int count = bookDao.bookCount();

		/*페이징 처리*/
		HashMap<String, Integer> page = page(request, count);
		
		int currentPage = page.get("currentPage");
		int startRow = page.get("startRow");
		int endRow = page.get("endRow");
		
		List<BookDto> bookDtoList = bookDao.discountList(startRow, endRow);
		
		mav.addObject("viewType", viewType);
		mav.addObject("pageCount", page.get("pageCount"));
		mav.addObject("pageBlock", page.get("pageBlock"));
		mav.addObject("startPage", page.get("startPage"));
		mav.addObject("endPage", page.get("endPage"));
		mav.addObject("pageNumber", currentPage);
		mav.addObject("bookDtoList", bookDtoList);
		
		mav.setViewName("book/book_discount.tiles");
	}
	

	@Override
	public void bookDetail(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		int book_num = Integer.parseInt(request.getParameter("book_num"));
		BookDto bookDto = bookDao.detail(book_num);
		String editor = bookDto.getBook_editor();
		if(editor != null) bookDto.setBook_editor(editor.replace("\n", "<br/>"));
		bookDto.setBook_contents(bookDto.getBook_contents().replace("\n", "<br/>"));
		bookDto.setBook_intro(bookDto.getBook_intro().replace("\n", "<br/>"));
		bookDto.setBook_author_info(bookDto.getBook_author_info().replace("\n", "<br/>"));
		bookDto.setBook_publisher_review(bookDto.getBook_publisher_review().replace("\n", "<br/>"));
		LogAspect.logger.info(LogAspect.logMsg + bookDto.toString());
		mav.addObject("bookDto", bookDto);
		
		mav.setViewName("book/book_detail.tiles");
		
	}
	
	/*메인 카테고리*/
	@Override
	public void bookMainCategory(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");

		String viewType = viewType(request);

		String path = request.getServletPath();
		String category = path.substring(path.lastIndexOf("/") + 1, path.lastIndexOf("."));

		/*책 리스트 개수*/
		int count = bookDao.bookMainCateCount(category);

		/*페이징 처리*/
		HashMap<String, Integer> page = page(request, count);
		
		int currentPage = page.get("currentPage");
		int startRow = page.get("startRow");
		int endRow = page.get("endRow");
		
		List<BookDto> bookDtoList = bookDao.bookMainCateList(startRow, endRow, category);
		
		mav.addObject("viewType", viewType);
		mav.addObject("pageCount", page.get("pageCount"));
		mav.addObject("pageBlock", page.get("pageBlock"));
		mav.addObject("startPage", page.get("startPage"));
		mav.addObject("endPage", page.get("endPage"));
		mav.addObject("pageNumber", currentPage);
		mav.addObject("bookDtoList", bookDtoList);
		
		mav.setViewName("book/book_list_" + category + ".tiles");
	}
	
	/*서브 카테고리*/
	@Override
	public void bookSubCategory(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");

		String viewType = viewType(request);

		String path = request.getServletPath();
		String category = path.substring(path.lastIndexOf("/") + 1, path.lastIndexOf("."));
		String url = path.substring(11 ,path.lastIndexOf("/"));

		/*책 리스트 개수*/
		int count = bookDao.bookSubCateCount(category);

		/*페이징 처리*/
		HashMap<String, Integer> page = page(request, count);
		
		int currentPage = page.get("currentPage");
		int startRow = page.get("startRow");
		int endRow = page.get("endRow");
		
		List<BookDto> bookDtoList = bookDao.bookSubCateList(startRow, endRow, category);
		
		mav.addObject("subCategory", category);
		mav.addObject("viewType", viewType);
		mav.addObject("pageCount", page.get("pageCount"));
		mav.addObject("pageBlock", page.get("pageBlock"));
		mav.addObject("startPage", page.get("startPage"));
		mav.addObject("endPage", page.get("endPage"));
		mav.addObject("pageNumber", currentPage);
		mav.addObject("bookDtoList", bookDtoList);
		
		mav.setViewName("book/book_list_" + url + ".tiles");
	}
	
	public String viewType(HttpServletRequest request) {
		String viewType = request.getParameter("viewType");
		if(viewType == "") viewType = "list";
		
		return viewType;
	}

	public HashMap<String, Integer> page(HttpServletRequest request, int count) {
		String pageNumber = request.getParameter("pageNumber");
		if(pageNumber == null) pageNumber = "1";
		int currentPage = Integer.parseInt(pageNumber);
		
		int boardSize = 10;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		int startRow = (currentPage - 1) * boardSize + 1;
		int endRow = currentPage * boardSize;
		
		int pageCount = count / boardSize + (count % boardSize == 0 ? 0:1);
		int pageBlock = 10;
		int startPage = (currentPage - 1) / pageBlock * pageBlock + 1;
		int endPage = startPage + pageBlock - 1;

		map.put("currentPage", currentPage);
		map.put("startRow", startRow);
		map.put("endRow", endRow);
		map.put("pageCount", pageCount);
		map.put("pageBlock", pageBlock);
		map.put("startPage", startPage);
		map.put("endPage", endPage);
		
		return map;
	}
}
