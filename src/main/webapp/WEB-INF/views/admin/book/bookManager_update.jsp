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
<link rel="stylesheet" type="text/css" href="${root }/css/admin/book/bookManager.css">
<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
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
		$(".nav-item:eq(3)").addClass("active");
	});
	
</script>

</head>   

<body>
	<!-- 타이틀메뉴 시작 -->
	<div class="all">	
		<!-- wrap시작 -->
			<div class="wrap">
				<div class="content_wrap">
					<div class="content_title">도서관리</div>
					
					<div class="content">
						<ul>
							<li class="content_part content_part_move1">
								<div class="content_wrap_body_right">
									
									<div class="content_box">					
										<ul class="content_box2 content_box2_margin">
											<li class="content_box_title" id="box3_width">도서정보</li>						
										</ul>
									</div>
									
									
									<!--  -->
									<div class="content_box3_form" align="center">
										<form class="content_box3_formtag">	
											<ul class="content_box3">					
												<li class="content_li">
													<span class="content_title_name">도서명</span>
													<input type="text" class="form-control" id="inputBookName" name="">
												</li>		
												<li class="content_li">
													<span class="content_title_name">출판사</span>
													<input type="text" class="form-control" id="inputPublisher" name="">
												</li>
												<li class="content_li">
													<span class="content_title_name">저자</span>
													<input type="text" class="form-control" id="inputAuthor" name="">
												</li>
												<li class="content_li">
													<span class="content_title_name">가격</span>
													<input type="text" class="form-control" id="inputPrice" name="">
												</li>
												<li class="content_li">
													<span class="content_title_name">분야</span>
													<input type="text" class="form-control" id="inputKind" name="">
												</li>
												<li class="content_li">
													<span class="content_title_name">이미지</span>
													<input type="file" class="form-control" id="inputImage" onchange="readURL(this);">
												</li>		
												<li class="c_orderlist_inputform_value">
													<div class="form-group" align="center">											      
												      <div class="imgLine">											      											      							 
												        <img id="imgFrame" src="#" alt="upload">											        
												      </div>
												    </div>												    
												</li>																						
											</ul>
																					
											<ul class="mapInfo1">
												<!-- 영업점지도정보 추가-->
												<li class="content_box_title">영업점별 가용재고</li>
																									
												<li class="medium_title">											
													<select class="form-control" id="select">
											           <option>역삼</option>
											           <option>잠실</option>									          
											        </select>
													<input type="text" class="form-control" id="input">
												</li>										
											</ul>								
											
											<!-- 환불, 교환, 반품-->
										    <div class="form-group btn-margin" align="center">
											      <div class="col-lg-10 col-lg-offset-2 col-lg-margin-left" id="btn-margin">
												        <button type="button" class="btn btn-default" id="">추가</button>												        
												        <button type="button" class="btn btn-default" id="">취소</button>
												        <button type="button" class="btn btn-default" id="">삭제</button>
											      </div>
										    </div>
										</form>		
									</div>							
									<!--  -->			
												
									</div>									
								</li>	
								<!--  -->																									
								</ul>
							</div>
						</div>
					<!--  -->
					</div>	
					
				</div>

		<!-- wrap 끝 -->

</body>
</html>