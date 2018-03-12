package com.bookjuk.admin.service;

import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.dao.AdminLocationDao;
import com.bookjuk.admin.dto.AdminLocationDto;
import com.bookjuk.admin.dto.ZipCodeDto;
import com.bookjuk.aop.LogAspect;

@Component
public class AdminLocationServiceImp implements AdminLocationService {

	@Autowired
	private AdminLocationDao locationDao;	

	
	
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
		/*locationDto.setLocation_comming(locationDto.getLocation_comming().replaceAll("\r\n", "<br>"));*/
		
		LogAspect.logger.info(LogAspect.logMsg+locationDto);
		Random rd=new Random();
		locationDto.setLocation_num(rd.nextInt(99));
		int check=locationDao.locationInsert(locationDto);
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
		
		AdminLocationDto locationDto=locationDao.locationSelect(location_name);
		LogAspect.logger.info(LogAspect.logMsg+locationDto.toString());
		
		mav.addObject("locationDto", locationDto);
		
		mav.setViewName("admin/location/locationManager.admin");		 
	}


	@Override
	public void locationSearch(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		List<AdminLocationDto>LocationList=locationDao.locationList();
		
		LogAspect.logger.info(LogAspect.logMsg+LocationList.size());
		
		mav.addObject("LocationList",LocationList);
		mav.setViewName("admin/location/locationManager_search.admin");
	}

	@Override
	public void zipCodeMove(ModelAndView mav) {
		Map<String, Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		String dong=request.getParameter("dong");
		
		List<ZipCodeDto> zipcodeList=null;
		
		if(dong!=null) {
			zipcodeList=locationDao.selectZipcode(dong.replaceAll(" ", ""));
			LogAspect.logger.info(LogAspect.logMsg + "zipcode "+ zipcodeList.size());
		}
		
		mav.addObject("zipcodeList", zipcodeList);
		
		mav.setViewName("admin/location/zipcode.empty");
	}

	@Override
	public void jusoMove(ModelAndView mav) {
		
		
		mav.setViewName("admin/location/jusoPopup.empty");
		
	}

	@Override
	public void locationUpdateMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		String location_num=request.getParameter("location_num");		
		System.out.println(location_num);
		
		AdminLocationDto locationDto=locationDao.upSelect(location_num);
		System.out.println(locationDto.toString());
		
		mav.addObject("locationDto", locationDto); 
		mav.setViewName("admin/location/locationManager_update.admin");
	}

	@Override
	public void locationUpdateOkMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		AdminLocationDto locationDto=(AdminLocationDto)map.get("locationDto");
		
		System.out.println(locationDto.toString());
		int check=locationDao.updateOk(locationDto);
		
		mav.addObject("check", check);
		mav.setViewName("admin/location/locationManager_updateOk.admin");
	}

	@Override
	public void locationDeleteMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		String location_num=request.getParameter("location_num");		
		System.out.println(location_num);
		
		mav.addObject("location_num", location_num); 
		mav.setViewName("admin/location/locationManager_delete.admin");
	}

	@Override
	public void locationDeleteOkMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		String location_num=request.getParameter("location_num");
		int check=locationDao.deleteOk(location_num);
		
		mav.addObject("check", check);
		mav.setViewName("admin/location/locationManager_deleteOk.admin");
	}



	
}
