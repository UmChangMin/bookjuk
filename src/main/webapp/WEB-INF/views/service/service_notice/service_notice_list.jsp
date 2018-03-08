<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>공지사항 리스트</title>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<link rel="stylesheet" type="text/css" href="${root}/css/template/basic.css" />
<link rel="stylesheet" type="text/css" href="${root}/css/service/service_basic.css" />
<link rel="stylesheet" type="text/css" href="${root}/css/service/service_notice_list.css" />
<script type="text/javascript" src="${root }/js/jquery.js"></script>
<script type="text/javascript" src="${root}/jqueryUI/jquery-ui.js"></script>
<script type="text/javascript" src="${root}/js/service/service_notice.js"></script>
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
					
					
					<!-- notice_list 시작 -->
						<div class="service_content_title">
							<div align="center">제목</div>
							<div align="center">작성일</div>
						</div>
					<c:forEach var="ServiceNoticeDto" items="${noticeList}">
						<div class="service_notices">
							<div><a href="javascript:readFunction('${root}','${ServiceNoticeDto.notice_num}','${pageNumber}')">${ServiceNoticeDto.notice_subject}</a></div>
							
							<div align="center"><fmt:formatDate var="notice_date" value="${ServiceNoticeDto.notice_date}" pattern="yyyy/MM/dd"/>${notice_date}</div>
						</div>
					</c:forEach>
					<!-- notice_list 끝-->	
	
				</div>
				<!-- 페이지번호 시작 -->
							<c:if test="${count>0}">	
								<div class="service_notice_list_pagenate">
									<c:set var="pageCount"
										value="${count / listSize + (count % listSize == 0 ? 0:1)}" />

									<c:set var="pageBlock" value="${5}" />

									<fmt:parseNumber var="rs"
										value="${(pageNumber - 1) / pageBlock}" integerOnly="true" />

									<c:set var="startPage" value="${rs * pageBlock + 1}" />

									<c:set var="endPage" value="${startPage + pageBlock - 1}" />

									<c:if test="${endPage > pageCount}">
										<c:set var="endPage" value="${pageCount}"></c:set>
									</c:if>

									<c:if test="${startPage > pageBlock}">
										<a href="${root}/service/notice/list.do?pageNumber=${startPage - pageBlock}"> [ 이전 ]</a>
									</c:if>

									<c:forEach var="i" begin="${startPage}" end="${endPage}">
										<a href="${root}/service/notice/list.do?pageNumber=${i}" class="service_notice_list_btn">${i}</a>
									</c:forEach>

									<c:if test="${endPage < pageCount}">
										<a href="${root}/service/notice/list.do?pageNumber=${startPage + pageBlock}">[ 다음 ]</a>
									</c:if>
								</div>
							</c:if>
				<!-- 페이지 번호 끝 -->
			</div>
			<!-- 내용부분 끝 -->
			
			</div>
		</div>
	</div>
	<!-- 고객센터 공지사항 끝-->
</body>
</html>