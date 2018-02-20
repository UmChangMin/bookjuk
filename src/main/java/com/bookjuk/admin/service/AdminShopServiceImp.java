package com.bookjuk.admin.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.dao.AdminShopDao;

@Component
public class AdminShopServiceImp implements AdminShopService {

	@Autowired
	private AdminShopDao shopDao;
	
	public AdminShopServiceImp() {}

	
	@Override
	public void shopMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/shop/shopManager");
		
	}

	
}
