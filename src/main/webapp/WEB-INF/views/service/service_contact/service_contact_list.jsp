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
<link rel="stylesheet" type="text/css" href="${root}/css/template/basic.css"/>
<link rel="stylesheet" type="text/css" href="${root}/css/service/service_basic.css"/>
<link rel="stylesheet" type="text/css" href="${root}/css/service/service_contact_list.css"/>
<script type="text/javascript" src="${root }/js/jquery.js"></script>
<script type="text/javascript" src="${root}/js/service/service_contact.js"></script>


</head>
<body>
	<!-- 고객센터 1:1문의 시작 강민아-->
	<%-- <c:if test="${member_level != null && member_id!=null}"> --%>
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
				<div class="service_inner">
					
					
					<!-- list 시작 -->
					<div class="service_contact_list">
						<div class="service_contact_title">
							<div class="service_contact_title_inner">
								<p>1:1 문의</p>
								<a href="${root}/service/contact/write.do">글쓰기</a>
							</div>
						</div>
					</div><br/><br/><br/>
					
					<c:if test="${count==0 }">
						<div align="center">게시글이 존재하지 않습니다.</div>
					</c:if>
					
					<!-- 1:1문의 타이틀 시작-->
					<c:if test="${count>0 }">
						<div class="service_contact_list_content">
							<div align="center">글번호</div>
							<div align="center">제목</div>
							<div align="center">작성일</div>
							<div align="center">답변</div>
						</div>
					<!-- 1:1문의 타이틀 끝-->
					
					<!-- 1:1문의 답변 리스트 시작 -->
					<c:forEach var="ServiceContactDto" items="${ServiceContactList}">
						<div class="service_contact_list_content_list">
							<div align="center">${ServiceContactDto.contact_num}</div>
							<div><a href="javascript:readFunction('${root}','${ServiceContactDto.contact_num}','${pageNumber}')">${ServiceContactDto.contact_subject}</a></div>
							<div align="center">
								<fmt:formatDate var="contact_date" value="${ServiceContactDto.contact_date}" pattern="yyyy-MM-dd"/>${contact_date}
							</div>
							<div align="center">${ServiceContactDto.contact_answer_whether}</div>
						</div>
					</c:forEach>
					
					<!-- 1:1문의 답변 리스트  끝-->
					
					<!-- 페이지번호 시작 -->
							<div class="service_contact_list_pagenate">
								<c:if test="${count > 0}">
									<c:set var="pageCount"
										value="${count / boardSize + (count % boardSize == 0 ? 0:1)}" />

									<c:set var="pageBlock" value="${10}" />

									<fmt:parseNumber var="rs"
										value="${(pageNumber - 1) / pageBlock}" integerOnly="true" />

									<c:set var="startPage" value="${rs * pageBlock + 1}" />

									<c:set var="endPage" value="${startPage + pageBlock - 1}" />

									<c:if test="${endPage > pageCount}">
										<c:set var="endPage" value="${pageCount}"></c:set>
									</c:if>

									<c:if test="${startPage > pageBlock}">
										<a
											href="${root}/service/contact/list.do?pageNumber=${startPage - pageBlock}">[이전]</a>
									</c:if>

									<c:forEach var="i" begin="${startPage}" end="${endPage}">
										<a href="${root}/service/contact/list.do?pageNumber=${i}" class="service_contact_list_btn">${i}</a>
									</c:forEach>

									<c:if test="${endPage < pageCount}">
										<a
											href="${root}/service/contact/list.do?pageNumber=${startPage + pageBlock}">[다음]</a>
									</c:if>
								</c:if>
							</div>
							<!-- 페이지 번호 끝 -->
					
					</c:if>
					<!-- list 끝-->	
					

					
				</div>
			</div>
			<!-- 내용부분 끝 -->
		</div>
		</div>
	</div>
	<%-- </c:if>
	
	<c:if test="${member_level == null && member_id==null}">
		
	</c:if> --%>
	<!-- 고객센터 1:1문의 끝-->
</body>
</html>