<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
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
	
	function changeValue() {
		var main_cate=$("#select1").val();
		//alert(main_cate);
		
	};
	
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
									<form class="content_box3_formtag" action="${root}/admin/book/bookManager_inputOk.do" method="POST">	
									<div class="content_box3_form" align="center">
											<ul class="content_box3">					
												<li class="content_li">
													<span class="content_title_name">도서명</span>
													<input type="text" class="form-control" id="inputBookName" name="book_name">
												</li>		
												<li class="content_li">
													<span class="content_title_name">출판사</span>
													<input type="text" class="form-control" id="inputPublisher" name="book_publisher">
												</li>
												<li class="content_li">
													<span class="content_title_name">저자</span>
													<input type="text" class="form-control" id="inputAuthor" name="book_author">
												</li>
												<li class="content_li">
													<span class="content_title_name category" style="float:left;">분야</span>
													
													<select class="form-control input_width" id="select1" name="category_main_eng" style="float:left;" onchange="changeValue('${root }','${bookList.book_num }')">													  
													  <option value="hide">-- 대분야 --</option>													
												      <c:forEach var="book" items="${book_MainCate_List }">
												      	<option value="${book.category_main_eng }" id="cate_select">${book.category_main_kor}</option>
												      </c:forEach>						          									         
											        </select>		
											        
											        <!-- 승찬이형, 용기  confirm-->
											       	<script type="text/javascript">
											        	var category_main_eng="${category_main_eng}";
											        	$("select[id='select1'] option[value='"+category_main_eng+"']").attr("selected","selected");
											        </script>
											        
											        <select class="form-control input_width" id="select2" name="category_sub_eng">
											        	<option value="hide">-- 소분야 --</option>														  													  											  										
												      <c:forEach var="book2" items="${book_SubCate_List }">
												      	<option value="${book2.category_sub_eng}">${book2.category_sub_kor}</option>
												      </c:forEach>						          									        
											        </select>															
												</li>
												
												<li class="content_li" style="margin-top: 2px;">
													<span class="content_title_name">발행일</span>
													<!-- <input type="text" class="form-control" id="inputBookDate" name="book_date"> -->
													<input type="text" class="form-control" id="dateofbirth" name="" readonly="readonly">
													<%-- <fmt:formatDate var="book_date" value="${book_date}" pattern="yy/MM/dd"/> --%>
												</li>		
												<li class="content_li" style="margin-top: 2px;">
													<span class="content_title_name">평점</span>
													<input type="text" class="form-control" id="inputScore" name="book_score">
												</li>
												
												<li class="content_li" style="margin-top: 2px;">
													<span class="content_title_name">이미지</span>
													<input type="file" class="form-control" id="inputImage" onchange="readURL(this);" name="book_img">
												</li>		
												<li class="c_orderlist_inputform_value img_margin">
													<div class="form-group" align="center">											      
												      <div class="imgLine">											      											      							 
												        <img id="imgFrame" src="#" alt="upload">											        
												      </div>
												    </div>												    
												</li>																						
											</ul>									
											<!-- 환불, 교환, 반품-->
										    <div class="form-group btn-margin" align="center">
											      <div class="col-lg-10 col-lg-offset-2 col-lg-margin-left" id="btn-margin">
												        <button type="submit" class="btn btn-default" id="">추가</button>												        
												        <button type="button" class="btn btn-default" id="">취소</button>
												        <button type="button" class="btn btn-default" id="">삭제</button>
											      </div>
										    </div>	
										</div>		
														
									<!--  -->	
									<!--  -->
									<div class="content_box4_form" align="center"> 
											<ul class="content_box4">																	
												<li class="content_li textarea_height">
													<span class="content_title_name">에디터 한마디</span>
													<textarea class="form-control textarea_height" id="inputEditor" name="book_editor"></textarea>
												</li>
												<li class="content_li textarea_height">
													<span class="content_title_name">목차</span>
													<textarea class="form-control textarea_height" id="inputIntro" name="book_intro"></textarea>
												</li>
												<li class="content_li textarea_height">
												<span class="content_title_name">책소개</span>
													<textarea class="form-control textarea_height" id="inputIntro" name="book_contents"></textarea>
												</li>	
												<li class="content_li textarea_height">
													<span class="content_title_name">저자소개</span>
													<textarea class="form-control textarea_height" id="inputAuthor_info" name="book_author_info"></textarea>
												</li>	
												<li class="content_li textarea_height">
													<span class="content_title_name">출판사 리뷰</span>
													<textarea class="form-control textarea_height" id="inputPublisher_review" name="book_publisher_review"></textarea>
												</li>																							
											</ul>
											
										
											
									</div>	
										
									</form>					
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