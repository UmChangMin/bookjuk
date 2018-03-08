package com.bookjuk.admin.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookjuk.admin.dto.AdminBookDto;

@Component
public class AdminBookDaoImp implements AdminBookDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate; 
	

	@Override
	public List<AdminBookDto> book_keyword(String keyword) {
		return sqlSessionTemplate.selectList("book_keyword", keyword);
	}
	
	@Override
	public int getBookCount() {
		return sqlSessionTemplate.selectOne("getBookCount");
	}
	
	@Override
	public AdminBookDto search(String book_num) {		
		return sqlSessionTemplate.selectOne("bookSearch",book_num);
	}

	@Override
	public List<AdminBookDto> book_MainCate_List() {
		List<AdminBookDto>book_MainCate_List=sqlSessionTemplate.selectList("book_MainCate_List");
		return book_MainCate_List;
	}

	@Override
	public List<AdminBookDto> book_SubCate_List(String category_main_eng) {
		 List<AdminBookDto>book_SubCate_List=sqlSessionTemplate.selectList("book_SubCate_List",category_main_eng);
		return book_SubCate_List;
	}

	@Override
	public AdminBookDto book_UpSearch(long book_num) {
		return sqlSessionTemplate.selectOne("book_UpSearch", book_num);
	}


	@Override
	public int updateOk(AdminBookDto adminBookDto) {		
		return sqlSessionTemplate.update("book_Update", adminBookDto);
	}

	@Override
	public List<AdminBookDto> book_List() {
		List<AdminBookDto>book_List=sqlSessionTemplate.selectList("getBookCount");
		return book_List;
	}


	@Override
	public List<AdminBookDto> getBookList(HashMap<String, Integer> hmap) {	
		return sqlSessionTemplate.selectList("getBookList", hmap);
	}

	

	
}
