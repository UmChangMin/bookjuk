package com.bookjuk.admin.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdminShopDaoImp implements AdminShopDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate; 
	
	public AdminShopDaoImp() {}

	

	
}
