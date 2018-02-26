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
	public String loginOk(String member_id, String member_password) {
		Map<String, Object> hMap = new HashMap<String, Object>();
		hMap.put("member_id", member_id);
		hMap.put("member_password", member_password);
		
		return sqlSession.selectOne("memberLogin", hMap);
	}
}
