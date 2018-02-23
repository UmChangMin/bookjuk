package com.bookjuk.member.service;

import org.springframework.web.servlet.ModelAndView;

public interface MemberService {
	public void login(ModelAndView mav);
	public void registe(ModelAndView mav);
	public void checkId(ModelAndView mav);
}
