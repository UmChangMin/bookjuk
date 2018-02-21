package com.bookjuk.admin.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.dao.AdminShopDao;
import com.bookjuk.admin.dto.AdminShopDto;
import com.bookjuk.aop.LogAspect;

@Component
public class AdminShopServiceImp implements AdminShopService {

	@Autowired
	private AdminShopDao shopDao;
		
	@Override
	public void shopSearchMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/shop/shopManager_search.admin");
		
	}
	
	@Override
	public void shopInputMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/shop/shopManager_input.admin");	 
	}
	
	
	@Override
	public void shopInputOk(ModelAndView mav) {			
		AdminShopDto shopDto=(AdminShopDto) mav.getModel().get("shopDto");
		LogAspect.logger.info(LogAspect.logMsg + "shopDto : "+shopDto.toString());
		
		int check=shopDao.shopInsert(shopDto);
		LogAspect.logger.info(LogAspect.logMsg+check);
		
		mav.addObject("check", check);
		mav.setViewName("admin/shop/shopManager_inputOk.admin");	
		
	}
	
	 
	@Override
	public void shopOutputMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		String shop_subname=request.getParameter("shop");
		LogAspect.logger.info(LogAspect.logMsg+shop_subname);
		
		AdminShopDto shopDto=shopDao.shopSelect(shop_subname);
		LogAspect.logger.info(LogAspect.logMsg+shopDto.toString());
		
		mav.addObject("shopDto", shopDto);
		mav.setViewName("admin/shop/shopManager.admin");		 
	}

	
}
