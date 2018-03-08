package com.bookjuk.user.service;

import org.springframework.web.servlet.ModelAndView;

public interface UserService {
	public void main(ModelAndView mav);
	public void location(ModelAndView mav);
	/*public void event(ModelAndView mav);*/
	public void main_header( ModelAndView mav);
	public void search_header(ModelAndView mav);

}
