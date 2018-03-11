<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>도서 목록 리스트 컴퓨터/IT</title>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<link rel="stylesheet" type="text/css" href="${root}/css/book/book_list.css"/>
<link rel="stylesheet" type="text/css" href="${root}/css/template/basic.css"/>
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<script type="text/javascript" src="${root}/jqueryUI/jquery-ui2.js"></script>
</head>
<body>
<!-- 도서 목록 리스트 시작 강민아 -->
	<div id="bookList_all">
		<div class="bookLists">
			<div class="bookList">
				<div class="bookList_mid">
					<!-- 도서 정보 top 시작 -->
					<div class="bookList_wrap">
						<c:if test="${bookDtoList[0].category_sub_kor == null}">
						<h3>소설</h3>
						</c:if>
						<c:if test="${bookDtoList[0].category_sub_kor != null}">
						<h3>소설&nbsp;&nbsp;>&nbsp;&nbsp;${bookDtoList[0].category_sub_kor}</h3>
						</c:if>
						<div class="bookList_top">
							<ul class="bookList_top_list">
								<li><a href="${root}/book/list/novel/modern.do?viewType=${viewType}">현대소설</a></li>
								<li><a href="${root}/book/list/novel/classic.do?viewType=${viewType}">고전소설</a></li>
								<li><a href="${root}/book/list/novel/mystery.do?viewType=${viewType}">추리소설</a></li>
								<li><a href="${root}/book/list/novel/romance.do?viewType=${viewType}">로맨스소설</a></li>
								<li><a href="${root}/book/list/novel/history.do?viewType=${viewType}">역사소설</a></li>
								<li><a href="${root}/book/list/novel/fantasy.do?viewType=${viewType}">판타지소설</a></li>
							</ul>
						</div>
					</div>
					<!-- 도서 정보 top 끝 -->
	
					<c:choose>
					<c:when test="${subCategory != null}">
					<!-- 도서 보기 시작 -->
					<div class="bookDetail_mid_images">
						<div class="bookDetail_mid_image">
							<ul>
								<li class="bookDetail_mid_list_show"><a href="${root}/book/list/novel/${subCategory}.do?pageNumber=${pageNumber}&viewType=list"><img src="${root}/img/book/list_var_pink.png"></a></li>
								<li class="bookDetail_mid_image_show"><a href="${root}/book/list/novel/${subCategory}.do?pageNumber=${pageNumber}&viewType=image"><img src="${root}/img/book/grid_pink.png"></a></li>
							</ul>
						</div>
					</div>
					<!-- 도서 보기 끝 -->
					
					<!-- 도서 리스트로 보기 -->
					<c:choose>
					<c:when test="${viewType eq 'list'}">
						<div class="bookList_mid_content1">
						<c:forEach items="${bookDtoList}" var="bookDto">
							<div class="bookList_mid_content_inner">
								<ul>
									<li>
										<div class="bookList_mid_content_figure">
											<a href="${root}/book/list/detail.do?book_num=${bookDto.book_num}">
												<img src="${root}${bookDto.book_img}">
											</a>
										</div>
										<div class="bookList_content_inbfo">
											<p class="bookList_content_title"><a href="${root}/book/list/detail.do?book_num=${bookDto.book_num}">${bookDto.book_name}</a></p>
											<p class="bookList_content_author">${bookDto.book_author}&nbsp;&nbsp;|&nbsp;&nbsp;${bookDto.book_publisher}&nbsp;&nbsp;|&nbsp;&nbsp;<fmt:formatDate value="${bookDto.book_date}" pattern="YYYY.MM.dd"/></p>
											<p class="bookList_content_buy">가격 <span><fmt:formatNumber value="${bookDto.product_disprice}" pattern="###,###,###"/>원</span></p>
											<div class="bookList_content_content">${bookDto.book_intro}</div>
											
										</div>
									</li>
								</ul>
							</div>
						</c:forEach> 
						</div>
					</c:when>
					
					<c:when test="${viewType eq 'image'}">
						<div class="bookList_mid_content2">
							<c:forEach items="${bookDtoList}" var="bookDto">
								<ul>
									<li>
										<div class="bookList_mid_content_figure2">
											<a href="${root}/book/list/detail.do?book_num=${bookDto.book_num}">
												<img src="${root}${bookDto.book_img}">
											</a>
										</div>
										<div class="bookList_mid_content_hot_info">
											<p class="bookList_mid_content_title">
												<a href="${root}/book/list/detail.do?book_num=${bookDto.book_num}">${bookDto.book_name}</a>
											</p>
											<p class="bookList_mid_content_author">
												${bookDto.book_author}<em>&nbsp;|&nbsp;&nbsp;</em>${bookDto.book_publisher}
											</p>
											<div class="bookList_mid_content_cash">
												<p>
													가격 <span><fmt:formatNumber value="${bookDto.product_disprice}" pattern="###,###,###"/>원</span>
												</p>
											</div>
										</div>
									</li>
								</ul>
							</c:forEach>
						</div>
					</c:when>
					</c:choose>
					<!-- 도서 이미지로 보기 -->
					
					<!-- 페이지 번호 시작 -->
					<div class="bookList_pageNumber">
						<c:if test="${endPage > pageCount}">
							<c:set var="endPage" value="${pageCount}"/>
						</c:if>
						
						<c:if test="${startPage > pageBlock}">
							<a href="${root}/book/list/novel/${subCategory}.do?pageNumber=${startPage - pageBlock}&viewType=${viewType}" class="bookList_num_before">이전</a>
						</c:if>
						
						<c:forEach var="i" begin="${startPage}" end="${endPage}" >
							<a href="${root}/book/list/novel/${subCategory}.do?pageNumber=${i}&viewType=${viewType}" class="bookList_num01">${i}</a>
						</c:forEach>
						
						<c:if test="${endPage < pageCount}">
							<a href="${root}/book/list/novel/${subCategory}.do?pageNumber=${startPage + pageBlock}&viewType=${viewType}" class="bookList_num_next">다음</a>
						</c:if>
					</div>
					<!-- 페이지 번호 끝 -->
					</c:when>
					
					<c:when test="${subCategory == null}">
					<!-- 도서 보기 시작 -->
					<div class="bookDetail_mid_images">
						<div class="bookDetail_mid_image">
							<ul>
								<li class="bookDetail_mid_list_show"><a href="${root}/book/list/novel.do?pageNumber=${pageNumber}&viewType=list"><img src="${root}/img/book/list_var_pink.png"></a></li>
								<li class="bookDetail_mid_image_show"><a href="${root}/book/list/novel.do?pageNumber=${pageNumber}&viewType=image"><img src="${root}/img/book/grid_pink.png"></a></li>
							</ul>
						</div>
					</div>
					<!-- 도서 보기 끝 -->
					
					<!-- 도서 리스트로 보기 -->
					<c:choose>
					<c:when test="${viewType eq 'list'}">
						<div class="bookList_mid_content1">
						<c:forEach items="${bookDtoList}" var="bookDto">
							<div class="bookList_mid_content_inner">
								<ul>
									<li>
										<div class="bookList_mid_content_figure">
											<a href="${root}/book/list/detail.do?book_num=${bookDto.book_num}">
												<img src="${root}${bookDto.book_img}">
											</a>
										</div>
										<div class="bookList_content_inbfo">
											<p class="bookList_content_title"><a href="${root}/book/list/detail.do?book_num=${bookDto.book_num}">${bookDto.book_name}</a></p>
											<p class="bookList_content_author">${bookDto.book_author}&nbsp;&nbsp;|&nbsp;&nbsp;${bookDto.book_publisher}&nbsp;&nbsp;|&nbsp;&nbsp;<fmt:formatDate value="${bookDto.book_date}" pattern="YYYY.MM.dd"/></p>
											<p class="bookList_content_buy">가격 <span><fmt:formatNumber value="${bookDto.product_disprice}" pattern="###,###,###"/>원</span></p>
											<div class="bookList_content_content">${bookDto.book_intro}</div>
											
										</div>
									</li>
								</ul>
							</div>
						</c:forEach> 
						</div>
					</c:when>
					
					<c:when test="${viewType eq 'image'}">
						<div class="bookList_mid_content2">
							<c:forEach items="${bookDtoList}" var="bookDto">
								<ul>
									<li>
										<div class="bookList_mid_content_figure2">
											<a href="${root}/book/list/detail.do?book_num=${bookDto.book_num}">
												<img src="${root}${bookDto.book_img}">
											</a>
										</div>
										<div class="bookList_mid_content_hot_info">
											<p class="bookList_mid_content_title">
												<a href="${root}/book/list/detail.do?book_num=${bookDto.book_num}">${bookDto.book_name}</a>
											</p>
											<p class="bookList_mid_content_author">
												${bookDto.book_author}<em>&nbsp;|&nbsp;&nbsp;</em>${bookDto.book_publisher}
											</p>
											<div class="bookList_mid_content_cash">
												<p>
													가격 <span><fmt:formatNumber value="${bookDto.product_disprice}" pattern="###,###,###"/>원</span>
												</p>
											</div>
										</div>
									</li>
								</ul>
							</c:forEach>
						</div>
					</c:when>
					</c:choose>
					<!-- 도서 이미지로 보기 -->
					
					<!-- 페이지 번호 시작 -->
					<div class="bookList_pageNumber">
						<c:if test="${endPage > pageCount}">
							<c:set var="endPage" value="${pageCount}"/>
						</c:if>
						
						<c:if test="${startPage > pageBlock}">
							<a href="${root}/book/list/novel.do?pageNumber=${startPage - pageBlock}&viewType=${viewType}" class="bookList_num_before">이전</a>
						</c:if>
						
						<c:forEach var="i" begin="${startPage}" end="${endPage}" >
							<a href="${root}/book/list/novel.do?pageNumber=${i}&viewType=${viewType}" class="bookList_num01">${i}</a>
						</c:forEach>
						
						<c:if test="${endPage < pageCount}">
							<a href="${root}/book/list/novel.do?pageNumber=${startPage + pageBlock}&viewType=${viewType}" class="bookList_num_next">다음</a>
						</c:if>
					</div>
					<!-- 페이지 번호 끝 -->
					</c:when>
					</c:choose>
				</div>
			</div>
		</div>
	</div>
	<!-- 도서 목록 리스트 끝 -->
</body>
</html>