package com.bookjuk.customer.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.customer.dao.CustomerDao;

@Component
public class CustomerServiceImp implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Override
	public void customer(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		mav.setViewName("customer_service/customer/customer.search");
	}

	@Override
	public void noticeList(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		mav.setViewName("customer_service/notice/customer_notice_list.search");
	}
	
	@Override
	public void noticeRead(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		mav.setViewName("customer_service/notice/customer_notice_read.search");
	}

	@Override
	public void inquiryList(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		mav.setViewName("customer_service/inquiry/customer_inquiry_list.search");
	}

	@Override
	public void inquiryWrite(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		mav.setViewName("customer_service/inquiry/customer_inquiry_write.search");
	}

	@Override
	public void inquiryRead(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		mav.setViewName("customer_service/inquiry/customer_inquiry_read.search");
	}

	@Override
	public void inquiryUpdate(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		mav.setViewName("customer_service/inquiry/customer_inquiry_update.search");
	}


	
	
}
