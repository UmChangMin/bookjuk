package com.bookjuk.admin.dao;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookjuk.admin.dto.AdminMemberDto;

@Component
public class AdminMemberDaoImp implements AdminMemberDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate; 
	
	public AdminMemberDaoImp() {}

	@Override
	public AdminMemberDto search(String member_id, String member_password) {
		Map<String, String>hMap=new HashMap<String, String>();
		hMap.put("member_id",member_id);
		hMap.put("member_password", member_password);
		
		return sqlSessionTemplate.selectOne("memberSearch",hMap);
	}

	@Override
	public AdminMemberDto upSelect(String member_num) {
		return sqlSessionTemplate.selectOne("memberUpSel", member_num);
	}

	@Override
	public int updateOk(AdminMemberDto adminDto) {
		return sqlSessionTemplate.update("memberUpdate", adminDto);
	}

	@Override
	public int searchAdmin(String member_id, String member_password) {
		Map<String, String>hMap=new HashMap<String, String>();
		hMap.put("member_id",member_id);
		hMap.put("member_password", member_password);
		
		return sqlSessionTemplate.selectOne("memberAdmin", hMap);
	}

	@Override
	public int deleteMember(String member_num) {		
		return sqlSessionTemplate.delete("memberDelete", member_num);
	}

	

	
}
