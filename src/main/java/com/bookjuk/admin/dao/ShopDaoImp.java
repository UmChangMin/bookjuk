package com.bookjuk.admin.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShopDaoImp implements ShopDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate; 
	
	public ShopDaoImp() {}

	

	
}
