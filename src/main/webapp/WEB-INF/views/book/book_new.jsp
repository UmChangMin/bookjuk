<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>도서 베스트셀러</title>
<c:set var="root" value="${pageContext.request.contextPath }" />
<link rel="stylesheet" type="text/css" href="${root}/css/book/book_best.css" />
<link rel="stylesheet" type="text/css" href="${root}/css/template/basic.css" />
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<script type="text/javascript" src="${root}/js/book/book_list.js"></script>
</head>
<body>
<!-- 도서 목록 리스트 시작 강민아 -->
		<form action="">
		<input type="hidden" name="pageNumber" value="${pageNumber}">
		<div id="bookList_all">
			<div class="bookLists">
				<div class="bookList">
					<!-- 도서분류 시작 -->
					<div class="bookList_select">
						<span>HOME ></span> <span>&nbsp;신간도서</span>
					</div>
					<!-- 도서분류 끝 -->
					<div class="bookList_mid">
						<!-- 도서 정보 top 시작 -->
						<div class="bookList_wrap">
							<h3>신간도서</h3>
							
						</div>
						<!-- 도서 정보 top 끝 -->
						<!-- 도서 보기 시작 -->
						<div class="bookDetail_mid_images">
							<div class="bookDetail_mid_image">
								<ul>
									<li class="bookDetail_mid_list_show"><a class="bookList_on"><img src="${root}/img/book/list_var_pink.png"></a></li>
									<li class="bookDetail_mid_image_show"><a class=""><img src="${root}/img/book/grid_pink.png"></a></li>
								</ul>
							</div>
						</div>
						<!-- 도서 보기 끝 -->
						<!-- 도서 리스트로 보기 시작 -->
						<div class="bookList_mid_content1">
						
						 <c:forEach var="i" begin="1" end="10">
							<div class="bookList_mid_content_inner">
								<ul>
									<li>
										<div class="bookList_mid_content_figure">
											<a href="${root}/book/list/detail.do">
												<img src="http://bookimg.bookcube.com/150/1801/180104379.jpg">
											</a>
										</div>
										<div class="bookList_content_inbfo">
											<p class="bookList_content_title"><a href="${root}/book/list/detail.do">모두의 엔트리 with 엔트리파이선</a></p>
											<p class="bookList_content_author">김슬기, 김성훈, 곽혜미 &nbsp;|&nbsp;길벗&nbsp;|&nbsp;2018.01.15</p>
											<p class="bookList_content_buy">구매 <span>12,600원</span></p>
											<div class="bookList_content_content">이 책은 이제 막 소프트웨어(SW) 교육을 시작하는 초등학교 고학년부터 중·고등학생, 컴퓨터를 전공하지 않은 대학생, 취미로 코딩을 배우고 싶은 직장인, SW 교육에 관심이 있는...이 책은 이제 막 소프트웨어(SW) 교육을 시작하는 초등학교 고학년부터 중·고등학생, 컴퓨터를 전공하지 않은 대학생, 취미로 코딩을 배우고 싶은 직장인, SW 교육에 관심이 있는...</div>
											
										</div>
									</li>
								</ul>
							</div>
						</c:forEach> 
						
						</div>
						<!-- 도서 리스트로 보기 끝-->
						
						<!-- 도서 이미지로 보기 시작 -->
						<div class="bookList_mid_content2">
							<c:forEach var="i" begin="1" end="10">
								<ul>
									<li>
										<div class="bookList_mid_content_figure2">
											<a href="${root}/book/list/detail.do">
												<img src="http://bookimg.bookcube.com/150/1801/180104379.jpg">
											</a>
										</div>
										<div class="bookList_mid_content_hot_info">
											<p>
												<a href="${root}/book/list/detail.do">모두의 엔트리 with 엔트리파이선</a>
											</p>
											<p class="bookList_mid_content_author">
												러셀 매딕스<em>&nbsp;|&nbsp;&nbsp;</em>시그마북스
											</p>
											<div class="bookList_mid_content_cash">
												<p>
													구매 <span>12,150원</span>
												</p>
											</div>
										</div>
									</li>

								</ul>
							</c:forEach>
						</div>
						<!-- 도서 이미지로 보기 끝 -->
						
						
						<!-- 페이지 번호 시작 -->
						<div class="bookList_pageNumber">
							<c:if test="${count > 0 }">
								<fmt:parseNumber var="pageCount" value="${count/listPage+(count%boardSize==0?0:1)}" integerOnly="true" />

								<c:set var="pageBlock" value="${2}" />

								<fmt:parseNumber var="sp" value="${(courrentPage-1)/pageBlock }" integerOnly="true" />
								<c:set var="startPage" value="${sp*pageBlock+1 }" />
								<c:set var="endPage" value="${startPage+pageBlock-1 }" />

								<c:if test="${endPage > pageCount}">
									<c:set var="endPage" value="${pageCount }" />
								</c:if>

								<c:if test="${startPage > pageBlock }">
									<a href="${root}/book/book_new.do?pageNumber=${startPage-pageBlock}" class="bookList_num_before">이전</a>	
								</c:if>

								<c:forEach var="i" begin="${startPage}" end="${endPage}">
									<a href="${root}/book/book_new.do?pageNumber=${i}" class="bookList_num01">${i}</a>
								</c:forEach>

								<c:if test="${endPage < pageCount }">
									<a href="${root}/book/book_new.do?pageNumber=${startPage+pageBlock}" class="bookList_num_next">다음</a>
								</c:if>
							</c:if>
						</div>
						<!-- 페이지 번호 끝 -->
					</div>
				</div>
			</div>
		</div>
		</form>
	<!-- 도서 목록 리스트 끝 -->
</body>
</html>