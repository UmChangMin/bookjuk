package com.bookjuk.admin.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.dao.AdminLocationDao;
import com.bookjuk.admin.dto.AdminLocationDto;
import com.bookjuk.aop.LogAspect;

@Component
public class AdminLocationServiceImp implements AdminLocationService {

	@Autowired
	private AdminLocationDao LocationDao;	

	
	
	@Override
	public void locationInputMove(ModelAndView mav) {
		mav.setViewName("admin/location/locationManager_input.admin");
		
	}
	
	@Override
	public void locationInputOk(ModelAndView mav) {			
/*		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
*/		
		AdminLocationDto locationDto=(AdminLocationDto) mav.getModel().get("adminLocationDto");
		locationDto.setLocation_comming(locationDto.getLocation_comming().replace("\r\n", "<br/>"));
		
		LogAspect.logger.info(LogAspect.logMsg+locationDto);
		
		int check=LocationDao.locationInsert(locationDto);
		LogAspect.logger.info(LogAspect.logMsg+check);
		
		mav.addObject("check", check);
		mav.setViewName("admin/location/locationManager_inputOk.admin");			
	}

	 
	@Override
	public void locationOutputMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		String location_name=request.getParameter("location");
		LogAspect.logger.info(LogAspect.logMsg+location_name);
		
		AdminLocationDto locationDto=LocationDao.locationSelect(location_name);
		LogAspect.logger.info(LogAspect.logMsg+locationDto.toString());
		
		mav.addObject("locationDto", locationDto);
		mav.setViewName("admin/location/locationManager.admin");		 
	}


	@Override
	public void locationSearch(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		List<AdminLocationDto>LocationList=LocationDao.locationList();
		
		LogAspect.logger.info(LogAspect.logMsg+LocationList.size());
		
		mav.addObject("LocationList",LocationList);
		mav.setViewName("admin/location/locationManager_search.admin");
	}

	@Override
	public void zipCodeMove(ModelAndView mav) {
		Map<String, Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		mav.setViewName("admin/location/zipcode.empty");
	}



	
}
