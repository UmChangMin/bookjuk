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
	public AdminBookDto search_book_num(long book_num) {	
		System.out.println(book_num);
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
		System.out.println(adminBookDto);
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

	@Override
	public List<AdminBookDto> book_SubCate() {
		List<AdminBookDto>book_SubCate=sqlSessionTemplate.selectList("book_SubCate");
		return book_SubCate;
	}

	@Override
	public int InsertBook(AdminBookDto bookDto) {
		return sqlSessionTemplate.insert("book_Insert", bookDto);
	}

	@Override
	public String main_en_kr(String main_cate_eng) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne("main_cate_eng", main_cate_eng);
	}

	@Override
	public String sub_en_kr(String sub_cate_eng) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne("sub_cate_eng", sub_cate_eng);
	}

	@Override
	public int InsertBook_cate(AdminBookDto bookDto) {
		return sqlSessionTemplate.insert("book_Insert_category", bookDto);
	}

	@Override
	public AdminBookDto getFile(long book_num) {
		return sqlSessionTemplate.selectOne("book_File", book_num);
	}

	@Override
	public int update_CateOk(AdminBookDto adminBookDto) {	
		System.out.println(adminBookDto);
		return sqlSessionTemplate.update("book_Update_cate", adminBookDto);
	}

	@Override
	public int deleteOk(String book_num) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.delete("book_Delete", book_num);
	}

	@Override
	public int delete_member_review(String book_num) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.delete("delete_member_review", book_num);
	}

	@Override
	public int delete_CATEGORY(String book_num) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.delete("delete_CATEGORY", book_num);
	}

	@Override
	public int delete_product(String book_num) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.delete("delete_product", book_num);
	}

	@Override
	public int delete_md_recommend(String book_num) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.delete("delete_md_recommend", book_num);
	}

	@Override
	public int delete_current_book(String book_num) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.delete("delete_current_book", book_num);
	}

	@Override
	public int delete_cart(String book_num) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.delete("delete_cart", book_num);
	}
	

	
}
