package com.bookjuk.admin.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.dao.AdminCustomerDao;

@Component
public class AdminCustomerServiceImp implements AdminCustomerService {

	@Autowired
	private AdminCustomerDao customerDao;
	
	public AdminCustomerServiceImp() {}

	
	@Override
	public void customerMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/customer/customerManager");
		
	}

	
}
