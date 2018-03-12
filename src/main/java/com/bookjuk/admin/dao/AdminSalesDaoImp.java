package com.bookjuk.admin.dao;

import java.util.Date;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdminSalesDaoImp implements AdminSalesDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate; 
	

	@Override
	public long td_sa(Date date) {
		return sqlSessionTemplate.selectOne("today_order_sales",date);
	}

	

	
}
