package com.bookjuk.order.dto;

import java.util.Date;

public class OrderDto {
	/*회원 정보*/
	private String member_id;			// 아이디
	private String member_name;			// 회원 이름
	private String member_phone;		// 회원 핸드폰
	private int member_postcode;		// 우편번호
	private String member_address;		// 주소
	private String member_address_detail;	// 상세주소
	private int member_point;			// 포인트
	private int birthday_coupon;		// 생일쿠폰
	private int delivery_coupon;		// 배송쿠폰
	/*비회원 정보*/
	private String nonmember_id;		// 비회원 아이디 
	private String nonmember_name;		// 비회원 이름
	private String nonmember_phone;		// 비회원 핸드폰번호
	private String nonmember_email;		// 이메일
	private String nonmember_password;	// 비밀번호
	/*도서정보*/
	private String book_img;			// 도서이미지
	private String book_name;			// 책 제목
	private int cart_num;				// 장바구니 번호
	private int book_num;				// 상품번호
	private int cart_amount;			// 수량
	private Date cart_date;				// 담긴시간
	private int product_amount;			// 재고
	private int product_disprice;		// 가격
	private int product_point;			// 포인트
	private int product_sales;			// 판매량
	private int product_delivery;		// 배송료
	/*주문*/
	private int order_num;				// 주문번호
	private Date order_date;			// 주문날짜
	private String order_state;			// 주문상태
	private String order_payment;		// 결제수단
	private String order_coupon;		// 쿠폰사용여부.
	private int order_total_price;		// 총 금액
	private String refund_name;			// 환불 예금주
	private String refund_bank;			// 환불은행
	private String refund_account;		// 환불계좌 
	/*배송*/
	private String order_name;			// 수령인
	private String order_phone;			// 연락처
	private String order_postcode;		// 우편번호
	private String order_address;		// 주소
	private String order_address_detail;// 상세주소
	private String order_memo;			// 배송메모
	
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getMember_phone() {
		return member_phone;
	}
	public void setMember_phone(String member_phone) {
		this.member_phone = member_phone;
	}
	public int getMember_postcode() {
		return member_postcode;
	}
	public void setMember_postcode(int member_postcode) {
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
	public int getDelivery_coupon() {
		return delivery_coupon;
	}
	public void setDelivery_coupon(int delivery_coupon) {
		this.delivery_coupon = delivery_coupon;
	}
	public String getNonmember_id() {
		return nonmember_id;
	}
	public void setNonmember_id(String nonmember_id) {
		this.nonmember_id = nonmember_id;
	}
	public String getNonmember_name() {
		return nonmember_name;
	}
	public void setNonmember_name(String nonmember_name) {
		this.nonmember_name = nonmember_name;
	}
	public String getNonmember_phone() {
		return nonmember_phone;
	}
	public void setNonmember_phone(String nonmember_phone) {
		this.nonmember_phone = nonmember_phone;
	}
	public String getNonmember_email() {
		return nonmember_email;
	}
	public void setNonmember_email(String nonmember_email) {
		this.nonmember_email = nonmember_email;
	}
	public String getNonmember_password() {
		return nonmember_password;
	}
	public void setNonmember_password(String nonmember_password) {
		this.nonmember_password = nonmember_password;
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
	public int getCart_num() {
		return cart_num;
	}
	public void setCart_num(int cart_num) {
		this.cart_num = cart_num;
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
	public int getProduct_amount() {
		return product_amount;
	}
	public void setProduct_amount(int product_amount) {
		this.product_amount = product_amount;
	}
	public int getProduct_disprice() {
		return product_disprice;
	}
	public void setProduct_disprice(int product_disprice) {
		this.product_disprice = product_disprice;
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
	public int getProduct_delivery() {
		return product_delivery;
	}
	public void setProduct_delivery(int product_delivery) {
		this.product_delivery = product_delivery;
	}
	public int getOrder_num() {
		return order_num;
	}
	public void setOrder_num(int order_num) {
		this.order_num = order_num;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public String getOrder_state() {
		return order_state;
	}
	public void setOrder_state(String order_state) {
		this.order_state = order_state;
	}
	public String getOrder_payment() {
		return order_payment;
	}
	public void setOrder_payment(String order_payment) {
		this.order_payment = order_payment;
	}
	public String getOrder_coupon() {
		return order_coupon;
	}
	public void setOrder_coupon(String order_coupon) {
		this.order_coupon = order_coupon;
	}
	public int getOrder_total_price() {
		return order_total_price;
	}
	public void setOrder_total_price(int order_total_price) {
		this.order_total_price = order_total_price;
	}
	public String getRefund_name() {
		return refund_name;
	}
	public void setRefund_name(String refund_name) {
		this.refund_name = refund_name;
	}
	public String getRefund_bank() {
		return refund_bank;
	}
	public void setRefund_bank(String refund_bank) {
		this.refund_bank = refund_bank;
	}
	public String getRefund_account() {
		return refund_account;
	}
	public void setRefund_account(String refund_account) {
		this.refund_account = refund_account;
	}
	public String getOrder_name() {
		return order_name;
	}
	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}
	public String getOrder_phone() {
		return order_phone;
	}
	public void setOrder_phone(String order_phone) {
		this.order_phone = order_phone;
	}
	public String getOrder_postcode() {
		return order_postcode;
	}
	public void setOrder_postcode(String order_postcode) {
		this.order_postcode = order_postcode;
	}
	public String getOrder_address() {
		return order_address;
	}
	public void setOrder_address(String order_address) {
		this.order_address = order_address;
	}
	public String getOrder_address_detail() {
		return order_address_detail;
	}
	public void setOrder_address_detail(String order_address_detail) {
		this.order_address_detail = order_address_detail;
	}
	public String getOrder_memo() {
		return order_memo;
	}
	public void setOrder_memo(String order_memo) {
		this.order_memo = order_memo;
	}
	
	@Override
	public String toString() {
		return "OrderDto [member_id=" + member_id + ", member_name=" + member_name + ", member_phone=" + member_phone
				+ ", member_postcode=" + member_postcode + ", member_address=" + member_address
				+ ", member_address_detail=" + member_address_detail + ", member_point=" + member_point
				+ ", birthday_coupon=" + birthday_coupon + ", delivery_coupon=" + delivery_coupon + ", nonmember_id="
				+ nonmember_id + ", nonmember_name=" + nonmember_name + ", nonmember_phone=" + nonmember_phone
				+ ", nonmember_email=" + nonmember_email + ", nonmember_password=" + nonmember_password + ", book_img="
				+ book_img + ", book_name=" + book_name + ", cart_num=" + cart_num + ", book_num=" + book_num
				+ ", cart_amount=" + cart_amount + ", cart_date=" + cart_date + ", product_amount=" + product_amount
				+ ", product_disprice=" + product_disprice + ", product_point=" + product_point + ", product_sales="
				+ product_sales + ", product_delivery=" + product_delivery + ", order_num=" + order_num
				+ ", order_date=" + order_date + ", order_state=" + order_state + ", order_payment=" + order_payment
				+ ", order_coupon=" + order_coupon + ", order_total_price=" + order_total_price + ", refund_name="
				+ refund_name + ", refund_bank=" + refund_bank + ", refund_account=" + refund_account + ", order_name="
				+ order_name + ", order_phone=" + order_phone + ", order_postcode=" + order_postcode
				+ ", order_address=" + order_address + ", order_address_detail=" + order_address_detail
				+ ", order_memo=" + order_memo + "]";
	}
}