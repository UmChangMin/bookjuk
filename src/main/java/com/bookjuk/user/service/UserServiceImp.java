package com.bookjuk.user.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.aop.LogAspect;
import com.bookjuk.user.dao.UserDao;

@Component
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserDao mainDao;

	@Override
	public void main(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		HttpSession session=(HttpSession)map.get("session");
		
		String member_level=(String) session.getAttribute("member_level");
		String member_name=(String) session.getAttribute("member_name");
		
		//String member_level=request.getParameter("member_level");
		LogAspect.logger.info(LogAspect.logMsg+member_name+","+member_level);
		
		mav.setViewName("main/main.tiles");
	}

	@Override
	public void location(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		mav.setViewName("main/location.search");
	}

	/* �̺�Ʈ �̱���
	@Override
	public void event(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		mav.setViewName("main/event.search");
	}
	*/
	
}
