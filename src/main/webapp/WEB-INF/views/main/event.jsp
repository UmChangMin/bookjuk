<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>출석체크</title>

<link rel="stylesheet" type="text/css" href="${root}/css/template/basic.css" />
<link rel="stylesheet" type="text/css" href="${root}/css/main/event.css" />
<link rel="stylesheet" type="text/css" href="${root}/css/calenderStyle.css" />
</head>
<body>

	<div class="attendance">
		<div class="attendance_top">
			<div class="attendance_inner">


				<!-- 출석체크 타이틀 시작 -->
				<div class="attendance_title_top">
					<div class="attendance_title">
						<div class="attendance_titleinner">출석체크</div>
					</div>
				</div>
				<!-- 타이틀 끝 -->

				<!-- 출석체크 배너 이미지 -->
				<div class="attendance_banner_move">
					<a><img alt="나와라 사진" src="${root}/img/main/출석체크 이벤트.jpg" /></a> <a><img
						alt="" src="" /></a> <a><img alt="" src="" /></a> <a><img alt=""
						src="" /></a> <a><img alt="" src="" /></a>
				</div>
			</div>

			<!-- 달력 시작 -->
			<div class='wrap'>
				<div class='btn-holder'>
					<button id='btnPrev'>&lt;</button>
					<span id='currentDate'></span>
					<button id='btnNext'>&gt;</button>
				</div>
				<div id="calendar"></div>
			</div>
			<!-- /#c -->
			<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
		
			<script src="${root}/javascript/calender/test.js"></script>
			<!--달력 끝  -->
			
			
 			<!--  출석체크 버튼  -->
			<div class="attendance_calenderbut">
				<input type="button" value="출석체크하기" id="attendance_calenderbut">
			</div> 

		</div>
	</div>

</body>
</html>