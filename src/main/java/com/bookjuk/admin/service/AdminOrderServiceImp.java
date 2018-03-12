package com.bookjuk.admin.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.bookjuk.admin.dao.AdminOrderDao;
import com.bookjuk.admin.dto.AdminBookDto;
import com.bookjuk.admin.dto.AdminOrderDto;
import com.bookjuk.aop.LogAspect;
import com.bookjuk.order.dto.OrderDto;

@Component
public class AdminOrderServiceImp implements AdminOrderService {

	@Autowired
	private AdminOrderDao orderDao;
	
	public AdminOrderServiceImp() {}

	
	@Override
	public void orderSearchMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");				
		List<AdminOrderDto>order_List=orderDao.Order_List();
		//LogAspect.logger.info(LogAspect.logMsg+order_List.toString());
		
		String pageNumber=request.getParameter("pageNumber");
		if(pageNumber==null)pageNumber="1";
		int count=orderDao.getOrderCount();
		LogAspect.logger.info(LogAspect.logMsg+"count:"+count);
		
		int current=Integer.parseInt(pageNumber);
		int boardSize=count;
		
		int start=(current-1)*boardSize+1;
		int end=current*boardSize;
		
		HashMap<String, Integer> hmap=new HashMap<String, Integer>();
		
		hmap.put("start", start);
		hmap.put("end", end);
		
		
		List<AdminOrderDto> boardList=null;

		if(count>0) {
			boardList=orderDao.getOrderList(hmap);
		}
		//LogAspect.logger.info(LogAspect.logMsg+"count, boardList : " +count +", " +boardList.size());
		
		
		mav.addObject("count", count);
		mav.addObject("boardList", boardList);
		mav.addObject("boardSize", boardSize);
		mav.addObject("pageNumber", current);
		
		mav.addObject("order_List", order_List);
		
		mav.setViewName("admin/order/orderManager_search.admin");
		
	}
	
	@Override
	public void orderOutputMove(ModelAndView mav){
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		
		String order_num=request.getParameter("order_num");
		
		AdminOrderDto orderDto=orderDao.select_on(order_num);
		AdminOrderDto orderDto_del=orderDao.select_on_del(order_num);
		LogAspect.logger.info(LogAspect.logMsg+orderDto);
		LogAspect.logger.info(LogAspect.logMsg+orderDto_del);	
		
		String orderList=orderDto.getOrder_list();
		String amountList=orderDto.getAmount_list();
		mav.addObject("orderList",orderList);
		mav.addObject("amountList",amountList);
		
		
		StringTokenizer tokensO = new StringTokenizer( orderList, "," );
		StringTokenizer tokensA = new StringTokenizer( amountList, "," );
		  
		
		  for(int x=1;tokensO.hasMoreElements();x++)
		  {
		    long book_num=Long.parseLong(tokensO.nextToken().trim());
		    System.out.println(book_num);
		    AdminBookDto orderDto_book_num=orderDao.getBook(book_num);
		    //System.out.println(orderDto_book_num);
		    mav.addObject("orderDto_book_num", orderDto_book_num);
		    
		    AdminOrderDto orderDto_product=orderDao.getProduct(book_num);
		    System.out.println(orderDto_product);
		    mav.addObject("orderDto_product", orderDto_product);
		  }
		  
		  for(int x=1;tokensA.hasMoreElements();x++)
		  {
		    int book_amount=Integer.parseInt(tokensA.nextToken());
		    mav.addObject("book_amount",book_amount);
		  }

		mav.addObject("orderDto", orderDto);
		mav.addObject("orderDto_del", orderDto_del);
		
		mav.setViewName("admin/order/orderManager.admin");
		
	}


	@Override
	public void orderUpdateMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		String order_num=request.getParameter("order_num");
		long book_num=Long.parseLong(request.getParameter("book_num"));
		
		AdminOrderDto orderDto=orderDao.select_on(order_num);
		AdminOrderDto orderDto_del=orderDao.select_on_del(order_num);
		LogAspect.logger.info(LogAspect.logMsg+orderDto);
		LogAspect.logger.info(LogAspect.logMsg+orderDto_del);	
		
		String orderList=orderDto.getOrder_list();
		String amountList=orderDto.getAmount_list();
		mav.addObject("orderList",orderList);
		mav.addObject("amountList",amountList);
		
		
		StringTokenizer tokensO = new StringTokenizer( orderList, "," );
		StringTokenizer tokensA = new StringTokenizer( amountList, "," );
		  
		
		  for(int x=1;tokensO.hasMoreElements();x++)
		  {
		    book_num=Long.parseLong(tokensO.nextToken().trim());
		    System.out.println(book_num);
		    AdminBookDto orderDto_book_num=orderDao.getBook(book_num);
		    //System.out.println(orderDto_book_num);		    
		    mav.addObject("orderDto_book_num", orderDto_book_num);
		    
		    AdminOrderDto orderDto_product=orderDao.getProduct(book_num);
		    System.out.println(orderDto_product);
		    mav.addObject("orderDto_product", orderDto_product);
		  }
		  
		  for(int x=1;tokensA.hasMoreElements();x++)
		  {
		    int book_amount=Integer.parseInt(tokensA.nextToken());
		    mav.addObject("book_amount",book_amount);
		  } 
		  
		  if(orderDto.getOrder_state()=="반품완료") {
			  orderDto.setOrder_total_price(0);
		  }
		SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd HH:mm"); 		
	    String sdfOrderDate = sdf.format(orderDto.getOrder_date());
	    System.out.println(sdfOrderDate);
	    mav.addObject("sdfOrderDate", sdfOrderDate);
		mav.addObject("orderDto", orderDto);
		mav.addObject("orderDto_del", orderDto_del);
		/*AdminOrderDto order_numList=orderDao.upSel(order_num);
		AdminBookDto book_numList=orderDao.upSel(book_num);
		
		mav.addObject("orderDto", order_numList);
		mav.addObject("orderDto_del", book_numList);*/
		
		mav.setViewName("admin/order/orderManager_update.admin");
	}


	@Override
	public void orderUpdateOkMove(ModelAndView mav) {
		Map<String,Object>map=mav.getModelMap();
		HttpServletRequest request=(HttpServletRequest)map.get("request");
		AdminOrderDto orderDto=(AdminOrderDto)map.get("orderDto");
		LogAspect.logger.info(LogAspect.logMsg+orderDto.toString());
		String date=request.getParameter("order_date");
			
		   try {
			    SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd HH:mm");
				Date to=sdf.parse(date);
				orderDto.setOrder_date(to);
				System.out.println(orderDto.getOrder_date());
			} catch (ParseException e) {
				e.printStackTrace();
			}
		int value=orderDao.updateOk_delivery(orderDto);
		System.out.println(value);
		int check=orderDao.updateOk(orderDto);
		System.out.println(check);
		
		System.out.println(date);
		mav.addObject("check", check);
		mav.setViewName("admin/order/orderManager_updateOk.admin");
	}
	
}
