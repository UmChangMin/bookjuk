package com.bookjuk.admin.dao;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bookjuk.admin.dto.AdminOrderDto;

@Component
public class AdminOrderDaoImp implements AdminOrderDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate; 
	
	public AdminOrderDaoImp() {}

	@Override
	@Transactional
	public AdminOrderDto searchList(String phone, String name, String email, String order_date) {
		Map<String,Object>hMap=new HashMap<String,Object>();
		
		hMap.put("phone", phone);
		hMap.put("name", name);
		hMap.put("email", email);
		hMap.put("order_date", order_date);	
				
		/*String value=sqlSessionTemplate.selectOne("orderListCheck",hMap);
		int check=0;
		if(value!=null)check=1;*/
		
		return sqlSessionTemplate.selectOne("orderListCheck",hMap);
		
	}


	

	

	
}
