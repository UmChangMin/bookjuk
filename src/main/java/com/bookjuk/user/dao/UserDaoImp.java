package com.bookjuk.user.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookjuk.book.dto.BookDto;

@Component
public class UserDaoImp implements UserDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<BookDto> bestList() {
		return sqlSession.selectList("mainBestList");
	}

	@Override
	public List<BookDto> newList() {
		return sqlSession.selectList("mainNewList");
	}

	@Override
	public List<BookDto> issueList() {
		return sqlSession.selectList("mainIssueList");
	}

	@Override
	public List<BookDto> discountList() {
		return sqlSession.selectList("mainDiscountList");
	}

	@Override
	public List<BookDto> bestComputerList() {
		return sqlSession.selectList("bestComputerList");
	}

	@Override
	public List<BookDto> bestHobbyList() {
		return sqlSession.selectList("bestHobbyList");
	}

	@Override
	public List<BookDto> bestNovelList() {
		return sqlSession.selectList("bestNovelList");
	}
}
