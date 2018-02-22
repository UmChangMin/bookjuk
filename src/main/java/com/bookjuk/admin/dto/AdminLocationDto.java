package com.bookjuk.admin.dto;

public class AdminLocationDto {
	private int num;
	private String location_lat;
	private String location_lng;
	private String location_name;
	private String location_post_num;
	private String location_addr;
	private String location_addr_detail;
	private String location_callnum;
	private String location_time;
	private String location_comming;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
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
	public String getLocation_name() {
		return location_name;
	}
	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}
	public String getLocation_post_num() {
		return location_post_num;
	}
	public void setLocation_post_num(String location_post_num) {
		this.location_post_num = location_post_num;
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
	public String getLocation_callnum() {
		return location_callnum;
	}
	public void setLocation_callnum(String location_callnum) {
		this.location_callnum = location_callnum;
	}
	public String getLocation_time() {
		return location_time;
	}
	public void setLocation_time(String location_time) {
		this.location_time = location_time;
	}
	public String getLocation_comming() {
		return location_comming;
	}
	public void setLocation_comming(String location_comming) {
		this.location_comming = location_comming;
	}
	@Override
	public String toString() {
		return "AdminLocationDto [num=" + num + ", location_lat=" + location_lat + ", location_lng=" + location_lng
				+ ", location_name=" + location_name + ", location_post_num=" + location_post_num + ", location_addr="
				+ location_addr + ", location_addr_detail=" + location_addr_detail + ", location_callnum="
				+ location_callnum + ", location_time=" + location_time + ", location_comming=" + location_comming
				+ "]";
	}

	
	
}

