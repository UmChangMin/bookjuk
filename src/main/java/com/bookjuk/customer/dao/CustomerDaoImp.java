package com.bookjuk.customer.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerDaoImp implements CustomerDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
}
