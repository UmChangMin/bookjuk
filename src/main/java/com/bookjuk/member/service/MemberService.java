package com.bookjuk.member.service;

import org.springframework.web.servlet.ModelAndView;

public interface MemberService {
	public void loginOk(ModelAndView mav);
	public void registOk(ModelAndView mav);
	public void checkId(ModelAndView mav);
	public void findId(ModelAndView mav);
	public void findPwd(ModelAndView mav);
	
	public void deleteOk(ModelAndView mav);
	public void update(ModelAndView mav);
	public void updateOk(ModelAndView mav);
	public void zipcode(ModelAndView mav);
}
