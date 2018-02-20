package com.bookjuk.admin.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
		
		mav.setViewName("admin/order/orderManager_search");
		
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
			
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");		
		
		Date odate;
		try {
			odate = sdf.parse(order_date);
			int check=orderDao.searchList(phone,name,email,odate);  
			LogAspect.logger.info(LogAspect.logMsg+check);
			mav.addObject("check",check);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		mav.setViewName("admin/order/orderManager");
		
	}

	
}
