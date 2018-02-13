package com.bookjuk.admin.sales.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SalesDaoImp implements SalesDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate; 
	
	public SalesDaoImp() {}

	

	
}
