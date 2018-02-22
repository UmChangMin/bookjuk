<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>       
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<link rel="stylesheet" type="text/css" href="${root}/css/template/footer.css"/>
</head>
<body>
<!-- footer 시작 -->
	<div class="footer_box">
		<div class="foot_inner">
			<div class="foot_left">
				<h3>북적북적 네트웍스</h3>
				<a href="${root}"><img src="${root}/img/template/header/bookjuk_footer.png"></a>
			</div>
			<div class="foot_right">
				<ul class="f_lnb large">
					<li><a>회사소개</a></li>
					<li><a>이용약관</a></li>
					<li><a>개인정보보호정책</a></li>
					<li><a>제휴문의</a></li>
				</ul>
				<h5 class="hide">북적북적 주소 및 정보</h5>
				<ul class="f_lnb">
					<li>상호 : 주식회사 북적북적 네트웍스</li>
					<li>대표이사 : BOOK</li>
					<li>주소 : 우) 062-35 서울 강남구 테헤란로 132, 한독빌딩 8층 3호</li>
					<li class="no_ba">사업자 등록번호 : 123-45-78910</li>
					<li>통신판매업 신고번호 :  제 2017-서울강남-0123호</li>
					<li>개인정보 관리 책임자 : 북적북적</li>
					<li class="no_ba">E-mail : <a>북적북적@naver.com</a></li>
					<li>전화 010-0000-0000</li>
				</ul>
				<p class="copyright">COPYRIGHT © 2017 By TAEWOONETWORKS CO,LTD., ALL RIGHTS RESERVED</p>
			</div>	
		</div>
	</div>
<!-- footer 끝 -->
</body>
</html>