<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="root" value="${pageContext.request.contextPath}"/>
<title>쿠폰</title>
<link rel="stylesheet" type="text/css" href="${root}/css/template/basic.css"/>
<link rel="stylesheet" type="text/css" href="${root}/css/member/member_coupon.css"/>
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<script type="text/javascript" src="${root}/js/member/member_mypage.js"></script>
</head>
<body>
	<!-- 쿠폰 시작 강민아-->
	<form method="post" name="form">
		<div id="couponAll">
			<div class="coupon_title" align="center">쿠폰 상세내역</div>

			<div class="coupon_mid">
				<div>나의 쿠폰&nbsp;&nbsp;:</div>
				<div>&nbsp;&nbsp;${coupon}장</div>
			</div>
			
			<div class="coupon_notice">
				<div>- 결제 시 하나의 쿠폰만 사용 가능합니다. (쿠폰 중복 사용 불가)</div>
				<div>- 쿠폰 할인액(율), 쿠폰 적용금액을 확인해 주시기 바랍니다.</div>
			</div>	
			
			<div class="coupon_bot">
				<ul>
					<li><div align="center">쿠폰명</div></li>
					<li><div align="center">할인율</div></li>
					<li><div align="center">내용</div></li>
				</ul>
				
			</div>
			<!-- <div class="coupon_bot_content1" align="center">쿠폰 내역이 없습니다.</div> -->
			<div class="coupon_bot_content2">
				<ul>
					<li><div align="center">생일쿠폰</div></li>
					<li><div align="center">10%</div></li>
					<li><div align="center">고객님의 생일을 축하합니다.</div></li>
				</ul>
			</div>
		</div>
	</form>
</body>
</html>