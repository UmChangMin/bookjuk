package com.bookjuk.user.service;

import org.springframework.web.servlet.ModelAndView;

public interface UserService {
	public void main(ModelAndView mav);
	public void location(ModelAndView mav);
	public void search(ModelAndView mav);
	public void floating(ModelAndView mav);
	
	/*public void event(ModelAndView mav);*/
}
