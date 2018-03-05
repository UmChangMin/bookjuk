package com.bookjuk.book.dao;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bookjuk.book.dto.BookDto;


@Component
public class BookDaoImp implements BookDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public int bookCount() {
		return sqlSession.selectOne("bookCount");
	}

	@Override
	public int bookMainCateCount(String category) {
		return sqlSession.selectOne("bookMainCateCount", category);
	}

	@Override
	public int bookSubCateCount(String category) {
		return sqlSession.selectOne("bookSubCateCount", category);
	}
	
	@Override
	public List<BookDto> bestList(int startRow, int endRow) {
		Map<String, Object> map = row(startRow, endRow);
		
		return sqlSession.selectList("bestList", map);
	}
	
	@Override
	public List<BookDto> newList(int startRow, int endRow) {
		Map<String, Object> map = row(startRow, endRow);
		
		return sqlSession.selectList("newList", map);
	}
	
	@Override
	public List<BookDto> issueList(int startRow, int endRow) {
		Map<String, Object> map = row(startRow, endRow);
		
		return sqlSession.selectList("issueList", map);
	}
	
	@Override
	public List<BookDto> discountSelect() {
		return sqlSession.selectList("discountSelect");
	}

	@Override
	public int discountUpdate(int book_num) {
		return sqlSession.update("discountUpdate", book_num);
	}
	
	@Override
	public List<BookDto> discountList(int startRow, int endRow) {
		Map<String, Object> map = row(startRow, endRow);
		
		return sqlSession.selectList("discountList", map);
	}

	@Override
	public int reviewCount(int book_num) {
		return sqlSession.selectOne("reviewCount", book_num);
	}
	
	@Override
	public List<BookDto> reviewList(int book_num){
		return sqlSession.selectList("reviewList", book_num);
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	public BookDto detail(int book_num) {
		sqlSession.update("readCount", book_num);
		
		return sqlSession.selectOne("detail", book_num);
	}
	
	@Override
	public List<BookDto> bookMainCateList(int startRow, int endRow, String category) {
		Map<String, Object> map = row(startRow, endRow);
		map.put("category", category);
		
		return sqlSession.selectList("bookMainCateList", map);
	}
	
	@Override
	public List<BookDto> bookSubCateList(int startRow, int endRow, String category) {
		Map<String, Object> map = row(startRow, endRow);
		map.put("category", category);
		
		return sqlSession.selectList("bookSubCateList", map);
	}
	
	private Map<String, Object> row(int startRow, int endRow){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("startRow", startRow);
		map.put("endRow", endRow);
		
		return map;
	}

	@Override
	public int insertReview(BookDto bookDto) {
		return sqlSession.insert("insertReview", bookDto);
	}

	@Override
	public int deleteReview(int review_num) {
		return sqlSession.delete("deleteReview", review_num);
	}

	@Override
	public int scoreUpdate(int book_num, float star_avg) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("book_num", book_num);
		map.put("book_score", star_avg);
		
		return sqlSession.update("scoreUpdate", map);
	}

	@Override
	public int currentBook(int book_num, String current_id, String current_img) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("book_num", book_num);
		map.put("current_id", current_id);
		map.put("current_img", current_img);
		
		return sqlSession.insert("currentBook", map);
	}
	
	@Override
	public int currentCount(String current_id) {
		return sqlSession.selectOne("currentCount", current_id);
	}

	@Override
	public List<BookDto> currentList(String current_id) {
		return sqlSession.selectList("currentList", current_id);
	}
}
