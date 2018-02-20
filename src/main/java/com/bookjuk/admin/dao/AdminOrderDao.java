package com.bookjuk.admin.dao;

import com.bookjuk.admin.dto.AdminOrderDto;

public interface AdminOrderDao {
	public AdminOrderDto searchList(String phone, String name, String email, String order_date);
	
	
}
