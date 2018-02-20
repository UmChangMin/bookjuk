package com.bookjuk.admin.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.dao.AdminServiceDao;

@Component
public class AdminServiceServiceImp implements AdminServiceService {

	@Autowired
	private AdminServiceDao serviceDao;
	
	public AdminServiceServiceImp() {}

	/** 자주묻는질문 시작*/
	
	//자주묻는질문 목록
	@Override
	public void serviceMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/service/service/serviceManager");
		
	}

	//자주묻는질문 글쓰기
	@Override
	public void serviceWriteMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/service/service/serviceManager_write");
		
	}
	
	//자주묻는질문 수정
		@Override
		public void serviceUpdateMove(ModelAndView mav) {
			Map<String,Object>map=mav.getModelMap();
			HttpServletRequest request=(HttpServletRequest)map.get("request");
			
			mav.setViewName("admin/service/service/serviceManager_update");
			
		}
		
		//자주묻는질문 삭제
		@Override
		public void serviceDeleteMove(ModelAndView mav) {
			Map<String,Object>map=mav.getModelMap();
			HttpServletRequest request=(HttpServletRequest)map.get("request");
			
			mav.setViewName("admin/service/service/serviceManager_delete");
			
		}
	
	
	/** 자주묻는질문 끝*/
	
	
	/** 공지사항 시작*/
	@Override
	public void noticeMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/service/notice/noticeManager");
		
	}
	
	@Override
	public void noticeReadMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/service/notice/noticeManager_read");
		
	}
	
	@Override
	public void noticeWriteMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/service/notice/noticeManager_write");
		
	}
	
	@Override
	public void noticeUpdateMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/service/notice/noticeManager_update");
		
	}
	
	@Override
	public void noticeDeleteMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/service/notice/noticeManager_delete");
		
	}

	
	/** 공지사항 끝*/
	

	
	/** 1:1문의 시작*/
	@Override
	public void contactMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/service/contact/contactManager");
		
	}
	
	@Override
	public void contactReadMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/service/contact/contactManager_read");
		
	}
	
	@Override
	public void contactWriteMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/service/contact/contactManager_write");
		
	}
	
	@Override
	public void contactUpdateMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/service/contact/contactManager_update");
		
	}
	
	@Override
	public void contactDeleteMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/service/contact/contactManager_delete");
		
	}

	
	/** 1:1문의 끝*/
	
}
