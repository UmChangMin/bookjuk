package com.bookjuk.admin.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookjuk.admin.dto.AdminService_noticeDto;


@Component
public class AdminServiceDaoImp implements AdminServiceDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate; 

	@Override
	public int getCount() {
		//갯수 출력
		return sqlSessionTemplate.selectOne("getCount");
	}

	@Override
	public List<AdminService_noticeDto> getList(HashMap<String, Integer> hmap) {		
		return sqlSessionTemplate.selectList("getList", hmap);
	}

	@Override
	public int noticeInsert(AdminService_noticeDto noticeDto) {
		return sqlSessionTemplate.insert("notice_insert", noticeDto);
	}

	@Override
	public AdminService_noticeDto noticeSelect(String noticeNumber) {		
		return sqlSessionTemplate.selectOne("notice_Numselect",noticeNumber);
	}



	

	
}
