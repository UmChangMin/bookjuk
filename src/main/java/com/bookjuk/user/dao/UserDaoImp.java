package com.bookjuk.user.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImp implements UserDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
}
