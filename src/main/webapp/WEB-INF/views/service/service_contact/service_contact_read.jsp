<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>1:1문의 읽기</title>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<link rel="stylesheet" type="text/css" href="${root}/css/template/basic.css"/>
<link rel="stylesheet" type="text/css" href="${root}/css/service/service_basic.css"/>
<link rel="stylesheet" type="text/css" href="${root}/css/service/service_contact_read.css"/>
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<script type="text/javascript" src="${root}/jqueryUI/jquery-ui.js"></script>
<script type="text/javascript" src="${root}/js/service/service_contact.js"></script>
</head>
<body>
	<!-- 고객센터 1:1문의 시작 강민아-->

	<div id="service_all">
		<div class="service">
		<div class="service_sub">
			<div class="service_warp">고객센터</div>
			<div class="service_tab">
				<ul>
					<li><a href="${root}/service/question.do" class="service_fna"><img src="${root}/img/service/question.png">자주하는질문</a></li>
					<li><a href="${root}/service/notice/list.do" class="service_notice"><img src="${root}/img/service/information.png">공지사항</a></li>
					<li><a href="${root}/service/contact/list.do" class="service_contact"><img src="${root}/img/service/service_contact_pink.png">1:1문의</a></li>
				</ul>
			</div>
			<!-- 내용부분 시작 -->
			
			<div class="service_content">
			
				<div class="service_title">
					<div class="service_content01"><span>제목</span></div>
					<div class="service_content02"><div>${serviceContactDto.contact_subject}</div></div>
				</div>
				
				<div class="service_kind">
					<div class="service_content01"><span>문의유형</span></div>
					<div class="service_content02"><div>${serviceContactDto.contact_type}</div></div>
				</div>
				
				<c:if test="${serviceContactDto.contact_file_size>0}">
				<div class="service_kind">
					<div class="service_content01"><span>파일첨부</span></div>
					<div class="service_content02"><div><a style="font-weight: 666;" href="${root}/service/contact/download.do?contact_num=${serviceContactDto.contact_num}&pageNumber=${pageNumber}">${serviceContactDto.contact_file_name}</a></div></div>
																											
				</div>
				</c:if>
				
				<div class="service_contact_content">
					<div class="service_content01"><span>내용</span></div>
					<div class="service_content02"><div>${serviceContactDto.contact_content}</div></div>
				</div>
				
				<!-- 답변이 완료되었을 경우 시작 && 답변 대기중이면 보이지 않아야 함 -->
				<c:if test="${serviceContactDto.contact_answer!=null}">
				<div class="service_contact_answer">
					<div class="service_content01"><span>답변</span></div>
					<div class="service_content02"><div>${serviceContactDto.contact_answer}</div></div>
				</div>
				</c:if>
				<!-- 답변이 완료되었을 경우 끝 -->
				
				
			</div>
			<!-- 내용부분 끝 -->

			<!-- 버튼시작 -->
			<div class="service_contact_button" align="center">
				<input type="button" value="수정" onclick="location.href='${root}/service/contact/update.do?contact_num=${serviceContactDto.contact_num}&pageNumber=${pageNumber}'"/>
				<input type="button" value="목록" onclick="location.href='${root}/service/contact/list.do?pageNumber=${pageNumber}'"/>
				<input type="button" value="삭제" onclick="contactDelete('${root}','${serviceContactDto.contact_num}','${pageNumber}')"/><!-- alert창 띄우고 삭제하시겠습니까? -->
			</div>
			<!-- 버튼 끝 -->
			</div>
		</div>
	</div>

	<!-- 고객센터 1:1문의 끝-->
</body>
</html>