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
<link rel="stylesheet" type="text/css" href="${root }/css/admin/sales/salesManager.css">
<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
 <script type="text/javascript">
 	$(function(){
 		$(".nav-item:eq(0)").addClass("active");
 	});
 </script>
</head>   

<body>
	
	<div class="all">

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