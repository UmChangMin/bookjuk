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
	public AdminBookDto search(String book_name, String book_publisher, String book_author) {
		Map<String, String>hMap=new HashMap<String, String>();
		
		hMap.put("book_name", book_name);
		hMap.put("book_publisher", book_publisher);
		hMap.put("book_author", book_author);
		
		return sqlSessionTemplate.selectOne("bookSearch",hMap);
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
	public String change_engkor(String category_main_eng) {
		return sqlSessionTemplate.selectOne("change_engkor", category_main_eng);
	}
	

	
}
