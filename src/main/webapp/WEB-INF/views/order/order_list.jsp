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
<link rel="stylesheet" type="text/css" href="${root}/jqueryUI/jquery-ui2.css">
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<script type="text/javascript" src="${root}/jqueryUI/jquery-ui2.js"></script>
<script type="text/javascript" src="${root}/js/order/order_list.js"></script>
</head>
<body>
	<div class="order">
	<div class="order_top">
		<div class="order_inner">
		<!-- 배송조회 타이틀 시작 -->	
		<div class="order_title">
			<!-- <div class="order_title_inner"> -->
				<div class="order_title2">배송조회</div>
			<!-- </div> -->
		</div>
		<!-- 타이틀 끝 -->
		
		<!-- 배송조회 리스트 -->
		<div class="order_box">
			<div class="order_boxinner">
			
				<!-- 개월수 시작 -->
				<div class="order_monthbox">
					<div class="order_month">
						<a class="" href="#">1주일</a>
						<a class="" href="#">1개월</a>
						<a class="" href="#">6개월</a>
						<a class="" href="#">1년</a>
					</div>
					<div class="calendar"> 
						<!-- 제이쿼리ui달력 -->
						<input type="text" id="calendar1"/> ~ <input type="text" id="calendar2">
						<p>까지의 주문일자</p>
					</div>				
				</div>
				
			<!-- 체크박스 -->
				<div class="order_subtitlebox">
					<div class="order_subtitle">
						<input id="checkbox_All" type="checkbox" value="selectAll"/>
						<span>전체선택</span>
						<p>주문일자</p>
						<p>도서사진</p>
						<p>도서명</p>
						<p>수량</p>
						<p>금액</p>
						<p>주문처리상태</p>
					</div>
				</div>
				
				<div class="orber_listbox">
					<input id="checkbox2" type="checkbox" value="selectAll"/>
						<div class="order_list_text">
							<span>2018-01-13</span>
							<a href="">도서명</a>
						</div>
						<div class="order_list_text2">
							<p>1</p>
							<span>18,000</span>
							<a href="">상품준비중</a>
						</div>
						<ul class="order_listimg">
							<li>
								<a href="#"><img alt="책사진" src="http://image.ypbooks.co.kr/upload/img/book/410/100830410.jpg"></a>
							</li>
						</ul> 
				</div>
				<div class="orber_listbox2">
				
				<input id="checkbox2" type="checkbox" value="selectAll"/>
						<div class="order_list_text">
							<span>2018-01-13</span>
							<a href="">도서명</a>
						</div>
						<div class="order_list_text2">
							<p>1</p>
							<span>18,000</span>
							<a href="">상품준비중</a>
						</div>
						<ul class="order_listimg2">
							<li>
								<a href="#"><img alt="책사진" src="http://image.ypbooks.co.kr/upload/img/book/780/100735780.jpg"></a>
							</li>
						</ul> 
				</div>
			</div>
		</div>
		</div>
	</div>
</div>

</body>
</html>