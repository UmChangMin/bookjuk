package com.bookjuk.admin.service.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceDaoImp implements ServiceDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate; 
	
	public ServiceDaoImp() {}

	

	
}
