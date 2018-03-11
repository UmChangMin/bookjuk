<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<c:set var="root" value="${pageContext.request.contextPath}" />
<head>
<meta name="viewport" content="initial-scale=1.0">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${root}/css/main/location.css" />
<link rel="stylesheet" type="text/css" href="${root}/css/template/basic.css" />
<script type="text/javascript" src="${root}/js/xhr.js"></script>
<title>영업점 안내</title>
</head>
<body>
	<div class="location">
		<div class="location_top">
			<div class="location_inner">
				<!-- 영업점 타이틀 시작 -->
				<div class="location_title">
					<div class="location_titleinner">영업점안내</div>
				</div>
				<!-- 타이틀 끝 -->
				<!-- 영업점 서브타이틀 시작 -->
				<div id="tabs">
					<!-- tabs자식으로 (ul,li,a전부) for문 돌려야합니다 -->
					<div class="tabs_top">
						<ul class="tabs_ul">
							<c:forEach var="lacationList" items="${locationDtoList}">
								<li><a href="${root}/location.do?location_num=${lacationList.location_num}" class="btn" style="color: white;">${lacationList.location_name}</a></li>
							</c:forEach>
						</ul>
					</div>
					<!-- 영업점 서브타이틀 끝  -->

					<!-- 지도,영업점 정보 시작 -->
					<div class="location_Maps_box">
						<div class="location_Maps">
							<div id="map">
								<script type="text/javascript">
									function initMap() {
								    var location = {lat: ${locationDto.location_lat}, lng: ${locationDto.location_lng}}
								    var map = new google.maps.Map(document.getElementById('map'), {
								      zoom: 15,
								      center: location
								    });
								    var marker = new google.maps.Marker({
								      position: location,
								      map: map,
								      title : '북적북적 ${locationDto.location_name}점'
								    });
								  }
								</script>
								<script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAOzBNCkRmPV1wSp-vdTC1SdXCMAY7chKw&callback=initMap"></script>
							</div>
						</div>
						<div class="location_Maps_text">
							<h3 class="location_Maps_text_h3">${locationDto.location_name}점</h3>
							<div>
								전화번호 : ${locationDto.location_call}<br /> 
								팩스 : ${locationDto.location_fax}<br /> 
								영업시간 : ${locationDto.location_hour}<br /> 
								주소 : ${locationDto.location_addr}&nbsp;${locationDto.location_addr_detail}
							</div>
						</div>
						<div class="location_Maps_text">
							<h3 class="location_Maps_text_h3">오시는길</h3>
							<br />

							<div class="location_Maps_directions_p">
								${locationDto.location_comming}
							</div>
						</div>
					</div>
					<!-- 지도,영업점 정보 끝 -->
				</div>
			</div>
		</div>
	</div>
</body>
</html>