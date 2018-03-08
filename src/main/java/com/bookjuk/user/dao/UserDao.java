package com.bookjuk.user.dao;

import java.util.List;

import com.bookjuk.book.dto.BookDto;
import com.bookjuk.user.dto.UserDto;

public interface UserDao {
	public List<BookDto> bestList();
	public List<BookDto> newList();
	public List<BookDto> issueList();
	public List<BookDto> discountList();
	public List<BookDto> bestComputerList();
	public List<BookDto> bestHobbyList();
	public List<BookDto> bestNovelList();
	public List<BookDto> mdList();
	public List<UserDto> locationDtoList();
	public List<BookDto> bookList(); 
	public List<BookDto> search_bookList(); 


}
