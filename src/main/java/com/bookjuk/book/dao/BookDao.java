package com.bookjuk.book.dao;

import java.util.List;

import com.bookjuk.book.dto.BookDto;

public interface BookDao {
	public int bookCount();
	public int bookMainCateCount(String category);
	public int bookSubCateCount(String category);
	
	public List<BookDto> bestList(int startRow, int endRow);
	public List<BookDto> newList(int startRow, int endRow);
	public List<BookDto> issueList(int startRow, int endRow);
	public List<BookDto> discountList(int startRow, int endRow);
	public List<BookDto> bookMainCateList(int startRow, int endRow, String category);
	public List<BookDto> bookSubCateList(int startRow, int endRow, String category);
	
	public BookDto detail(int book_num);
}
