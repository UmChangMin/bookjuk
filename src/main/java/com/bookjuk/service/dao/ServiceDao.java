package com.bookjuk.service.dao;

import java.util.List;

import com.bookjuk.service.dto.ServiceContactDto;
import com.bookjuk.service.dto.ServiceNoticeDto;
import com.bookjuk.service.dto.ServiceQuestionDto;

public interface ServiceDao {

	/*public int listCount();*/
	
	// 1:1문의
	public int ServiceWrite(ServiceContactDto serviceContactDto);
	
	public int getBoardCount(String member_id);
	public List<ServiceContactDto> ServiceContactList(int startRow,int endRow,String member_id);
	
	public ServiceContactDto ServiceRead(long contact_num);
	
	public ServiceContactDto fileBoardSelect(long contact_num);
	
	public int contactDelete(long contact_num);
	
	public int ServiceContactUpdate(ServiceContactDto serviceContactDto);
	
	//공지사항
	public int noticeCount();
	public List<ServiceNoticeDto> noticeList(int startRow,int endRow);
	
	public ServiceNoticeDto noticeRead(long notice_num);
	public int maxNum(long notice_num);
	public int minNum(long notice_num);
	
	//자주묻는질문
	public int questionCount();
	public List<ServiceQuestionDto> questionList();
	
	
}
