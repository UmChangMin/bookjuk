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
<script type="text/javascript">
	$(function(){
		$(".nav-item:eq(2)").addClass("active");
	});
</script>
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
											<form class="content_box3_formtag" action="${root }/admin/member/memberManager_updateOk.do" method="post">
											<input type="hidden" name="member_num" value="${memberList.member_num }"/>											
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
											
											<!-- 고객정보 -->
											<div class="content_c_orderlist_value">
												<ul>
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputId" name="member_id" value="${memberList.member_id }" readonly="readonly">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputName" name="member_name" value="${memberList.member_name }">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputPassword" name="member_password" value="${memberList.member_password }">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputEmail" name="member_email" value="${memberList.member_email }">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">	
													      	<select name="member_mailing" id="select1" class="form-control">	
													      		<c:if test="${memberList.member_mailing=='yes'}">
													      			<c:set var="member_mailing" value="${memberList.member_mailing='수신' }"/>
														      		<option value="${memberList.member_mailing }" selected="selected">${member_mailing }</option>														      		
													      		</c:if>	
													      		<c:if test="${memberList.member_mailing=='no'}">
													      			<c:set var="member_mailing" value="${memberList.member_mailing='수신거부' }"/>
														      		<option value="${memberList.member_mailing }" selected="selected">${member_mailing }</option>														      		
													      		</c:if>													      		
													      		<option>------</option>											      		
													      		<option value="yes">수신</option>
													      		<option value="no">수신거부</option>
													      	</select>											      											      							 													        											       
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputAge" name="member_birth" value="${memberList.member_birth }">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputPost" name="member_postcode" value="${memberList.member_postcode }">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputAddr" name="member_address" value="${memberList.member_address }">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputDetailAddr" name="member_address_detail" value="${memberList.member_address_detail }">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputPhone" name="member_phone" value="${memberList.member_phone }">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputPoint" name="member_point" value="${memberList.member_point }">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">											      											      							 
													        <input type="text" class="form-control" id="inputCoupon" name="birthday_coupon" value="${memberList.birthday_coupon }">											        
													      </div>
													    </div>
													</li>
													
													<li class="c_orderlist_inputform_value">
														<div class="form-group">											      
													      <div class="col-lg-10">
													      	<select name="member_level" id="select1" class="form-control">	
													      		<c:if test="${memberList.member_level=='admin'}">
													      			<c:set var="member_level" value="${memberList.member_level='관리자' }"/>
														      		<option value="admin" selected="selected">${member_level }</option>														      		
													      		</c:if>	
													      		<c:if test="${memberList.member_level=='member'}">
													      			<c:set var="member_level" value="${memberList.member_level='회원' }"/>
														      		<option value="member" selected="selected">${member_level }</option>														      		
													      		</c:if>													      		
													      		<option>------</option>											      		
													      		<option value="admin">관리자</option>
													      		<option value="member">회원</option>
													      	</select>													      											      											      							 													       
													      </div>
													    </div>
													</li>
													
												</ul>
											</div>											
																					
											<!-- 환불, 교환, 반품-->
										
										</div>
											<div class="form-group">
										      <div class="col-lg-10 col-lg-offset-2 col-lg-margin-left">
										        <button type="submit" class="btn btn-primary">수정</button>
										        <button type="reset" class="btn btn-default">취소</button>										        
										      </div>
										    </div>					    
											</form>
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