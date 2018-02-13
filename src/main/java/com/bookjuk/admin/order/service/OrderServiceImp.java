package com.bookjuk.admin.order.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.order.dao.OrderDao;

@Component
public class OrderServiceImp implements OrderService {

	@Autowired
	private OrderDao orderDao;
	
	public OrderServiceImp() {}

	
	@Override
	public void orderMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/order/orderManager");
		
	}

	
}
