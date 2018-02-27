<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="root" value="${pageContext.request.contextPath}" />
<!-- header뷰: 강민아 ,실시간 급상승 :허단비,  플로팅 메뉴 : 엄창민 /수정: 허단비  -->
<title>북적북적</title>
<link rel="stylesheet" type="text/css"
	href="${root}/css/template/basic.css" />
<link rel="stylesheet" type="text/css"
	href="${root}/css/template/header.css" />
<link rel="stylesheet" type="text/css"
	href="${root}/css/template/real_time.css" />
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<script type="text/javascript" src="${root}/js/main/main_header.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.4/jquery.min.js"
	type="text/javascript"></script>
</head>
<body>
	<div id="header">
		<div class="header_top">
			<div class="header_top_inner">

				<c:if test="${member_level == null && member_id==null}">
					<ul class="header_lnb_right">
						<li><a href="" class="openMask" onclick="login('${root}')">로그인</a></li>
						<li><a class="openMask2" href="" onclick="registe('${root}')">회원가입</a></li>
						<li><a class="" href="${root}/order/cart.do">장바구니</a></li>
						<li><a class="openMask3" href="${root}/order/list.do" onclick="orderdelivery('${root}')">주문/배송조회</a></li>
						<li><a class="" href="${root}/service/question.do">고객센터</a></li>
						<li><a class="" href="${root}/location.do">영업점 안내</a></li>
					</ul>
				</c:if>
				<c:if test="${member_level=='admin'}">
					<ul class="header_lnb_right">
						<li><strong><a href="${root}/admin/sales/salesManager.do">[관리자모드]</a></strong></li>
						<li><a class="openMask2" href="${root}/member/logout.do">로그아웃</a></li>
						<li><a class="" href="${root}/order/cart.do">장바구니</a></li>
						<li><a class="openMask3" href="${root}/order/list.do" onclick="orderdelivery('${root}')">주문/배송조회</a></li>
						<li><a class="" href="${root}/service/question.do">고객센터</a></li>
						<li><a class="" href="${root}/location.do">영업점 안내</a></li>
					</ul>
				</c:if>
				<c:if test="${member_level != null && member_id!=null}">
					<ul class="header_lnb_right">
						<li><a href="${root}/member/mypage.do" class="openMask" style="color: #F15F5F">[${member_name}]</a></li>
						<li><a class="openMask2" href="${root}/member/logout.do">로그아웃</a></li>
						<li><a class="" href="${root}/member/mypage.do">마이페이지</a></li>
						<li><a class="" href="${root}/order/cart.do">장바구니</a></li>
						<li><a class="openMask3" href="${root}/order/list.do" onclick="orderdelivery('${root}')">주문/배송조회</a></li>
						<li><a class="" href="${root}/service/question.do">고객센터</a></li>
						<li><a class="" href="${root}/location.do">영업점 안내</a></li>
					</ul>
				</c:if>

			</div>
		</div>

		<div class="header_mid_content">
			<div class="header_mid_logo">
				<a href="${root}/main.do"><img
					src="${root}/img/template/header/bookjuk_headlogo.png" /></a>
			</div>
			<div class="header_mid_search">
				<div class="header_mid_search_inner">
					<input type="text" name="SearchString" class="header_SearchString">
					<input type="button" name="Search_btn" class="header_Search_btn"
						onclick="">
				</div>

				<!-- 실시간 급상승 : 허단비 -->
				<!-- 실시간 시작  -->
				<div id="header_real_time">
					<dl id="hread_rank_list">
						<dt>실시간 급상승 검색어</dt>
						<dd>
							<ol>
								<li><a href="#">1&nbsp;&nbsp;82년생 김지영</a></li>
								<li><a href="#">2&nbsp;&nbsp;무례한 사람에게 웃으며 대처하는 법</a></li>
								<li><a href="#">3&nbsp;&nbsp;일취월장 : 일을 잘하기 위한 8가지 원리</a></li>
								<li><a href="#">4&nbsp;&nbsp;신경 끄기의 기술</a></li>
								<li><a href="#">5&nbsp;&nbsp;회색 인간</a></li>
								<li><a href="#">6&nbsp;&nbsp;살며 사랑하며 배우며</a></li>
								<li><a href="#">7&nbsp;&nbsp;나미야 잡화점의 기적</a></li>
								<li><a href="#">8&nbsp;&nbsp;언어의 온도</a></li>
								<li><a href="#">9&nbsp;&nbsp;말 그릇</a></li>
								<li><a href="#">10&nbsp;&nbsp;파리의 아파트</a></li>
							</ol>
						</dd>
					</dl>
				</div>
				<!-- 실시간 끝 -->
			</div>
		</div>
	</div>

	<!-- 플로팅 메뉴 -->
	<div id="floatMenu" align="center">
		<div class="today_view" align="center">
			<div class="today_title">
				<h3 align="center">최근 본 목록</h3>
			</div>
			<div class="tv_container">
				<div class="tv_prod">
					<a href="#"><img
						src="http://bookimg.bookcube.com/94/1308/130801548.jpg"></a>
				</div>
				<div class="tv_prod">
					<a href="#"><img
						src="http://bookimg.bookcube.com/94/1712/171201262.jpg"></a>
				</div>
				<div class="tv_prod">
					<a href="#"><img
						src="http://bookimg.bookcube.com/94/1607/160704046.jpg"></a>
				</div>
			</div>
		</div>
		<div class="float_btn">
			<a href="${root}/order/cart.do" class="cart_btn">장바구니</a><br /> <a
				href="#" class="top_btn">TOP</a>
		</div>
	</div>

</body>
</html>