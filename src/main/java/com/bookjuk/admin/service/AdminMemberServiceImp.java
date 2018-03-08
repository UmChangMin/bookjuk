package com.bookjuk.admin.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.dao.AdminMemberDao;
import com.bookjuk.admin.dto.AdminMemberDto;
import com.bookjuk.aop.LogAspect;

@Component
public class AdminMemberServiceImp implements AdminMemberService {

	@Autowired
	private AdminMemberDao memberDao;
	

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
		String member_id=request.getParameter("member_id");
		String member_password=request.getParameter("member_password");
		
		//System.out.println(member_id+","+member_password);
		AdminMemberDto memberDto=memberDao.search(member_id,member_password);
		
		LogAspect.logger.info(LogAspect.logMsg+memberDto.toString());
		
		
		mav.addObject("memberList", memberDto);
		mav.setViewName("admin/member/memberManager.admin");		
	}
	
	@Override
	public void memberUpdate(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		String member_num=request.getParameter("member_num");			
		
		//LogAspect.logger.info(LogAspect.logMsg+member_num);
		
		AdminMemberDto memberDto=memberDao.upSelect(member_num);
		
		LogAspect.logger.info(LogAspect.logMsg+memberDto.toString());
		
		
		mav.addObject("memberList", memberDto);
		mav.setViewName("admin/member/memberManager_update.admin");		
	}

	@Override
	public void memberUpdateOk(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		AdminMemberDto adminDto=(AdminMemberDto)map.get("adminMemberDto");
		
		LogAspect.logger.info(LogAspect.logMsg+adminDto.toString());
		
		int check=memberDao.updateOk(adminDto);
		
		mav.addObject("check", check);
		mav.setViewName("admin/member/memberManager_updateOk.admin");	
	}
	
	@Override
	public void memberDelete(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		String member_num=request.getParameter("member_num");
		
		mav.addObject("member_num", member_num);
		mav.setViewName("admin/member/memberManager_delete.empty");	
	}
	
	@Override
	public void memberDeleteOk(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		String member_num=request.getParameter("member_num");
		
		String member_password=request.getParameter("member_password");
		 //System.out.println(member_password);
		String member_id="admin";		
		
		//찍어봄
		//AdminMemberDto memberDto=memberDao.searchAdmin(member_id,member_password);
		//LogAspect.logger.info(LogAspect.logMsg+memberDto.toString());
		int adminCheck=memberDao.searchAdmin(member_id, member_password);
		
		if(adminCheck>0) {
			int check=memberDao.deleteMember(member_num);
			mav.addObject("check", check);
			
		}
		
		mav.setViewName("admin/member/memberManager_deleteOk.empty");	
	}

	
	
	
}
