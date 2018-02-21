package com.bookjuk.admin.dao;

import com.bookjuk.admin.dto.AdminShopDto;

public interface AdminShopDao {

	public AdminShopDto shopSelect(String shop_subname);
	public int shopInsert(AdminShopDto shopDto);
}
