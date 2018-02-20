package com.bookjuk.admin.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdminCustomerDaoImp implements AdminCustomerDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate; 
	
	public AdminCustomerDaoImp() {}

	

	
}
