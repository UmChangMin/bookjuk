package com.bookjuk.member.dao;

import com.bookjuk.member.dto.MemberDto;

public interface MemberDao {
	public int checkId(String id);
	public int insert(MemberDto memberDto);
	public MemberDto loginOk(String member_id, String member_password);
	public String findId(String name, String email);
	public String finfPwd(String id, String email);
	
	/*회원삭제*/
	public int delete(String member_id, String member_password);
	public String searchPassword(String member_id);
	public int deleteMemberReview(String member_id);
	public int deleteMemberCart(String member_id);
	public int deleteMemberOrder(String member_id);
	public int deleteMemberContact(String member_id);
	
	public MemberDto upSelect(String member_id);
	public int update(MemberDto memberDto);
	
	public int coupon(String member_id);
	public int point(String member_id);
	
	/*장바구니 확인*/
	public int getCart(String session_id);
	public int updateCart(String member_id, String session_id);
}
