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
<link rel="stylesheet" type="text/css" href="${root }/css/admin/service/service/serviceManager.css">
<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="${root }/js/admin/service.js"></script>
<script type="text/javascript" src="${root }/js/admin/service_question.js"></script>
</head>   

<body>
	<!-- 타이틀메뉴 시작 -->
	<div class="all">
		
				
		<!-- wrap시작 -->
			<div class="wrap">
				<div class="content_wrap">
					<div class="content_title">자주묻는질문관리</div>
					<div class="sub_title">
						<div class="sub_title1"><a href="${root }/admin/service/service/serviceManager.do">자주묻는질문</a></div>
						<div class="sub_title2"><a href="${root }/admin/service/notice/noticeManager.do">공지사항</a></div>
						<div class="sub_title3"><a href="${root }/admin/service/contact/contactManager.do">1:1문의</a></div>
					</div>
					<div class="content_wrap_body_right">
					
						<!-- Content 시작 -->
						<div class="content">
							<div class="content_title_signature" align="center">자주묻는질문목록</div>	
							<div class="content_form" align="center">
								<form>		

									<!-- 아코디언 시작 -->								
									<div>
										<ul class="content_ul">
										<c:forEach var="questionDto" items="${boardList}">
											<li class="collapsible">
									            <h2 class="title"><a href="#">${questionDto.question_subject }</a></h2>
									            <p class="content_value" name="">${questionDto.question_content}
									            	<br/><br/>
									            	<a href="#" class="service_update" onclick="javascript:upMove('${root}','${questionDto.question_num }','${pageNumber }')">수정</a>
								            		<a href="#" class="service_delete" onclick="javascript:delMove('${root}','${questionDto.question_num }')">삭제</a>
									            </p>									           
									        </li>
										</c:forEach>	
										
									     						
									</div>
									<!-- 아코디언 끝 -->
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
												<a href="${root}/admin/service/service/serviceManager.do?pageNumber=${startPage-pageBlock}">[이전]</a>
											</c:if>
											
											<c:forEach var="i" begin="${startPage}" end="${endPage}">
												<a href="${root}/admin/service/service/serviceManager.do?pageNumber=${i}" class="pagepic" id="pagepic">[${i}]</a>
											</c:forEach>
											
											<c:if test="${endPage<pageCount }">
												<a href="${root}/admin/service/service/serviceManager.do?pageNumber=${startPage+pageBlock}">[다음]</a>
											</c:if>
										</c:if>
									</div>
									<!-- 페이징 처리 끝 -->								
									<!-- 버튼시작 -->
									<div>
								        <button type="button" class="btn btn-default input_float_right" id="" onclick="location.href='serviceManager_write.do'"
								        style="margin-bottom: 30px;">글쓰기</button>										        
							        </div>
									<!-- 버튼끝 -->
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