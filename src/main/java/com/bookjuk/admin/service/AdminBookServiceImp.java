package com.bookjuk.admin.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONValue;
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
		List<AdminBookDto>book_List=bookDao.book_List();
		//LogAspect.logger.info(LogAspect.logMsg+book_List.toString());
		
		String pageNumber=request.getParameter("pageNumber");
		if(pageNumber==null)pageNumber="1";
		
		int current=Integer.parseInt(pageNumber);
		int boardSize=10;
		int start=(current-1)*boardSize+1;
		int end=current*boardSize;
		
		HashMap<String, Integer> hmap=new HashMap<String, Integer>();
		
		hmap.put("start", start);
		hmap.put("end", end);
		
		int count=bookDao.getBookCount();
		LogAspect.logger.info(LogAspect.logMsg+"count:"+count);
		
		List<AdminBookDto> boardList=null;

		if(count>0) {
			boardList=bookDao.getBookList(hmap);
		}
		//LogAspect.logger.info(LogAspect.logMsg+"count, boardList : " +count +", " +boardList.size());
		
		
		mav.addObject("count", count);
		mav.addObject("boardList", boardList);
		mav.addObject("boardSize", boardSize);
		mav.addObject("pageNumber", current);
		
		mav.addObject("book_List", book_List);
		mav.setViewName("admin/book/bookManager_search.admin");
		
	}
	
	@Override
	public void bookInputMove(ModelAndView mav) {
				
		mav.setViewName("admin/book/bookManager_input.admin");
		
	}
	
	@Override
	public void bookInputOkMove(ModelAndView mav) {		
		HttpServletRequest request=(HttpServletRequest) mav.getModel().get("request");
		AdminBookDto bookDto=(AdminBookDto) mav.getModel().get("adminBookDto");
		//MultipartHttpServletRequest request=(MultipartHttpServletRequest) mav.getModel().get("request");
		
		
		System.out.println(bookDto.toString());
		
		mav.setViewName("admin/book/bookManager_inputOk.admin");
		
	}
	
	@Override
	public void bookOutputMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		String book_num=request.getParameter("book_num");
		String pageNumber=request.getParameter("pageNumber");
		
		AdminBookDto bookDto=bookDao.search(book_num);
		LogAspect.logger.info(LogAspect.logMsg+bookDto.toString()); 
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd"); 
        String sdfBookDate = sdf.format(bookDto.getBook_date());

		
		mav.addObject("bookList",bookDto);
		mav.addObject("sdfBookDate", sdfBookDate);
		mav.addObject("pageNumber", pageNumber);
		mav.setViewName("admin/book/bookManager.admin");
		
	}

	@Override
	public void bookUpdateMove(ModelAndView mav) {
		HttpServletRequest request=(HttpServletRequest) mav.getModel().get("request");
		
		long book_num=Integer.parseInt(request.getParameter("book_num"));
		String category_main_eng=request.getParameter("category_main_eng");
		String sdfBookDate=request.getParameter("sdfBookDate");
		String pageNumber=request.getParameter("pageNumber");
		AdminBookDto bookDto=bookDao.book_UpSearch(book_num);
		LogAspect.logger.info(LogAspect.logMsg+bookDto.toString()); 
		
		List<AdminBookDto>book_MainCate_List=bookDao.book_MainCate_List();
		System.out.println("book_MainCate_List"+book_MainCate_List);
		
		List<AdminBookDto>book_SubCate_List=bookDao.book_SubCate_List(category_main_eng);		
		System.out.println(book_SubCate_List.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd"); 
        sdfBookDate = sdf.format(bookDto.getBook_date());
		
		mav.addObject("bookList",bookDto);
		mav.addObject("category_main_eng",category_main_eng);
		mav.addObject("book_MainCate_List", book_MainCate_List);
		mav.addObject("book_SubCate_List", book_SubCate_List);
		mav.addObject("sdfBookDate", sdfBookDate);
		mav.addObject("pageNumber", pageNumber);
		//mav.addObject("change",change);
		
		mav.setViewName("admin/book/bookManager_update.admin");
		
	}
	
	@Override
	public void bookUpdateOkMove(ModelAndView mav) {
		
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest) mav.getModel().get("request");
		AdminBookDto adminBookDto=(AdminBookDto)mav.getModel().get("adminBookDto");	
		String book_img="123";
		adminBookDto.setBook_img(book_img);	
		LogAspect.logger.info(LogAspect.logMsg+adminBookDto.toString());
		
		int check=bookDao.updateOk(adminBookDto);		
		LogAspect.logger.info(LogAspect.logMsg+check);
		
		
		mav.setViewName("admin/book/bookManager_updateOk.admin");
		
	}

	//search
	@Override
	public void bookSearchKeyword(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletResponse response = (HttpServletResponse) map.get("response");
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String keyword=request.getParameter("keyword");
		
		LogAspect.logger.info(LogAspect.logMsg+"keyword:"+keyword);
		List<AdminBookDto>book_keywordList=bookDao.book_keyword(keyword.trim());
		LogAspect.logger.info(LogAspect.logMsg+"book__keyword:"+book_keywordList);
		
		try {
			JSONArray arrKeyword = new JSONArray();
			
			String jSonV = null;			
			if(book_keywordList!=null) {
				for (int i=0;i<book_keywordList.size();i++) {
					AdminBookDto bookDto=book_keywordList.get(i);
					bookDto.setBook_name(bookDto.getBook_name());					
					String keyVal = bookDto.getBook_name()+","+bookDto.getBook_publisher();
					arrKeyword.add(keyVal);
				}
			}
			
			jSonV = JSONValue.toJSONString(arrKeyword);
			response.setContentType("application/x-json;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.print(jSonV);
			out.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	//search


}
