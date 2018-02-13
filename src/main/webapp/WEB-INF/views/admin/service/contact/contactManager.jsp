<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>관리자모드</title>

<c:set var="root" value="${pageContext.request.contextPath }"/>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="${root }/css/commons/main.css">
<link rel="stylesheet" type="text/css" href="${root }/css/service/contact/contactManager.css">
<script type="text/javascript" src="${root }/jquery/jquery.js"></script>
<script type="text/javascript" src="${root }/jqueryUI/jquery-ui.js"></script>
<link rel="stylesheet" type="text/css" href="${root }/jqueryUI/jquery-ui.css"/>
<script type="text/javascript">
	$(function(){
		$(".nav-item:eq(4)").addClass("active");
	});
</script>
</head>   

<body>
	<!-- 타이틀메뉴 시작 -->
	<div class="all">
		<jsp:include page="../../commons/header_menu.jsp"></jsp:include>
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
									<div class="contact_content">
										<ul>
											<li class="contact_board_num">글번호</li>
											<li class="contact_title">제목</li>
											<li class="contact_writer">글쓴이</li>
											<li class="contact_date">작성일</li>
											<li class="contact_ans">답변</li>
										</ul>
										
										<ul>
											<li class="contact_board_num">10</li>
											<li class="contact_title"><a href="contactManager_read.jsp">환불 신청합니다.</a></li>
											<li class="contact_writer">박로석</li>
											<li class="contact_date">2018-01-20</li>
											<li class="contact_ans">답변대기중</li>
										</ul>
										<ul>
											<li class="contact_board_num">9</li>
											<li class="contact_title"><a href="#">주문취소 신청합니다.</a></li>
											<li class="contact_writer">엄창민</li>
											<li class="contact_date">2018-01-19</li>
											<li class="contact_ans">답변대기중</li>
										</ul>
										<ul>
											<li class="contact_board_num">8</li>
											<li class="contact_title"><a href="#">교환 신청합니다.</a></li>
											<li class="contact_writer">허단비</li>
											<li class="contact_date">2018-01-18</li>
											<li class="contact_ans">답변대기중</li>
										</ul>
										<ul>
											<li class="contact_board_num">7</li>
											<li class="contact_title"><a href="#">환불 신청합니다.</a></li>
											<li class="contact_writer">강민아</li>
											<li class="contact_date">2018-01-16</li>
											<li class="contact_ans">답변대기중</li>
										</ul>
										<ul>
											<li class="contact_board_num">6</li>
											<li class="contact_title"><a href="#">주문취소 신청합니다.</a></li>
											<li class="contact_writer">김태우</li>
											<li class="contact_date">2018-01-16</li>
											<li class="contact_ans">답변대기중</li>
										</ul>
										<ul>
											<li class="contact_board_num">5</li>
											<li class="contact_title"><a href="#">환불 신청합니다.</a></li>
											<li class="contact_writer">김동환</li>
											<li class="contact_date">2018-01-14</li>
											<li class="contact_ans">답변완료</li>
										</ul>
										<ul>
											<li class="contact_board_num">4</li>
											<li class="contact_title"><a href="#">주문취소 신청합니다.</a></li>
											<li class="contact_writer">김용기</li>
											<li class="contact_date">2018-01-14</li>
											<li class="contact_ans">답변완료</li>
										</ul>
										<ul>
											<li class="contact_board_num">3</li>
											<li class="contact_title"><a href="#">교환 신청합니다.</a></li>
											<li class="contact_writer">허승찬</li>
											<li class="contact_date">2018-01-12</li>
											<li class="contact_ans">답변완료</li>
										</ul>
										<ul>
											<li class="contact_board_num">2</li>
											<li class="contact_title"><a href="#">환불 신청합니다.</a></li>
											<li class="contact_writer">채종욱</li>
											<li class="contact_date">2018-01-12</li>
											<li class="contact_ans">답변완료</li>
										</ul>
										<ul>
											<li class="contact_board_num">1</li>
											<li class="contact_title"><a href="#">주문취소 신청합니다.</a></li>
											<li class="contact_writer">박성호</li>
											<li class="contact_date">2018-01-01</li>
											<li class="contact_ans">답변완료</li>
										</ul>
									</div>								
									
									
									<!-- 버튼시작 -->
									<div>
								        <button type="button" class="btn btn-default input_float_right" id="" onclick="location.href='noticeManager_write.jsp'">글쓰기</button>										        
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