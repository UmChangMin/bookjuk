<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<c:set var="root" value="${pageContext.request.contextPath}" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="${root}/css/main/shop.css" />
<link rel="stylesheet" type="text/css" href="${root}/css/template/basic.css" />
<link rel="stylesheet" type="text/css" href="${root}/jqueryUI/jquery-ui.css">
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="${root}/jqueryUI/jquery-ui.js"></script>
<script type="text/javascript" src="${root}/js/main/shop.js"></script>
<title>영업점 안내</title>
</head>
<body>
<div class="Shop">
	<div class="Shop_top">
	<div class="Shop_inner">
	<!-- 영업점 타이틀 시작 -->
	<div class="Shop_title">
		<div class="Shop_titleinner">영업점안내</div>
	</div>
	<!-- 타이틀 끝 -->
	<!-- 영업점 서브타이틀 시작 -->
	<div id="tabs"><!-- tabs자식으로 (ul,li,a전부) for문 돌려야합니다 -->
		<ul>
			<li><a href="#tabs-1">역삼점</a></li>
			<li><a href="#tabs-2">광화문점</a></li>
			<li><a href="#tabs-3">잠실점</a></li>
			<li><a href="#tabs-4">목동점</a></li>
			<li><a href="#tabs-5">영등포점</a></li>
		</ul>
		<!-- 영업점 서브타이틀 끝  -->

		<!-- 	지도,영업점 정보 시작 -->
		<div id="tabs-1">
			<div class="Shop_Maps_box">
				<div class="Shop_Maps">
					<div id="map1"></div>
<!-- 					<script>
						var map;
						function initMap() {
							var location = {
								lat : 37.512089,
								lng : 127.023614
							}, map = new google.maps.Map(document
									.getElementById('map1'), {
								center : location,
								zoom : 15
							});

							var marker = new google.maps.Marker({
								position : location,
								map : map,
								title : '북적북적 역삼점'
							});
						}
					</script>
					<script
						src="https://maps.googleapis.com/maps/api/js?key=AIzaSyA3SjKlJrlOkNAnBvLK5EYrcuUKx-NeCQ4&callback=initMap"
						async defer></script> -->
				</div>
				<div class="Shop_Maps_text">
					<h3 class="Shop_Maps_text_h3">북적북적 역삼점</h3>
					<p>
						전화번호 : 1234-5678<br /> 팩스 : 0123-456-7890<br /> 영업시간 : 9:30 ~
						22:00<br /> 정기휴일 : 설(당일), 추석(당일)<br /> <br /> 주소 : 서울특별시 서초구
						강남대로 465 태우타워 지하1,2층
					</p>
				</div>
				<div class="Shop_Maps_directions">
					<h3 class="Shop_Maps_directions_h3">오시는길</h3>
					<br />

					<p class="Shop_Maps_directions_p">
						지하철 이용시 &nbsp; 지하철 2, 8호선 잠실역 8번 출구(지하도에서 바로 연결)<br /> <br />
						버스이용시<br /> 지선버스 : 3217, 3313, 3314, 3315, 3317, 3411,3414, 4319<br />
						광역버스 : 1007-1, 1100, 1700, 2000, 6900, 7007, 8001<br /> 간선버스 :
						301, 341, 360,362<br /> 공항버스 : 6000, 6006, 6705, 6706A
					</p>
				</div>
			</div>
			<!-- 	지도,영업점 정보 끝 -->
		</div>

		<div id="tabs-2">
	<!-- 	지도,영업점 정보 시작 -->
			<div class="Shop_Maps_box">
				<div class="Shop_Maps">
					<div id="map2"></div>
<!-- 					<script>
						var map;
						function initMap() {
							var location = {
								lat : 37.571408,
								lng : 127.977830
							}, map = new google.maps.Map(document
									.getElementById('map2'), {
								center : location,
								zoom : 15
							});

							var marker = new google.maps.Marker({
								position : location,
								map : map,
								title : '북적북적 광화문점'
							});
						}
					</script>
					<script
						src="https://maps.googleapis.com/maps/api/js?key=AIzaSyA3SjKlJrlOkNAnBvLK5EYrcuUKx-NeCQ4&callback=initMap"
						async defer></script> -->
				</div>
				<div class="Shop_Maps_text">
					<h3 class="Shop_Maps_text_h3">북적북적 광화문점</h3>
					<p>
						전화번호 : 1544-1900<br /> 팩스 : 0502-987-5739<br /> 영업시간 : 9:30 ~
						22:00<br /> 정기휴일 : 설(당일), 추석(당일)<br /> <br /> 주소 : 서울특별시 종로구 종로1.2.3.4가동 종로 １민아타워1층
					</p>
				</div>
				<div class="Shop_Maps_directions">
					<h3 class="Shop_Maps_directions_h3">오시는길</h3>
					<br />

					<p class="Shop_Maps_directions_p">
						지하철 이용시 &nbsp;지하철 5 호선 광화문역 하차 민아 빌딩 방향으로 직접 연결 되어 있습니다. <br /><br />
						버스이용시<br /> 지선버스 : 0015(남산방향), 0212, 1011, 1012, 1020, 7012, 7018<br />
						광역버스 : 9703, 9704, 9711, 9712<br /> 간선버스 : 162, 606
						301, 341, 360,362<br /> 공항버스 :  1노선(시청), 601, 605
					</p>
				</div>
			</div>
			<!-- 	지도,영업점 정보 끝 -->		
		</div>
		
		<div id="tabs-3">
			<div class="Shop_Maps_box">
				<div class="Shop_Maps">
					<div id="map"></div>
