<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>공지사항 읽기</title>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<link rel="stylesheet" type="text/css" href="${root}/css/template/basic.css" />
<link rel="stylesheet" type="text/css" href="${root}/css/customer/customer_basic.css" />
<link rel="stylesheet" type="text/css" href="${root}/css/customer/cutomer_notice_read.css" />
<script type="text/javascript" src="${root }/js/jquery.js"></script>
<script type="text/javascript">
	$(function(){

		$(".customer_notice").css("color","#F15F5F");
	});
</script>
</head>
<body>
	<!-- 고객센터 공지사항 시작 강민아-->

	<div id="customer_all">
		<div class="customer">
		<div class="cutomers">
			<div class="customer_warp">고객센터</div>
			<div class="customer_tab">
				<ul>
					<li><a href="${root}/customer/customer.do" class="customer_fna"><img src="${root}/img/customer/question.png">자주하는질문</a></li>
					<li><a href="${root}/customer/notice/list.do" class="customer_notice"><img src="${root}/img/customer/information_pink.png">공지사항</a></li>
					<li><a href="${root}/customer/inquiry/list.do" class="customer_inquiry"><img src="${root}/img/customer/customer_inquiry.png">1:1문의</a></li>
				</ul>
			</div>
			<!-- 내용부분 시작 -->
			<div class="customer_content">
				<div class="customer_inner">
					
					<!-- notice_read 시작 -->
					<div class="notice_read">
						<div class="notice_read_title">
							<div align="center">제목</div>
							<div>[공지] 제목입니다.</div>
						</div>
						<div class="notice_read_date">
							<div align="center">등록일</div>
							<div>등록일입니다.</div>
						</div>
						<div class="notice_read_content">
							
							<div><p>내용입니다.<br/>
								상호 : 주식회사 OOO네트웍스대표이사 : BOOK주소 : 우) 062-35 서울 강남구 테헤란로 132,<br/>
								한독빌딩 8층 3호사업자 등록번호 : 123-45-78910통신판매업 신고번호 : <br/><br/>
								제 2017-서울강남-0123호개인정보 관리 책임자 : BOOKE-mail : BOOK@naver.com전화 010-0000-0000전화 010-0000-0000<br/>
								한독빌딩 8층 3호사업자 등록번호 : 123-45-78910통신판매업 신고번호 : <br/><br/>
								상호 : 주식회사 OOO네트웍스대표이사 : BOOK주소 : 우) 062-35 서울 강남구 테헤란로 132,<br/>
								한독빌딩 8층 3호사업자 등록번호 : 123-45-78910통신판매업 신고번호 : <br/>
								제 2017-서울강남-0123호개인정보 관리 책임자 : BOOKE-mail : BOOK@naver.com전화 010-0000-0000전화 010-0000-0000<br/>
								한독빌딩 8층 3호사업자 등록번호 : 123-45-78910통신판매업 신고번호 : <br/><br/>
								상호 : 주식회사 OOO네트웍스대표이사 : BOOK주소 : 우) 062-35 서울 강남구 테헤란로 132,<br/>
								한독빌딩 8층 3호사업자 등록번호 : 123-45-78910통신판매업 신고번호 : <br/>
								제 2017-서울강남-0123호개인정보 관리 책임자 : BOOKE-mail : BOOK@naver.com전화 010-0000-0000전화 010-0000-0000<br/>
								
								
								</p></div>
						</div>
						
					</div>
					
					<!-- 이전 다음 시작 --> 
					<div class="notice_button" align="center">
						<input type="button" value="이전" onclick=""/>
						<input type="button" value="목록" onclick="location.href='${root}/customer_notice_list.jsp'"/>
						<input type="button" value="다음" onclick=""/>
					</div> 
					<!-- 이전 다음 끝 -->
					<!-- notice_read 끝-->	
					

					
				</div>
			</div>
			<!-- 내용부분 끝 -->
			</div>
		</div>
	</div>
	<!-- 고객센터 공지사항 끝-->
</body>
</html>