package com.bookjuk.book.dao;


import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookjuk.book.dto.BookDto;


@Component
public class BookDaoImp implements BookDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<BookDto> newList() {
		return sqlSession.selectList("newList");
	}

	@Override
	public BookDto detail(int book_num) {
		return sqlSession.selectOne("detail", book_num);
	}

}
