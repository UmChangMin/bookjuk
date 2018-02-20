<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>1:1문의 리스트</title>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<link rel="stylesheet" type="text/css" href="${root}/css/template/basic.css" />
<link rel="stylesheet" type="text/css" href="${root}/css/customer/customer_basic.css" />
<link rel="stylesheet" type="text/css" href="${root}/css/customer/cutomer_inquiry_list.css" />
<script type="text/javascript" src="${root }/js/jquery.js"></script>
<script type="text/javascript">
	$(function(){

		$(".customer_inquiry").css("color","#F15F5F");
	});
</script>
</head>
<body>
	<!-- 고객센터 1:1문의 시작 강민아-->
	<div id="customer_all">
		<div class="customer">
			<div class="cutomers">
			<div class="customer_warp">고객센터</div>
			<div class="customer_tab">
				<ul>
					<li><a href="${root}/customer/customer.do" class="customer_fna"><img src="${root}/img/customer/question.png">자주하는질문</a></li>
					<li><a href="${root}/customer/notice/list.do" class="customer_notice"><img src="${root}/img/customer/information.png">공지사항</a></li>
					<li><a href="${root}/customer/inquiry/list.do" class="customer_inquiry"><img src="${root}/img/customer/customer_inquiry_pink.png">1:1문의</a></li>
				</ul>
			</div>
			<!-- 내용부분 시작 -->
			<div class="customer_content">
				<div class="customer_inner">
					
					
					<!-- inquiry_list 시작 -->
					<div class="customer_inquiry_list">
						<div class="customer_inquiry_title">
							<div class="customer_inquiry_title_inner">
								<p>1:1 문의</p>
								<a href="${root}/customer/inquiry/write.do">글쓰기</a>
							</div>
						</div>
					</div><br/><br/><br/>
					<!-- 
					<div>게시글이 존재하지 않습니다.</div>
					 -->
					<!-- 1:1문의 타이틀 시작-->
					<div class="customer_inquiry_list_content">
						<div align="center">글번호</div>
						<div align="center">제목</div>
						<div align="center">등록일</div>
						<div align="center">답변</div>
					</div>
					<!-- 1:1문의 타이틀 끝-->
					
					<!-- 1:1문의 답변 리스트 시작 -->
					<c:forEach var="i" begin="1" end="5">
					<div class="customer_inquiry_list_content_list">
						<div align="center">0001</div>
						<div><a href="${root}/customer/inquiry/read.do">주문취소 문의 입니다.</a></div>
						<div align="center">2018-01-27</div>
						<div align="center">답변완료</div>
					</div>
					</c:forEach>
					
					<!-- 1:1문의 답변 리스트  끝-->
					
					<!-- 페이지번호 시작 -->
					<div class="customer_inquiry_list_pagenate">
						<a href="" class="customer_inquiry_list_btn">1</a> 
					</div>
					<!-- 페이지 번호 끝 -->
					
					
					<!-- inquiry_list 끝-->	
					

					
				</div>
				<!-- 페이지번호 시작 -->
				
				
				<!-- 페이지번호 끝 -->
			</div>
			<!-- 내용부분 끝 -->
		</div>
		</div>
	</div>
	<!-- 고객센터 1:1문의 끝-->
</body>
</html>