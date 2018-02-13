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
<link rel="stylesheet" type="text/css" href="${root }/css/commons/main.css">
<link rel="stylesheet" type="text/css" href="${root }/css/sales/salesManager.css">
 <script type="text/javascript">
 	$(function(){
 		$(".nav-item:eq(0)").addClass("active");
 	});
 </script>
</head>   

<body>
	
	<div class="all">
	<jsp:include page="../commons/header_menu.jsp"></jsp:include>	
		<!-- wrap시작 -->
			<div class="wrap">
				<div class="content_wrap">
					<div class="content_title">실시간 매출 현황</div>
					
					<div class="content">
						<ul>
							<li class="content_part">
							<div class="content_wrap_body">
								
								<div class="content_box">
									<ul class="content_box1">
										<li class="content_box_title">오늘 매출금액</li>
										<li class="content_box_value">
											<span>금액:</span>
											<span>85,000원</span>
										</li>	
									</ul>
									
									<ul class="content_box2">
										<li class="content_box_title">오늘 환불금액</li>
										<li class="content_box_value">
											<span>금액:</span>
											<span>12,000원</span>
										</li>						
									</ul>
								</div>
							</div>
							</li>
							
							<li class="content_part">
							<div class="content_wrap_body">
								<div class="content_box">
									<ul class="content_box1">
										<li class="content_box_title">이번 달 매출금액</li>
										<li class="content_box_value">
											<span>금액:</span>
											<span>2,225,000원</span>
										</li>		
									</ul>
									
									<ul class="content_box2">
										<li class="content_box_title">이번 달 환불금액</li>
										<li class="content_box_value">
											<span>금액:</span>
											<span>350,000원</span>
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