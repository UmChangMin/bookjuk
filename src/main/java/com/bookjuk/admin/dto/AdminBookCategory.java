package com.bookjuk.admin.dto;

public class AdminBookCategory {
	private String category_main_kor;
	  private String category_sub_kor;
	  
	  private String category_main_eng;
	  private String category_sub_eng;
	  
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
		return "AdminBookCategory [category_main_kor=" + category_main_kor + ", category_sub_kor=" + category_sub_kor
				+ ", category_main_eng=" + category_main_eng + ", category_sub_eng=" + category_sub_eng + "]";
	}
	  
	  
}
