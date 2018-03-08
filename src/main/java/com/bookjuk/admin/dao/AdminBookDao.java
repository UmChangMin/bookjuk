package com.bookjuk.admin.dao;

import java.util.HashMap;
import java.util.List;

import com.bookjuk.admin.dto.AdminBookDto;

public interface AdminBookDao {

	//public AdminBookDto search(String book_name, String book_publisher, String book_author);	//상세검색 -search()로 수정
	public AdminBookDto search(String book_num);
	
	public List<AdminBookDto> book_keyword(String keyword);//키워드 검색 시
	
	public List<AdminBookDto>book_MainCate_List();
	public List<AdminBookDto>book_SubCate_List(String category_main_eng);
	public List<AdminBookDto>book_List();
	public AdminBookDto book_UpSearch(long book_num); 
	
	public int getBookCount();
	public List<AdminBookDto> getBookList(HashMap<String, Integer> hmap);
	
	public int updateOk(AdminBookDto adminBookDto); 
}
