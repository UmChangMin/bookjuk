<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>관리자모드</title>

<c:set var="root" value="${pageContext.request.contextPath }"/>
<link rel="stylesheet" type="text/css" href="${root }/css/admin/commons/main.css">
<link rel="stylesheet" type="text/css" href="${root }/css/admin/service/contact/contactManager.css">
<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="${root }/js/admin/service.js"></script>
<script type="text/javascript" src="${root }/js/admin/service_contact.js"></script>

</head>   

<body>
	<!-- 타이틀메뉴 시작 -->
	<div class="all">
		
		<!-- wrap시작 -->
			<div class="wrap">
				<div class="content_wrap">
					<div class="content_title">1:1문의관리</div>
					<div class="sub_title">
						<div class="sub_title1"><a href="${root }/admin/service/service/serviceManager.do">자주묻는질문</a></div>
						<div class="sub_title2"><a href="${root }/admin/service/notice/noticeManager.do">공지사항</a></div>
						<div class="sub_title3"><a href="${root }/admin/service/contact/contactManager.do">1:1문의</a></div>
					</div>
					<div class="content_wrap_body_right">
						<!-- Content 시작 -->
						<div class="content">
							<div class="content_title_signature" align="center">1:1문의목록</div>	
							<div class="content_form" align="center">
								<form class="form_style">
									<!--  -->
									<div class="contact_content">
										<ul>
											<li class="contact_board_num">글번호</li>
											<li class="contact_title">제목</li>
											<li class="contact_writer">글쓴이</li>
											<li class="contact_date">작성일</li>
											<li class="contact_ans">답변</li>
										</ul>
										<c:forEach var="contactDto" items="${boardList}">
											<ul>
												<li class="contact_board_num">${contactDto.contact_num }</li>
												<li class="contact_title">
													<a href="javascript:read_contact('${root }','${contactDto.contact_num }','${pageNumber }')">${contactDto.contact_subject }</a>
												</li>
												<li class="contact_writer">${contactDto.member_id }</li>
												<li class="contact_date">
													<fmt:formatDate var="contact_date" value="${contactDto.contact_date}" pattern="yy/MM/dd"/>${contact_date}
												</li>
												<li class="contact_ans">${contactDto.contact_answer_whether }</li>
											</ul>
										</c:forEach>									 
									</div>
									<!--  -->	
									<!-- 페이징 처리 -->
									<!-- 페이지 번호 -->
									<div align="center">
										<c:if test="${count>0 }">			
											<fmt:parseNumber var="pageCount" value="${count/boardSize+(count%boardSize==0? 0:1)}" integerOnly="true"/>
											<c:set var="pageBlock" value="${3}"/>
										
											<fmt:parseNumber var="rs" value="${(pageNumber-1)/pageBlock}" integerOnly="true"/>
											<c:set var="startPage" value="${rs*pageBlock+1}"/>
											
											<c:set var="endPage" value="${startPage+pageBlock-1 }"/>
											
											<c:if test="${endPage>pageCount }">
												<c:set var="endPage" value="${pageCount}"/>
											</c:if>
											
											<c:if test="${startPage>pageBlock }">
												<a href="${root}/admin/service/contactManager.do?pageNumber=${startPage-pageBlock}">[이전]</a>
											</c:if>
											
											<c:forEach var="i" begin="${startPage}" end="${endPage}">
												<a href="${root}/admin/service/contact/contactManager.do?pageNumber=${i}" class="pagepic" id="pagepic">[${i}]</a>
											</c:forEach>
											
											<c:if test="${endPage<pageCount }">
												<a href="${root}/admin/service/contact/contactManager.do?pageNumber=${startPage+pageBlock}">[다음]</a>
											</c:if>
										</c:if>
									</div>
									<!-- 페이징 처리 끝 -->
								</form>
							</div>
						</div>
						<!-- Content 끝 -->
					</div>

					
				</div>
			</div>
		<!-- wrap 끝 -->
    </div>
</body>
</html>