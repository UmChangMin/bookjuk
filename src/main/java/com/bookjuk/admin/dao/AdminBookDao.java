package com.bookjuk.admin.dao;

import java.util.HashMap;
import java.util.List;

import com.bookjuk.admin.dto.AdminBookDto;

public interface AdminBookDao {

	//public AdminBookDto search(String book_name, String book_publisher, String book_author);	//상세검색 -search()로 수정
	public AdminBookDto search_book_num(long book_num);
	public AdminBookDto getFile(long book_num);
	public int InsertBook(AdminBookDto bookDto);
	public int InsertBook_cate(AdminBookDto bookDto);
	public List<AdminBookDto> book_keyword(String keyword);//키워드 검색 시
	
	public List<AdminBookDto>book_MainCate_List();
	public List<AdminBookDto>book_SubCate_List(String category_main_eng);
	public List<AdminBookDto>book_SubCate();
	
	public String main_en_kr(String main_cate_eng);
	public String sub_en_kr(String sub_cate_eng);
	
	public List<AdminBookDto>book_List();
	public AdminBookDto book_UpSearch(long book_num); 
	
	public int getBookCount();
	public List<AdminBookDto> getBookList(HashMap<String, Integer> hmap);
	
	public int updateOk(AdminBookDto adminBookDto); 
	public int update_CateOk(AdminBookDto adminBookDto);
	public int deleteOk(String book_num);
	public int delete_member_review(String book_num);
	public int delete_CATEGORY(String book_num);
	public int delete_product(String book_num);
	public int delete_md_recommend(String book_num);
	public int delete_current_book(String book_num);
	public int delete_cart(String book_num);
}
