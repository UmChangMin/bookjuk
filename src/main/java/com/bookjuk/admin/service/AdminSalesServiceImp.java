package com.bookjuk.admin.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.dao.AdminSalesDao;
import com.bookjuk.admin.dto.AdminSalesDto;

@Component
public class AdminSalesServiceImp implements AdminSalesService {

	@Autowired
	private AdminSalesDao salesDao;
	
	public AdminSalesServiceImp() {}

	
	@Override
	public void salesMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		/*AdminSalesDto salesDto=new AdminSalesDto();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd");
		
		Date sales_date=new Date();
		String to=sdf.format(sales_date);
		long td_sa=salesDao.td_sa(to);
		System.out.println(td_sa);
		long td_rf;
		long tm_sa;
		long tm_rf;
		long tot_sa;
		long tot_rf;*/
		
		
		mav.setViewName("admin/sales/salesManager.admin");
		
	}

	
}
