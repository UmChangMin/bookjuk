package com.bookjuk.order.dao;

import java.util.Date;
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
	public int insertDirectCart(OrderDto orderDto);
	
	public int updateSales(String order, String amount);
	
	public List<OrderDto> getOrderLog(String nonmember_name, String nonmember_phone, String nonmember_password);
	public String getOrderId(int order_num);
	public List<OrderDto> getOrderList(String order_id, Date start_date, Date end_date);
	public OrderDto getBookInfo(int book_num);
	public int updateState(int order_num, String order_state, int order_total_price);
}
