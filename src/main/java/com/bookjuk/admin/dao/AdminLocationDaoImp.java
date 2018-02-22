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
		
		//System.out.println(location_name);
		return sqlSessionTemplate.selectOne("locationSelect", location_name);
	}

	@Override
	public int locationInsert(AdminLocationDto locationDto) {
		//System.out.println(shopDto.toString());
		return sqlSessionTemplate.insert("locationInsert", locationDto);
	}

	@Override
	public List<AdminLocationDto> locationList() {		
		List<AdminLocationDto>locationList=sqlSessionTemplate.selectList("locationList");

		return locationList;
		
	}

	/*@Override
	public int locationList(List<AdminShopDto> locationList) {
		// TODO Auto-generated method stub
		return 0;
	}*/

	
}
