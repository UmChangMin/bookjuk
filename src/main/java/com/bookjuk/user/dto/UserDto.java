package com.bookjuk.user.dto;

import java.util.Date;

public class UserDto {
	/*영업점 안내*/
	private int location_num;				// 영업점 번호
	private String location_name;			// 영업점 이름
	private String location_postcode;		// 영업점 우편번호
	private String location_addr;			// 영업점 주소
	private String location_addr_detail;	// 영업점 상세주소
	private String location_call;			// 영업점 전화번호
	private String location_fax;			// 영업점 팩스
	private String location_hour;			// 영업점 영업시간
	private String location_comming;		// 영업점 오시는길
	private String location_lat;			// 영업점 위도
	private String location_lng;			// 영업점 경도
	
	/*최근 본 목록*/
	private int book_num;					// 도서번호
	private String current_img;				// 도서이미지
	private String current_id;				// 아이디
	private Date current_time;				// 담긴 시간
	
	public int getLocation_num() {
		return location_num;
	}
	public void setLocation_num(int location_num) {
		this.location_num = location_num;
	}
	public String getLocation_name() {
		return location_name;
	}
	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}
	public String getLocation_postcode() {
		return location_postcode;
	}
	public void setLocation_postcode(String location_postcode) {
		this.location_postcode = location_postcode;
	}
	public String getLocation_addr() {
		return location_addr;
	}
	public void setLocation_addr(String location_addr) {
		this.location_addr = location_addr;
	}
	public String getLocation_addr_detail() {
		return location_addr_detail;
	}
	public void setLocation_addr_detail(String location_addr_detail) {
		this.location_addr_detail = location_addr_detail;
	}
	public String getLocation_call() {
		return location_call;
	}
	public void setLocation_call(String location_call) {
		this.location_call = location_call;
	}
	public String getLocation_fax() {
		return location_fax;
	}
	public void setLocation_fax(String location_fax) {
		this.location_fax = location_fax;
	}
	public String getLocation_hour() {
		return location_hour;
	}
	public void setLocation_hour(String location_hour) {
		this.location_hour = location_hour;
	}
	public String getLocation_comming() {
		return location_comming;
	}
	public void setLocation_comming(String location_comming) {
		this.location_comming = location_comming;
	}
	public String getLocation_lat() {
		return location_lat;
	}
	public void setLocation_lat(String location_lat) {
		this.location_lat = location_lat;
	}
	public String getLocation_lng() {
		return location_lng;
	}
	public void setLocation_lng(String location_lng) {
		this.location_lng = location_lng;
	}
	public int getBook_num() {
		return book_num;
	}
	public void setBook_num(int book_num) {
		this.book_num = book_num;
	}
	public String getCurrent_img() {
		return current_img;
	}
	public void setCurrent_img(String current_img) {
		this.current_img = current_img;
	}
	public String getCurrent_id() {
		return current_id;
	}
	public void setCurrent_id(String current_id) {
		this.current_id = current_id;
	}
	public Date getCurrent_time() {
		return current_time;
	}
	public void setCurrent_time(Date current_time) {
		this.current_time = current_time;
	}	@Override
	public String toString() {
		return "UserDto [location_num=" + location_num + ", location_name=" + location_name + ", location_postcode="
				+ location_postcode + ", location_addr=" + location_addr + ", location_addr_detail="
				+ location_addr_detail + ", location_call=" + location_call + ", location_fax=" + location_fax
				+ ", location_hour=" + location_hour + ", location_comming=" + location_comming + ", location_lat="
				+ location_lat + ", location_lng=" + location_lng + ", book_num=" + book_num + ", current_img="
				+ current_img + ", current_id=" + current_id + ", current_time=" + current_time + "]";
	}
}
