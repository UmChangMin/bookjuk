package com.bookjuk.book.dto;

import java.util.Date;

public class BookDto {

	private long book_num;					//상품번호
	private String book_img;				//도서이미지
	private String book_name;				//책 제목
	private String  book_writer;			//저자
	private String book_publisher;			//출판사
	private Date book_date;					//발행일
	private int book_score;					//평점
	private String book_editor;     		//에디터 한마디
	private String book_intro;      		//목차
	private String book_author_info;      	//저자소개
	private String book_publisher_review; 	//출판사리뷰
	
	private String book_main_category;		//타이틀분야
	private String book_sub_category; 		//서브분야
	
	private int product_amount;				//재고
	private long product_price;				//가격
	private int product_dicount;			//할인율
	private int product_point;				//포인트
	private long product_sales_amount;		//판매량
	private long product_count; 			//조회수
	private int product_delivery_price;		//배송료
	
	private float review_score;				//별점
	private String member_id;				//사용자 아이디
	private String review_content;			//리뷰내용
	private Date review_date;				//작성일
	
	
	public BookDto() {}


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


	public String getBook_writer() {
		return book_writer;
	}


	public void setBook_writer(String book_writer) {
		this.book_writer = book_writer;
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


	public String getBook_main_category() {
		return book_main_category;
	}


	public void setBook_main_category(String book_main_category) {
		this.book_main_category = book_main_category;
	}


	public String getBook_sub_category() {
		return book_sub_category;
	}


	public void setBook_sub_category(String book_sub_category) {
		this.book_sub_category = book_sub_category;
	}


	public int getProduct_amount() {
		return product_amount;
	}


	public void setProduct_amount(int product_amount) {
		this.product_amount = product_amount;
	}


	public long getProduct_price() {
		return product_price;
	}


	public void setProduct_price(long product_price) {
		this.product_price = product_price;
	}


	public int getProduct_dicount() {
		return product_dicount;
	}


	public void setProduct_dicount(int product_dicount) {
		this.product_dicount = product_dicount;
	}


	public int getProduct_point() {
		return product_point;
	}


	public void setProduct_point(int product_point) {
		this.product_point = product_point;
	}


	public long getProduct_sales_amount() {
		return product_sales_amount;
	}


	public void setProduct_sales_amount(long product_sales_amount) {
		this.product_sales_amount = product_sales_amount;
	}


	public long getProduct_count() {
		return product_count;
	}


	public void setProduct_count(long product_count) {
		this.product_count = product_count;
	}


	public int getProduct_delivery_price() {
		return product_delivery_price;
	}


	public void setProduct_delivery_price(int product_delivery_price) {
		this.product_delivery_price = product_delivery_price;
	}


	public float getReview_score() {
		return review_score;
	}


	public void setReview_score(float review_score) {
		this.review_score = review_score;
	}


	public String getMember_id() {
		return member_id;
	}


	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}


	public String getReview_content() {
		return review_content;
	}


	public void setReview_content(String review_content) {
		this.review_content = review_content;
	}


	public Date getReview_date() {
		return review_date;
	}


	public void setReview_date(Date review_date) {
		this.review_date = review_date;
	}


	public BookDto(long book_num, String book_img, String book_name, String book_writer, String book_publisher,
			Date book_date, int book_score, String book_editor, String book_intro, String book_author_info,
			String book_publisher_review, String book_main_category, String book_sub_category, int product_amount,
			long product_price, int product_dicount, int product_point, long product_sales_amount, long product_count,
			int product_delivery_price, float review_score, String member_id, String review_content, Date review_date) {
		super();
		this.book_num = book_num;
		this.book_img = book_img;
		this.book_name = book_name;
		this.book_writer = book_writer;
		this.book_publisher = book_publisher;
		this.book_date = book_date;
		this.book_score = book_score;
		this.book_editor = book_editor;
		this.book_intro = book_intro;
		this.book_author_info = book_author_info;
		this.book_publisher_review = book_publisher_review;
		this.book_main_category = book_main_category;
		this.book_sub_category = book_sub_category;
		this.product_amount = product_amount;
		this.product_price = product_price;
		this.product_dicount = product_dicount;
		this.product_point = product_point;
		this.product_sales_amount = product_sales_amount;
		this.product_count = product_count;
		this.product_delivery_price = product_delivery_price;
		this.review_score = review_score;
		this.member_id = member_id;
		this.review_content = review_content;
		this.review_date = review_date;
	}


	@Override
	public String toString() {
		return "BookDto [book_num=" + book_num + ", book_img=" + book_img + ", book_name=" + book_name
				+ ", book_writer=" + book_writer + ", book_publisher=" + book_publisher + ", book_date=" + book_date
				+ ", book_score=" + book_score + ", book_editor=" + book_editor + ", book_intro=" + book_intro
				+ ", book_author_info=" + book_author_info + ", book_publisher_review=" + book_publisher_review
				+ ", book_main_category=" + book_main_category + ", book_sub_category=" + book_sub_category
				+ ", product_amount=" + product_amount + ", product_price=" + product_price + ", product_dicount="
				+ product_dicount + ", product_point=" + product_point + ", product_sales_amount="
				+ product_sales_amount + ", product_count=" + product_count + ", product_delivery_price="
				+ product_delivery_price + ", review_score=" + review_score + ", member_id=" + member_id
				+ ", review_content=" + review_content + ", review_date=" + review_date + "]";
	}

	
	
	
}
