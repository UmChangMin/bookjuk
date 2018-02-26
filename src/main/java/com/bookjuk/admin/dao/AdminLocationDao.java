package com.bookjuk.admin.dao;

import java.util.List;

import com.bookjuk.admin.dto.AdminLocationDto;
import com.bookjuk.admin.dto.ZipCodeDto;

public interface AdminLocationDao {

	public List<AdminLocationDto> locationList();
	public AdminLocationDto locationSelect(String location_name);
	public int locationInsert(AdminLocationDto locationDto);
	public List<ZipCodeDto> selectZipcode(String dong);
}
