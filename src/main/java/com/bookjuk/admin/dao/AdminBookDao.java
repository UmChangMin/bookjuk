package com.bookjuk.admin.dao;

import java.util.List;

import com.bookjuk.admin.dto.AdminBookDto;

public interface AdminBookDao {

	public AdminBookDto search(String book_name, String book_publisher, String book_author);
	public List<AdminBookDto>book_MainCate_List();
	public List<AdminBookDto>book_SubCate_List(String category_main_eng);
	
	public String change_engkor(String category_main_eng);
	
	public AdminBookDto book_UpSearch(long book_num); 
}
