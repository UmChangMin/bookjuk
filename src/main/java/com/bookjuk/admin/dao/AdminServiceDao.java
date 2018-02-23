package com.bookjuk.admin.dao;

import java.util.HashMap;
import java.util.List;

import com.bookjuk.admin.dto.AdminServiceDto;

public interface AdminServiceDao {

	public int getCount();
	public List<AdminServiceDto> getList(HashMap<String, Integer> hmap);
	
}
