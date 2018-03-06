package com.bookjuk.order.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.aop.LogAspect;
import com.bookjuk.order.dao.OrderDao;
import com.bookjuk.order.dto.OrderDto;

@Component
public class OrderServiceImp implements OrderService {
	@Autowired
	private OrderDao orderDao;
	
	@Override
	public void cart(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		HttpSession session = request.getSession();
		String nonmember_id = session.getId();
		String member_id = (String) session.getAttribute("member_id");
		int count = 0;
		List<OrderDto> cartList = null;
		
		if(member_id != null) {
			count = orderDao.memCartCount(member_id);
			if(count > 0) {
				cartList = orderDao.memCartList(member_id);
				mav.addObject("member_id", cartList.get(0).getMember_id());
			}
		}else if(nonmember_id != null) {
			member_id = "비회원";
			count = orderDao.nonCartCount(nonmember_id);
			if(count > 0) {
				cartList = orderDao.nonCartList(nonmember_id);
				mav.addObject("member_id", cartList.get(0).getMember_id());
				mav.addObject("nonmember_id", cartList.get(0).getNonmember_id());
			}
		}
		
		Map<String, Integer> tot_map = calculate(cartList);
		
		mav.addObject("tot_price", tot_map.get("tot_price"));
		mav.addObject("tot_point", tot_map.get("tot_point"));
		mav.addObject("tot_delivery", tot_map.get("tot_delivery"));
		mav.addObject("cartList", cartList);
		
		mav.setViewName("order/order_cart.search");
	}
	
	@Override
	public void updateAmount(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		HttpSession session = request.getSession();
		String member_id = (String) session.getAttribute("member_id");
		int book_num = Integer.parseInt(request.getParameter("book_num"));
		int cart_amount = Integer.parseInt(request.getParameter("cart_amount"));
		String nonmember_id = session.getId();
		
		OrderDto orderDto = new OrderDto();
		
		if(member_id != null) {
			orderDto.setMember_id(member_id);
			orderDto.setBook_num(book_num);
			orderDto.setNonmember_id(nonmember_id);
			orderDto.setCart_amount(cart_amount);
		}else {
			orderDto.setBook_num(book_num);
			orderDto.setNonmember_id(nonmember_id);
			orderDto.setCart_amount(cart_amount);
		}
		
		orderDao.updateAmount(orderDto);
	}
	
	@Override
	public void deleteCart(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		HttpSession session = request.getSession();
		int book_num = Integer.parseInt(request.getParameter("book_num"));
		if(session.getAttribute("member_id") != null) {
			String member_id = (String) session.getAttribute("member_id");
			orderDao.memDeleteCart(book_num, member_id);
		}else {
			String nonmember_id = session.getId();
			orderDao.nonDeleteCart(book_num, nonmember_id);
		}
		
		
	}

	@Override
	public void orderNon(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String nonmember_id = request.getParameter("nonmember_id");
		LogAspect.logger.info(LogAspect.logMsg + nonmember_id);
		
		List<OrderDto> cartList = orderDao.nonCartList(nonmember_id);
		
		Map<String, Integer> tot_map = calculate(cartList);
		
		mav.addObject("tot_price", tot_map.get("tot_price"));
		mav.addObject("tot_point", tot_map.get("tot_point"));
		mav.addObject("tot_delivery", tot_map.get("tot_delivery"));
		mav.addObject("cartList", cartList);
		
		mav.setViewName("order/order_non.search");
	}

	@Override
	public void order(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String member_id = request.getParameter("member_id");
		LogAspect.logger.info(LogAspect.logMsg + member_id);
		
		List<OrderDto> cartList = orderDao.memCartList(member_id);
		
		Map<String, Integer> tot_map = calculate(cartList);
		
		OrderDto memberDto = orderDao.orderMember(member_id);
		
		mav.addObject("tot_price", tot_map.get("tot_price"));
		mav.addObject("tot_point", tot_map.get("tot_point"));
		mav.addObject("tot_delivery", tot_map.get("tot_delivery"));
		mav.addObject("memberDto", memberDto);
		mav.addObject("cartList", cartList);
		
		mav.setViewName("order/order.search");
	}
	
	@Override
	public void zipcode(ModelAndView mav) {
		
		mav.setViewName("order/order_zipcode.empty");
	}

	@Override
	public void complete(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		OrderDto orderDto = (OrderDto) map.get("orderDto");
		LogAspect.logger.info(LogAspect.logMsg + orderDto.toString());
		
		mav.setViewName("order/order_complete.search");
	}
	
	@Override
	public void orderMain(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String phone = request.getParameter("phone");
		String member_password=request.getParameter("member_password");
		LogAspect.logger.info(LogAspect.logMsg+"핸드폰번호&&비밀번호"+phone+"\t"+member_password);
		
		mav.setViewName("order/order_main.empty");
	}
	
	@Override
	public void orderList(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		mav.setViewName("order/order_list.search");
	}

	@Override
	public void orderCancle(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		mav.setViewName("order/order_cancle.search");
	}
	
	public Map<String, Integer> calculate(List<OrderDto> cartList) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		int tot_price = 0;
		int tot_point = 0;
		int tot_delivery = 0;
		if(cartList != null) {
			for(int i = 0; i<cartList.size(); i++) {
				int price = cartList.get(i).getProduct_disprice();
				int point = cartList.get(i).getProduct_point();
				int delivery = cartList.get(i).getProduct_delivery();
				int amount = cartList.get(i).getCart_amount();
				tot_price += price * amount;
				tot_point += point * amount;
				tot_delivery += delivery;
			}
		}
		
		if(tot_price > 10000) {
			tot_delivery = 0;
		}
		
		map.put("tot_price", tot_price);
		map.put("tot_point", tot_point);
		map.put("tot_delivery", tot_delivery);
		
		return map;
	}
/*	@Override
	public void orderOk(ModelAndView mav) {
		Map<>
		
	}*/
}
