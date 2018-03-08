package com.bookjuk.order.dao;

import java.util.List;

import com.bookjuk.order.dto.OrderDto;

public interface OrderDao {
	public int cartCount(String order_id);
	public List<OrderDto> cartList(String order_id);
	
	public int updateAmount(OrderDto orderDto);
	public int deleteCart(int book_num, String order_id);
	
	public OrderDto orderMember(String order_id);
	
	public int orderNum(OrderDto orderDto);
	
	public int insertOrderNonmemInfo(OrderDto orderDto, int order_num);
	public int insertOrderDelivery(OrderDto orderDto, int order_num);
	public int insertOrderInfo(OrderDto orderDto);
	
	public int deleteCartOrder(String order_id);
	
	public OrderDto orderCompleteNonInfo(int order_num, String order_id);
	public OrderDto orderCompleteMemInfo(int order_num, String order_id);
	
	public OrderDto directOrder(int book_num);
	
	public int updateSales(String order, String amount);
}
