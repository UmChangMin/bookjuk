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
							<div class="content_title_signature" align="center">자주묻는질문목록</div>	
							<div class="content_form" align="center">
								<form>		

									<!-- 아코디언 시작 -->								
									<div>
										<ul class="content_ul">
									        <li class="collapsible">
									            <h2 class="title"><a href="#">주문 취소는 어떻게 하나요?</a></h2>
									            <p class="content_value">1:1문의 게시판에서 신청해 주시면 됩니다.1:1문의 게시판에서 신청해 주시면 됩니다.
									            	<br/><br/>
									            	<a href="serviceManager_update.do" class="service_update">수정</a>
								            		<a href="serviceManager_delete.do" class="service_delete">삭제</a>
									            </p>									           
									        </li>
									        <li class="collapsible">
									            <h2 class="title"><a href="#">환불은 어떻게 하나요?</a></h2>
									            <p class="content_value">1:1문의 게시판에서 신청해 주시면 됩니다.
									            <br/><br/>
									            	<a href="serviceManager_update.do" class="service_update">수정</a>
								            		<a href="serviceManager_delete.do" class="service_delete">삭제</a></p>
									        </li>
									        <li class="collapsible">
									            <h2 class="title"><a href="#">적립금은 어떻게 사용하나요?</a></h2>
									            <p class="content_value">1:1문의 게시판에서 신청해 주시면 됩니다.
									            <br/><br/>
									            	<a href="serviceManager_update.do" class="service_update">수정</a>
								            		<a href="serviceManager_delete.do" class="service_delete">삭제</a></p>
									        </li>
									        <li class="collapsible">
									            <h2 class="title"><a href="#">카카오 ID로 여러 기기에서 이용할 수 있나요?</a></h2>
									            <p class="content_value">1:1문의 게시판에서 신청해 주시면 됩니다.
									            <br/><br/>
									            	<a href="serviceManager_update.do" class="service_update">수정</a>
								            		<a href="serviceManager_delete.do" class="service_delete">삭제</a></p>
									        </li>
									        <li class="collapsible">
									            <h2 class="title"><a href="#">비회원이 문의를 할 경우는 어떻게 하나요?</a></h2>
									            <p class="content_value">1:1문의 게시판에서 신청해 주시면 됩니다.
									            <br/><br/>
									            	<a href="serviceManager_update.do" class="service_update">수정</a>
								            		<a href="serviceManager_delete.do" class="service_delete">삭제</a></p>
									        </li>
									        
									        <li class="collapsible">
									            <h2 class="title"><a href="#">해외카드로도 결제가 되나요?</a></h2>
									            <p class="content_value">1:1문의 게시판에서 신청해 주시면 됩니다.
									            <br/><br/>
									            	<a href="serviceManager_update.do" class="service_update">수정</a>
								            		<a href="serviceManager_delete.do" class="service_delete">삭제</a></p>
									        </li>
									        <li class="collapsible">
									            <h2 class="title"><a href="#">페이스북/네이버/카카오/페이코 계정을 탈퇴하고 싶어요!</a></h2>
									            <p class="content_value">1:1문의 게시판에서 신청해 주시면 됩니다.
									            <br/><br/>
									            	<a href="serviceManager_update.do" class="service_update">수정</a>
								            		<a href="serviceManager_delete.do" class="service_delete">삭제</a></p>
									        </li>
									        <li class="collapsible">
									            <h2 class="title"><a href="#">회원 탈퇴는 어떻게 하나요?</a></h2>
									            <p class="content_value">1:1문의 게시판에서 신청해 주시면 됩니다.
									            <br/><br/>
									            	<a href="serviceManager_update.do" class="service_update">수정</a>
								            		<a href="serviceManager_delete.do" class="service_delete">삭제</a></p>
									        </li>
									        <li class="collapsible">
									            <h2 class="title"><a href="#">구매 또는 대여한 도서는 몇 대의 기기까지 이용 가능한가요?</a></h2>
									            <p class="content_value">1:1문의 게시판에서 신청해 주시면 됩니다.
									            <br/><br/>
									            	<a href="serviceManager_update.do" class="service_update">수정</a>
								            		<a href="serviceManager_delete.do" class="service_delete">삭제</a></p>
									        </li>
									        <li class="collapsible">
									            <h2 class="title"><a href="#">선물한 도서에 대하여 환불 가능한가요?</a></h2>
									            <p class="content_value">1:1문의 게시판에서 신청해 주시면 됩니다.
									            <br/><br/>
									            	<a href="serviceManager_update.do" class="service_update">수정</a>
								            		<a href="serviceManager_delete.do" class="service_delete">삭제</a></p>
									        </li>
									    </ul>										
									</div>
									<!-- 아코디언 끝 -->
									<!-- 버튼시작 -->
									<div>
								        <button type="button" class="btn btn-default input_float_right" id="" onclick="location.href='serviceManager_write.do'">글쓰기</button>										        
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