package com.bookjuk.book.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	public void bookSpecial(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		List<BookDto> bookDtoList = new ArrayList<BookDto>();
		
		String path = request.getServletPath();
		String categorization = path.substring(path.lastIndexOf("/") + 1, path.lastIndexOf("."));
		
		String viewType = viewType(request);

		/*책 리스트 개수*/
		int count = bookDao.bookCount();

		/*페이징 처리*/
		HashMap<String, Integer> page = page(request, count);
		
		int currentPage = page.get("currentPage");
		int startRow = page.get("startRow");
		int endRow = page.get("endRow");
		
		if(categorization.equals("best")) {
			bookDtoList = bookDao.bestList(startRow, endRow);
		}else if(categorization.equals("issue")) {
			bookDtoList = bookDao.issueList(startRow, endRow);
		}else if(categorization.equals("new")) {
			bookDtoList = bookDao.newList(startRow, endRow);
		}else if(categorization.equals("discount")) {
			page = page(request, 20);
			
			List<BookDto> discountDtoList = bookDao.discountSelect();
			for(int i = 0; i < discountDtoList.size(); i++) {
				if(discountDtoList.get(i).getProduct_discount() != 80) {
					bookDao.discountUpdate(discountDtoList.get(i).getBook_num());
				}
			}

			bookDtoList = bookDao.discountList(startRow, endRow);
		}
		
		mav.addObject("viewType", viewType);
		mav.addObject("pageCount", page.get("pageCount"));
		mav.addObject("pageBlock", page.get("pageBlock"));
		mav.addObject("startPage", page.get("startPage"));
		mav.addObject("endPage", page.get("endPage"));
		mav.addObject("pageNumber", currentPage);
		mav.addObject("bookDtoList", bookDtoList);
		
		mav.setViewName("book/book_" + categorization + ".tiles");
	}
	
	/*도서 상세보기*/
	@Override
	public void bookDetail(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		HttpSession session = (HttpSession) map.get("session");
		
		String member_id = (String) session.getAttribute("member_id");
		String order_id = session.getId();
		if(member_id != null) order_id = member_id;
		
		int book_num = Integer.parseInt(request.getParameter("book_num"));
		
		int review_count = bookDao.reviewCount(book_num);
		
		int star_tot = 0;
		float star_avg = 0;
		List<BookDto> reviewDtoList = new ArrayList<BookDto>();
		if(review_count > 0) {
			reviewDtoList = bookDao.reviewList(book_num);
			
			for(int i=0; i<reviewDtoList.size(); i++) {
				star_tot += reviewDtoList.get(i).getReview_score();
			}
			
			star_avg = (float) star_tot / review_count;
			star_avg = Float.parseFloat(String.format("%.1f", star_avg));
			
			bookDao.scoreUpdate(book_num, star_avg);
		}
		
		BookDto bookDto = bookDao.detail(book_num);
		
		/*소개글 Enter 값 처리*/
		String editor = bookDto.getBook_editor();
		if(editor != null) bookDto.setBook_editor(editor.replace("\n", "<br/>"));
		bookDto.setBook_contents(bookDto.getBook_contents().replace("\n", "<br/>"));
		bookDto.setBook_intro(bookDto.getBook_intro().replace("\n", "<br/>"));
		bookDto.setBook_author_info(bookDto.getBook_author_info().replace("\n", "<br/>"));
		bookDto.setBook_publisher_review(bookDto.getBook_publisher_review().replace("\n", "<br/>"));
		
		bookDao.addCurrentBook(bookDto.getBook_num(), bookDto.getBook_img(), order_id);
		
		mav.addObject("bookDto", bookDto);
		mav.addObject("book_num", book_num);
		mav.addObject("member_id", member_id);
		mav.addObject("order_id", order_id);
		mav.addObject("review_count", review_count);
		mav.addObject("reviewDtoList", reviewDtoList);
		
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
		if(viewType == null) viewType = "list";
		
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
	
	/*회원 리뷰*/
	@Override
	public void bookInsertReview(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		BookDto bookDto = (BookDto) map.get("bookDto");
		bookDto.setReview_date(new Date());
		
		bookDao.insertReview(bookDto);
	}

	@Override
	public void bookDeleteReview(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		int review_num = Integer.parseInt(request.getParameter("review_num"));
		
		bookDao.deleteReview(review_num);
	}

	/*장바구니 담기*/
	@Override
	public void insertCart(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		HttpSession session = request.getSession();
		String order_id = (String) session.getAttribute("member_id");
		if(order_id == null) {order_id = session.getId();}
		
		int book_num = Integer.parseInt(request.getParameter("book_num"));
		BookDto bookDto = bookDao.detail(book_num);
		bookDto.setOrder_id(order_id);
		
		int check = bookDao.searchCartList(bookDto);
		if(check > 0) {
			bookDao.updateInsertCart(bookDto);
		}else {
			bookDao.insertCart(bookDto);
		}
	}

	@Override
	public void bookSearch(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		String search = request.getParameter("search");
		mav.addObject("search", search);
		int count = 0;
		String book_name = null;
		
		String viewType = viewType(request);
		
		/*책 리스트 개수*/
		if(search.contains("-")) {
			int index = search.indexOf("-");
			search = search.substring(0, index).trim();
			// String book_author = search.substring(index+1).trim();
			count = bookDao.bookSearchCount(search);
		}else {
			count = bookDao.bookSearchCount(search);
		}
		
		/*페이징 처리*/
		HashMap<String, Integer> page = page(request, count);
		
		int currentPage = page.get("currentPage");
		int startRow = page.get("startRow");
		int endRow = page.get("endRow");
		
		List<BookDto> bookDtoList = bookDao.searchList(startRow, endRow, search);
		
		mav.addObject("viewType", viewType);
		mav.addObject("pageCount", page.get("pageCount"));
		mav.addObject("pageBlock", page.get("pageBlock"));
		mav.addObject("startPage", page.get("startPage"));
		mav.addObject("endPage", page.get("endPage"));
		mav.addObject("count", count);
		mav.addObject("pageNumber", currentPage);
		mav.addObject("bookDtoList", bookDtoList);
		
		mav.setViewName("book/book_list_search.tiles");
	}
}
