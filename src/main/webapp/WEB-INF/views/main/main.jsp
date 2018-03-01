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
			<div class="main_md_box">
				<div class="main_md_view" style="display: block;">
					<ul class="main_md_list">
						<li>
							<div class="main_md_synthesis">
								<a href="${root}/book/list/detail.do"><img alt="책사진"
									src="http://image.kyobobook.co.kr/images/book/xlarge/125/x9791195522125.jpg"></a>
								<p class="main_md_title">
									<a href="${root}/book/list/detail.do">언어의 온도</a><br /> <a href="${root}/book/list/detail.do">이기주</a>
								</p>
							</div>
							<div class="main_md_text">
								<p class="main_md_p">말과 글에는 나름의 온도가 있다.</p>
								<p class="main_md_p2">언어에는 따뜻함과 차가움, 적당한 온기 등 나름의 온도가 있다.
									세상살이에 지칠 때 어떤 이는 친구와 이야기를 주고받으며 고민을 털기도 하고, 어떤 이는 책을 읽으며 작가가
									건네는 문장으로 위안을 얻는다. 이렇듯 ‘언어’는 한순간 나의 마음을 꽁꽁 얼리기도, 그 꽁꽁 얼어붙었던 마음을
									녹여주기도 한다. 『언어의 온도』의 저자 이기주는 엿듣고 기록하는 일을 즐겨 하는 사람이다. 그는 버스나
									지하철에 몸을 실으면 몹쓸 버릇이 발동한다고 고백한다. 이 책은 저자가 일상에서 발견한 의미 있는 말과 글,
									단어의 어원과 유래, 그런 언어가 지닌 소중함과 절실함을 농밀하게 담아낸 것이다.섬세한 것은 대개 아름답다.
									그리고 예민하다. 우리말이 대표적이다. 한글은 점 하나, 조사 하나로 문장의 결이 달라진다. 친구를 앞에 두고
									“넌 얼굴도 예뻐” 하려다 실수로 “넌 얼굴만 예뻐”라고 말하는 순간, 서로 얼굴을 붉히게 된다.말과 글에는
									나름의 온도가 있다. 따뜻함과 차가움의 정도가 저마다 다르다. 적당히 온기 있는 언어는 슬픔을 감싸 안아준다.
									세상살이에 지칠 때 어떤 이는 친구와 이야기를 주고받으며 고민을 털어내고, 어떤 이는 책을 읽으며 작가가 건네는
									문장에서 위안을 얻는다. 용광로처럼 뜨거운 언어에는 감정이 잔뜩 실리기 마련이다. 말하는 사람은 시원할지 몰라도
									듣는 사람은 정서적 화상(火傷)을 입을 수 있다. 얼음장같이 차가운 표현도 위태롭기는 마찬가지. 상대의 마음을
									돌려세우기는커녕 꽁꽁 얼어붙게 한다.</p>
							</div>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<!-- md추천 끝 -->
		<!-- MD추천 시작 2-->
		<div class="main_md">
			<div class="main_md_box">
				<div class="main_md_view" style="display: block;">
					<ul class="main_md_list">
						<li>
							<div class="main_md_synthesis">
								<a href="#"><img alt="책사진"
									src="http://image.kyobobook.co.kr/images/book/xlarge/125/x9791195522125.jpg"></a>
								<p class="main_md_title">
									<a href="#">언어의 온도</a><br /> <a href="#">이기주</a>
								</p>
							</div>
							<div class="main_md_text">
								<p class="main_md_p">말과 글에는 나름의 온도가 있다.</p>
								<p class="main_md_p2">언어에는 따뜻함과 차가움, 적당한 온기 등 나름의 온도가 있다.
									세상살이에 지칠 때 어떤 이는 친구와 이야기를 주고받으며 고민을 털기도 하고, 어떤 이는 책을 읽으며 작가가
									건네는 문장으로 위안을 얻는다. 이렇듯 ‘언어’는 한순간 나의 마음을 꽁꽁 얼리기도, 그 꽁꽁 얼어붙었던 마음을
									녹여주기도 한다. 『언어의 온도』의 저자 이기주는 엿듣고 기록하는 일을 즐겨 하는 사람이다. 그는 버스나
									지하철에 몸을 실으면 몹쓸 버릇이 발동한다고 고백한다. 이 책은 저자가 일상에서 발견한 의미 있는 말과 글,
									단어의 어원과 유래, 그런 언어가 지닌 소중함과 절실함을 농밀하게 담아낸 것이다.섬세한 것은 대개 아름답다.
									그리고 예민하다. 우리말이 대표적이다. 한글은 점 하나, 조사 하나로 문장의 결이 달라진다. 친구를 앞에 두고
									“넌 얼굴도 예뻐” 하려다 실수로 “넌 얼굴만 예뻐”라고 말하는 순간, 서로 얼굴을 붉히게 된다.말과 글에는
									나름의 온도가 있다. 따뜻함과 차가움의 정도가 저마다 다르다. 적당히 온기 있는 언어는 슬픔을 감싸 안아준다.
									세상살이에 지칠 때 어떤 이는 친구와 이야기를 주고받으며 고민을 털어내고, 어떤 이는 책을 읽으며 작가가 건네는
									문장에서 위안을 얻는다. 용광로처럼 뜨거운 언어에는 감정이 잔뜩 실리기 마련이다. 말하는 사람은 시원할지 몰라도
									듣는 사람은 정서적 화상(火傷)을 입을 수 있다. 얼음장같이 차가운 표현도 위태롭기는 마찬가지. 상대의 마음을
									돌려세우기는커녕 꽁꽁 얼어붙게 한다.</p>
							</div>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<!-- md추천 끝 -->
	</div>
</div>
</body>
</html>