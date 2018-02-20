package com.bookjuk.admin.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdminOrderDaoImp implements AdminOrderDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate; 
	
	public AdminOrderDaoImp() {}

	@Override
	public int searchList(String phone, String name, String email, Date odate) {
		Map<String,Object>hMap=new HashMap<String,Object>();
		
		hMap.put("phone", phone);
		hMap.put("name", name);
		hMap.put("email", email);
		hMap.put("odate", odate);
				
		String value=sqlSessionTemplate.selectOne("orderListCheck",hMap);
		int check=0;
		if(value!=null)check=1;
		
		return check;
	}


	

	

	
}
