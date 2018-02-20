package com.bookjuk.admin.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.dao.AdminSalesDao;

@Component
public class AdminSalesServiceImp implements AdminSalesService {

	@Autowired
	private AdminSalesDao salesDao;
	
	public AdminSalesServiceImp() {}

	
	@Override
	public void salesMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/sales/salesManager.admin");
		
	}

	
}
