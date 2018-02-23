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
<script type="text/javascript">
	$(function(){
		// 컴퓨터/IT & 소설 & 취미/여행 각각의 도서목록 리스트에서 도서 클릭시 HOME > 뒤에 내용이 바뀌어야함
		
		
/* 		$(".bookDetail_select span:eq(1)").replaceWith("<span><a href='${root}/view/bookList/book_list_hobby_trip.jsp'>취미 / 여행 </a>></span>");
		$(".bookDetail_select span:eq(2)").replaceWith("<span> 취미일반</span>"); */
	});
</script>
</head>
<body>
	<!-- 도서 상세보기 시작 강민아-->
	<form action="">
		<div id="bookDetail_all">
		
			<div class="bookDetails">
				<div class="bookDetail">
					<!-- 도서분류 시작 -->
					<div class="bookDetail_select">
						<span>HOME ></span> <span><a href="${root}/book/list/computer.do">컴퓨터 / IT </a>></span><span>&nbsp;프로그래밍</span>
						<%-- <span>HOME ></span> <span><a href="${root}/book/list/hobby_trip.do">취미 / 여행 </a>></span><span>&nbsp;프로그래밍</span>
						<span>HOME ></span> <span><a href="${root}/book/list/nov
						el.do">소설&nbsp;</a>></span><span>&nbsp;프로그래밍</span>
						
					 --%></div>
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
													src="${root}/img/book/computer_com_05.jpg" />
												</span>
											</div>
										</div>
									</div>
								</div>

								<div class="bookDetail_info">
									<div class="bookDetail_title">
										<div class="bookDetail_title_inner">
											<p>모두의 엔트리 with 엔트리파이선</p>
										</div>
									</div>
									<div class="bookDetail_author">
										김슬기, 김성훈, 곽혜미<span>&nbsp;저</span>
									</div>
									<span>출판사</span>&nbsp;|&nbsp;<span>출간정보</span>

									<div class="bookDetail_star">
										<div>
											<span class="bookDetail_list_star"></span>
											<p class="bookDetail_rank_user">4.7</p>
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
											<div class="bookDetail_one">판매가</div>
											<div class="bookDetail_two">
												<span>12,150원</span>
											</div>
										</div>
										<div class="bookDetail_point">
											<div class="bookDetail_one">포인트</div>
											<div class="bookDetail_two">
												<span>10% 적립</span>
											</div>
										</div>
										<div class="bookDetail_delivery">
											<div class="bookDetail_one">배송료</div>
											<div class="bookDetail_two">무료배송</div>
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
							<div>컴퓨터 과학의 개념을 이해하고 코딩할 수 있다!컴퓨터 과학의 개념을 이해하고 코딩할 수 있다! 컴퓨터 과학의 개념을 이해하고 코딩할 수 있다! 컴퓨터 과학의 개념을 이해하고 코딩할 수 있다!  </div>
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
									이 책은 이제 막 소프트웨어(SW) 교육을 시작하는 초등학교 고학년부터 중·고등학생, 컴퓨터를 전공하지 않은
									대학생, 취미로 코딩을 배우고 싶은 직장인, SW 교육에 관심이 있는 선생님이나 부모님을 대상으로 합니다.
									엔트리를 처음 접하는 사람도 쉽게 따라 할 수 있도록 차근차근 설명하였습니다. 또한 ‘엔트리파이선’ 모드를 활용해
									파이썬 언어를 익힐 수 있게 구성해서 블록 코딩에서 텍스트 코딩으로 넘어가려는 사람에게 징검다리 역할을 할 수
									있습니다. 
								</div>
							</div>
						
						<!-- 도서 책소개 끝 -->
						<!-- 도서 목차 소개 시작 -->
						<div class="bookDetail_intro bookDetail_second_page">
						<h3>목차</h3>
							<div>
								[첫째 마당] 엔트리 기초 <br>Day 01. 엔트리 시작하기 <br>Day 02. 순서대로
								실행되는 명령어, 순차 <br>Day 03. 정보를 담는 그릇, 변수 <br>Day 04.
								컴퓨터가 가장 잘하는 반복 <br>Day 05. 상황에 따라 다른 명령어를 실행하는 선택 <br>Day
								06. 명령어를 시작하는 방아쇠, 이벤트 <br>Day 07. 특정 기능을 하며 언제든 다시 사용할 수
								있는 함수 <br>Day 08. 정보를 저장하는 책꽂이, 함수 <br>
							</div>
						</div>
						<!-- 도서 목차 소개 끝 -->
						<!-- 도서 저자 소개 시작 -->
						<div class="bookDetail_intro bookDetail_author_intro">
							<h3>저자소개</h3>
							<div class="bookDetail_intro bookDetail_author_intro_text">
								김슬기 <br> <br>저자소개 <br>즐거운 소프트웨어 교육을 학생들과 함께 나누기
								위해 노력하는 현직 교사입니다. 모든 사람의 컴퓨팅 사고력 향상을 위해 다양한 교육 자료를 개발하고 폭넓은 활동을
								하고 있습니다.
							</div>
						</div>
						<!-- 도서 저자 소개 끝 -->
						<!-- 책 속한문장 시작 -->
						<div class="bookDetail_intro bookDetail_one_content">
						<h3>출판사리뷰</h3>
							<div>
								[첫째 마당] 엔트리 기초 <br>Day 01. 엔트리 시작하기 <br>Day 02. 순서대로
								실행되는 명령어, 순차 <br>Day 03. 정보를 담는 그릇, 변수 <br>Day 04.
								컴퓨터가 가장 잘하는 반복 
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
										<p>아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아아</p><br/>
										<span>아이디</span>&nbsp;&nbsp;
										<span>등록일</span>
									</li>
									
								</ul>
							
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