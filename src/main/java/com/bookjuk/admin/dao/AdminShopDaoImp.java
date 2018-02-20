package com.bookjuk.admin.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bookjuk.admin.dto.AdminShopDto;

@Component
public class AdminShopDaoImp implements AdminShopDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate; 
	
	public AdminShopDaoImp() {}

	@Override
	public AdminShopDto shopSelect(String shop_name) {

		return sqlSessionTemplate.selectOne("shopSelect", shop_name);
	}

	

	
}
