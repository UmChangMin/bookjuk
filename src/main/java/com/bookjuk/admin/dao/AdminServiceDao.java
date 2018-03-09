package com.bookjuk.admin.dao;

import java.util.HashMap;
import java.util.List;

import com.bookjuk.admin.dto.AdminService_contactDto;
import com.bookjuk.admin.dto.AdminService_noticeDto;
import com.bookjuk.admin.dto.AdminService_questionDto;

public interface AdminServiceDao {

	//자주묻는질문
	public int getQuestionCount();
	public List<AdminService_questionDto> getQuestionList(HashMap<String, Integer> hmap);
	public AdminService_questionDto questionUpSelect(String question_num);
	public int serviceUpdate(AdminService_questionDto questionDto);
	
	//공지사항
	public int getCount();
	public int getContactCount();
	public int noticeInsert(AdminService_noticeDto noticeDto);
	public AdminService_noticeDto noticeUpSelect(String notice_num);	
	public AdminService_noticeDto noticeSelect(String notice_num);
	public int noticeUpdate(AdminService_noticeDto noticeDto);
	public int delete_notice(String contice_num);
	public List<AdminService_noticeDto> getList(HashMap<String, Integer> hmap);
	
	//1:1문의
	public int delete_contact(String contact_num);
	public List<AdminService_contactDto> getContactList(HashMap<String, Integer> hmap);
	
	public AdminService_contactDto contactSelect(String contact_num);	

	public int writeInsert(String contact_answer, String contact_answer_whether, long contact_num);
	
}
