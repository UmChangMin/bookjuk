package com.bookjuk.admin.dao;

import com.bookjuk.admin.dto.AdminMemberDto;

public interface AdminMemberDao {

	public AdminMemberDto search(String member_id, String member_name);
	public AdminMemberDto upSelect(String member_num);
	
	public int updateOk(AdminMemberDto memberDto);
	public int searchAdmin(String member_id,String member_password);
	
	public int deleteMember(String member_num);
}
