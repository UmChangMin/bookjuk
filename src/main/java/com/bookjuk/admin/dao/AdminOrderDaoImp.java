package com.bookjuk.admin.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bookjuk.admin.dto.AdminBookDto;
import com.bookjuk.admin.dto.AdminOrderDto;

@Component
public class AdminOrderDaoImp implements AdminOrderDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate; 
	
	public AdminOrderDaoImp() {}

	
	@Override
	public List<AdminOrderDto> Order_List() {
		List<AdminOrderDto>order_List=sqlSessionTemplate.selectList("getOrderCount");
		return order_List;
	}


	@Override
	public int getOrderCount() {		
		return sqlSessionTemplate.selectOne("getOrderCount");
	}

	@Override
	public List<AdminOrderDto> getOrderList(HashMap<String, Integer> hmap) {
		return sqlSessionTemplate.selectList("getOrderList2", hmap);
	}


	@Override
	public AdminOrderDto select_on(String order_num) {
		return sqlSessionTemplate.selectOne("select_order", order_num);
	}
	
	@Override
	public AdminOrderDto select_on_del(String order_num) {
		return sqlSessionTemplate.selectOne("select_order_delivery", order_num);
	}


	@Override
	public AdminBookDto getBook(long book_num) {
		System.out.println(book_num);
		return sqlSessionTemplate.selectOne("getBookInfo_admin", book_num);
	}
	
	@Override
	public AdminOrderDto getProduct(long book_num) {
		System.out.println(book_num);
		return sqlSessionTemplate.selectOne("getBookProduct_admin", book_num);
	}


	@Override
	public AdminOrderDto upSel(String order_num) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne("order_num_upSelect", order_num);
	}


	@Override
	public AdminBookDto upSel(long book_num) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne("book_num_upSelect", book_num);
	}


	@Override
	public int updateOk(AdminOrderDto orderDto) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.update("update_orderlist", orderDto);
	}
	
	@Override
	public int updateOk_delivery(AdminOrderDto orderDto) {
		return sqlSessionTemplate.update("update_delivery_list", orderDto);
	}
	

	

	
}
