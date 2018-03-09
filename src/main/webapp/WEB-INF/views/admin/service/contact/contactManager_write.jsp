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
<link rel="stylesheet" type="text/css" href="${root }/css/admin/service/contact/contactManager_write.css">
<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="${root }/js/admin/service.js"></script>

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
							<div class="content_title_signature" align="center">1:1문의답글</div>	
							<form action="${root }/admin/service/contact/contactManager_writeOk.do" method="post">
							<input type="hidden" name="contact_num" value="${contactDto.contact_num }">
							
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
											<li class="contact_title_value"><input type="file" class="" id="" name="contact_file_name">${contactDto.contact_file_name}</li>										
										</ul>
										<ul>
											<li class="contact_title">문의유형</li>
											<li class="contact_title_value"><input type="text" placeholder="문의유형" value="${contactDto.contact_type }" readonly="readonly"></li>
										</ul>
										<ul>											
											<li class="contact_content_title">내용</li>
											<li class="contact_content_value"><textarea name="contact_content" readonly="readonly">${contactDto.contact_content }</textarea></li>
										</ul>	
									</div>													
								</div>
								<div class="content_form" align="center">
									<div class="contact_content">
										<div class="contact_content">
											<ul>											
												<li class="contact_content_title">답변</li>
												<li class="contact_content_value"><textarea name="contact_answer">${contactDto.contact_answer}</textarea></li>
											</ul>
										</div>									
									</div>									
								</div>
								
								<!-- 버튼시작 -->
								<div class="form-group btn-margin" align="center">
								      <div class="col-lg-10 col-lg-offset-2 col-lg-margin-left" id="btn-margin">
								      	<ul>
								      		<li>
										        <button type="button" class="btn btn-default" id="" onclick="location.href='contactManager.do'">목록</button>
										        <button type="submit" class="btn btn-default" id="">등록</button>
										        <button type="reset" class="btn btn-default" id="">취소</button>
									        </li>
									    </ul>
								      </div>
								</div>
								</form>
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