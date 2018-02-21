package com.bookjuk.admin.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.dao.AdminMemberDao;

@Component
public class AdminMemberServiceImp implements AdminMemberService {

	@Autowired
	private AdminMemberDao customerDao;
	
	public AdminMemberServiceImp() {}

	@Override
	public void memberSearchMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/member/memberManager_search.admin");
		
	}
	
	@Override
	public void memberOutputMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/member/memberManager.admin");
		
	}

	
}
