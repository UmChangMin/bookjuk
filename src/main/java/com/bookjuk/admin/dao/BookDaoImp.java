package com.bookjuk.admin.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookDaoImp implements BookDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate; 
	
	public BookDaoImp() {}

	

	
}