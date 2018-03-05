package com.bookjuk.user.dto;

public class UserDto {
	
	private String location_name;	//영업점 이름
	private String location_addr;		//주소
	private String location_addr_detail;//상세주소
	private String location_call;	//전화번호
	private String location_fax;	//팩스
	private String location_hour;	//영업시간
	private String location_comming;	//오시는길
	private String location_lat; //위도
	private String location_lng; //경도
	
	public String getLocation_name() {
		return location_name;
	}
	public void setLocation_name(String location_name) {
		this.location_name = location_name;
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
	
	@Override
	public String toString() {
		return "UserDto [location_name=" + location_name + ", location_addr=" + location_addr
				+ ", location_addr_detail=" + location_addr_detail + ", location_call=" + location_call
				+ ", location_fax=" + location_fax + ", location_hour=" + location_hour + ", location_comming="
				+ location_comming + ", location_lat=" + location_lat + ", location_lng=" + location_lng + "]";
	}
	
}
