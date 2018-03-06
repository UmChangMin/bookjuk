package com.bookjuk.member.dao;

import com.bookjuk.member.dto.MemberDto;

public interface MemberDao {
	public int checkId(String id);
	public int insert(MemberDto memberDto);
	public MemberDto loginOk(String member_id, String member_password);
	public String findId(String name, String email);
	public String finfPwd(String id, String email);
	
	public int delete(String member_id);
	public MemberDto upSelect(String member_id);
	public int update(MemberDto memberDto);
}
