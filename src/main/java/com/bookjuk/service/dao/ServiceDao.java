package com.bookjuk.service.dao;

import java.util.List;

import com.bookjuk.service.dto.ServiceContactDto;

public interface ServiceDao {

	public int listCount();
	
	public int ServiceWrite(ServiceContactDto serviceContactDto);
	
	public int getBoardCount();
	public List<ServiceContactDto> ServiceContactList(int startRow,int endRow,String member_id);
	
	public ServiceContactDto ServiceRead(long contact_num);
	
	public ServiceContactDto fileBoardSelect(long contact_num);
	
	public int contactDelete(long contact_num);
	
	public int ServiceContactUpdate(ServiceContactDto serviceContactDto);
}
