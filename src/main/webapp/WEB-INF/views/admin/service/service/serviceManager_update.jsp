<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>관리자모드</title>

<c:set var="root" value="${pageContext.request.contextPath }"/>
<link rel="stylesheet" type="text/css" href="${root }/css/admin/commons/main.css">
<link rel="stylesheet" type="text/css" href="${root }/css/admin/service/service/serviceManager.css">
<link rel="stylesheet" type="text/css" href="${root }/css/admin/service/service/serviceManager_update.css">
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
							<div class="content_title_signature" align="center">자주묻는질문수정</div>	
							<div class="content_form" align="center">
							
								<form>
									
									<input type="text" class="notice_1_write" placeholder="제목">
									<textarea rows="8" cols="76" placeholder="  내용"></textarea>
									
									<!-- 버튼 -->
									<div class="form-group btn-margin" align="center">
									      <div class="col-lg-10 col-lg-offset-2" align="center" id="btn-margin">
									      	<ul>
									      		<li>
											        <button type="submit" class="btn btn-default" id="" onclick="location.href='serviceManager.jsp'">완료</button>											        
										        	<button type="reset" class="btn btn-default" id="" onclick="location.href='serviceManager.jsp'">취소</button>
										        </li>
										    </ul>										        										     
									      </div>
									</div>
									<!-- /버튼 -->
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