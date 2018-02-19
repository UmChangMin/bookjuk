package com.bookjuk.admin.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.dao.SalesDao;

@Component
public class SalesServiceImp implements SalesService {

	@Autowired
	private SalesDao salesDao;
	
	public SalesServiceImp() {}

	
	@Override
	public void salesMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/sales/salesManager");
		
	}

	
}
