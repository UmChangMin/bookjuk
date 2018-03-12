package com.bookjuk.admin.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdminSalesDaoImp implements AdminSalesDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate; 
	

	@Override
	public long td_sa(String to) {
		System.out.println(to);
		return sqlSessionTemplate.selectOne("today_sales", to);
	}

	

	
}
