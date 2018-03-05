package com.bookjuk.service.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.service.dto.ServiceContactDto;
import com.bookjuk.service.dto.ServiceNoticeDto;
import com.bookjuk.service.dto.ServiceQuestionDto;

@Component
public class ServiceDaoImp implements ServiceDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public int ServiceWrite(ServiceContactDto serviceContactDto) {
		
		int check=0;
		
		if(serviceContactDto.getContact_file_size()==0) {	// 파일이 들어오지 않았을때
			check=sqlSession.insert("boardInsert", serviceContactDto);
		}else {												// 파일이 들어왔을 때
			check=sqlSession.insert("fileBoardInsert",serviceContactDto);
		}
		
		return check;
	}

	@Override
	public int getBoardCount() {
		
		return sqlSession.selectOne("getBoardCount");
	}

	@Override
	public List<ServiceContactDto> ServiceContactList(int startRow, int endRow, String member_id) {
		Map<String,Object>hmap=new HashMap<String, Object>();
		hmap.put("startRow", startRow);
		hmap.put("endRow", endRow);
		hmap.put("member_id", member_id);
		
		
		return sqlSession.selectList("ServiceContactList",hmap);
	}

	@Override
	public ServiceContactDto ServiceRead(long contact_num) {
		
		ServiceContactDto serviceContactDto=new ServiceContactDto();
		
		serviceContactDto=sqlSession.selectOne("boardRead",contact_num);
		
		return serviceContactDto;
		
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	public ServiceContactDto fileBoardSelect(long contact_num) {
		
		return sqlSession.selectOne("boardRead",contact_num);
	}

	@Override
	public int contactDelete(long contact_num) {
		
		return sqlSession.delete("contactDelete",contact_num);
	}

	@Override
	public int ServiceContactUpdate(ServiceContactDto serviceContactDto) {
		int check=0;
		
		if(serviceContactDto.getContact_file_size()==0) {	
			check = sqlSession.update("boardUpdateOk", serviceContactDto);
		}else {		
			check=sqlSession.insert("fileBoardUpdateOk",serviceContactDto);
		}
		return check;
	}

	
	// 공지사항
	@Override
	public int noticeCount() {
		
		return sqlSession.selectOne("noticeCount");
	}

	@Override
	public List<ServiceNoticeDto> noticeList(int startRow, int endRow) {
		Map<String,Object>hmap=new HashMap<String, Object>();
		hmap.put("startRow", startRow);
		hmap.put("endRow", endRow);		
		
		return sqlSession.selectList("noticeList",hmap);
	}

	@Override
	public ServiceNoticeDto noticeRead(long notice_num) {
		
		ServiceNoticeDto serviceNoticeDto=new ServiceNoticeDto();
		
		serviceNoticeDto=sqlSession.selectOne("noticeRead",notice_num);
		
		return serviceNoticeDto;
	}
	

	// 자주묻는 질문
	@Override
	public int questionCount() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("questionCount");
	}

	@Override
	public List<ServiceQuestionDto> questionList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("questionList");
	}

	
	


	
	
}
