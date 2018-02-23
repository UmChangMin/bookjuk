package com.bookjuk.admin.dao;

import java.util.List;

import com.bookjuk.admin.dto.AdminLocationDto;

public interface AdminLocationDao {

	public List<AdminLocationDto> locationList();
	public AdminLocationDto locationSelect(String location_name);
	public int locationInsert(AdminLocationDto shopDto);
}