<!-- 					<script>
						var map;
						function initMap() {
							var location = {
								lat : 37.571408,
								lng : 127.977830
							}, map2 = new google.maps.Map(document
									.getElementById('map'), {
								center : location,
								zoom : 15
							});

							var marker = new google.maps.Marker({
								position : location,
								map : map2,
								title : '북적북적 잠실점'
							});
						}
					</script>
					<script
						src="https://maps.googleapis.com/maps/api/js?key=AIzaSyA3SjKlJrlOkNAnBvLK5EYrcuUKx-NeCQ4&callback=initMap"
						async defer></script> -->
				</div>
				<div class="Shop_Maps_text">
					<h3 class="Shop_Maps_text_h3">북적북적 잠실점</h3>
					<p>
						전화번호 : 1544-1900<br /> 팩스 :  0502-987-5747<br /> 영업시간 : 9:30 ~
						22:00<br /> 정기휴일 : 설(당일), 추석(당일)<br /> <br /> 주소 : 서울특별시 송파구 올림픽로 269 단비캐슬 지하1층
					</p>
				</div>
				<div class="Shop_Maps_directions">
					<h3 class="Shop_Maps_directions_h3">오시는길</h3>
					<br />

					<p class="Shop_Maps_directions_p">
						지하철 이용시 &nbsp; 지하철 2, 8호선잠실역 하차 2호선 8번 출구, 8호선 9번 출구 약 30m 가량소요<br />  <br />
						버스이용시<br /> 지선버스 : 2225번, 2311번, 2412번, 3313번, 3412번, 3413번, 3414번, 3415번<br />
						광역버스 : 9202번, 9203번, 9403번<br /> 간선버스 :301번, 302번, 303번, 360번, 361번, 362번, 730번
						<br /> 공항버스 :600번, 606번
					</p>
				</div>
			</div>
			<!-- 	지도,영업점 정보 끝 -->
		</div>
		
		<div id="tabs-4">
			<div class="Shop_Maps_box">
				<div class="Shop_Maps">
					<div id="map"></div>
<!-- 					<script>
						var map;
						function initMap() {
							var location = {
								lat : 37.571408,
								lng : 127.977830
							}, map = new google.maps.Map(document
									.getElementById('map'), {
								center : location,
								zoom : 15
							});

							var marker = new google.maps.Marker({
								position : location,
								map : map,
								title : '북적북적 광화문점'
							});
						}
					</script>
					<script
						src="https://maps.googleapis.com/maps/api/js?key=AIzaSyA3SjKlJrlOkNAnBvLK5EYrcuUKx-NeCQ4&callback=initMap"
						async defer></script> -->
				</div>
				<div class="Shop_Maps_text">
					<h3 class="Shop_Maps_text_h3">북적북적 목동점</h3>
					<p>
						전화번호 : 1544-1900<br /> 팩스 : 0502-987-5757<br /> 영업시간 : 9:30 ~
						22:00<br /> 정기휴일 : 설(당일), 추석(당일)<br /> <br /> 주소 :  서울특별시 양천구 목동서로 159-1  UCM지하 1층
					</p>
				</div>
				<div class="Shop_Maps_directions">
					<h3 class="Shop_Maps_directions_h3">오시는길</h3>
					<br />

					<p class="Shop_Maps_directions_p">
						지하철 이용시 &nbsp; 지하철 5호선 오목교역 하차 CBS (현대백화점방면 2번 출구)<br /> <br />
						버스이용시<br /> 지선버스 : 5012, 5616, 6211, 6624, 6628,,6629, 6630, 6638, 6648<br /> 간선버스 : 640, 650, 571, 603
						301, 341, 360,362<br /> 
					</p>
				</div>
			</div>
			<!-- 	지도,영업점 정보 끝 -->
		</div>
		
		<div id="tabs-5">
			<div class="Shop_Maps_box">
				<div class="Shop_Maps">
					<div id="map"></div>
<!-- 					<script>
						var map;
						function initMap() {
							var location = {
								lat : 37.571408,
								lng : 127.977830
							}, map = new google.maps.Map(document
									.getElementById('map'), {
								center : location,
								zoom : 15
							});

							var marker = new google.maps.Marker({
								position : location,
								map : map,
								title : '북적북적 영등포점 '
							});
						}
					</script>
					<script
						src="https://maps.googleapis.com/maps/api/js?key=AIzaSyA3SjKlJrlOkNAnBvLK5EYrcuUKx-NeCQ4&callback=initMap"
						async defer></script>  -->
				</div>
				<div class="Shop_Maps_text">
					<h3 class="Shop_Maps_text_h3">북적북적 영등포점</h3>
					<p>
						전화번호 : 1544-1900<br /> 팩스 : 0502-987-5760<br /> 영업시간 : 9:30 ~
						22:00<br /> 정기휴일 : 설(당일), 추석(당일)<br /> <br /> 주소 : 서울특별시 영등포구 영중로 15 DB스퀘어 멀티플렉스 2층
					</p>
				</div>
				<div class="Shop_Maps_directions">
					<h3 class="Shop_Maps_directions_h3">오시는길</h3>
					<br />

					<p class="Shop_Maps_directions_p">
						지하철 이용시 &nbsp; 1호선 영등포역 5번 출구 지하상가 2번 출구 도보 5분<br /><br />
						버스이용시<br /> 지선버스 : 5012번, 5614번, 5616번, 6630번, 6637번, 6638번, 6640번, 6654번<br />
						광역버스 : 2400번, 2500번, 9408번, 9707번<br /> 간선버스 :  160번, 260번, 361번, 462번, 503번, 600번, 605번, 661번, 760번
						<br /> 공항버스 : 301번, 608번
					</p>
				</div>
			</div>
			<!-- 	지도,영업점 정보 끝 -->
		</div>
	</div>
	</div>
	</div>
</div>
</body>
</html>