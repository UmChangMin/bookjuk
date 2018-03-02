package com.bookjuk.admin.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookjuk.admin.dto.AdminService_contactDto;
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
	public int getContactCount() {
		return sqlSessionTemplate.selectOne("getContactCount");
	}

	@Override
	public List<AdminService_noticeDto> getList(HashMap<String, Integer> hmap) {		
		return sqlSessionTemplate.selectList("getList", hmap);
	}

	@Override
	public int noticeInsert(AdminService_noticeDto noticeDto) {
		return sqlSessionTemplate.insert("notice_Insert", noticeDto);
	}

	@Override
	public AdminService_noticeDto noticeSelect(String noticeNumber) {		
		return sqlSessionTemplate.selectOne("notice_NumSelect",noticeNumber);
	}

	@Override
	public AdminService_contactDto contactSelect(String contact_num) {
		return sqlSessionTemplate.selectOne("contact_NumSelect", contact_num);
	}


	@Override
	public List<AdminService_contactDto> getContactList(HashMap<String, Integer> hmap) {
		return sqlSessionTemplate.selectList("getContactList", hmap);
	}



	

	
}
