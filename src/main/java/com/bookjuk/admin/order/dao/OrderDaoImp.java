package com.bookjuk.admin.order.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderDaoImp implements OrderDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate; 
	
	public OrderDaoImp() {}

	

	
}
