package com.bookjuk.member.dao;

import com.bookjuk.member.dto.MemberDto;

public interface MemberDao {
	public int checkId(String id);
	public int insert(MemberDto memberDto);
}
