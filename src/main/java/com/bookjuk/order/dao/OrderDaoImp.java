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
	public int memCartCount(String member_id) {
		return sqlSession.selectOne("memCartCount", member_id);
	}

	@Override
	public int nonCartCount(String nonmember_id) {
		return sqlSession.selectOne("nonCartCount", nonmember_id);
	}

	@Override
	public List<OrderDto> memCartList(String member_id) {
		return sqlSession.selectList("memCartList", member_id);
	}
	
	@Override
	public List<OrderDto> nonCartList(String nonmember_id) {
		return sqlSession.selectList("nonCartList", nonmember_id);
	}

	@Override
	public int updateAmount(OrderDto orderDto) {
		int check = 0;
		
		if(orderDto.getMember_id() != null) {
			check = sqlSession.update("updateAmount", orderDto);
		}else {
			check = sqlSession.update("updateNonAmount", orderDto);
		}
		
		return check;
	}

	@Override
	public int memDeleteCart(int book_num, String member_id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("book_num", book_num);
		map.put("member_id", member_id);
		
		return sqlSession.delete("memDeleteCart", map);
	}

	@Override
	public int nonDeleteCart(int book_num, String nonmember_id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("book_num", book_num);
		map.put("nonmember_id", nonmember_id);
		
		return sqlSession.delete("nonDeleteCart", map);
	}

	@Override
	public OrderDto orderMember(String member_id) {
		return sqlSession.selectOne("orderMember", member_id);
	}

	
}
