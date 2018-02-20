package com.bookjuk.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.member.service.MemberService;

@Controller
@RequestMapping(value = "/member")
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "/login.do")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		memberService.login(mav);
		
		return mav;
	}
	
	@RequestMapping(value = "/registe.do")
	public ModelAndView registe(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("request", request);
		memberService.registe(mav);
		
		return mav;
	}
	
	@RequestMapping(value = "rule1.do")
	public ModelAndView rule1(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("member/rule1.empty");
		return mav;
	}
	
	@RequestMapping(value = "rule2.do")
	public ModelAndView rule2(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("member/rule2.empty");
		return mav;
	}
}
