package com.bookjuk.admin.service;

import org.springframework.web.servlet.ModelAndView;

public interface AdminMemberService {

	public void memberSearchMove(ModelAndView mav);
	public void memberOutputMove(ModelAndView mav);
	
	public void memberUpdate(ModelAndView mav);
	public void memberUpdateOk(ModelAndView mav);
	
	public void memberDelete(ModelAndView mav);
	public void memberDeleteOk(ModelAndView mav);
	public void adminChk(ModelAndView mav);
	
}
