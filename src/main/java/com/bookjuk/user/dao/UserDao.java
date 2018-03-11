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
	public List<UserDto> getLocationList();
	public UserDto getLocationDto(int location_num);
	public List<BookDto> searchList(); 


}
