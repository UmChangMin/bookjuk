package com.bookjuk.admin.dto;

public class AdminShopDto {
	private int num;
	private String shop_name;
	private String shop_post_num;
	private String shop_addr;
	private String shop_addr_detail;
	private String shop_callnum;
	private String shop_time;
	private String shop_comming;
	private String shop_lat;
	private String shop_lon;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getShop_name() {
		return shop_name;
	}
	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}
	public String getShop_post_num() {
		return shop_post_num;
	}
	public void setShop_post_num(String shop_post_num) {
		this.shop_post_num = shop_post_num;
	}
	public String getShop_addr() {
		return shop_addr;
	}
	public void setShop_addr(String shop_addr) {
		this.shop_addr = shop_addr;
	}
	public String getShop_addr_detail() {
		return shop_addr_detail;
	}
	public void setShop_addr_detail(String shop_addr_detail) {
		this.shop_addr_detail = shop_addr_detail;
	}
	public String getShop_callnum() {
		return shop_callnum;
	}
	public void setShop_callnum(String shop_callnum) {
		this.shop_callnum = shop_callnum;
	}
	public String getShop_time() {
		return shop_time;
	}
	public void setShop_time(String shop_time) {
		this.shop_time = shop_time;
	}
	public String getShop_comming() {
		return shop_comming;
	}
	public void setShop_comming(String shop_comming) {
		this.shop_comming = shop_comming;
	}
	public String getShop_lat() {
		return shop_lat;
	}
	public void setShop_lat(String shop_lat) {
		this.shop_lat = shop_lat;
	}
	public String getShop_lon() {
		return shop_lon;
	}
	public void setShop_lon(String shop_lon) {
		this.shop_lon = shop_lon;
	}
	@Override
	public String toString() {
		return "AdminShopDto [num=" + num + ", shop_name=" + shop_name + ", shop_post_num=" + shop_post_num
				+ ", shop_addr=" + shop_addr + ", shop_addr_detail=" + shop_addr_detail + ", shop_callnum="
				+ shop_callnum + ", shop_time=" + shop_time + ", shop_comming=" + shop_comming + ", shop_lat="
				+ shop_lat + ", shop_lon=" + shop_lon + "]";
	}
	
	
}

