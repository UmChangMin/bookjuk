<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="root" value="${pageContext.request.contextPath }" />
<title>북적북적</title>
<link rel="stylesheet" type="text/css" href="${root}/css/main/main.css"/>
<link rel="stylesheet" type="text/css" href="${root}/css/template/basic.css"/>
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<script type="text/javascript" src="${root}/js/main/main_header.js"></script>
<script type="text/javascript" src="${root}/js/main/main_banner.js"></script>
</head>
<body>
	<!-- 메인 베너 시작 -->
	<div class="main">
		<div class="main_inner">
			<div class="main_slide_board">
				<div class="main_slide_banner">
					<ul>
						<li><img src="${root}/img/main/출석체크 이벤트.jpg"></li>
						<li><img src="${root}/img/main/이벤트 배너이미지 수정본.jpg"></li>
						<li><img src="${root}/img/main/포인트 배너 이미지 수정본.jpg"></li>
<%-- 						<li><img
							src="${root}/img/main/eventBanner_1514508708809W.jpg"></li>
						<li><img
							src="${root}/img/main/eventBanner_1516846885798W.jpg"></li> --%>
					</ul>
				</div>
			</div>

			<div class="main_banner">
				<div class="main_banner_button">
					<input type="button" value="베스트셀러" /> <br />
					<input type="button" value="화제의도서" /> <br /> 
					<input type="button" value="신간도서" /> <br />
					<input type="button" value="할인도서" />
				</div>
				
				
				<div class="main_banner_list_div">
				
				<!-- 베스트셀러  -->
				<div class="main_banner_list_view" style="display: block;">
					<ul class="main_banner_list">
						<c:forEach items="${bookBestList}" var="bookDto">
							<li><a href="${root}/book/list/detail.do?book_num=${bookDto.book_num}"><img alt="${bookDto.book_name}" src="${root}${bookDto.book_img}"></a></li>
						</c:forEach>
					</ul>
					</div>
					
					
				<!-- 화제의 도서  -->
				<div class="main_banner_list_view" style="display: none;">
					<ul class="main_banner_list">
						<c:forEach items="${bookIssueList}" var="bookDto">
							<li><a href="${root}/book/list/detail.do?book_num=${bookDto.book_num}"><img alt="${bookDto.book_name}" src="${root}${bookDto.book_img}"></a></li>
						</c:forEach>
					</ul>
					</div>
					
					
					
				<!-- 신간도서  -->
				<div class="main_banner_list_view" style="display: none;">
					<ul class="main_banner_list">
						<c:forEach items="${bookNewList}" var="bookDto">
							<li><a href="${root}/book/list/detail.do?book_num=${bookDto.book_num}"><img alt="${bookDto.book_name}" src="${root}${bookDto.book_img}"></a></li>
						</c:forEach>
					</ul>
					</div>
					
					
				<!-- 할인도서  -->
				<div class="main_banner_list_view" style="display: none;">
					<ul class="main_banner_list">
						<c:forEach items="${bookDiscountList}" var="bookDto">
							<li><a href="${root}/book/list/detail.do?book_num=${bookDto.book_num}"><img alt="${bookDto.book_name}" src="${root}${bookDto.book_img}"></a></li>
						</c:forEach>
					</ul>
					</div>
				</div>
			</div>
			<!-- main banner 끝 -->
			
			<!-- 분야별 베스트 -->
			<div class="main_best">
			<div class="main_best_inner">
			<div class="best_wrap">
				<div class="best_category">
					<h1>분야별 베스트</h1>
					<ul class="best_cate">
						<li>컴퓨터/IT</li>
						<li>소설</li>
						<li>취미/여행</li>
					</ul>
				</div>
				<div class="best_box">
					<!-- best_view_컴퓨터 -->
					<div class="best_view" style="display: block;">
						<ul class="best_list">
							<c:forEach var="i" begin="0" end="4">
							<li>
								<p class="b_num1 rank">${i+1}</p>
								<div class="thumBox">
									<a href="${root}/book/list/detail.do?book_num=${bestCom[i].book_num}"><img alt="${bestCom[i].book_name}"
										src="${root}${bestCom[i].book_img}"></a>
									<p class="best_title">
										<a href="${root}/book/list/detail.do?book_num=${bestCom[i].book_num}">${bestCom[i].book_name}</a> <br /> <a href="${root}/book/list/detail.do?book_num=${bestCom[i].book_num}">${bestCom[i].book_author}</a>
									</p>
								</div>
							</li>
							</c:forEach>
						</ul>
					</div>

					<!-- best_view_소설 -->
					<div class="best_view" style="display: none;">
						<ul class="best_list">
							<c:forEach var="i" begin="0" end="4">
							<li>
								<p class="b_num1 rank">${i+1}</p>
								<div class="thumBox">
									<a href="${root}/book/list/detail.do?book_num=${bestNov[i].book_num}"><img alt="${bestNov[i].book_name}"
										src="${root}${bestNov[i].book_img}"></a>
									<p class="best_title">
										<a href="${root}/book/list/detail.do?book_num=${bestNov[i].book_num}">${bestNov[i].book_name}</a> <br /> <a href="${root}/book/list/detail.do?book_num=${bestNov[i].book_num}">${bestNov[i].book_author}</a>
									</p>
								</div>
							</li>
							</c:forEach>
						</ul>
					</div>

					<!-- best_view_취미 -->
					<div class="best_view" style="display: none;">
						<ul class="best_list">
							<c:forEach var="i" begin="0" end="4">
							<li>
								<p class="b_num1 rank">${i+1}</p>
								<div class="thumBox">
									<a href="${root}/book/list/detail.do?book_num=${bestHob[i].book_num}"><img alt="${bestHob[i].book_name}"
										src="${root}${bestHob[i].book_img}"></a>
									<p class="best_title">
										<a href="${root}/book/list/detail.do?book_num=${bestHob[i].book_num}">${bestHob[i].book_name}</a> <br /> <a href="${root}/book/list/detail.do?book_num=${bestHob[i].book_num}">${bestHob[i].book_author}</a>
									</p>
								</div>
							</li>
							</c:forEach>
						</ul>
					</div>
				</div>
			</div>
		</div><br/>
	</div>

		<!-- MD추천 시작 1-->
		<div class="main_md">
			<div class="main_md_inner">
				<h1>MD추천</h1>
			</div>
			<c:forEach items="${bookMdList}" var="mdDto">
			<div class="main_md_box">
				<div class="main_md_view" style="display: block;">
					<ul class="main_md_list">
						<li>
							<div class="main_md_synthesis">
								<a href="${root}/book/list/detail.do?book_num=${mdDto.book_num}"><img alt="책사진"
									src="${root}${mdDto.book_img}"></a>
								<p class="main_md_title">
									<a href="${root}/book/list/detail.do?book_num=${mdDto.book_num}">${mdDto.book_name}</a><br/> <a href="${root}/book/list/detail.do?book_num=${mdDto.book_num}">${mdDto.book_author}</a>
								</p>
							</div>
							<div class="main_md_text">
								<p class="main_md_p">${mdDto.md_reason}</p>
								<p class="main_md_p2">${mdDto.md_content}</p>
							</div>
						</li>
					</ul>
				</div>
			</div>
			</c:forEach>
		</div>
		<!-- md추천 끝 -->
	</div>
</div>
</body>
</html>