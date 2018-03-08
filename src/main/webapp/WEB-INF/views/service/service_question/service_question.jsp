<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>자주하는 질문</title>
<c:set var="root" value="${pageContext.request.contextPath }" />
<link rel="stylesheet" type="text/css" href="${root}/css/template/basic.css" />
<link rel="stylesheet" type="text/css" href="${root}/css/service/service_basic.css" />
<link rel="stylesheet" type="text/css" href="${root}/css/service/service_question.css" />
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<script type="text/javascript" src="${root}/jqueryUI/jquery-ui.js"></script>
<script type="text/javascript"
	src="${root}/js/service/service_question.js"></script>
</head>
<body>
	<!-- 고객센터 자주하는 질문 시작 강민아-->

	<div id="service_all">
		<div class="service">
			<div class="service_sub">
				<div class="service_warp">고객센터</div>
				<div class="service_tab">
					<ul>
						<li><a href="${root}/service/question.do" class="service_fna"><img
								src="${root}/img/service/question_pink.png">자주하는질문</a></li>
						<li><a href="${root}/service/notice/list.do"
							class="service_notice"><img
								src="${root}/img/service/information.png">공지사항</a></li>
						<li><a href="${root}/service/contact/list.do"
							class="service_contact"><img
								src="${root}/img/service/service_contact.png">1:1문의</a></li>
					</ul>
				</div>
				<!-- 내용부분 시작 -->
				<div class="service_content">
					<div class="service_inner">
						<div class="service_content_title">
							<div align="center">글번호</div>
							<div align="center">제목</div>
						</div>
						<c:forEach var="serviceQuestionDto" items="${questionList}">


							<!-- 자주묻는 질문Q -->
							<%-- <c:if test="${questionList.size()<=10}">  --%>
								<div class="service_total">
									<div class="service_question">
										<div align="center">${serviceQuestionDto.question_num}</div>
										<div align="left">
											<span>Q. </span>${serviceQuestionDto.question_subject}</div>
									</div>

									<!-- 자주묻는 질문의 답변A -->
									<div class="service_answer" style="display: none;">
										<div align="left">
											<span>A. </span> ${serviceQuestionDto.question_content}
										</div>
									</div>
								</div>
							<%-- </c:if> --%> 

						</c:forEach>
					</div>
				</div>
				<!-- 내용부분 끝 -->
			</div>
		</div>
	</div>
	<!-- 고객센터 자주하는 질문 끝-->
</body>
</html>