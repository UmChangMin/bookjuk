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
<link rel="stylesheet" type="text/css" href="${root }/css/admin/service/notice/noticeManager.css">
<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="${root }/js/admin/service.js"></script>
</head>   

<body>
	<!-- 타이틀메뉴 시작 -->
	<div class="all">
		<jsp:include page="../../commons/header_menu.jsp"></jsp:include>
		<!-- wrap시작 -->
			<div class="wrap">
				<div class="content_wrap">
					<div class="content_title">공지사항관리</div>
					<div class="sub_title">
						<div class="sub_title1"><a href="${root }/admin/service/service/serviceManager.do">자주묻는질문</a></div>
						<div class="sub_title2"><a href="${root }/admin/service/notice/noticeManager.do">공지사항</a></div>
						<div class="sub_title3"><a href="${root }/admin/service/contact/contactManager.do">1:1문의</a></div>
					</div>
					<div class="content_wrap_body_right">
						<!-- Content 시작 -->
						<div class="content">
							<div class="content_title_signature" align="center">공지사항목록</div>	
							<div class="content_form" align="center">
								<div class="form_style">
									<div class="notice_content">
										<ul>
											<li class="notice_board_num">글번호</li>
											<li class="notice_title">제목</li>
											<li class="notice_date">작성일</li>
										</ul>
										
										<ul>
											<li class="notice_board_num">10</li>
											<li class="notice_title"><a href="noticeManager_read.do">[공지] 1월 12일 고객센터 운영시간 변경 안내</a></li>
											<li class="notice_date">2018-01-12</li>
										</ul>
										<ul>
											<li class="notice_board_num">9</li>
											<li class="notice_title"><a href="">[공지] 카카오페이 서비스 일시 중지 안내</a></li>
											<li class="notice_date">2018-01-11</li>
										</ul>
										<ul>
											<li class="notice_board_num">8</li>
											<li class="notice_title"><a href="">[공지] 1월 10일 고객센터 운영시간 변경 안내</a></li>
											<li class="notice_date">2018-01-10</li>
										</ul>
										<ul>
											<li class="notice_board_num">7</li>
											<li class="notice_title"><a href="">[공지] ios 북적북적 앱 업데이트 공지</a></li>
											<li class="notice_date">2017-12-26</li>
										</ul>
										<ul>
											<li class="notice_board_num">6</li>
											<li class="notice_title"><a href="">[공지] 일부 서비스 중지 안내</a></li>
											<li class="notice_date">2017-12-22</li>
										</ul>
										<ul>
											<li class="notice_board_num">5</li>
											<li class="notice_title"><a href="">[공지] 북적북적 서버 정기점검 작업 공지</a></li>
											<li class="notice_date">2017-12-18</li>
										</ul>
										<ul>
											<li class="notice_board_num">4</li>
											<li class="notice_title"><a href="">[공지] 북적북적 앱 apk 파일 다운로드 안내</a></li>
											<li class="notice_date">2017-11-13</li>
										</ul>
										<ul>
											<li class="notice_board_num">3</li>
											<li class="notice_title"><a href="">[공지] 기기관리 기능 추가 안내</a></li>
											<li class="notice_date">2017-11-08</li>
										</ul>
										<ul>
											<li class="notice_board_num">2</li>
											<li class="notice_title"><a href="">[공지] 신규회원 첫 구매 추가혜택 변경 안내</a></li>
											<li class="notice_date">2017-11-01</li>
										</ul>
										<ul>
											<li class="notice_board_num">1</li>
											<li class="notice_title"><a href="">[공지] 10월 회원별 혜택 지급일 변경 안내</a></li>
											<li class="notice_date">2017-10-18</li>
										</ul>
									</div>								
									
									
									<!-- 버튼시작 -->
								    <div>
								        <button type="button" class="btn btn-default input_float_right" id="" onclick="location.href='noticeManager_write.do'">글쓰기</button>										        
							        </div>
								
									<!-- 버튼끝 -->	
									
								</div>
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