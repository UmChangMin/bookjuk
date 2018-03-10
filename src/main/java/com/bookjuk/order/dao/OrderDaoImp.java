package com.bookjuk.order.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookjuk.order.dto.OrderDto;

@Component
public class OrderDaoImp implements OrderDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public int cartCount(String order_id) {
		return sqlSession.selectOne("cartCount", order_id);
	}

	@Override
	public List<OrderDto> cartList(String order_id) {
		return sqlSession.selectList("cartList", order_id);
	}

	@Override
	public int updateAmount(OrderDto orderDto) {
		return sqlSession.update("updateAmount", orderDto);
	}

	@Override
	public int deleteCart(int book_num, String order_id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("book_num", book_num);
		map.put("order_id", order_id);
		
		return sqlSession.delete("deleteCart", map);
	}

	@Override
	public OrderDto orderMember(String order_id) {
		return sqlSession.selectOne("orderMember", order_id);
	}

	@Override
	public int insertOrderNonmemInfo(OrderDto orderDto, int order_num) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("orderDto", orderDto);
		map.put("order_num", order_num);
		
		return sqlSession.insert("insertOrderNonmemInfo", orderDto);
	}

	@Override
	public int insertOrderDelivery(OrderDto orderDto, int order_num) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("orderDto", orderDto);
		map.put("order_num", order_num);
		
		return sqlSession.insert("insertOrderDelivery", orderDto);
	}

	@Override
	public int insertOrderInfo(OrderDto orderDto) {
		return sqlSession.insert("insertOrderInfo", orderDto);
	}

	@Override
	public int orderNum(OrderDto orderDto) {
		return sqlSession.selectOne("orderNum", orderDto);
	}

	@Override
	public int deleteCartOrder(String order_id) {
		return sqlSession.delete("deleteCartOrder", order_id);
	}

	@Override
	public OrderDto orderCompleteNonInfo(int order_num, String order_id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("order_num", order_num);
		map.put("order_id", order_id);
		
		return sqlSession.selectOne("orderCompleteNonInfo", map);
	}

	@Override
	public OrderDto orderCompleteMemInfo(int order_num, String order_id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("order_num", order_num);
		map.put("order_id", order_id);
		
		return sqlSession.selectOne("orderCompleteMemInfo", map);
	}

	@Override
	public OrderDto directOrder(int book_num) {
		return sqlSession.selectOne("directOrder", book_num);
	}
	
	@Override
	public int insertDirectCart(OrderDto orderDto) {
		return sqlSession.insert("insertDirectCart", orderDto);
	}

	@Override
	public int updateSales(String order, String amount) {
		int book_num = Integer.parseInt(order);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("book_num", book_num);
		map.put("amount", amount);
		
		return sqlSession.update("updateSales", map);
	}

	@Override
	public List<OrderDto> getOrderLog(String nonmember_name, String nonmember_phone, String nonmember_password) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("nonmember_name", nonmember_name);
		map.put("nonmember_phone", nonmember_phone);
		map.put("nonmember_password", nonmember_password);
		
		return sqlSession.selectList("getOrderLog", map);
	}

	@Override
	public String getOrderId(int order_num) {
		return sqlSession.selectOne("getOrderId", order_num);
	}

	@Override
	public List<OrderDto> getOrderList(String order_id, Date start_date, Date end_date) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("order_id", order_id);
		map.put("start_date", start_date);
		map.put("end_date", end_date);
		
		return sqlSession.selectList("getOrderList", map);
	}

	@Override
	public OrderDto getBookInfo(int book_num) {
		return sqlSession.selectOne("getBookInfo", book_num);
	}
}
