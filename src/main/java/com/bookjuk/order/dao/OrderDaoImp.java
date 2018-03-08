package com.bookjuk.order.dao;

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
	public int updateSales(String order, String amount) {
		int book_num = Integer.parseInt(order);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("book_num", book_num);
		map.put("amount", amount);
		
		return sqlSession.update("updateSales", map);
	}

	
}
