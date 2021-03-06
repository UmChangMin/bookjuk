<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="initial-scale=1.0">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>관리자모드</title>

<c:set var="root" value="${pageContext.request.contextPath }"/>
<link rel="stylesheet" type="text/css" href="${root }/css/admin/commons/main.css">
<link rel="stylesheet" type="text/css" href="${root }/css/admin/location/locationManager_input.css">
<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDT8UWioePDnrx76CcuMrV_2M1FfUY9j0w&callback=initMap" async defer></script>  
<script type="text/javascript" src="${root}/js/xhr.js"></script>
<script type="text/javascript" src="${root}/js/admin/location.js"></script>

</head>   
<body>
	<!-- 타이틀메뉴 시작 -->
	<div class="all">
		
		<!-- wrap시작 -->
			<div class="wrap">
				<div class="content_wrap">
					<div class="content_title">영업점관리</div>
					
					<div class="content">
						<form class="content_box3_formtag" action="locationManager_inputOk.do" method="get" name="location_Info">	
						<ul>
							<li class="content_part content_part_move1">
							<div class="content_wrap_body_left">
								
								<div class="mapInfo1">
									<ul>
										<!-- 영업점지도정보 추가-->
										<li class="content_box_title">영업점지도정보</li>
										<%-- <img src="${root }/img/map/yeoksam.PNG" alt="지도내용" > --%>
										<li>
											<div id="img_area" style="width:300px; height:250px;"></div>
										</li>
																							
										<li class="medium_title">
											<label class="title_name">위도</label>
											<input type="text" class="form-control" id="input_lat" name="location_lat">
										</li>	
																																
										<li class="medium_title">
											<label class="title_name">경도</label>
											<input type="text" class="form-control" id="input_lng" name="location_lng">
										</li>										
									</ul>								
								</div>
							</div>
							</li>

							<li class="content_part content_part_move1">
								<div class="content_wrap_body_right">
									
									<div class="content_box">					
										<ul class="content_box2 content_box2_margin">
											<li class="content_box_title" id="box3_width">고객주문내역</li>						
										</ul>
									</div>
									
									
									<!--  -->
									<div class="content_box3_form" align="center">
										
											<ul class="content_box3">					
												<li class="content_li">
													<span class="content_title_name">영업점명</span>
													<input type="text" class="form-control" id="inputlocationName" name="location_name">
												</li>		
												<li class="content_li">
													<span class="content_title_name">우편번호</span>
													<input type="text" class="form-control" id="inputPost" name="location_postcode">
													<input type="button" class="btn btn-primary" id="Post_btn" onclick="goPopup('${root}')" value="주소검색">
													
												</li>
												<li class="content_li">
													<span class="content_title_name">주소</span>
													<input type="text" class="form-control" id="inputAddr" name="location_addr">	
												</li>
												<li class="content_li">
													<span class="content_title_name">상세주소</span>
													<input type="text" class="form-control" id="inputAddr_detail" name="location_addr_detail" placeholder="상세주소 입력 후 '지도' 버튼 클릭">
													<input type="button" class="btn btn-primary" id="input_map" onclick="" value="지도">													
												</li>
												<li class="content_li">
													<span class="content_title_name">전화번호</span>
													<input type="text" class="form-control" id="inputCall" name="location_call">
												</li>
												<li class="content_li">
													<span class="content_title_name">팩스번호</span>
													<input type="text" class="form-control" id="inputFax" name="location_fax">
												</li>		
												<li class="content_li">
													<span class="content_title_name">영업시간</span>
													<input type="text" class="form-control" id="inputTime" name="location_hour">
												</li>	
												<li class="content_li">
													<span class="content_title_name">오시는길</span>
													<textarea class="form-control" rows="3" id="textArea" name="location_comming"></textarea>
												</li>																														
											</ul>
									</div>							
									<div align="center" id="btn-margin-top">
										<button type="submit" class="btn btn-primary" id="">완료</button>
						        		<button type="reset" class="btn btn-default" id="">취소</button>
					        		</div>
									<!--  -->			
												
									</div>									
								</li>								
							</ul>
						<!-- 환불, 교환, 반품-->
											      	
							        

					</form>		
					</div><!-- content -->
					
				</div>
			</div>
		<!-- wrap 끝 -->
    </div>
</body>
</html>