package com.bookjuk.order.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.aop.LogAspect;
import com.bookjuk.order.dao.OrderDao;
import com.bookjuk.order.dto.OrderDto;

@Component
public class OrderServiceImp implements OrderService {
	@Autowired
	private OrderDao orderDao;
	
	/*LogAspect.logger.info(LogAspect.logMsg + );*/
	
	@Override
	public void cart(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		HttpSession session = request.getSession();
		/*주문 아이디 생성*/
		String order_id = getId(session);
		
		String member_level = (String) session.getAttribute("member_level");
		
		if(member_level == null) {member_level = "none";}
		
		List<OrderDto> cartList = null;
		int count = orderDao.cartCount(order_id);
		
		if(count > 0) {
			cartList = orderDao.cartList(order_id);
			mav.addObject("order_id", cartList.get(0).getOrder_id());
		}
		LogAspect.logger.info(LogAspect.logMsg + cartList);
		LogAspect.logger.info(LogAspect.logMsg + "cart : " + order_id);
		
		Map<String, Integer> tot_map = calculate(cartList);
		
		mav.addObject("member_level", member_level);
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
		String order_id = getId(session);
		int book_num = Integer.parseInt(request.getParameter("book_num"));
		int cart_amount = Integer.parseInt(request.getParameter("cart_amount"));
		
		OrderDto orderDto = new OrderDto();
		
		orderDto.setBook_num(book_num);
		orderDto.setOrder_id(order_id);
		orderDto.setCart_amount(cart_amount);
		
		orderDao.updateAmount(orderDto);
	}
	
	@Override
	public void deleteCart(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		HttpSession session = request.getSession();
		String order_id = getId(session);
		int book_num = Integer.parseInt(request.getParameter("book_num"));
		
		orderDao.deleteCart(book_num, order_id);
	}

	@Override
	public void orderNon(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String order_id = request.getParameter("order_id");
		LogAspect.logger.info(LogAspect.logMsg + "ordernon : " + order_id);
		
		/*장바구니 리스트*/
		List<OrderDto> cartList = orderDao.cartList(order_id);
		
		String order_list = orderList(cartList);
		String amount_list = amountList(cartList);
		
		Map<String, Integer> tot_map = calculate(cartList);
		
		mav.addObject("order_id", order_id);
		mav.addObject("order_list", order_list);
		mav.addObject("amount_list", amount_list);
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
		String order_id = request.getParameter("order_id");
		LogAspect.logger.info(LogAspect.logMsg + "order : " + order_id);
		
		/*장바구니 리스트*/
		List<OrderDto> cartList = orderDao.cartList(order_id);
		
		String order_list = orderList(cartList);
		String amount_list = amountList(cartList);
		
		Map<String, Integer> tot_map = calculate(cartList);
		
		/*주문 항목에 뿌릴 회원 정보 받아오기*/
		OrderDto memberDto = orderDao.orderMember(order_id);
		
		mav.addObject("order_id", order_id);
		mav.addObject("order_list", order_list);
		mav.addObject("amount_list", amount_list);
		mav.addObject("tot_price", tot_map.get("tot_price"));
		mav.addObject("tot_point", tot_map.get("tot_point"));
		mav.addObject("tot_delivery", tot_map.get("tot_delivery"));
		mav.addObject("memberDto", memberDto);
		mav.addObject("cartList", cartList);
		
		mav.setViewName("order/order.search");
	}
	
	@Transactional
	@Override
	public void complete(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		OrderDto orderDto = (OrderDto) map.get("orderDto");
		HttpSession session = request.getSession();
		String order_id = getId(session);
		
		if(orderDto.getRefund_bank().equals("mutong")) {
			orderDto.setOrder_state("입금대기중");
		}else {
			orderDto.setOrder_state("상품준비중");
		}
		LogAspect.logger.info(LogAspect.logMsg + orderDto);
		
		/*주문정보 입력*/
		int check = orderDao.insertOrderInfo(orderDto);
		LogAspect.logger.info(LogAspect.logMsg + check);
		
		/*주문번호 가져오기*/
		int order_num = orderDao.orderNum(orderDto);
		if(order_id.length() > 25) {orderDao.insertOrderNonmemInfo(orderDto, order_num);}
		
		LogAspect.logger.info(LogAspect.logMsg + order_num);
		
		/*배송정보 입력*/
		orderDao.insertOrderDelivery(orderDto, order_num);
		
		/*장바구니 비우기*/
		if(check > 0) {orderDao.deleteCartOrder(order_id);}
		
		/*주문 정보*/
		if(order_id.length() > 25) {
			orderDto = orderDao.orderCompleteNonInfo(order_num, order_id);
		}else {
			orderDto = orderDao.orderCompleteMemInfo(order_num, order_id);
		}
		
		/*재고 소진*/
		
		mav.addObject("orderDto", orderDto);
		
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
	
	public String getId(HttpSession session) {
		String order_id = (String) session.getAttribute("member_id");
		if(order_id == null) {order_id = session.getId();}
		
		return order_id;
	}
	
	/*장바구니 및 주문 Total 가격, 배송비, 포인트 계산*/
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
	
	public String orderList(List<OrderDto> cartList) {
		String order_list = "";
		
		for(int i=0; i<cartList.size(); i++) {
			order_list += cartList.get(i).getBook_num() + ",";
		}
		
		return order_list;
	}
	
	public String amountList(List<OrderDto> cartList) {
		String amount_list = "";
		
		for(int i=0; i<cartList.size(); i++) {
			amount_list += cartList.get(i).getCart_amount() + ",";
		}
		
		return amount_list;
	}
/*	@Override
	public void orderOk(ModelAndView mav) {
		Map<>
		
	}*/
}
