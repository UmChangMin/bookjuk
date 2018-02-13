package com.bookjuk.admin.customer.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.customer.dao.CustomerDao;

@Component
public class CustomerServiceImp implements CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	public CustomerServiceImp() {}

	
	@Override
	public void customerMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/customer/customerManager");
		
	}

	
}
