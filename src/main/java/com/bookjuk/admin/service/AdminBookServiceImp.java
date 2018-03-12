package com.bookjuk.admin.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
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
		int count=bookDao.getBookCount();
		LogAspect.logger.info(LogAspect.logMsg+"count:"+count);
		
		int current=Integer.parseInt(pageNumber);
		int boardSize=count;
		
		int start=(current-1)*boardSize+1;
		int end=current*boardSize;
		
		HashMap<String, Integer> hmap=new HashMap<String, Integer>();
		
		hmap.put("start", start);
		hmap.put("end", end);
		
		
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
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest) mav.getModel().get("request");
		
		List<AdminBookDto>book_MainCate_List=bookDao.book_MainCate_List();
		System.out.println("book_MainCate_List"+book_MainCate_List);
		
		List<AdminBookDto>book_SubCate_List=bookDao.book_SubCate();
		System.out.println("book_MainCate_List"+book_SubCate_List);
		
		
		mav.addObject("book_MainCate_List", book_MainCate_List);
		mav.addObject("book_SubCate_List", book_SubCate_List);
		mav.setViewName("admin/book/bookManager_input.admin");
		
	}
	
	@Override
	public void bookInputOkMove(ModelAndView mav) {		
		//HttpServletRequest request=(HttpServletRequest) mav.getModel().get("request");
		
		MultipartHttpServletRequest request=(MultipartHttpServletRequest) mav.getModel().get("request");
		AdminBookDto bookDto=(AdminBookDto) mav.getModel().get("adminBookDto");
		Random random=new Random();
		
		LogAspect.logger.info(LogAspect.logMsg+"바꾸기전:"+bookDto.toString()); 
		//
		//
		MultipartFile upFile=request.getFile("file");
		String fileName=Long.toString(System.currentTimeMillis()) +"_"+upFile.getOriginalFilename();
		
		long fileSize=upFile.getSize();
		LogAspect.logger.info(LogAspect.logMsg + fileName +"< "+ fileSize);
		
		if(fileSize!=0) {
			File path=new File("c:\\bookjuk\\");
			
			path.mkdir();
			
			if(path.isDirectory() && path.exists()) {
				File file=new File(path, fileName);
				
				//전가시키거나 처리해줘야한다.
				try {
					upFile.transferTo(file);
				}catch(Throwable e) {
					e.printStackTrace();
				}
				
				bookDto.setBook_file_name(fileName);
				bookDto.setBook_file_size(fileSize);
				bookDto.setBook_file_path(file.getAbsolutePath());
				LogAspect.logger.info(LogAspect.logMsg + bookDto.toString());
			}
		}
		//
		//
		String main_cate_eng=request.getParameter("category_main_eng");
		String sub_cate_eng=request.getParameter("category_sub_eng");
		
		String main_en_kr=bookDao.main_en_kr(main_cate_eng);
		String sub_en_kr=bookDao.sub_en_kr(sub_cate_eng);
		
		bookDto.setCategory_main_kor(main_en_kr);
		bookDto.setCategory_sub_kor(sub_en_kr);
		
		bookDto.setBook_num(random.nextInt(100000));
		
		int rand=random.nextInt(1000);
		
		String img_path="/book_img/"+main_cate_eng+"/"+sub_cate_eng+"/"+main_cate_eng+"_"+sub_cate_eng+"_"+rand;		
		bookDto.setBook_img(img_path+fileName);
		
		bookDto.setBook_score(0);
		bookDto.setBook_date(new Date());
		LogAspect.logger.info(LogAspect.logMsg+"바꾸는 중:"+bookDto.toString());
		
		//C:\taewoo\bookjuk\workspace\bookjuk\src\main\webapp\book_img
		int check=bookDao.InsertBook(bookDto);
		int check_cate=bookDao.InsertBook_cate(bookDto);
		System.out.println(check+","+check_cate); 
		//String bp_re=book_pattern.replace("-", "/");
		//System.out.println(bp_re);
		//bookDto.setBook_date(bp_re);
		mav.addObject("check", check);
		
		mav.setViewName("admin/book/bookManager_inputOk.admin");
		
	}
	
	@Override
	public void bookOutputMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		long book_num=Long.parseLong(request.getParameter("book_num"));
		String pageNumber=request.getParameter("pageNumber");
		System.out.println(book_num);
		
		AdminBookDto bookDto=bookDao.search_book_num(book_num);
		//AdminBookDto bookCate=bookDao.search_cate(book_num);
		System.out.println(bookDto.toString());
		//System.out.println(bookCate.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd"); 		
        String sdfBookDate = sdf.format(bookDto.getBook_date());
        
        if(bookDto.getBook_file_size()!=0) {
        	int index=bookDto.getBook_file_name().indexOf("_")+1;
        	bookDto.setBook_file_name(bookDto.getBook_file_name().substring(index));
        }
		
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
		MultipartHttpServletRequest request=(MultipartHttpServletRequest) mav.getModel().get("request");
		AdminBookDto bookDto=(AdminBookDto)mav.getModel().get("adminBookDto");	
		Random random=new Random();
		
		LogAspect.logger.info(LogAspect.logMsg+bookDto.toString());
		String book_date=request.getParameter("book_date");
		SimpleDateFormat sdf=new SimpleDateFormat("yy/MM/dd");
		try {
			Date to=sdf.parse(book_date);
			bookDto.setBook_date(to);
			System.out.println(bookDto.getBook_date());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		bookDto.setBook_num(random.nextInt(100000));
		
		String main_cate_eng=request.getParameter("category_main_eng");
		String sub_cate_eng=request.getParameter("category_sub_eng");
		
		String main_en_kr=bookDao.main_en_kr(main_cate_eng);
		String sub_en_kr=bookDao.sub_en_kr(sub_cate_eng);
		
		bookDto.setCategory_main_kor(main_en_kr);
		bookDto.setCategory_sub_kor(sub_en_kr);
		
		MultipartFile upFile=request.getFile("file");
		String fileName=Long.toString(System.currentTimeMillis()) +"_"+upFile.getOriginalFilename();
		
		long fileSize=upFile.getSize();
		LogAspect.logger.info(LogAspect.logMsg + fileName +"< "+ fileSize);
		
		if(fileSize!=0) {
			File path=new File("C:\\ucm\\bookjuk\\workspace\\bookjuk\\src\\main\\webapp\\book_img");
			
			path.mkdir();
			
			if(path.isDirectory() && path.exists()) {
				File file=new File(path, fileName);
				
				//전가시키거나 처리해줘야한다.
				try {
					upFile.transferTo(file);
				}catch(Throwable e) {
					e.printStackTrace();
				}
				
				bookDto.setBook_file_name(fileName);
				bookDto.setBook_file_size(fileSize);
				bookDto.setBook_file_path(file.getAbsolutePath());
				//LogAspect.logger.info(LogAspect.logMsg + bookDto.toString());
			}
		}
		//int rand=random.nextInt(1000);
		
		String img_path="/book_img/"+bookDto.getBook_file_name();
		
		bookDto.setBook_img(img_path);
		LogAspect.logger.info(LogAspect.logMsg + bookDto.toString());
		
		//System.out.println(bookDto.getBook_date());
		int check_cate=bookDao.update_CateOk(bookDto);
		int check=bookDao.updateOk(bookDto);		
		LogAspect.logger.info(LogAspect.logMsg+check_cate);
		LogAspect.logger.info(LogAspect.logMsg+check);
		
		mav.addObject("check", check);
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

	@Override
	public void bookDownloadMove(ModelAndView mav) {
		HttpServletRequest request=(HttpServletRequest) mav.getModel().get("request");
		HttpServletResponse response=(HttpServletResponse) mav.getModel().get("response");
		int book_num=Integer.parseInt(request.getParameter("book_num"));
		//LogAspect.logger.info(LogAspect.logMsg + "boardNumber "+boardNumber);
		
		AdminBookDto bookDto=bookDao.getFile(book_num);
		System.out.println(bookDto.toString());
		
		bookDto.setBook_file_name(bookDto.getBook_file_name().substring(bookDto.getBook_file_name().indexOf("_")+1));
		
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		try {
		String fileName=new String(bookDto.getBook_file_name().getBytes("utf-8"),"ISO-8859-1");
		
		response.setContentType("image/x-icon");
		response.setContentLength((int)bookDto.getBook_file_size());
		response.setHeader("Content-Disposition", "attachment;filename="+fileName+";");
		
		bis=new BufferedInputStream(new FileInputStream(bookDto.getBook_file_path()));
		bos=new BufferedOutputStream(response.getOutputStream());
		
		while(true) {
			int data=bis.read();
			if(data==-1)	break;
			bos.write(data);
			
		}
		bos.flush();
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bis!=null)	bis.close();
				if(bos!=null)	bos.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void bookDeleteMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		String book_num=request.getParameter("book_num");
		System.out.println(book_num);
		
		mav.addObject("book_num",book_num);
		
		mav.setViewName("admin/book/bookManager_delete.admin");
	}

	@Override
	public void bookDeleteOkMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		String book_num=request.getParameter("book_num");
		int c2=bookDao.delete_member_review(book_num);
		int c3=bookDao.delete_CATEGORY(book_num);
		int c4=bookDao.delete_product(book_num);
		int c5=bookDao.delete_md_recommend(book_num);
		int c6=bookDao.delete_current_book(book_num);
		int c7=bookDao.delete_cart(book_num);
		int check=bookDao.deleteOk(book_num);
		
		
		LogAspect.logger.info(LogAspect.logMsg+check);
		
		mav.addObject("check", check);
		mav.setViewName("admin/book/bookManager_deleteOk.admin");
	}


}
