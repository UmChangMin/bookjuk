package com.bookjuk.book.dao;

import java.util.List;

import com.bookjuk.book.dto.BookDto;

public interface BookDao {
	public int bookCount();
	public int bookMainCateCount(String category);
	public int bookSubCateCount(String category);
	public int bookSearchCount(String search);
	
	public List<BookDto> bestList(int startRow, int endRow);
	public List<BookDto> newList(int startRow, int endRow);
	public List<BookDto> issueList(int startRow, int endRow);
	public List<BookDto> discountList(int startRow, int endRow);
	public List<BookDto> bookMainCateList(int startRow, int endRow, String category);
	public List<BookDto> bookSubCateList(int startRow, int endRow, String category);
	public List<BookDto> searchList(int startRow, int endRow, String search);
	
	public List<BookDto> discountSelect();
	public int discountUpdate(int book_num);
	
	public int reviewCount(int book_num);
	public List<BookDto> reviewList(int book_num);
	public int scoreUpdate(int book_num, float star_avg);
	public BookDto detail(int book_num);
	
	public int insertReview(BookDto bookDto);
	public int deleteReview(int review_num);
	
	public int currentBook(int book_num, String current_id, String current_img);
	public int currentCount(String current_id);
	public List<BookDto> currentList(String current_id);
	
	public int searchCartList(BookDto bookDto);
	public int insertCart(BookDto bookDto);
	public int updateInsertCart(BookDto bookDto);
}
