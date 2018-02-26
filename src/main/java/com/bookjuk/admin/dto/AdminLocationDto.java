package com.bookjuk.admin.dto;

public class AdminLocationDto {
	private int location_num;
	private String location_lat;
	private String location_lng;
	private String location_name;
	private String location_postcode;
	private String location_addr;
	private String location_addr_detail;
	private String location_call;
	private String location_fax;
	private String location_hour;
	private String location_comming;
	
	
	public int getLocation_num() {
		return location_num;
	}
	public void setLocation_num(int location_num) {
		this.location_num = location_num;
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
	@Override
	public String toString() {
		return "AdminLocationDto [location_num=" + location_num + ", location_lat=" + location_lat + ", location_lng="
				+ location_lng + ", location_name=" + location_name + ", location_postcode=" + location_postcode
				+ ", location_addr=" + location_addr + ", location_addr_detail=" + location_addr_detail
				+ ", location_call=" + location_call + ", location_fax=" + location_fax + ", location_hour="
				+ location_hour + ", location_comming=" + location_comming + "]";
	}
	
	
	
	
}

