package com.bookjuk.admin.dao;

import java.util.Date;

import com.bookjuk.admin.dto.AdminOrderDto;

public interface AdminOrderDao {
	public int searchList(String phone, String name, String email, Date odate);
	
	
}
