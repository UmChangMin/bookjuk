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
<script type="text/javascript" src="${root }/jquery.js"></script> 
<link rel="stylesheet" type="text/css" href="${root }/css/main.css">
<link rel="stylesheet" type="text/css" href="${root }/css/contactManager_write.css">
<script type="text/javascript" src="${root }/jquery.js"></script>
<script type="text/javascript" src="${root }/jqueryUI/jquery-ui.js"></script>
<link rel="stylesheet" type="text/css" href="${root }/jqueryUI/jquery-ui.css"/>
<script type="text/javascript">

</script>


</head>   

<body>
	<!-- 타이틀메뉴 시작 -->
	<div class="all">
		<div class="header" align="center">
			<nav class="navbar navbar-expand-lg navbar-light bg-light">
			  <a class="navbar-brand" href="#">
			  	<img src="${root }/img/bookjuk_headlogo.png">
			  </a>
			  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor03" aria-controls="navbarColor03" aria-expanded="false" aria-label="Toggle navigation" style="">
			    <span class="navbar-toggler-icon"></span>
			  </button>
			
			  <div class="collapse navbar-collapse" id="navbarColor03">
			   <ul class="navbar-nav mr-auto">
			      <li class="nav-item">
			        <a class="nav-link" href="salesManager.jsp">영업관리 <span class="sr-only">(current)</span></a>
			      </li>
			      <li class="nav-item">
			        <a class="nav-link" href="orderManager.jsp">주문관리</a>
			      </li>
			      <li class="nav-item">
			        <a class="nav-link" href="customerManager.jsp">고객관리</a>
			      </li>
			      <li class="nav-item">
			        <a class="nav-link" href="bookManager.jsp">도서관리</a>
			      </li>
	        	  <li class="nav-item active">
			        <a class="nav-link" href="noticeManager.jsp">고객센터관리</a>
			      </li>
			      <li class="nav-item">
			        <a class="nav-link" href="shopManager.jsp">영업점관리</a>
			      </li>
			    </ul>			  
			  </div>
			</nav>
		</div>
		<!-- 타이틀메뉴 끝 -->
		
		
		
		
		
		
		
		<!-- wrap시작 -->
			<div class="wrap">
				<div class="content_wrap">
					<div class="content_title">자주묻는질문관리</div>
					<div class="sub_title">
						<div class="sub_title1"><a href="serviceManager.jsp">자주묻는질문</a></div>
						<div class="sub_title2"><a href="noticeManager.jsp">공지사항</a></div>
						<div class="sub_title3"><a href="contactManager.jsp">1:1문의</a></div>
					</div>
					<div class="content_wrap_body content_wrap_body_right">
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
										        <button type="button" class="btn btn-default" id="" onclick="location.href='contactManager.jsp'">목록</button>
										        <button type="submit" class="btn btn-default" id="" onclick="location.href='contactManager_write.jsp'">등록</button>
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