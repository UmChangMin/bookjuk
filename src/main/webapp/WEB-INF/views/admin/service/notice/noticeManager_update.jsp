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
<link rel="stylesheet" type="text/css" href="${root }/css/admin/service/notice/noticeManager_write.css">
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
							<div class="content_title_signature" align="center">공지사항수정</div>
							
							<form action="${root }/admin/service/notice/noticeManager_updateOk.do" method="post">
							<input type="hidden" name="notice_num" value="${noticeDto.notice_num}">
							<%-- <input type="hidden" name="notice_date" value="${noticeDto.notice_date}">
							<input type="hidden" name="notice_num" value="${noticeDto.notice_num}">
							<input type="hidden" name="notice_writer" value="${noticeDto.notice_writer }"> --%>
								
							<div class="content_form" align="center">
								<div class="form_style">
									<div class="notice_content">
										<ul>											
											<li class="notice_title">제목</li>
											<li class="notice_title_value">																								
												<input type="text" class="value_input" id="" placeholder="" name="notice_subject" value="${noticeDto.notice_subject }"/>
											</li>
										</ul>
										<ul>											
											<li class="notice_title">작성자</li>
											<li class="notice_writer_value">
												<input type="text" style="width:150px;height: 40px;" name="notice_writer" value="${noticeDto.notice_writer }" readonly="readonly"/>
											</li>
											<li class="notice_title">작성일</li>
											<li class="notice_date">
												<input type="text" style="width:240px;height: 40px;" name="notice_date" value="<fmt:formatDate var="notice_date" value="${noticeDto.notice_date}" pattern="yy/MM/dd"/>${notice_date}" readonly="readonly"/>
												
											</li>
										</ul>
										<ul>											
											<li class="notice_content_title">내용</li>
											<li class="notice_content_value">
												<textarea placeholder="내용" name="notice_content">${noticeDto.notice_content }</textarea>
											</li>
										</ul>
										
										
										
									</div>								
									
									
									<!-- 버튼시작 -->
									<div class="form-group btn-margin" align="center">
									      <div class="col-lg-10 col-lg-offset-2 col-lg-margin-left" id="btn-margin">
									      	<ul>
									      		<li>
											        <button type="submit" class="btn btn-default" id="">수정</button>
											        <button type="button" class="btn btn-default" id="" onclick="location.href='noticeManager.do'">목록</button>
											        <button type="reset" class="btn btn-default" id="">취소</button>
										        </li>
										    </ul>
									      </div>
									</div>
									<!-- 버튼끝 -->	
									
								</div>
							</div>
							</form>
						</div>
						<!-- Content 끝 -->
					</div>

					
				</div>
			</div>
		<!-- wrap 끝 -->
    </div>
</body>
</html>