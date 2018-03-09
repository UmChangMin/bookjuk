package com.bookjuk.member.dto;

import java.util.Date;

public class MemberDto {
	/*회원정보*/
	private int member_num;					// 자동증가번호
	private String member_id;				// 아이디
	private String member_password; 		// 비밀번호
	private String member_name;				// 이름
	private String member_email;			// 이메일
	private String member_mailing;			// 이메일 수신여부
	private int member_birth;				// 생년월일
	private String member_postcode;			// 우편번호
	private String member_address;			// 주소
	private String member_address_detail;	// 상세주소
	private String member_phone;			// 핸드폰번호
	private int member_point;				// 적립금
	private int birthday_coupon;			// 생일쿠폰
	private String member_level;			// 회원레벨
	/*장바구니*/
	private int cart_num;					// 장바구니 번호
	private String order_id;				// 주문 아이디 
	private int book_num;					// 상품번호
	private int cart_amount;				// 수량
	private Date cart_date;					// 담긴시간
	
	public int getMember_num() {
		return member_num;
	}
	public void setMember_num(int member_num) {
		this.member_num = member_num;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_password() {
		return member_password;
	}
	public void setMember_password(String member_password) {
		this.member_password = member_password;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getMember_email() {
		return member_email;
	}
	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}
	public String getMember_mailing() {
		return member_mailing;
	}
	public void setMember_mailing(String member_mailing) {
		this.member_mailing = member_mailing;
	}
	public int getMember_birth() {
		return member_birth;
	}
	public void setMember_birth(int member_birth) {
		this.member_birth = member_birth;
	}
	public String getMember_postcode() {
		return member_postcode;
	}
	public void setMember_postcode(String member_postcode) {
		this.member_postcode = member_postcode;
	}
	public String getMember_address() {
		return member_address;
	}
	public void setMember_address(String member_address) {
		this.member_address = member_address;
	}
	public String getMember_address_detail() {
		return member_address_detail;
	}
	public void setMember_address_detail(String member_address_detail) {
		this.member_address_detail = member_address_detail;
	}
	public String getMember_phone() {
		return member_phone;
	}
	public void setMember_phone(String member_phone) {
		this.member_phone = member_phone;
	}
	public int getMember_point() {
		return member_point;
	}
	public void setMember_point(int member_point) {
		this.member_point = member_point;
	}
	public int getBirthday_coupon() {
		return birthday_coupon;
	}
	public void setBirthday_coupon(int birthday_coupon) {
		this.birthday_coupon = birthday_coupon;
	}
	public String getMember_level() {
		return member_level;
	}
	public void setMember_level(String member_level) {
		this.member_level = member_level;
	}
	public int getCart_num() {
		return cart_num;
	}
	public void setCart_num(int cart_num) {
		this.cart_num = cart_num;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public int getBook_num() {
		return book_num;
	}
	public void setBook_num(int book_num) {
		this.book_num = book_num;
	}
	public int getCart_amount() {
		return cart_amount;
	}
	public void setCart_amount(int cart_amount) {
		this.cart_amount = cart_amount;
	}
	public Date getCart_date() {
		return cart_date;
	}
	public void setCart_date(Date cart_date) {
		this.cart_date = cart_date;
	}
	
	@Override
	public String toString() {
		return "MemberDto [member_num=" + member_num + ", member_id=" + member_id + ", member_password="
				+ member_password + ", member_name=" + member_name + ", member_email=" + member_email
				+ ", member_mailing=" + member_mailing + ", member_birth=" + member_birth + ", member_postcode="
				+ member_postcode + ", member_address=" + member_address + ", member_address_detail="
				+ member_address_detail + ", member_phone=" + member_phone + ", member_point=" + member_point
				+ ", birthday_coupon=" + birthday_coupon + ", member_level=" + member_level + ", cart_num=" + cart_num
				+ ", order_id=" + order_id + ", book_num=" + book_num + ", cart_amount=" + cart_amount + ", cart_date="
				+ cart_date + "]";
	}
}
