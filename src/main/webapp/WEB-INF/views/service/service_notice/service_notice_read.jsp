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
<link rel="stylesheet" type="text/css" href="${root}/css/service/service_basic.css" />
<link rel="stylesheet" type="text/css" href="${root}/css/service/service_notice_read.css" />
<script type="text/javascript" src="${root }/js/jquery.js"></script>
<script type="text/javascript">
	$(function(){

		$(".service_notice").css("color","#F15F5F");
	});
</script>
</head>
<body>
	<!-- 고객센터 공지사항 시작 강민아-->

	<div id="service_all">
		<div class="service">
		<div class="service_sub">
			<div class="service_warp">고객센터</div>
			<div class="service_tab">
				<ul>
					<li><a href="${root}/service/question.do" class="service_fna"><img src="${root}/img/service/question.png">자주하는질문</a></li>
					<li><a href="${root}/service/notice/list.do" class="service_notice"><img src="${root}/img/service/information_pink.png">공지사항</a></li>
					<li><a href="${root}/service/contact/list.do" class="service_inquiry"><img src="${root}/img/service/service_contact.png">1:1문의</a></li>
				</ul>
			</div>
			<!-- 내용부분 시작 -->
			<div class="service_content">
				<div class="service_inner">
					
					<!-- notice_read 시작 -->
					<div class="notice_read">
						<div class="notice_read_title">
							<div align="center">제목</div>
							<div>${serviceNoticeDto.notice_subject}</div>
						</div>
						<div class="notice_read_date">
							<div align="center">작성일</div>
							<div><fmt:formatDate var="notice_date" value="${serviceNoticeDto.notice_date}" pattern="yyyy/MM/dd"/>${notice_date}</div>
						</div>
						<div class="notice_read_content">
							<div><p>${serviceNoticeDto.notice_content}</p></div>
						</div>
					</div>
					
					<!-- 이전 다음 시작 --> 
					<div class="notice_button" align="center">
						<c:if test="${serviceNoticeDto.notice_num > 1}">
							<input type="button" value="이전" onclick="location.href='${root}/service/notice/read.do?pageNumber=${pageNumber}&notice_num=${serviceNoticeDto.notice_num-1}'"/>
						</c:if>
						<input type="button" value="목록" onclick="location.href='${root}/service/notice/list.do?pageNumber=${pageNumber}'"/>
						<c:if test="${serviceNoticeDto.notice_num < listSize }">
							<input type="button" value="다음" onclick="location.href='${root}/service/notice/read.do?pageNumber=${pageNumber}&notice_num=${serviceNoticeDto.notice_num+1}'"/>						
						</c:if>
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