package com.bookjuk.member.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;


import com.bookjuk.aop.LogAspect;
import com.bookjuk.member.dao.MemberDao;
import com.bookjuk.member.dto.MemberDto;
import com.bookjuk.service.dao.ServiceDao;
import com.bookjuk.service.dto.ServiceContactDto;

@Component
public class MemberServiceImp implements MemberService {

	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	private ServiceDao serviceDao;

	@Override
	public void loginOk(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		HttpSession session = request.getSession();
		String session_id = session.getId();
		
		int count = memberDao.getCart(session_id);
		
		String member_id=request.getParameter("member_id");
		String member_password=request.getParameter("member_password");
		
		MemberDto memberDto = memberDao.loginOk(member_id,member_password);
		if(count > 0) {
			memberDao.updateCart(member_id, session_id);
			mav.addObject("cart", "cart");
		}
		
		if(memberDto != null) {
			mav.addObject("member_id", memberDto.getMember_id());
			mav.addObject("member_name", memberDto.getMember_name());
			mav.addObject("member_level", memberDto.getMember_level());
		}
		
		mav.setViewName("member/member_loginOk.empty");
	}
	

	@Override
	public void registOk(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		MemberDto memberDto = (MemberDto) map.get("memberDto");
		
		if(memberDto.getMember_mailing() == null) {
			memberDto.setMember_mailing("no");
		}else {
			memberDto.setMember_mailing("yes");
		}
		memberDto.setMember_level("member");
		
		int check = memberDao.insert(memberDto);

		mav.addObject("check", check);
		
		mav.setViewName("member/member_registOk.empty");
	}

	@Override
	public void checkId(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		HttpServletResponse response = (HttpServletResponse) map.get("response");
		String id = request.getParameter("id");
		
		int check = memberDao.checkId(id);
		
		try {
			response.getWriter().print(check);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	@Override
	public void findId(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String name = request.getParameter("member_name");
		String email = request.getParameter("member_email");

		String id = memberDao.findId(name, email);

		mav.addObject("id", id);
		
		mav.setViewName("member/member_find_idOk.empty");
	}


	@Override
	public void findPwd(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String id = request.getParameter("member_id");
		String email = request.getParameter("member_email");
		
		String pwd = memberDao.finfPwd(id,email);
		
		mav.addObject("pwd", pwd);
		
		mav.setViewName("member/member_find_pwdOk.empty");
		
	}

	
	// 회원 탈퇴 180306 강민아
	@Override
	public void deleteOk(ModelAndView mav) {
		Map<String, Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		String member_id=request.getParameter("member_id");
		String member_password = request.getParameter("member_password");
		
		String password = memberDao.searchPassword(member_id);
		if(member_password.equals(password)) {
			memberDao.deleteMemberReview(member_id);
			memberDao.deleteMemberCart(member_id);
			memberDao.deleteMemberOrder(member_id);
			memberDao.deleteMemberContact(member_id);
		}
		
		int check = memberDao.delete(member_id, member_password);
		
		mav.addObject("check",check);
		mav.setViewName("member/member_deleteOk.empty");
		
	}

	// 회원수정 180306 강민아
	@Override
	public void update(ModelAndView mav) {
		Map<String, Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		HttpSession session=request.getSession();
		String member_id=(String)session.getAttribute("member_id");
		//LogAspect.logger.info(LogAspect.logMsg+"아이디:"+member_id);
		
		MemberDto memberDto=memberDao.upSelect(member_id);
		//LogAspect.logger.info(LogAspect.logMsg+memberDto.toString());
		
		mav.addObject("memberDto",memberDto);
	
		mav.setViewName("member/member_update.search");
		
	}

	// 우편번호 
	@Override
	public void zipcode(ModelAndView mav) {
		mav.setViewName("member/member_zipcode.empty");
	}

	// 회원수정 180306 강민아
	@Override
	public void updateOk(ModelAndView mav) {
		Map<String, Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		MemberDto memberDto=(MemberDto)map.get("memberDto");
		
		LogAspect.logger.info(LogAspect.logMsg+memberDto.toString());
	
		int check=memberDao.update(memberDto);
		//LogAspect.logger.info(LogAspect.logMsg+check);
		mav.addObject("check",check);
	
		mav.setViewName("member/member_updateOk.search");
	}


	// 180308 강민아 나의문의내역
	@Override
	public void mypage(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		HttpSession session = (HttpSession) map.get("session");
		
		String member_id = (String) session.getAttribute("member_id");
		
		//System.out.println(member_id);
	
		String pageNumber=request.getParameter("pageNumber");
		if(pageNumber==null) {pageNumber="1";}
		
		int currentPage=Integer.parseInt(pageNumber);
		
		int boardSize=5;
		
		int startRow=(currentPage-1)*boardSize+1;
		int endRow=currentPage*boardSize;
		
		int coupon=memberDao.coupon(member_id);
		int point=memberDao.point(member_id);
		
		List<ServiceContactDto>ServiceContactList=null;
		if(member_id!=null) {
			
			int count=serviceDao.getBoardCount(member_id);
			//LogAspect.logger.info(LogAspect.logMsg+"count :"+count);
			
			if(count>0) {
				ServiceContactList=serviceDao.ServiceContactList(startRow,endRow,member_id);
				//LogAspect.logger.info(LogAspect.logMsg+"글 총개수( ServiceContactList ) :"+ServiceContactList.size());
				mav.addObject("pageNumber",pageNumber);
				mav.addObject("currentPage",currentPage);
				mav.addObject("boardSize",boardSize);
				mav.addObject("count",count);
				mav.addObject("ServiceContactList",ServiceContactList);
			}
			
		}else {
			mav.addObject("member_id", member_id);
		}
		
		mav.addObject("point",point);
		mav.addObject("coupon",coupon);
		mav.setViewName("member/member_mypage.search");
		
	}


	// 180308 강민아 쿠폰
	@Override
	public void coupon(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String member_id=request.getParameter("member_id");
		
		int coupon=memberDao.coupon(member_id);
		
		mav.addObject("coupon",coupon);
		mav.setViewName("member/member_coupon.empty");
	}

	// 180308 강민아 포인트
	@Override
	public void point(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String member_id=request.getParameter("member_id");
		
		int point=memberDao.point(member_id);
		
		mav.addObject("point",point);
		mav.setViewName("member/member_point.empty");
		
	}


	@Override
	public void updateCheck(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		HttpSession session = request.getSession();
		String member_id = (String) session.getAttribute("member_id");
		
		mav.addObject("member_id", member_id);
		
		mav.setViewName("/member/member_pwd_check.search");
	}


	@Override
	public void updateCheckOk(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String member_id = request.getParameter("member_id");
		String member_password = request.getParameter("member_password");
		int member_num = 0;
		
		int count = memberDao.upCheck(member_id, member_password);
		if(count > 0){
			member_num = memberDao.upCheckOk(member_id, member_password);
		}
		LogAspect.logger.info(LogAspect.logMsg + member_num);
		
		mav.addObject("member_num", member_num);
		
		mav.setViewName("/member/member_pwd_checkOk.empty");
	}
}
