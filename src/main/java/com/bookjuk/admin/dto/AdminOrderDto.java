package com.bookjuk.admin.dto;

import java.util.Date;

public class AdminOrderDto {
	private int num;			//주문번호
	private String name;			//주문고객이름
	private String email;			//이메일
	private String phone;			//핸드폰번호
	
	private String post_num;		//우편번호
	private String addr;			//주소
	private String detailAddr;		//상세주소
	
	private String book_name;		//도서명
	private int book_order_count;	//도서주문수량
	private Date order_date;	 	//주문일자 ex)2018-01-14 13:35 
	
	private String credit;			//결제수단 ex)카드, 카드번호 xxxx-xxxx-xxxx-xxxx
	private String refund_account;	//환불계좌 ex)신한, 110-xxx-xxxxxx
	private String use_coupon;		//사용쿠폰 ex)없음 or 무료배송쿠폰..etc
	private String order_status;	//결제처리상태	ex)정상
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPost_num() {
		return post_num;
	}
	public void setPost_num(String post_num) {
		this.post_num = post_num;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getDetailAddr() {
		return detailAddr;
	}
	public void setDetailAddr(String detailAddr) {
		this.detailAddr = detailAddr;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public int getBook_order_count() {
		return book_order_count;
	}
	public void setBook_order_count(int book_order_count) {
		this.book_order_count = book_order_count;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public String getRefund_account() {
		return refund_account;
	}
	public void setRefund_account(String refund_account) {
		this.refund_account = refund_account;
	}
	public String getUse_coupon() {
		return use_coupon;
	}
	public void setUse_coupon(String use_coupon) {
		this.use_coupon = use_coupon;
	}
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	@Override
	public String toString() {
		return "OrderDto [num=" + num + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", post_num=" + post_num + ", addr=" + addr + ", detailAddr=" + detailAddr + ", book_name="
				+ book_name + ", book_order_count=" + book_order_count + ", order_date=" + order_date + ", credit="
				+ credit + ", refund_account=" + refund_account + ", use_coupon=" + use_coupon + ", order_status="
				+ order_status + "]";
	}
	
	
}

