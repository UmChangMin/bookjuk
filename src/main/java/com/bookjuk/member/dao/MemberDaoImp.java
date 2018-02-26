package com.bookjuk.member.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookjuk.member.dto.MemberDto;

@Component
public class MemberDaoImp implements MemberDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public int checkId(String id) {
		return sqlSession.selectOne("checkId", id);
	}

	@Override
	public int insert(MemberDto memberDto) {
		return sqlSession.insert("memberInsert" ,memberDto);
	}

	@Override
	public MemberDto loginOk(String member_id, String member_password) {
		Map<String, String> hMap = new HashMap<String, String>();
		
		hMap.put("member_id", member_id);
		hMap.put("member_password", member_password);
		System.out.println(member_id+","+member_password);
		
		return sqlSession.selectOne("memberLogin", hMap);
		
	}
}
