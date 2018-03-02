package com.bookjuk.book.dto;

import java.util.Date;

public class BookDto {
	/*book*/
	private int book_num;					// 상품번호
	private String book_img;				// 도서이미지
	private String book_name;				// 책 제목
	private String book_author;				// 저자 
	private String book_publisher;			// 출판사
	private Date book_date;					// 발행일
	private float book_score;				// 평점
	private String book_editor;				// 에디터 한마디
	private String book_contents;			// 목차
	private String book_intro;				// 책 소개
	private String book_author_info;		// 저자소개
	private String book_publisher_review;	// 리뷰
	/*category*/
	private String category_main_kor;		// 분야 메인(kor)
	private String category_sub_kor;		// 분야 서브(kor)
	private String category_main_eng;		// 분야 메인(eng)
	private String category_sub_eng;		// 분야 서브(eng)
	/*product*/
	private int product_amount;				// 재고
	private int product_price;				// 가격
	private int product_discount;			// 할인율
	private int product_point;				// 포인트
	private int product_sales;				// 판매량
	private int product_count;				// 조회수
	private int product_delivery;			// 배송료
	/*review*/
	private int review_num;					// 리뷰번호
	private float review_score;				// 별점
	private String member_id;				// 사용자 ID
	private String review_content;			// 리뷰내용
	private Date review_date;               // 작성일
	public int getBook_num() {
		return book_num;
	}
	public void setBook_num(int book_num) {
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
	public float getBook_score() {
		return book_score;
	}
	public void setBook_score(float book_score) {
		this.book_score = book_score;
	}
	public String getBook_editor() {
		return book_editor;
	}
	public void setBook_editor(String book_editor) {
		this.book_editor = book_editor;
	}
	public String getBook_contents() {
		return book_contents;
	}
	public void setBook_contents(String book_contents) {
		this.book_contents = book_contents;
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
	public int getProduct_amount() {
		return product_amount;
	}
	public void setProduct_amount(int product_amount) {
		this.product_amount = product_amount;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	public int getProduct_discount() {
		return product_discount;
	}
	public void setProduct_discount(int product_discount) {
		this.product_discount = product_discount;
	}
	public int getProduct_point() {
		return product_point;
	}
	public void setProduct_point(int product_point) {
		this.product_point = product_point;
	}
	public int getProduct_sales() {
		return product_sales;
	}
	public void setProduct_sales(int product_sales) {
		this.product_sales = product_sales;
	}
	public int getProduct_count() {
		return product_count;
	}
	public void setProduct_count(int product_count) {
		this.product_count = product_count;
	}
	public int getProduct_delivery() {
		return product_delivery;
	}
	public void setProduct_delivery(int product_delivery) {
		this.product_delivery = product_delivery;
	}
	public int getReview_num() {
		return review_num;
	}
	public void setReview_num(int review_num) {
		this.review_num = review_num;
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
	@Override
	public String toString() {
		return "BookDto [book_num=" + book_num + ", book_img=" + book_img + ", book_name=" + book_name
				+ ", book_author=" + book_author + ", book_publisher=" + book_publisher + ", book_date=" + book_date
				+ ", book_score=" + book_score + ", book_editor=" + book_editor + ", book_contents=" + book_contents
				+ ", book_intro=" + book_intro + ", book_author_info=" + book_author_info + ", book_publisher_review="
				+ book_publisher_review + ", category_main_kor=" + category_main_kor + ", category_sub_kor="
				+ category_sub_kor + ", category_main_eng=" + category_main_eng + ", category_sub_eng="
				+ category_sub_eng + ", product_amount=" + product_amount + ", product_price=" + product_price
				+ ", product_discount=" + product_discount + ", product_point=" + product_point + ", product_sales="
				+ product_sales + ", product_count=" + product_count + ", product_delivery=" + product_delivery
				+ ", review_num=" + review_num + ", review_score=" + review_score + ", member_id=" + member_id
				+ ", review_content=" + review_content + ", review_date=" + review_date + "]";
	}
	
	
	
}
