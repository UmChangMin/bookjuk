<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>주문/배송조회</title>
<link rel="stylesheet" type="text/css"href="${root}/css/order/order_list.css" />
<link rel="stylesheet" type="text/css"href="${root}/css/template/basic.css" />
<link type="text/css" rel="stylesheet" href="${root}/jqueryUI/jquery-ui.css"/>
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<script type="text/javascript" src="${root}/jqueryUI/jquery-ui.js"></script>
<script type="text/javascript" src="${root}/js/order/order_list.js"></script>
</head>
<body>
	<div class="order">
		<div class="order_top">
			<div class="order_inner">
				<!-- 배송조회 타이틀 시작 -->	
				<div class="order_title">
						<div class="order_title2">배송조회</div>
				</div>
				
				<!-- 내용시작 -->
				<div class="order_box">
					<!-- 기간조회 시작-->
					<div class="order_month">
						<div class="order_month1">기간조회</div>
						<div class="order_calendar"> 
							<!-- 제이쿼리ui달력 -->
							<input type="text" id="order_calendar1"/> ~ <input type="text" id="order_calendar2">
							<span>까지의 주문일자</span>
							<button class="order_search">조회</button>
						</div>
					</div>
					<!-- 기간조회 끝-->
					
					<!-- 본문 contact 시작 -->
					<div class="order_contact_all">
					<div class="order_contact" align="center">
						<!-- 타이틀 시작 -->
						<ul>
							<li>주문번호</li>
							<li>접수일자</li>
							<li>상품정보</li>
							<li>수량</li>
							<li>판매가</li>
							<li>상태</li>
							
						</ul>
						<!-- 타이틀 끝 -->
					</div>
					
					<!-- 책내용 시작 -->
					<c:forEach var="i" begin="1" end="5">
					<div class="order_info" align="center">
						<ul>
							<li>20180309</li>
							<li>2018/03/09</li>
							<li class="order_info_book">
								<div class="order_info_bookimg"><img src="http://image.kyobobook.co.kr/images/book/large/245/l9788984059245.jpg"></div>
								<div class="order_info_booktit">
									모두의 아두이노 모두의 아두이노 모두의 아두이노
								</div>
							</li>
							<li>1</li>
							<li>15000</li>
							<li>상품준비중</li>
							
						</ul>
					</div>
					</c:forEach>
					<!-- 책내용 끝 -->
					
					<!-- 페이지번호 -->
					<div class="order_page">
						<a href="#" class="">1</a>
					</div>
					<!-- 페이지 번호 끝 -->
					</div>
					<!-- 본문 contact 끝 -->
				</div>
				<!-- 내용끝 -->
				<!-- 타이틀 끝 -->
				<!-- 배송조회 리스트 -->
			</div>
		</div>
	</div>

</body>
</html>