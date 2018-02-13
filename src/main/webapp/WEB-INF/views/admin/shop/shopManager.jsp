<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>관리자모드</title>

<c:set var="root" value="${pageContext.request.contextPath }"/>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script type="text/javascript" src="${root }/jquery.js"></script> 
<link rel="stylesheet" type="text/css" href="${root }/css/commons/main.css">
<link rel="stylesheet" type="text/css" href="${root }/css/shop/shopManager.css">
<script type="text/javascript" src="${root }/jquery/jquery.js"></script> 
</head>   
<script type="text/javascript"> 
	
	function readURL(input){ 
		if(input.files&&input.files[0]){ 
			var reader=new FileReader(); 
			reader.onload=function(e){ 
				$("#imgFrame").attr("src", e.target.result); 
			} 
			reader.readAsDataURL(input.files[0]); 
		} 
	} 
	
	$(function(){
		$(".nav-item:eq(5)").addClass("active");
	});
	
</script>
<body>
	<!-- 타이틀메뉴 시작 -->
	<div class="all">
		<jsp:include page="../commons/header_menu.jsp"></jsp:include>
		<!-- wrap시작 -->
			<div class="wrap">
				<div class="content_wrap">
					<div class="content_title">영업점관리</div>
					
					<div class="content">
						<ul>
							<li class="content_part content_part_move1">
							<div class="content_wrap_body_left">
								
								<div class="content_box">
									<ul class="content_box1">
										<li class="content_box_title">영업점조회</li>
										<li class="">
											<form class="form-horizontal">
											  <fieldset>
											  
											    <div class="form-group">											      
											      <div class="col-lg-10">											      											      							 
											        <input type="text" class="form-control input_width" id="inputShopName" placeholder="영업점명">											        
											      </div>
											    </div>
											    								  
											    <div class="form-group" align="center">
											      <div class="col-lg-10 col-lg-offset-2 col-lg-margin-left">
											        <button type="submit" class="btn btn-primary">조회</button>
											        <button type="reset" class="btn btn-default">취소</button>
											      </div>
											    </div>
											  </fieldset>
											</form>
										</li>
									</ul>									
								</div>
								
								<div class="content_middle_line_w content_middle_line_w_move1"></div>
								
								<div class="mapInfo1">
									<ul>
										<!-- 영업점지도정보 추가-->
										<li class="content_box_title">영업점지도정보</li>
										<li><img src="${root }/img/map/yeoksam.PNG" alt="지도내용" style="width:300px; height:250px"></li>
																							
										<li class="medium_title">
											<label class="title_name">위도</label>
											<input type="text" class="form-control" id="input" placeholder="37.499294">
										</li>	
																																
										<li class="medium_title">
											<label class="title_name">경도</label>
											<input type="text" class="form-control" id="input" placeholder="127.0309996">
										</li>
									
									</ul>								
								</div>
								
								
							</div>
							</li>
						
						<!-- 	<li>
								<div class="content_middle_line_h content_middle_line_h_move1"></div>
							</li> -->
							<li class="content_part content_part_move1">
								<div class="content_wrap_body_right">
									
									<div class="content_box">					
										<ul class="content_box2 content_box2_margin">
											<li class="content_box_title" id="box3_width">고객주문내역</li>						
										</ul>
									</div>
									
									
									<!--  -->
									<div class="content_box3_form" align="center">
										<form class="content_box3_formtag">	
											<ul class="content_box3">					
												<li class="content_li">
													<span class="content_title_name">영업점명</span>
													<input type="text" class="form-control" id="inputBookName" placeholder="역삼점">
												</li>		
												<li class="content_li">
													<span class="content_title_name">우편번호</span>
													<input type="text" class="form-control" id="inputPost" placeholder="06235">
												</li>
												<li class="content_li">
													<span class="content_title_name">주소</span>
													<input type="text" class="form-control" id="inputAddr" placeholder="서울시 강남구 역삼1동">
												</li>
												<li class="content_li">
													<span class="content_title_name">상세주소</span>
													<input type="text" class="form-control" id="inputDetailAddr" placeholder="테헤란로 132 한독빌딩 8층">
												</li>
												<li class="content_li">
													<span class="content_title_name">전화번호</span>
													<input type="text" class="form-control" id="inputCall" placeholder="02-1234-5678">
												</li>	
												<li class="content_li">
													<span class="content_title_name">영업시간</span>
													<input type="text" class="form-control" id="inputTime" placeholder="오전 09시 30분 - 오후 10시 00분">
												</li>	
												<li class="content_li">
													<span class="content_title_name">오시는길</span>
													<textarea class="form-control" rows="3" id="textArea" placeholder="지하철 이용:역삼역 2호선 3번출구, 버스 이용시 지선버스:3217 간선버스:146, 242, 402, 421, 471 직행버스 1005-1"></textarea>
												</li>																														
											</ul>
											
											<!-- 환불, 교환, 반품-->
										    <div class="form-group btn-margin" align="center">
											      <div class="col-lg-10 col-lg-offset-2 col-lg-margin-left" id="btn-margin">
												        <button type="button" class="btn btn-default" id="">추가</button>
												        <button type="button" class="btn btn-default" id="">수정</button>
												        <button type="button" class="btn btn-default" id="">취소</button>
												        <button type="button" class="btn btn-default" id="">삭제</button>
											      </div>
										    </div>
										</form>		
									</div>							
									<!--  -->			
												
									</div>									
								</li>								
						</ul>
					</div><!-- content -->
					
				</div>
			</div>
		<!-- wrap 끝 -->
    </div>
</body>
</html>