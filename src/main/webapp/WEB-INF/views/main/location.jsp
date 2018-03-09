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

 <script type="text/javascript" src="${root}/js/main/location.js"></script>
<script type="text/javascript" src="${root}/js/xhr.js"></script>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyD25O8wV5lCcHiyQlb3LedFnvFhdY8TtNY&callback=initMap"async defer></script>
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
							<c:set var="i" value="1" />
							<c:forEach items="${locationDtoList}" var="list">
								<button type="button"  class="btn" >${list.location_name}	</button>	
								<c:set var="i" value="${i+1}" />				
							</c:forEach>
						</ul>
					</div>
					<!-- 영업점 서브타이틀 끝  -->

					<!-- 	지도,영업점 정보 시작 -->
					<c:set var="i" value="1" />
					<c:forEach items="${locationDtoList}" var="list">
						<div id="tabs-${i}" class="map_content" style="display: none">
							<div class="location_Maps_box">
								<div class="location_Maps">
													
									<div id="map">
										<script>
									var map;
									function initMap() {
										var location = {
											lat : ${list.location_lat},
											lng : ${list.location_lng}
										}, map = new google.maps.Map(document
												.getElementById('map'), {
											center : location,
											zoom : 15
										});
			
										var marker = new google.maps.Marker({
											position : location,
											map : map,
											title : '북적북적 ${list.location_name}점'
										});
									}
					</script>
									</div>
	
								</div>
								<div class="location_Maps_text">
									<h3 class="location_Maps_text_h3">${list.location_name}</h3>
									<div class="location_information">
										전화번호 : ${list.location_call}<br /> 
										팩스 : ${list.location_fax}<br /> 
										영업시간 : ${list.location_hour}<br /> 
										주소 : ${list.location_addr}&nbsp;${list.location_addr_detail}
									</div>
								</div>
								<div class="location_Maps_directions">
									<h3 class="location_Maps_directions_h3">오시는길</h3>
									<br />
	
									<div class="location_Maps_directions_p">
										${list.location_comming} 
									</div>
								</div>
							</div>
						</div>
						<c:set var="i" value="${i+1}" />
					</c:forEach>
				</div>
			</div>
		</div>
	</div>	
</body>
</html>