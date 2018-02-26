package com.bookjuk.admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.dto.AdminLocationDto;
import com.bookjuk.admin.service.AdminLocationService;
import com.bookjuk.aop.LogAspect;

@Controller
public class AdminLocationController{

	@Autowired
	private AdminLocationService adminLocationService;
	
	public AdminLocationController() {}

	
	
	
	@RequestMapping(value="/admin/location/locationManager_search.do",method=RequestMethod.GET)
	public ModelAndView LocationSearch(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"Location-search?");
		ModelAndView mav=new ModelAndView();
		
		adminLocationService.locationSearch(mav);
		return mav;
	}
	
	@RequestMapping(value="/admin/location/locationManager_input.do",method=RequestMethod.GET)
	public ModelAndView LocationInput(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"Location-input?");
		ModelAndView mav=new ModelAndView();		
		adminLocationService.locationInputMove(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/admin/location/locationManager_inputOk.do",method=RequestMethod.GET)
	public ModelAndView LocationInputOk(HttpServletRequest request, HttpServletResponse response, AdminLocationDto adminLocationDto) {
		
		LogAspect.logger.info(LogAspect.logMsg+"Location-inputOK?");
		
		ModelAndView mav=new ModelAndView();
		
		mav.addObject("request",request);
		mav.addObject("adminLocationDto", adminLocationDto);
		
		adminLocationService.locationInputOk(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/admin/location/locationManager.do",method=RequestMethod.GET)
	public ModelAndView LocationOutput(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"Location-output?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		adminLocationService.locationOutputMove(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/admin/location/zipcode.do",method=RequestMethod.GET)
	public ModelAndView ZipCodeMove(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"Zipcode?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		adminLocationService.zipCodeMove(mav);
		
		return mav;
	}
	
	
}
