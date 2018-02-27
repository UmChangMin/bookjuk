package com.bookjuk.book.dao;

import java.util.List;

import com.bookjuk.book.dto.BookDto;

public interface BookDao {
	public List<BookDto> newList();
	public BookDto detail(int book_num);
}
