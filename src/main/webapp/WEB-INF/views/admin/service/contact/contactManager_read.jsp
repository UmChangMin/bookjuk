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
<link rel="stylesheet" type="text/css" href="${root }/css/admin/service/contact/contactManager_read.css">
<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="${root }/js/admin/service.js"></script>
<script type="text/javascript" src="${root }/js/admin/service_contact.js"></script>

<!-- 
	만약 답글이 있다면 replaceWith로 읽기 하단에 답글을 추가 + 답글달기버튼 없음 // 답글이 없으면 공백상태 + 답글달기 버튼 추가	
 -->

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
							<div class="content_title_signature" align="center">1:1문의읽기</div>	
							<div class="content_form" align="center">
									<div class="contact_content">
										<ul>											
											<li class="contact_title">제목</li>
											<li class="contact_title_value">												
												[주문취소]${contactDto.contact_subject }
												<!-- <input type="text" class="value_input" id="" placeholder="내용"> -->
											</li>
										</ul>
										<ul>											
											<li class="contact_title">작성자</li>
											<li class="contact_writer_value">${contactDto.contact_content}</li>
											<li class="contact_title">작성일</li>
											<li class="contact_date">
												<fmt:formatDate var="contact_date" value="${contactDto.contact_date}" pattern="yy/MM/dd"/>${contact_date}
											</li>
										</ul>
										<ul>
											<li class="contact_title">파일첨부</li>
											<li class="contact_title_value"><input type="file" class="" id=""></li>										
										</ul>
										<ul>
											<li class="contact_title">문의유형</li>
											<li class="contact_title_value"><input type="text" placeholder="문의유형" value="${contactDto.contact_type}"></li>
										</ul>
										<ul>											
											<li class="contact_content_title">내용</li>
											<li class="contact_content_value"><textarea readonly="readonly">${contactDto.contact_content }</textarea></li>
										</ul>	
									</div>													
								</div>
								
								<c:if test="${contactDto.contact_answer!=null }">
									<div class="content_form remove_answer" align="center">
										<div class="contact_content">
											<div class="contact_content">
												<ul>											
													<li class="contact_content_title">답변</li>
													<li class="contact_content_value"><textarea readonly="readonly">${contactDto.contact_answer }</textarea></li>
												</ul>
											</div>									
										</div>									
									</div>
								</c:if>
								<!-- 버튼시작 -->
								<div class="form-group btn-margin" align="center">
								      <div class="col-lg-10 col-lg-offset-2 col-lg-margin-left" id="btn-margin">
								      	<ul>
								      		<li>
										        <button type="button" class="btn btn-default" id="" onclick="location.href='contactManager.do'">목록</button>
										        <c:if test="${answer_whether=='답변완료'}">
										        	<button type="submit" class="btn btn-default" id="" onclick="location.href='contactManager_write.do?contact_num=${contactDto.contact_num}'">답글수정</button>
										        </c:if>
										        
										        <c:if test="${answer_whether=='답변대기중'}">
										        	<button type="submit" class="btn btn-default" id="" onclick="location.href='contactManager_write.do?contact_num=${contactDto.contact_num}'">답글달기</button>
										        </c:if>
										        <button type="reset" class="btn btn-default" id="" onclick="javascript:deleteMove('${root }','${contactDto.contact_num}','${pageNumber}')">답글삭제</button>
									        </li>
									    </ul>
								      </div>
								</div>
								<!-- 버튼끝 -->	
						</div>
						<!-- Content 끝 -->
					</div>

					
				</div>
			</div>
		<!-- wrap 끝 -->
    </div>
</body>
</html>