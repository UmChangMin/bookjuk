package com.bookjuk.admin.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.dao.AdminOrderDao;
import com.bookjuk.admin.dto.AdminOrderDto;
import com.bookjuk.aop.LogAspect;

@Component
public class AdminOrderServiceImp implements AdminOrderService {

	@Autowired
	private AdminOrderDao orderDao;
	
	public AdminOrderServiceImp() {}

	
	@Override
	public void orderSearchMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/order/orderManager_search.admin");
		
	}
	
	@Override
	public void orderOutputMove(ModelAndView mav){
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		String phone=request.getParameter("phone");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String order_date=request.getParameter("order_date");
		LogAspect.logger.info(LogAspect.logMsg+phone+","+name+","+email+","+order_date);
			
		
		AdminOrderDto orderDto=orderDao.searchList(phone,name,email,order_date);  
		LogAspect.logger.info(LogAspect.logMsg+orderDto);
		mav.addObject("orderDto",orderDto);
		
		mav.setViewName("admin/order/orderManager.admin");
		
	}

	
}
