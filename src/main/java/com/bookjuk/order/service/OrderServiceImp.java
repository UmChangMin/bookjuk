package com.bookjuk.order.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
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
		
		int length = order_id.length();
		
		Map<String, Integer> tot_map = calculate(cartList);
		
		mav.addObject("id_length", length);
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
		HttpSession session = request.getSession();
		
		List<OrderDto> cartList = new ArrayList<OrderDto>();
		String order_id = request.getParameter("order_id");
		int book_num = 0;
		
		if(request.getParameter("book_num") != null) {
			/*바로 구매*/
			String session_id = session.getId();
			book_num = Integer.parseInt(request.getParameter("book_num"));
			cartList = directOrder(book_num, session_id);
			orderDao.insertDirectCart(cartList.get(0));
		}else {
			/*장바구니 리스트*/
			cartList = orderDao.cartList(order_id);
		}
		
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
		
		List<OrderDto> cartList = new ArrayList<OrderDto>();
		String order_id = request.getParameter("order_id");
		int book_num = 0;
		
		if(request.getParameter("book_num") != null) {
			/*바로 구매*/
			book_num = Integer.parseInt(request.getParameter("book_num"));
			cartList = directOrder(book_num, order_id);
		}else {
			/*장바구니 리스트*/
			cartList = orderDao.cartList(order_id);
		}
		
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
		
		if(orderDto.getOrder_payment().equals("mutong")) {
			orderDto.setOrder_state("입금대기중");
		}else {
			orderDto.setOrder_state("상품준비중");
		}
		LogAspect.logger.info(LogAspect.logMsg + orderDto);
		
		/*주문정보 입력*/
		int check = orderDao.insertOrderInfo(orderDto);
		
		/*주문번호 가져오기*/
		int order_num = orderDao.orderNum(orderDto);
		if(order_id.length() > 25) {orderDao.insertOrderNonmemInfo(orderDto, order_num);}
		
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
		
		/*판매량 업데이트*/
		String order_list = orderDto.getOrder_list();
		String amount_list = orderDto.getAmount_list();
		
		String[] order = stringToken(order_list);
		String[] amount = stringToken(amount_list);
		
		for(int i=0; i<order.length; i++) {
			orderDao.updateSales(order[i], amount[i]);
		}
		
		mav.addObject("orderDto", orderDto);
		
		mav.setViewName("order/order_complete.search");
	}
	
	@Override
	public void orderLoginOk(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String nonmember_name = request.getParameter("nonmember_name");
		String nonmember_phone = request.getParameter("nonmember_phone");
		String nonmember_password = request.getParameter("nonmember_password");
		
		int order_num = 0;
		List<OrderDto> orderList = orderDao.getOrderLog(nonmember_name, nonmember_phone, nonmember_password);
		if(orderList.size() > 0) {
			order_num = orderList.get(0).getOrder_num();
		}

		mav.addObject("order_num", order_num);
		mav.setViewName("order/order_loginOk.empty");;
	}	
	@Override
	public void orderList(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		HttpSession session = request.getSession();
		String order_id = getId(session);
		String num = request.getParameter("order_num");
		int order_num = 0;
		
		if(num != null) {
			order_num = Integer.parseInt(num);
			order_id = orderDao.getOrderId(order_num);
		}
		
		List<OrderDto> orderList = orderDao.getOrderList(order_id);
		
		for(int i=0; i<orderList.size(); i++) {
			setOrderList(orderList.get(i));
		}
		
		int count = orderList.size();
		
		/*페이징 처리*/
		HashMap<String, Integer> page = page(request, count);
		
		int currentPage = page.get("currentPage");
		int startRow = page.get("startRow");
		int endRow = page.get("endRow");
		
		mav.addObject("startRow", startRow);
		mav.addObject("endRow", endRow);
		mav.addObject("pageCount", page.get("pageCount"));
		mav.addObject("pageBlock", page.get("pageBlock"));
		mav.addObject("startPage", page.get("startPage"));
		mav.addObject("endPage", page.get("endPage"));
		mav.addObject("pageNumber", currentPage);
		mav.addObject("orderList", orderList);
		
		mav.setViewName("order/order_list.search");
	}

	@Override
	public void orderCancle(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		HttpSession session = request.getSession();
		String order_id = getId(session);
		String num = request.getParameter("order_num");
		int order_num = 0;
		
		if(num != null) {
			order_num = Integer.parseInt(num);
			order_id = orderDao.getOrderId(order_num);
		}
		
		List<OrderDto> orderList = orderDao.getOrderList(order_id);
		
		for(int i=0; i<orderList.size(); i++) {
			setOrderList(orderList.get(i));
		}
		
		int count = orderList.size();
		
		/*페이징 처리*/
		HashMap<String, Integer> page = page(request, count);
		
		int currentPage = page.get("currentPage");
		int startRow = page.get("startRow");
		int endRow = page.get("endRow");
		
		mav.addObject("startRow", startRow);
		mav.addObject("endRow", endRow);
		mav.addObject("pageCount", page.get("pageCount"));
		mav.addObject("pageBlock", page.get("pageBlock"));
		mav.addObject("startPage", page.get("startPage"));
		mav.addObject("endPage", page.get("endPage"));
		mav.addObject("pageNumber", currentPage);
		mav.addObject("orderList", orderList);
		
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
		
		if(tot_price > 10000) {tot_delivery = 0;}
		
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
	
	public List<OrderDto> directOrder(int book_num, String order_id){
		List<OrderDto> cartList = new ArrayList<OrderDto>();
		OrderDto orderDto = orderDao.directOrder(book_num);
		orderDto.setOrder_id(order_id);
		orderDto.setCart_date(new Date());
		orderDto.setCart_amount(1);
		cartList.add(0, orderDto);
		
		return cartList;
	}
	
	public String[] stringToken(String list) {
		int i = 0;
		StringTokenizer st = new StringTokenizer(list, ",");
		String[] tokenList = new String[st.countTokens()];
		while(st.hasMoreElements()) {
			tokenList[i++] = st.nextToken();
		}
		
		return tokenList;
	}
	
	public OrderDto setOrderList(OrderDto orderList){
		int temp = 0;
		String book_img = "";
		OrderDto orderDto = null;
		
		String order_list = orderList.getOrder_list();
		String amount_list = orderList.getAmount_list();
		
		String[] order = stringToken(order_list);
		String[] count = stringToken(amount_list);
		
		int orderLen = order.length;
		int book_num = Integer.parseInt(order[0]);
		orderDto = orderDao.getBookInfo(book_num);
		if(orderLen > 1) {
			order_list = orderDto.getBook_name() + " 외 " + (orderLen - 1) + "권";
			
			for(int j=0; j<count.length; j++) {
				temp += Integer.parseInt(count[j]);
			}
			amount_list = String.valueOf(temp);
			
			orderList.setOrder_list(order_list);
			orderList.setAmount_list(amount_list);
		}else {
			orderList.setOrder_list(orderDto.getBook_name());
			orderList.setAmount_list(count[0]);
		}
		book_img = orderDto.getBook_img();
		orderList.setBook_img(book_img);
		
		return orderList;
	}
	
	public HashMap<String, Integer> page(HttpServletRequest request, int count) {
		String pageNumber = request.getParameter("pageNumber");
		if(pageNumber == null) pageNumber = "1";
		int currentPage = Integer.parseInt(pageNumber);
		
		int boardSize = 10;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		int startRow = (currentPage - 1) * boardSize + 1;
		int endRow = currentPage * boardSize;
		
		int pageCount = count / boardSize + (count % boardSize == 0 ? 0:1);
		int pageBlock = 10;
		int startPage = (currentPage - 1) / pageBlock * pageBlock + 1;
		int endPage = startPage + pageBlock - 1;
		
		map.put("currentPage", currentPage);
		map.put("startRow", startRow);
		map.put("endRow", endRow);
		map.put("pageCount", pageCount);
		map.put("pageBlock", pageBlock);
		map.put("startPage", startPage);
		map.put("endPage", endPage);
		
		return map;
	}
}
