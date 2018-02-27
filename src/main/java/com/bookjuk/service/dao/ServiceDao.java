package com.bookjuk.service.dao;

import java.util.List;

import com.bookjuk.service.dto.ServiceContactDto;

public interface ServiceDao {

	public int listCount();
	
	public int ServiceWrite(ServiceContactDto serviceContactDto);
	
	public int getBoardCount();
	public List<ServiceContactDto> ServiceContactList(int startRow,int endRow);
	
	public ServiceContactDto ServiceRead(long contact_num);
}
