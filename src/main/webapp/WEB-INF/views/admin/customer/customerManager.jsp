<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>관리자모드</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<c:set var="root" value="${pageContext.request.contextPath }"/>


<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script type="text/javascript" src="${root }/jquery/jquery.js"></script> 
<link rel="stylesheet" type="text/css" href="${root }/css/commons/main.css">
<link rel="stylesheet" type="text/css" href="${root }/css/customer/customerManager.css">
</head>   
<script type="text/javascript">
	$(function(){
		$(".nav-item:eq(2)").addClass("active");
	});
</script>
<body>
	<!-- 타이틀메뉴 시작 -->
	<div class="all">
		<jsp:include page="../commons/header_menu.jsp"></jsp:include>
		<!-- wrap시작 -->
			<div class="wrap">
				<div class="content_wrap">
					<div class="content_title">고객관리</div>
					
					<div class="content">
						<ul>
							<li class="content_part content_part_move1">
							<div class="content_wrap_body_left">
								
								<div class="content_box">
									<ul class="content_box1">
										<li class="content_box_title">회원정보조회</li>
										<li class="">
											<form class="form-horizontal">
											  <fieldset>
											  
											    <div class="form-group">											      
											      <div class="col-lg-10">											      											      							 
											        <input type="text" class="form-control input_width" id="inputId" placeholder="아이디">											        
											      </div>
											    </div>
											    
											    <div class="form-group">											      
											      <div class="col-lg-10">											      											      							 
											        <input type="text" class="form-control input_width" id="inputName" placeholder="이름">											        
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
								</div>
							</div>
							</li>
							
<!-- 							<li>
								<div class="content_middle_line_h content_middle_line_h_move1"></div>
							</li> -->
							
							<li class="content_part content_part_move1">
							<div class="content_wrap_body_right">
								<div class="content_box">
									
									
									<ul class="content_box2 content_box2_margin">
										<li class="content_box_title" id="box3_width">회원정보</li>						
									</ul>
									
									<ul class="content_box3">					
										<li class="content_box3_main_li">
										<div class="content_box3_form">
											<form class="content_box3_formtag">
											
											<div class="content_c_orderlist_title">												
												<ul>
													<li>아이디</li>
													<li>이름</li> 
													<li>우편번호</li>
													<li>주소</li>
													<li>상세주소</li>
													<li>이메일</li>
													<li>선호분야</li>
													<li>적립금</li>
													<li>보유쿠폰</li>	
												</ul>
											</div>
											
											<!-- 주문일자 -->
											<div class="content_c_orderlist_value">
												<ul>
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputId" placeholder="twkim326">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputName" placeholder="김태우">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputPost" placeholder="08276">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputAddr" placeholder="서울시 구로구 오류동">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputDetailAddr" placeholder="예성라온팰리스 101동 2205호">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputEmail" placeholder="twkim326@naver.com">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputInterest" placeholder="IT, 소설, 철학">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputPoint" placeholder="8,000 P">											        
													      </div>
													    </div>
													</li>
													
												</ul>
											</div>
											
											<div class="content_menulist_title">
												<ul>
													<li>쿠폰종류</li>
													<li>보유개수</li>														
												</ul>
												
												<ul>
													<li>생일축하쿠폰</li>
													<li>1개</li>													
												</ul>
												
												<ul>
													<li>무료배송쿠폰</li>
													<li>1개</li>													
												</ul>
												
											</div>
																					
											<!-- 환불, 교환, 반품-->
											<div class="content_button" align="center">
											    <button type="button" class="btn btn-default">수정</button>
											    <button type="button" class="btn btn-default">취소</button>
											    <button type="button" class="btn btn-default">삭제</button>		
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