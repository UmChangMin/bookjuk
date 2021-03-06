<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>관리자모드</title>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<link rel="stylesheet" type="text/css" href="${root }/css/admin/commons/main.css">
<link rel="stylesheet" type="text/css" href="${root }/css/admin/member/memberManager.css">
<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
</head>   
<script type="text/javascript" src="${root }/js/admin/member.js"></script>
<body>
	<!-- 타이틀메뉴 시작 -->
	<div class="all">
		
		<!-- wrap시작 -->
			<div class="wrap">
				<div class="content_wrap">
					<div class="content_title">고객관리</div>
					
					<div class="content">
						<ul>												
							<li class="content_part content_part_move1">
							<div class="content_wrap_body_right">
								<div class="content_box">
									
									
									<ul class="content_box2 content_box2_margin">
										<li class="content_box_title" id="box3_width">회원정보</li>						
									</ul>
									
									<ul class="content_box3">					
										<li class="content_box3_main_li">

										<div class="content_box3_form">
											
											<div class="content_c_orderlist_title">												
												<ul>
													<li>아이디</li>
													<li>이름</li> 
													<li>비밀번호</li> 
													<li>이메일</li>
													<li>메일수신</li> 
													<li>생년월일</li> 
													<li>우편번호</li>
													<li>주소</li>
													<li>상세주소</li>
													<li>연락처</li>
													<li>적립금</li>
													<li>생일쿠폰</li>
													<li>회원등급</li>	
												</ul>
											</div>
											
											<!-- 주문일자 -->
											<div class="content_c_orderlist_value">
												<ul>
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputId" value="${memberList.member_id }" readonly="readonly">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputName" value="${memberList.member_name }" readonly="readonly">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputPassword" value="${memberList.member_password }" readonly="readonly">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputEmail" value="${memberList.member_email }" readonly="readonly">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">													     	
												     	 	<c:if test="${memberList.member_mailing=='yes'}">
												      			<c:set var="member_mailing" value="${memberList.member_mailing='수신' }"/>
													      		<input type="text" class="form-control" id="inputMailing" value="${member_mailing }" readonly="readonly">														      		
												      		</c:if>	
												      		<c:if test="${memberList.member_mailing=='no'}">
												      			<c:set var="member_mailing" value="${memberList.member_mailing='수신거부' }"/>
													      		<input type="text" class="form-control" id="inputMailing" value="${member_mailing }" readonly="readonly">														      		
												      		</c:if>											      											      							 													        											       
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputAge" value="${memberList.member_birth }" readonly="readonly">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputPost" value="${memberList.member_postcode }" readonly="readonly">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputAddr" value="${memberList.member_address }" readonly="readonly">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputDetailAddr" value="${memberList.member_address_detail }" readonly="readonly">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputPhone" value="${memberList.member_phone }" readonly="readonly">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputPoint" value="${memberList.member_point }" readonly="readonly">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputCoupon" value="${memberList.birthday_coupon }" readonly="readonly">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">													     	
												     	 	<c:if test="${memberList.member_level=='admin'}">
												      			<c:set var="member_level" value="${memberList.member_level='관리자' }"/>
													      		<input type="text" class="form-control" id="inputLevel" value="${memberList.member_level }" readonly="readonly">														      		
												      		</c:if>	
												      		<c:if test="${memberList.member_level=='member'}">
												      			<c:set var="member_level" value="${memberList.member_level='회원' }"/>
													      		<input type="text" class="form-control" id="inputLevel" value="${memberList.member_level }" readonly="readonly">														      		
												      		</c:if>											      											      							 													        											       
													      </div>
													    </div>
													</li>
													
												</ul>
											</div>											
																					
										
										</div>
											<!-- 환불, 교환, 반품-->
											<div class="form-group">
										      <div class="col-lg-10 col-lg-offset-2 col-lg-margin-left">
										        <button type="button" class="btn btn-default" onclick="javascript:UpMove('${root}',${memberList.member_num })">수정</button>
										        <button type="button" class="btn btn-default" onclick="javascript:DelMove('${root}',${memberList.member_num })">삭제</button>
										        <button type="button" class="btn btn-default" onclick="javascript:BackMove('${root}')">뒤로가기</button>
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