package com.bookjuk.order.dao;

import java.util.List;

import com.bookjuk.order.dto.OrderDto;

public interface OrderDao {
	public int memCartCount(String member_id);
	public int nonCartCount(String nonmember_id);
	public List<OrderDto> memCartList(String member_id);
	public List<OrderDto> nonCartList(String nonmember_id);
	public int updateAmount(OrderDto orderDto);
	public int memDeleteCart(int book_num, String member_id);
	public int nonDeleteCart(int book_num, String nonmember_id);
	
	public OrderDto orderMember(String member_id);
}
