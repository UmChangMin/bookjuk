package com.bookjuk.admin.dao;

import java.util.HashMap;
import java.util.List;

import com.bookjuk.admin.dto.AdminBookDto;
import com.bookjuk.admin.dto.AdminOrderDto;

public interface AdminOrderDao {
	//public AdminOrderDto searchList(String phone, String name, String email, String order_date);
	public List<AdminOrderDto>Order_List();
	public int getOrderCount();
	public List<AdminOrderDto> getOrderList(HashMap<String, Integer> hmap);
	public AdminOrderDto select_on(String order_num);
	public AdminOrderDto select_on_del(String order_num);
	
	public AdminBookDto getBook(long book_num);
	public AdminOrderDto getProduct(long book_num);
	
	public AdminOrderDto upSel(String order_num);
	public AdminBookDto upSel(long book_num);
	
	public int updateOk(AdminOrderDto orderDto);
	public int updateOk_delivery(AdminOrderDto orderDto);
}
