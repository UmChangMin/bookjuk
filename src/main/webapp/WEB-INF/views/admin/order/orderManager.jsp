<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>관리자모드</title>

<c:set var="root" value="${pageContext.request.contextPath }"/>
 <link rel="stylesheet" type="text/css" href="${root }/css/admin/order/orderManager.css">
 <link rel="stylesheet" type="text/css" href="${root }/css/admin/commons/main.css">
 <script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
 <script type="text/javascript" src="${root }/js/admin/order.js"></script>
</head>   

<body>
	<!-- 타이틀메뉴 시작 -->
	<div class="all">
	
		<!-- wrap시작 -->
			<div class="wrap">
				<div class="content_wrap">
					<div class="content_title">주문관리</div>
					
					<div class="content">
						<ul>
							<li class="content_part content_part_move1">
							<div class="content_wrap_body_left">
								
								<div class="content_box" align="center">									
									
									<ul class="content_box_left">
										<!-- <li class="content_box_title">고객배송지정보</li> -->
										
										<li class="">
											
											  <div class="form-left">
											  	<div class="content_box_title left_title">고객배송지정보</div>
											  											 
											    <div class="form-group">											      
											      <div class="col-lg-10">											      											      							 
											        <input type="text" class="form-control input_width" id="outputName" value="${orderDto_del.order_name }">											        
											      </div>
											    </div>
										
											  	<div class="form-group">											      
											      <div class="col-lg-10">											      											      							 
											        <input type="text" class="form-control input_width" id="outputPost" value="${orderDto_del.order_postcode }">											        
											      </div>
											    </div>
											    
											    <div class="form-group">											      
											      <div class="col-lg-10">											      											      							 
											        <input type="text" class="form-control input_width" id="outputAddress" value="${orderDto_del.order_address }">											        
											      </div>
											    </div>
											    
											    <div class="form-group">											      
											      <div class="col-lg-10">											      											      							 
											        <input type="text" class="form-control input_width" id="outputDetailAddr" value="${orderDto_del.order_address_detail }">											        
											      </div>
											    </div>
											    										   
											    <div class="form-group">											      
											      <div class="col-lg-10">											      											      							 
											        <input type="text" class="form-control input_width" id="outputPhone" value="${orderDto_del.order_phone }">											        
											      </div>
											    </div>
											    
											    <div class="form-group">											      
											      <div class="col-lg-10">											      											      							 
											        <input type="text" class="form-control input_width" id="outputMemo" value="${orderDto_del.order_memo }">											        
											      </div>
											    </div>
										    </div>
						    <div class="content_wrap_body_right">
								<div class="content_box">
									<!-- <ul class="content_box1 content_title_height">
										<li class="content_box_title content_admin_alert">
											<span>※관리자 주의사항</span><br/>
											<span>※환불, 교환,반품 수정은 상품 출발 전 또는 상품이 
											본사에 도착한 이후를 기점으로 합니다.</span>
										</li>											
									</ul> -->
									
									<ul class="">
										<li class="content_box_title" id="box3_width">고객주문내역</li>						
									</ul>
									
									<ul class="content_box3">					
										<li class="content_box3_main_li">
										<div class="content_box3_form" align="center">
											<div class="content_c_orderlist_title">
												<ul>
													<li class="c_orderlist_h">결제내역</li>																		
												</ul>												
											</div>
											<div class="content_menulist_title">
												<ul>
													<li class="menulist_title">도서</li>
													<li class="menulist_title">수량</li>
													<li class="menulist_title">금액</li>	
												</ul>
												
												<ul>
													<li>${orderDto_book_num.book_name}</li>
													<li><input type="text" value="${book_amount }" id="value_count" readonly="readonly"/></li>
													<li><input type="text" value="${orderDto_product.product_disprice }" id="value_price" readonly="readonly"/></li>
												</ul>
												 <%-- <c:forEach var="book_name" items="${orderList }" var="amount_list" items="${amountList }">
												<ul>
													<li>${book_name}</li>
													<li><input type="text" value="${amount_list }" id="value_count" readonly="readonly"/></li>
													<li><input type="text" value="${orderDto_product.product_disprice }" id="value_price" readonly="readonly"/></li>
												</ul>
												</c:forEach> --%>
						
											</div>
											
											<div class="content_c_orderlist_title">												
												<ul>
													<li>주문일자</li>
													<li>결제수단</li> 
													<li>환불계좌</li>
													<li>사용쿠폰</li>
													<li>처리상태</li>
													<li>합계금액</li>	
												</ul>
											</div>
											
											<!-- 주문일자 -->
											<div class="content_c_orderlist_value">
												<ul>
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputOrderDate" value="<fmt:formatDate var="order_date" value="${orderDto.order_date }" pattern="yy/MM/dd hh:mm"/>${order_date}" readonly="readonly">
													        											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputCredit" value="${orderDto.order_payment }" readonly="readonly">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputRefer" value="${orderDto.refund_bank },${orderDto.refund_account}" readonly="readonly">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputUseCoupon" value="${orderDto.order_coupon}" readonly="readonly">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputStatus" value="${orderDto.order_state }" readonly="readonly">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        	<c:if test="${orderDto.order_state=='반품완료' }">										      											      							 
													        	<input type="text" class="form-control" id="inputTotalPrice" name="order_total_price" value="0" readonly="readonly">
													        </c:if>	
													        <c:if test="${orderDto.order_state!='반품완료' }">										      											      							 
													        	<input type="text" class="form-control" id="inputTotalPrice" name="order_total_price" value="${orderDto.order_total_price}" readonly="readonly">
													        </c:if>													        
													      </div>
													    </div>
													</li>
												</ul>
											     <div class="form-group btn-margin" align="center">
												      <div class="col-lg-10 col-lg-offset-2 col-lg-margin-left" id="btn-margin">											
													        <button type="button" class="btn btn-default" id="" onclick="upMove('${root}','${orderDto.order_num }','${orderDto_book_num.book_num }')">수정</button>													        
													        <button type="button" class="btn btn-default" id="">삭제</button>
												      </div>
											    </div> 								
											</div>											
											<!-- 환불, 교환, 반품-->
										     
										</div>
										
										</li>																										
									</ul>
								</div>
							</div>
											    
											
										</li>							
									</ul>
								</div>
							</div>
							</li>
						</ul>
					</div><!-- content -->
					
				</div>
			</div>
		<!-- wrap 끝 -->
    </div>
</body>
</html>