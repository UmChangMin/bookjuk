<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<head>



<title>영업점 안내</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="initial-scale=1.0">
<link rel="stylesheet" type="text/css"href="${root}/css/template/basic.css" />
<link rel="stylesheet" type="text/css"href="${root}/css/main/shop.css" />
<link rel="stylesheet" type="text/css" href="${root}/jqueryUI/jquery-ui.css">
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<script type="text/javascript" src="${root}/jqueryUI/jquery-ui.js"></script>
<script type="text/javascript">
	$(function(){
		$(".Shop_subtitle_ul li").click(function (){
			$(".Shop_Maps_box").show();
		});
		/* JQUERY 미완성 디비 붙이면 시작 */
	});
</script>
    <style>
      #map {
		width: 500px;
		height: 350px;
      }
      html, body {
        height: 100%;
        margin: 0;
        padding: 0;
      }
    </style>

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
				<div class="Shop_subtitle">
					<ul class="Shop_subtitle_ul">
						<li class="Shop_subtitle_li"><a href="#">강남점</a></li>
						<li><a href="#">명동점</a></li>
						<li><a href="#">홍대점</a></li>
						<li><a href="#">건대점</a></li>
						<li><a href="#">코엑스점</a></li>
					</ul>
				</div>
				<!-- 영업점 서브타이틀 끝  -->
				
			<!-- 	지도,영업점 정보 시작 -->
				<div class="Shop_Maps_box">
					<div class="Shop_Maps">
						  <div id="map"></div>
							  <script>
								  var map;
								  function initMap() {
									var location ={lat:37.512089, lng:127.023614},
								     map = new google.maps.Map(document.getElementById('map'), {
								    center: location,
								      zoom: 15
								    });
									    
								    var marker = new google.maps.Marker({
								        position: location,
								        map: map,
								        title: '북적북적 강남점'
								      });
									  }
						</script>
					  <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyA3SjKlJrlOkNAnBvLK5EYrcuUKx-NeCQ4&callback=initMap"
					  async defer></script>
					</div>
					
					<div class="Shop_Maps_text">
						<h3 class="Shop_Maps_text_h3">북적북적 강남점</h3>
						<p>
						       전화번호 : 1234-5678<br/>
						       팩스 : 0123-456-7890<br/>
						       영업시간 : 9:30 ~ 22:00<br/>
						       정기휴일 : 설(당일), 추석(당일)<br/><br/>
						 
						       주소 : 서울특별시 서초구
						       강남대로 465 태우타워
						       지하1,2층</p>	
					</div>
					<div class="Shop_Maps_directions">
						<h3 class="Shop_Maps_directions_h3">찾아오시는길</h3>  <br/>
 
							<p class="Shop_Maps_directions_p">지하철 이용시 &nbsp;	지하철 2, 8호선 잠실역 8번 출구(지하도에서 바로 연결)<br/><br/>
						 
							버스이용시<br/>
									지선버스 : 3217, 3313, 3314, 3315, 3317, 3411,3414, 4319<br/>
									광역버스 : 1007-1, 1100, 1700, 2000, 6900, 7007, 8001<br/>
									간선버스 : 301, 341, 360,362<br/>
									공항버스 : 6000, 6006, 6705, 6706A</p>
					</div>
				</div>				
				<!-- 	지도,영업점 정보 끝 -->

		</div>
	</div>
</div>

</body>
</html>