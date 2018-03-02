<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>도서 상세보기</title>
<c:set var="root" value="${pageContext.request.contextPath }" />
<link rel="stylesheet" type="text/css" href="${root}/css/book/book_detail.css"/>
<link rel="stylesheet" type="text/css" href="${root}/css/template/basic.css"/>
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<script type="text/javascript" src="${root}/js/book/book_detail.js"></script>
</head>
<body>
	<!-- 도서 상세보기 시작 강민아-->
	<form action="">
		<div id="bookDetail_all">
		
			<div class="bookDetails">
				<div class="bookDetail">
					<!-- 도서분류 시작 -->
					<div class="bookDetail_select">
						<span><a href="${root}/main.do">HOME</a> > </span> <span><a href="${root}/book/list/${bookDto.category_main_eng}.do">${bookDto.category_main_kor}</a> > </span><span><a href="${root}/book/list/${bookDto.category_main_eng}/${bookDto.category_sub_eng}.do">${bookDto.category_sub_kor}</a></span>
					</div>
					<!-- 도서분류 끝 -->

					<div class="bookDetail_mid">
						<!-- 도서 정보 top 시작 -->
						<div class="bookDetail_wrap">
							<div class="bookDetail_inners"><br/><br/>
								<div class="bookDetail_book">
									<div class="bookDetail_book_thum">
										<div class="bookDetail_figure">
											<div class="bookDetail_thum_box">
												<span class="bookDetail_rm_br"> <img
													src="${root}${bookDto.book_img}" />
												</span>
											</div>
										</div>
									</div>
								</div>

								<div class="bookDetail_info">
									<div class="bookDetail_title">
										<div class="bookDetail_title_inner">
											<p>${bookDto.book_name}</p>
										</div>
									</div>
									<div class="bookDetail_author">
										${bookDto.book_author}<span>&nbsp;저</span>
									</div>
									<span>${bookDto.book_publisher}</span>&nbsp;&nbsp;|&nbsp;&nbsp;<span><fmt:formatDate value="${bookDto.book_date}" pattern="YYYY.MM.dd"/></span>

									<div class="bookDetail_star">
										<div>
											<span class="bookDetail_list_star"></span>
											<p class="bookDetail_rank_user">${bookDto.book_score}</p>
										</div>
									</div>
								<!-- 	<ul>
										<li class="bookDetail_star_rating">
											<a href="#">★</a> 
											<a href="#">★</a> 
											<a href="#">★</a> 
											<a href="#">★</a> 
											<a href="#">★</a>
										</li>
									</ul> -->
									
									<div class="bookDetail_info_table">
										
										<div class="bookDetail_info_content">
											<div class="bookDetail_one">정가</div>
											<div class="bookDetail_two">
												<span><del><fmt:formatNumber value="${bookDto.product_price}" pattern="###,###,###"/></del>&nbsp;원</span>
											</div>
										</div>
										<div class="bookDetail_price">
											<div class="bookDetail_one">판매가</div>
											<div class="bookDetail_two">
												<span><span class="bookDetail_disprice"><fmt:formatNumber value="${bookDto.product_disprice}" pattern="###,###,###"/></span>&nbsp;원</span>&nbsp;&nbsp;
												<span class="bookDetail_discount">[&nbsp;<span><fmt:formatNumber value="${bookDto.product_discount}" pattern="###,###,###"/>%↓</span>&nbsp;]</span>
											</div>
										</div>
										<div class="bookDetail_point">
											<div class="bookDetail_one">포인트</div>
											<div class="bookDetail_two">
												<span><fmt:formatNumber value="${bookDto.product_point}" pattern="###,###,###"/>&nbsp;P</span>
											</div>
										</div>
										<div class="bookDetail_delivery">
											<div class="bookDetail_one">배송료</div>
											<div class="bookDetail_two"><fmt:formatNumber value="${bookDto.product_delivery}" pattern="###,###,###"/>&nbsp;원</div>
										</div>
										
									</div>
									<div class="bookDetail_btn">
										<a href="javascript:cartFunction()" class="bookDetail_cart"><span>책바구니</span></a> 
										<a href="#" class="bookDetail_buy">구매</a>
									</div>
								</div>

							</div>

						</div>

						<!-- 에디터의 한마디 시작 -->
						<div class="bookDetail_MD">
							<span><img src="${root}/img/book/good.png" width="25" height="25"/>&nbsp;에디터의 한마디</span>
							<div><p>${bookDto.book_editor}</p></div>
						</div>
									
						<!-- 도서 정보 top 끝 -->
						<!-- 도서 정보  tab 시작 -->
						<div class="bookDetail_tab">
								<div class="bookDetail_nav_inner">
								<ul class="bookDetail_scroll_tab bookDetail_series">
									<li class="bookDetail_on"><a href="javascript:">책소개</a><span></span></li>
									<li><a href="javascript:">목차</a><span></span></li>
									<li><a href="javascript:">저자소개</a><span></span></li>
									<li><a href="javascript:">출판사리뷰</a><span></span></li>
									<li><a href="javascript:">회원리뷰</a><span></span></li>
								</ul>
							</div> 
						</div>
						<!-- tab메뉴 따라오기 시작 -->
						<div class="bookDetail_jdcontent"></div>
						<!-- tab메뉴 따라오기  끝-->
						
						<!-- 도서 정보  tab 끝 -->
						
						<div class="bookDetail_inner">
							<!-- 도서 책소개 시작 --><!-- bookDetail_intro 으로 제이쿼리 사용하기 -->
							<div class="bookDetail_intro bookDetail_one_page">
								<h3>책소개</h3>
								<div>
									${bookDto.book_intro}
								</div>
							</div>
						
						<!-- 도서 책소개 끝 -->
						<!-- 도서 목차 소개 시작 -->
						<div class="bookDetail_intro bookDetail_second_page">
						<h3>목차</h3>
							<div>
								${bookDto.book_contents}
							</div>
						</div>
						<!-- 도서 목차 소개 끝 -->
						<!-- 도서 저자 소개 시작 -->
						<div class="bookDetail_intro bookDetail_author_intro">
							<h3>저자소개</h3>
							<div class="bookDetail_intro bookDetail_author_intro_text">
								${bookDto.book_author_info}
							</div>
						</div>
						<!-- 도서 저자 소개 끝 -->
						<!-- 책 속한문장 시작 -->
						<div class="bookDetail_intro bookDetail_one_content">
						<h3>출판사리뷰</h3>
							<div>
								${bookDto.book_publisher_review}
							</div>
						</div>
						<!-- 책 속한문장 끝 -->
						<!-- 회원리뷰 시작 -->
						
						<div class="bookDetail_intro bookDetail_review">
							<h3>회원리뷰</h3>		
							<br/>
							<ul>
								<li class="bookDetail_drag_star">
									<div class="bookDetail_lft">
										<ul class="bookDetail_reviewAll_top">
											<li class="bookDetail_star_rating">
												<a href="#">★</a> 
												<a href="#">★</a> 
												<a href="#">★</a> 
												<a href="#">★</a> 
												<a href="#">★</a>
											</li>
										</ul>
									</div>
								</li>
								<li class="bookDetail_input_textarea">
									<textarea name="ment" cols="6" rows="2" placeholder="120자 이내로 작성해주세요." maxlength="120"></textarea>
								</li>
								<li>
									<input type="button" id="bookDetail_pointAddButton" value="등록" onclick="">
								</li> 
							</ul>
							
							<!-- 새로운/기존 댓글출력 시작 -->
							<c:if test="${bookDto.review_num != 0}">
								<ul class="bookdetail_reviewLists">
									<li>
										<div>
											<ul class="bookDetail_reviewAll_top bookDetail_reviewAll_top2">
												<li class="bookDetail_star_rating">
													<a href="#">★</a> 
													<a href="#">★</a> 
													<a href="#">★</a> 
													<a href="#">★</a> 
													<a href="#">★</a>
												</li>
											</ul>
										</div>
									</li>
									<li class="bookDetail_reviewAll_content">
										<p>${bookDto.review_content}</p><br/>
										<span>${bookDto.member_id}</span>&nbsp;&nbsp;
										<span><fmt:formatDate value="${bookDto.review_date}" pattern="YYYY.MM.dd"/></span>
									</li>
									
								</ul>
							</c:if>
							<!-- 새로운/기존 댓글출력 끝 -->								
						</div>
						<!-- 회원리뷰 끝 -->
						</div>
					</div>

				</div>
			</div>
		</div>
	</form>
	<!-- 도서 상세보기 끝 -->
</body>
</html>