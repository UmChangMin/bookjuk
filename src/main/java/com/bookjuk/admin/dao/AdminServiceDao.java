package com.bookjuk.admin.dao;

import java.util.HashMap;
import java.util.List;

import com.bookjuk.admin.dto.AdminService_noticeDto;

public interface AdminServiceDao {

	public int noticeInsert(AdminService_noticeDto noticeDto);
	public int getCount();
	public List<AdminService_noticeDto> getList(HashMap<String, Integer> hmap);
	public AdminService_noticeDto noticeSelect(String noticeNumber);
	
}
