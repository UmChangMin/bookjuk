package com.bookjuk.admin.service;

import org.springframework.web.servlet.ModelAndView;

public interface AdminLocationService {

	public void locationSearch(ModelAndView mav);
	public void locationInputMove(ModelAndView mav);
	
	public void jusoMove(ModelAndView mav);
	
	public void zipCodeMove(ModelAndView mav);
	
	public void locationInputOk(ModelAndView mav);
	public void locationOutputMove(ModelAndView mav);
	
	public void locationUpdateMove(ModelAndView mav);
	public void locationUpdateOkMove(ModelAndView mav);
	
	public void locationDeleteMove(ModelAndView mav);
	public void locationDeleteOkMove(ModelAndView mav);
	
}


