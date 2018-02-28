package com.bookjuk.book.dao;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
	public List<BookDto> bestList(int startRow, int endRow) {
		Map<String, Integer> map = row(startRow, endRow);
		
		return sqlSession.selectList("bestList", map);
	}
	
	@Override
	public List<BookDto> newList(int startRow, int endRow) {
		Map<String, Integer> map = row(startRow, endRow);
		
		return sqlSession.selectList("newList", map);
	}
	
	@Override
	public List<BookDto> issueList(int startRow, int endRow) {
		Map<String, Integer> map = row(startRow, endRow);
		
		return sqlSession.selectList("issueList", map);
	}
	
	@Override
	public List<BookDto> discountList(int startRow, int endRow) {
		Map<String, Integer> map = row(startRow, endRow);
		
		return sqlSession.selectList("discountList", map);
	}
	
	@Override
	public BookDto detail(int book_num) {
		int count = sqlSession.selectOne("reviewCount", book_num);
		
		if(count > 0) {
			return sqlSession.selectOne("reviewDetail", book_num);
		}else {
			return sqlSession.selectOne("detail", book_num);
		}
	}

	private Map<String, Integer> row(int startRow, int endRow){
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("startRow", startRow);
		map.put("endRow", endRow);
		
		return map;
	}
}
