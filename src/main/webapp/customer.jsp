<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>자주하는 질문</title>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<link rel="stylesheet" type="text/css" href="${root}/css/template/basic.css" />
<link rel="stylesheet" type="text/css" href="${root}/css/customer/customer_basic.css" />
<link rel="stylesheet" type="text/css" href="${root}/css/customer/customer.css" />
<script type="text/javascript" src="${root }/js/jquery.js"></script>
<script type="text/javascript" src="${root }/js/customer/customer.js"></script>
</head>
<body>
	<%@ include file="/template/search_header.jsp" %>
	
	<!-- 고객센터 자주하는 질문 시작 강민아-->

	<div id="customer_all">
		<div class="customer">
		<div class="cutomers">
			<div class="customer_warp">고객센터</div>
			<div class="customer_tab">
				<ul>
					<li><a href="#" class="customer_fna"><img src="${root}/img/customer/question_pink.png">자주하는질문</a></li>
					<li><a href="${root}/customer_notice_list.jsp" class="customer_notice"><img src="${root}/img/customer/information.png">공지사항</a></li>
					<li><a href="${root}/customer_inquiry_list.jsp" class="customer_inquiry"><img src="${root}/img/customer/customer_inquiry.png">1:1문의</a></li>
				</ul>
			</div>
			<!-- 내용부분 시작 -->
			<div class="customer_content">
				<div class="customer_inner">
					<div class="customer_content_title">
						<div align="center">글번호</div>
						<div align="center">제목</div>
					</div>
					<c:forEach var="i" begin="1" end="10">
						<!-- 자주묻는 질문Q -->
						<div class="customer_total">
							<div class="customer_question">
								<div align="center">0001</div>
								<div align="left"><span>Q. </span>비회원이 문의를 할 경우는 어떻게 하나요?</div>
							</div>
						
						<!-- 자주묻는 질문의 답변A -->
							<div class="customer_answer" style="display: none;">
								<div align="left">
									<span>A. </span>
									비회원이신경우 고객센터로 직접 전화 주시면 친절하게 상담 해드리겠습니다.<br/>
									비회원이신경우 고객센터로 직접 전화 주시면 친절하게 상담 해드리겠습니다.<br/>
									비회원이신경우 고객센터로 직접 전화 주시면 친절하게 상담 해드리겠습니다.
								</div>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
			<!-- 내용부분 끝 -->
			</div>
		</div>
	</div>
	<!-- 고객센터 자주하는 질문 끝-->
	
	<%@ include file="/template/footer.jsp" %>
	
</body>
</html>