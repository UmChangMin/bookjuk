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
	
	@RequestMapping(value="/admin/location/locationManager_update.do",method=RequestMethod.GET)
	public ModelAndView LocationUpdate(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"Location-update?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		adminLocationService.locationUpdateMove(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/admin/location/locationManager_updateOk.do",method=RequestMethod.POST)
	public ModelAndView LocationUpdateOk(HttpServletRequest request, HttpServletResponse response, AdminLocationDto locationDto) {
		
		LogAspect.logger.info(LogAspect.logMsg+"Location-updateOk?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		mav.addObject("locationDto", locationDto);
		adminLocationService.locationUpdateOkMove(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/admin/location/locationManager_delete.do",method=RequestMethod.GET)
	public ModelAndView LocationDelete(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"Location-delete?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		adminLocationService.locationDeleteMove(mav);
		
		return mav;
	}
	
	@RequestMapping(value="/admin/location/locationManager_deleteOk.do",method=RequestMethod.GET)
	public ModelAndView LocationDeleteOk(HttpServletRequest request, HttpServletResponse response, AdminLocationDto locationDto) {
		
		LogAspect.logger.info(LogAspect.logMsg+"Location-deleteOk?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		mav.addObject("locationDto", locationDto);
		adminLocationService.locationDeleteOkMove(mav);
		
		return mav;
	}
	
	
	
	@RequestMapping(value="/admin/location/jusoPopup.do",method= {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView JusoPopup(HttpServletRequest request, HttpServletResponse response) {
		
		LogAspect.logger.info(LogAspect.logMsg+"jusoPopup?");
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("request",request);
		adminLocationService.jusoMove(mav);
		
		return mav;
	}
	
	
}
