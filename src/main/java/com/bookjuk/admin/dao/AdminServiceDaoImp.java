package com.bookjuk.admin.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookjuk.admin.dto.AdminService_contactDto;
import com.bookjuk.admin.dto.AdminService_noticeDto;
import com.bookjuk.admin.dto.AdminService_questionDto;


@Component
public class AdminServiceDaoImp implements AdminServiceDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate; 

	@Override
	public int getCount() {
		//갯수 출력
		return sqlSessionTemplate.selectOne("getCount");
	}
	
	@Override
	public int getContactCount() {
		return sqlSessionTemplate.selectOne("getContactCount");
	}

	@Override
	public List<AdminService_noticeDto> getList(HashMap<String, Integer> hmap) {		
		return sqlSessionTemplate.selectList("getList", hmap);
	}

	@Override
	public int noticeInsert(AdminService_noticeDto noticeDto) {
		return sqlSessionTemplate.insert("notice_Insert", noticeDto);
	}

	@Override
	public AdminService_noticeDto noticeSelect(String notice_num) {		
		return sqlSessionTemplate.selectOne("notice_NumSelect",notice_num);
	}
	
	@Override
	public AdminService_noticeDto noticeUpSelect(String notice_num) {
		return sqlSessionTemplate.selectOne("notice_NumSelect", notice_num);
	}
	
	@Override
	public int noticeUpdate(AdminService_noticeDto noticeDto) {
		return sqlSessionTemplate.update("notice_Update", noticeDto);
	}
	
	@Override
	public int delete_notice(String notice_num) {
		return sqlSessionTemplate.delete("notice_Delete", notice_num);
	}

	//1:1문의
	@Override
	public AdminService_contactDto contactSelect(String contact_num) {
		return sqlSessionTemplate.selectOne("contact_NumSelect", contact_num);
	}


	@Override
	public List<AdminService_contactDto> getContactList(HashMap<String, Integer> hmap) {
		return sqlSessionTemplate.selectList("getContactList", hmap);
	}

	@Override
	public int writeInsert(String contact_answer, String contact_answer_whether, long contact_num) {
		Map<String, Object>hMap=new HashMap<String, Object>();
		hMap.put("contact_answer", contact_answer);
		hMap.put("contact_answer_whether", contact_answer_whether);
		hMap.put("contact_num", contact_num);
		return sqlSessionTemplate.update("contact_Update", hMap);
	}

	@Override
	public int delete_contact(String contact_num) {
		return sqlSessionTemplate.delete("contact_Delete", contact_num);
	}

	@Override
	public int getQuestionCount() {
		return sqlSessionTemplate.selectOne("getQuestionCount");
	}

	@Override
	public List<AdminService_questionDto> getQuestionList(HashMap<String, Integer> hmap) {
		return sqlSessionTemplate.selectList("getQuestionList", hmap);
	}

	@Override
	public AdminService_questionDto questionUpSelect(String question_num) {
		return sqlSessionTemplate.selectOne("question_NumSelect",question_num);
	}

	@Override
	public int serviceUpdate(AdminService_questionDto questionDto) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.update("service_Update", questionDto);
	}

	@Override
	public AdminService_contactDto getFile(long contact_num) {
		return sqlSessionTemplate.selectOne("service_File",contact_num);
	}

	@Override
	public int writeQuestion(AdminService_questionDto questionDto) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.insert("service_question_insert", questionDto);
	}
	
	@Override
	public int delete_question(long question_num) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.delete("delete_question", question_num);
	}

	
	



	

	
}
