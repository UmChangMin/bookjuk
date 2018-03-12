package com.bookjuk.admin.dao;

import java.util.List;

import com.bookjuk.admin.dto.AdminLocationDto;
import com.bookjuk.admin.dto.ZipCodeDto;

public interface AdminLocationDao {

	public List<AdminLocationDto> locationList();
	public AdminLocationDto locationSelect(String location_name);
	public int locationInsert(AdminLocationDto locationDto);
	public List<ZipCodeDto> selectZipcode(String dong);
	
	public AdminLocationDto upSelect(String location_num);
	public int updateOk(AdminLocationDto locationDto);
	public int deleteOk(String location_num);
}
