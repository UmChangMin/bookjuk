package com.bookjuk.member.dao;

import java.util.List;

import com.bookjuk.member.dto.MemberDto;
import com.bookjuk.service.dto.ServiceContactDto;

public interface MemberDao {
	public int checkId(String id);
	public int insert(MemberDto memberDto);
	public MemberDto loginOk(String member_id, String member_password);
	public String findId(String name, String email);
	public String finfPwd(String id, String email);
	
	public int delete(String member_id, String member_password);
	public MemberDto upSelect(String member_id);
	public int update(MemberDto memberDto);
	
	public int coupon(String member_id);
	public int point(String member_id);
}
