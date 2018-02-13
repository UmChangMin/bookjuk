<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>관리자모드</title>

<c:set var="root" value="${pageContext.request.contextPath }"/>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script type="text/javascript" src="${root }/jquery/jquery.js"></script> 
 <link rel="stylesheet" type="text/css" href="${root }/css/order/orderManager.css">
 <link rel="stylesheet" type="text/css" href="${root }/css/commons/main.css">
 <script type="text/javascript">
 	$(function(){
 		$(".nav-item:eq(1)").addClass("active");
 	});
 </script>
</head>   

<body>
	<!-- 타이틀메뉴 시작 -->
	<div class="all">
		<jsp:include page="../commons/header_menu.jsp"></jsp:include>
		<!-- wrap시작 -->
			<div class="wrap">
				<div class="content_wrap">
					<div class="content_title">주문관리</div>
					
					<div class="content">
						<ul>
							<li class="content_part content_part_move1">
							<div class="content_wrap_body_left">
								
								<div class="content_box">
									<ul class="content_box1">
										<li class="content_box_title">주문정보조회</li>
										<li class="">
											<form class="form-horizontal">
											  <fieldset>
											  
											    <div class="form-group">											      
											      <div class="col-lg-10">											      											      							 
											        <input type="text" class="form-control input_width" id="inputPhone" placeholder="전화번호">											        
											      </div>
											    </div>
											    
											    <div class="form-group">											      
											      <div class="col-lg-10">											      											      							 
											        <input type="text" class="form-control input_width" id="inputName" placeholder="이름">											        
											      </div>
											    </div>
											  											   
											    <div class="form-group">											      
											      <div class="col-lg-10">											      											      							 
											        <input type="text" class="form-control input_width" id="inputEmail" placeholder="이메일">											        
											      </div>
											    </div>
											    
											    <div class="form-group">											      
											      <div class="col-lg-10">
											        <input type="text" class="form-control input_width" id="inputOrderDate" placeholder="주문일자">											       
											      </div>
											    </div>											  
											    <div class="form-group">
											      <div class="col-lg-10 col-lg-offset-2 col-lg-margin-left">
											        <button type="submit" class="btn btn-primary">조회</button>
											        <button type="reset" class="btn btn-default">취소</button>
											      </div>
											    </div>
											  </fieldset>
											</form>
										</li>	
									</ul>
									
									<div class="content_middle_line_w content_middle_line_w_move1"></div>
									
									<ul class="content_box2">
										<li class="content_box_title">고객배송지정보</li>
										<li class="">
											<form class="form-horizontal">
											  <fieldset>
											  
											    <div class="form-group">											      
											      <div class="col-lg-10">											      											      							 
											        <input type="text" class="form-control input_width" id="inputName" placeholder="이름">											        
											      </div>
											    </div>
											  	
											  	<div class="form-group">											      
											      <div class="col-lg-10">											      											      							 
											        <input type="text" class="form-control input_width" id="inputPost" placeholder="우편번호">											        
											      </div>
											    </div>
											    
											    <div class="form-group">											      
											      <div class="col-lg-10">											      											      							 
											        <input type="text" class="form-control input_width" id="inputAddress" placeholder="주소">											        
											      </div>
											    </div>
											    
											    <div class="form-group">											      
											      <div class="col-lg-10">											      											      							 
											        <input type="text" class="form-control input_width" id="inputDetailAddr" placeholder="상세주소">											        
											      </div>
											    </div>
											    										   
											    <div class="form-group">											      
											      <div class="col-lg-10">											      											      							 
											        <input type="text" class="form-control input_width" id="inputEmail" placeholder="이메일">											        
											      </div>
											    </div>
										  
											    <div class="form-group">
											      <div class="col-lg-10 col-lg-offset-2 col-lg-margin-left">
											         <button type="button" class="btn btn-default" id="">수정</button>										   
											         <button type="button" class="btn btn-default" id="">취소</button>
											         <button type="button" class="btn btn-default" id="">삭제</button>
											      </div>
											    </div>
											  </fieldset>
											</form>
										</li>							
									</ul>
								</div>
							</div>
							</li>

							
							<li class="content_part content_part_move1 part2">
							<div class="content_wrap_body_right">
								<div class="content_box">
									<ul class="content_box1 content_title_height">
										<li class="content_box_title content_admin_alert">
											<span>※관리자 주의사항</span><br/>
											<span>※환불, 교환,반품 수정은 상품 출발 전 또는 상품이 
											본사에 도착한 이후를 기점으로 합니다.</span>
										</li>											
									</ul>
									
									<ul class="content_box2 content_box2_margin">
										<li class="content_box_title" id="box3_width">고객주문내역</li>						
									</ul>
									
									<ul class="content_box3">					
										<li class="content_box3_main_li">
										<div class="content_box3_form">
											<form class="content_box3_formtag">
											<div class="content_c_orderlist_title">
												<ul>
													<li class="c_orderlist_h">결제내역</li>																		
												</ul>												
											</div>
											<div class="content_menulist_title">
												<ul>
													<li>도서</li>
													<li>수량</li>
													<li>금액</li>	
												</ul>
												
												<ul>
													<li>나의라임오렌지나무</li>
													<li>1개</li>
													<li>18,000원</li>
												</ul>
												
												<ul>
													<li>마시멜로이야기</li>
													<li>1개</li>
													<li>14,000원</li>
												</ul>
												
												<ul>
													<li>Java의 정석</li>
													<li>1개</li>
													<li>28,000원</li>
												</ul>
												<ul>
													<li>Java의 정석</li>
													<li>1개</li>
													<li>28,000원</li>
												</ul>
												<!-- 추가가능 -->
						
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
													        <input type="text" class="form-control" id="inputOrderDate" placeholder="2018-01-14 13:35">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputCredit" placeholder="카드, 4849-4952-8745-7484">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputRefer" placeholder="신한, 110-358-454541">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputUseCoupon" placeholder="없음">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputStatus" placeholder="정상">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputTotalPrice" placeholder="88,000원">											        
													      </div>
													    </div>
													</li>
												</ul>
											</div>											
											<!-- 환불, 교환, 반품-->
										     <div class="form-group">
										      <div class="col-lg-10 col-lg-offset-2 col-lg-margin-left">
										         <button type="button" class="btn btn-default" id="">수정</button>										   
										         <button type="button" class="btn btn-default" id="">취소</button>
										         <button type="button" class="btn btn-default" id="">삭제</button>
										      </div>
										    </div>											
											</form>
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