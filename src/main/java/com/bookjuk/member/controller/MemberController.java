package com.bookjuk.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tools.ant.taskdefs.condition.Http;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.member.dto.MemberDto;
import com.bookjuk.member.service.MemberService;

@Controller
@RequestMapping(value = "/member")
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("member/member_login.empty");
	}
	
	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public ModelAndView loginOk(HttpServletRequest request, HttpServletResponse response,HttpSession session) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		mav.addObject("session", session);

		memberService.loginOk(mav);
		
		return mav;
	}
	
	@RequestMapping(value = "/findId.do",method=RequestMethod.GET)
	public ModelAndView findId(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("/member/member_find_id.empty");
	}
	
	@RequestMapping(value = "/findId.do",method=RequestMethod.POST)
	public ModelAndView findIdOk(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);

		memberService.findId(mav);
		
		return mav;
	}
	
	@RequestMapping(value = "/findPwd.do", method=RequestMethod.GET)
	public ModelAndView findPwd(HttpServletRequest request, HttpServletResponse response) {
		return new  ModelAndView("/member/member_find_pwd.empty");
	}
	
	@RequestMapping(value = "/findPwd.do", method = RequestMethod.POST)
	public ModelAndView findPwdOk(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		
		memberService.findPwd(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/logout.do", method = RequestMethod.GET)
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		session.invalidate();
		return new ModelAndView("member/member_logout.empty");
	}
	
	@RequestMapping(value = "/regist.do", method = RequestMethod.GET)
	public ModelAndView registe(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("member/member_regist.empty");
	}
	
	@RequestMapping(value = "/regist.do", method = RequestMethod.POST)
	public ModelAndView registeOk(HttpServletRequest request, HttpServletResponse response, MemberDto memberDto) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("memberDto", memberDto);
		memberService.registOk(mav);
		
		return mav;
	}
	
	@RequestMapping(value = "/checkId.do")
	public ModelAndView checkId(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		mav.addObject("response", response);
		memberService.checkId(mav);
		
		return null;
	}
	
	@RequestMapping(value = "zipcode.do")
	public ModelAndView zipcode(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("member/member_zipcode.empty");
		return mav;
	}
	
	@RequestMapping(value = "update.do")
	public ModelAndView update(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("member/member_update.search");
		return mav;
	}
	
	@RequestMapping(value = "delete.do")
	public ModelAndView delete(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("member/member_delete.search");
		return mav;
	}
	
	@RequestMapping(value = "rule1.do")
	public ModelAndView rule1(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("member/member_rule1.empty");
		return mav;
	}
	
	@RequestMapping(value = "rule2.do")
	public ModelAndView rule2(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("member/member_rule2.empty");
		return mav;
	}
	
	@RequestMapping(value = "mypage.do")
	public ModelAndView mypage(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("member/member_mypage.search");
		return mav;
	}
	
	@RequestMapping(value = "point.do")
	public ModelAndView point(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("member/member_point.empty");
		return mav;
	}
	
	@RequestMapping(value = "coupon.do")
	public ModelAndView coupon(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("member/member_coupon.empty");
		return mav;
	}
	
}
