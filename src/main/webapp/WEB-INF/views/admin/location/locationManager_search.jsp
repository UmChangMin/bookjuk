<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>관리자모드</title>

<c:set var="root" value="${pageContext.request.contextPath }"/>
<link rel="stylesheet" type="text/css" href="${root }/css/admin/commons/main.css">
<link rel="stylesheet" type="text/css" href="${root }/css/admin/location/locationManager_search.css">
<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>

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
	
	/*18/02/22-추가해야할 내용 데이터베이스의 영업점 개수만큼 option 생성하기  */
	var index="디비연동인데";
	
	
	
</script>
<body>
	<!-- 타이틀메뉴 시작 -->
	<div class="all">
		
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
											<form class="form-horizontal" action="locationManager.do">
											  <fieldset>
											  
											    <div class="form-group" align="center">											      
											      <div class="col-lg-10">											      								
												      <select class="form-control input_width" id="select" name="location">
												      <c:forEach var="locationList" items="${locationList }">
												      	<option value="${location_name }">${location_name}</option>
												      </c:forEach>
											           <!-- <option value="역삼점">역삼</option>
											           <option value="잠실점">잠실</option>
											           <option value="본점">본점</option>		 -->									          									         
											        </select>			      							 											        											       
											      </div>
											    </div>
											    								  
											    <div class="form-group" align="center">
											      <div class="col-lg-10 col-lg-offset-2 col-lg-margin-left">
											        <button type="submit" class="btn btn-primary" id="selected">조회</button>
											        <button type="reset" class="btn btn-default">취소</button>
											        <button type="button" class="btn btn-default" onclick="location.href='locationManager_input.do'">추가</button>
											      </div>
											    </div>
											  </fieldset>
											</form>
										</li>
									</ul>									
								</div>
																				
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