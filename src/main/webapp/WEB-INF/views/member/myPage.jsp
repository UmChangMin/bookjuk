<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>마이페이지</title>
<c:set var="root" value="${pageContext.request.contextPath }" />
<link rel="stylesheet" type="text/css" href="${root}/css/template/basic.css" />
<link rel="stylesheet" type="text/css" href="${root}/css/myPage/myPage.css" />
<script type="text/javascript" src="${root }/jquery.js"></script>
<script type="text/javascript">
/* $(function(){
	$(".v-btn").on("click",function(){
		var fname = $(this).data("fname");
		$(".my-frame").css("visibility","hidden");
		$(".my-frame."+ fname).css("visibility","visible");	
		return false;
	});	
	$(".mpop-close").on("click",function(){
		$(this).parent().parent().parent().css("visibility","hidden");
		return false;
	});
}); */
</script>
</head>
<body>
	<!-- 마이페이지 시작 강민아-->
	<div id="maPage_all">
		<div class="maPages">
			<div class="maPage">
				<div class="maPage_warp">마이페이지</div>
					<div class="maPage_title">
						<ul>
							<li>
								<img class="maPage_first" src="${root}/img/myPage/my.png" width="100" height="100">	
							</li>
							<li>
								<div class="maPage_top"><img src="${root}/img/myPage/point.png" width="28" height="28"><span>포인트</span></div>
								<p class="maPage_mid">0 POINT</p>
								<div class="myPage_bot">
									<a href="javascript:" class="v-btn" data-fname="bookcash">내역보기 &gt;</a>
								</div>
							</li>
							<li>
								<div class="maPage_top"><img src="${root}/img/myPage/coupon.png" width="28" height="28"><span>쿠폰</span></div>
								<p class="maPage_mid">0 장</p>
								<div class="myPage_bot">
									<a href="javascript:" class="v-btn" data-fname="bookcash">내역보기 &gt;</a>
								</div>
								<!-- 내역 보기 시작 -->
								
								<!-- 내역 보기 끝 -->
							</li>
						</ul>
					</div>
					<div class="maPage_bottom">
						<div>
							<ul>
								<li>
									<h4>도서 주문 관리</h4>
									<ul>
										<li><a href="#">주문 / 배송 조회</a></li>
										<li><a href="#">취소 / 교환 / 반품 조회</a></li>
									</ul>
								</li>
								<li>
									<h4>회원 정보 관리</h4>
									<ul>
										<li><a href="${root}/memberUpdate.jsp">회원정보수정</a></li>
										<li><a href="${root}/memberDelete.jsp">회원탈퇴</a></li>
									</ul>
								</li>
							</ul>
						</div>	
					</div>
				<div class="maPage_warp2">나의 문의 내역</div>
				<div class="maPage_title1">
					<!-- 1:1문의 타이틀 시작-->
					<div class="maPage_customer_inquiry_list_content">
						<div align="center">글번호</div>
						<div align="center">제목</div>
						<div align="center">등록일</div>
						<div align="center">답변</div>
					</div>
					<!-- 1:1문의 타이틀 끝-->
					
					<!-- 1:1문의 답변 리스트 시작-->
					<c:forEach var="i" begin="1" end="5">
					<div class="maPage_customer_inquiry_list_content_list">
						<div align="center">0001</div>
						<div><a href="${root}/customer_inquiry_read.jsp">주문취소 문의 입니다.</a></div>
						<div align="center">2018-01-27</div>
						<div align="center">답변완료</div>
					</div>
					</c:forEach>
					 <!-- 1:1문의 답변 리스트 끝-->
					 
					 <!-- 페이지번호 시작 -->
					<div class="maPage_customer_inquiry_list_pagenate">
						<a href="" class="maPage_customer_inquiry_list_btn">1</a> 
					</div>
					<!-- 페이지 번호 끝 -->
				</div>
			</div>
		</div>
	</div>
</body>
</html>