package com.bookjuk.user.dao;

import java.util.List;

import com.bookjuk.book.dto.BookDto;

public interface UserDao {
	public List<BookDto> bestList();
	public List<BookDto> newList();
	public List<BookDto> issueList();
	public List<BookDto> discountList();
	public List<BookDto> bestComputerList();
	public List<BookDto> bestHobbyList();
	public List<BookDto> bestNovelList();
}
