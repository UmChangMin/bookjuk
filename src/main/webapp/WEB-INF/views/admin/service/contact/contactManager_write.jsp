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
<link rel="stylesheet" type="text/css" href="${root }/css/admin/service/contact/contactManager_write.css">
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
							<div class="content_form" align="center">
									<div class="notice_content">
										<ul>											
											<li class="notice_title">제목</li>
											<li class="notice_title_value">												
												[주문취소] 주문취소 신청합니다.
												<!-- <input type="text" class="value_input" id="" placeholder="내용"> -->
											</li>
										</ul>
										<ul>											
											<li class="notice_title">작성자</li>
											<li class="notice_writer_value">관리자</li>
											<li class="notice_title">작성일</li>
											<li class="notice_date">Sysdate</li>
										</ul>
										<ul>
											<li class="notice_title">파일첨부</li>
											<li class="notice_title_value"><input type="file" class="" id=""></li>
											
										</ul>
										<ul>											
											<li class="notice_content_title">내용</li>
											<li class="notice_content_value">
												<p>
												자세한 오류 / 불편 사항<br>
												(오류 신고의 경우 자세한 오류 페이지 정보를 제공해 주시면, 빠른 문제 해결에 도움이 됩니다.)<br>
												-결제 관련문의일 경우 사용하신 결제수단(핸드폰, 카드, 적립금  등)에 대한 정보도 함께 보내주시면 더욱 빠른 처리가 가능합니다.<br>
												-북적북적 서비스에 대해 좋은 제안이나 의견을 남겨주시면 더 나은 서비스 제공을 위한 밑거름으로 삼겠습니다<br>
												
												1. 오류 / 불편 발생 일시(예시 : 2018-01-01) <br>
												=> 2018-01-02<br><br>
												2. 오류 / 불편 내용
												=>어제 책 2권을 주문했는데 오늘 한 권 더 주문하려구요~ 배송비가 2번 결제될 것 같아 재결제를 위해 기존 결제 취소부탁드립니다.<br>
												은행: 쌍용, 카드번호 4124-1314-5315-1241 입니다.
												<br>

												</p>
											</li>
										</ul>	
									</div>													
								</div>
								
								<div class="content_form" align="center">
									<div class="notice_content">
										<div class="contact_content">
											<ul>											
												<li class="contact_content_title">답변</li>
												<li class="contact_content_value"><textarea placeholder="내용"></textarea></li>
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
										        <button type="submit" class="btn btn-default" id="" onclick="location.href='contactManager_write.do'">등록</button>
										        <button type="reset" class="btn btn-default" id="">취소</button>
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