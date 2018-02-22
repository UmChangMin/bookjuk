package com.bookjuk.admin.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookjuk.admin.dto.AdminLocationDto;

@Component
public class AdminLocationDaoImp implements AdminLocationDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate; 
	
	public AdminLocationDaoImp() {}

	@Override
	public AdminLocationDto locationSelect(String location_name) {
		
		//System.out.println(shop_subname);
		return sqlSessionTemplate.selectOne("shopSelect", location_name);
	}

	@Override
	public int locationInsert(AdminLocationDto locationDto) {
		//System.out.println(shopDto.toString());
		return sqlSessionTemplate.insert("shopInsert", locationDto);
	}

	/*@Override
	public int shopList(List<AdminShopDto> shopList) {
		// TODO Auto-generated method stub
		return 0;
	}*/

	
}
