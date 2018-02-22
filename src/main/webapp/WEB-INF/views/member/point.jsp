<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="root" value="${pageContext.request.contextPath}"/>
<title>쿠폰</title>
<link rel="stylesheet" type="text/css" href="${root}/css/template/basic.css" />
<link rel="stylesheet" type="text/css" href="${root}/css/myPage/point.css" />
<script type="text/javascript" src="${root }/js/jquery.js"></script>
<script type="text/javascript" src="${root }/js/member/myPage.js"></script>
</head>
<body>
	<!-- 포인트 시작 강민아-->
	<form action ="" method="post">
		<div id="pointAll">
			<div class="point_title" align="center">포인트 상세내역</div>

			<div class="point_mid">
				<div>나의 포인트&nbsp;&nbsp;:</div>
				<div>&nbsp;&nbsp;0원</div>
			</div>
			
			<div class="point_bot">
				<ul>
					<li><div align="center">날짜</div></li>
					<li><div align="center">구분</div></li>
					<li><div align="center">금액</div></li>
				</ul>
				
			</div>
			<!-- <div class="point_bot_content1" align="center">포인트 내역이 없습니다.</div> -->
			<div class="point_bot_content2">
				<ul>
					<li><div align="center">2018-02-20</div></li>
					<li><div align="center">구매적립금</div></li>
					<li><div align="center">100P</div></li>
				</ul>
			</div>
		</div>
	</form>
</body>
</html>