package com.bookjuk.admin.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.dao.ShopDao;

@Component
public class ShopServiceImp implements ShopService {

	@Autowired
	private ShopDao shopDao;
	
	public ShopServiceImp() {}

	
	@Override
	public void shopMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/shop/shopManager");
		
	}

	
}
