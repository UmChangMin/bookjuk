package com.bookjuk.admin.dto;

import java.util.Date;

public class AdminBookDto {
	  private long book_num; //NUMBER(10) PRIMARY KEY,    --상품번호
	  private String book_img; //VARCHAR2(100) NOT NULL,    --도서이미지
	  private String book_name; //VARCHAR2(100) NOT NULL,   --책 제목
	  private String book_author; //VARCHAR2(30) NOT NULL,    --저자 
	  private String book_publisher; //VARCHAR2(20) NOT NULL,     --출판사
	  private Date book_date;//TIMESTAMP NOT NULL,           --발행일
	  private int book_score; //NUMBER(2) NOT NULL,        --평점
	  private String book_editor; //VARCHAR2(4000),           --에디터 한마디
	  private String book_intro; //VARCHAR2(4000),            --목차
	  private String book_author_info; //VARCHAR2(4000),      --저자소개
	  private String book_publisher_review; //VARCHAR2(4000)    --출판사 리뷰
	  
	  private String category_main_kor;
	  private String category_sub_kor;
	  
	  private String category_main_eng;
	  private String category_sub_eng;
	public long getBook_num() {
		return book_num;
	}
	public void setBook_num(long book_num) {
		this.book_num = book_num;
	}
	public String getBook_img() {
		return book_img;
	}
	public void setBook_img(String book_img) {
		this.book_img = book_img;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public String getBook_publisher() {
		return book_publisher;
	}
	public void setBook_publisher(String book_publisher) {
		this.book_publisher = book_publisher;
	}
	public Date getBook_date() {
		return book_date;
	}
	public void setBook_date(Date book_date) {
		this.book_date = book_date;
	}
	public int getBook_score() {
		return book_score;
	}
	public void setBook_score(int book_score) {
		this.book_score = book_score;
	}
	public String getBook_editor() {
		return book_editor;
	}
	public void setBook_editor(String book_editor) {
		this.book_editor = book_editor;
	}
	public String getBook_intro() {
		return book_intro;
	}
	public void setBook_intro(String book_intro) {
		this.book_intro = book_intro;
	}
	public String getBook_author_info() {
		return book_author_info;
	}
	public void setBook_author_info(String book_author_info) {
		this.book_author_info = book_author_info;
	}
	public String getBook_publisher_review() {
		return book_publisher_review;
	}
	public void setBook_publisher_review(String book_publisher_review) {
		this.book_publisher_review = book_publisher_review;
	}
	public String getCategory_main_kor() {
		return category_main_kor;
	}
	public void setCategory_main_kor(String category_main_kor) {
		this.category_main_kor = category_main_kor;
	}
	public String getCategory_sub_kor() {
		return category_sub_kor;
	}
	public void setCategory_sub_kor(String category_sub_kor) {
		this.category_sub_kor = category_sub_kor;
	}
	public String getCategory_main_eng() {
		return category_main_eng;
	}
	public void setCategory_main_eng(String category_main_eng) {
		this.category_main_eng = category_main_eng;
	}
	public String getCategory_sub_eng() {
		return category_sub_eng;
	}
	public void setCategory_sub_eng(String category_sub_eng) {
		this.category_sub_eng = category_sub_eng;
	}
	@Override
	public String toString() {
		return "AdminBookDto [book_num=" + book_num + ", book_img=" + book_img + ", book_name=" + book_name
				+ ", book_author=" + book_author + ", book_publisher=" + book_publisher + ", book_date=" + book_date
				+ ", book_score=" + book_score + ", book_editor=" + book_editor + ", book_intro=" + book_intro
				+ ", book_author_info=" + book_author_info + ", book_publisher_review=" + book_publisher_review
				+ ", category_main_kor=" + category_main_kor + ", category_sub_kor=" + category_sub_kor
				+ ", category_main_eng=" + category_main_eng + ", category_sub_eng=" + category_sub_eng + "]";
	}
	  
	  
	  
	  
	
	
	
	
	  
	  
}

