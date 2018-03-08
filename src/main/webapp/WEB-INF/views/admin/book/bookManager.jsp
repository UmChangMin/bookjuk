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
	
	
	$(function(){
		$(".nav-item:eq(3)").addClass("active");
	});
	
	function upmove(root, bookNum,category_main_eng,pageNumber) {
		var url=root+"/admin/book/bookManager_update.do?book_num="+bookNum+"&category_main_eng="+category_main_eng+"&pageNumber="+pageNumber;
		location.href=url;
	}
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
											<ul class="content_box3">					
												<li class="content_li">
													<span class="content_title_name">도서명</span>
													<input type="text" class="form-control" id="inputBookName" name="book_name" value="${bookList.book_name}">
												</li>		
												<li class="content_li">
													<span class="content_title_name">출판사</span>
													<input type="text" class="form-control" id="inputPublisher" name="book_publisher" value="${bookList.book_publisher }">
												</li>
												<li class="content_li">
													<span class="content_title_name">저자</span>
													<input type="text" class="form-control" id="inputAuthor" name="book_author" value="${bookList.book_author}">
												</li>
												<li class="content_li">
													<span class="content_title_name category" style="float:left;">분야</span>
													<select class="form-control input_width" id="select1" name="book" style="float:left;" onchange="changeValue()">														  
													  <option value="${bookList.category_main_kor }">${bookList.category_main_kor }</option>													
												      <%-- <c:forEach var="book" items="${book_MainCate_List }">
												      	<option value="${book.book_main_category }">${book.book_main_category}</option>
												      </c:forEach> --%>						          									         
											        </select>		
											        <select class="form-control input_width" id="select2" name="book">	
													  
													  <option value="${bookList.category_sub_kor }">${bookList.category_sub_kor }</option>												  											
												      <%-- <c:forEach var="book" items="${bookList }">
												      	<option value="${bookList.book_sub_category }">${bookList.book_sub_category}</option>
												      </c:forEach>	 --%>						          									        
											        </select>																
												</li>
												
												<li class="content_li" style="margin-top: 2px;">
													<span class="content_title_name">발행일</span>
													<input type="text" class="form-control" id="inputBookDate" name="book_date" value="${sdfBookDate }">													
												</li>		
												<li class="content_li">
													<span class="content_title_name">평점</span>
													<input type="text" class="form-control" id="inputScore" name="book_score" value="${bookList.book_score }">
												</li>
												
												<li class="content_li" style="margin-top: 2px;">
													<span class="content_title_name">이미지</span>
													<input type="file" class="form-control" id="inputImage" onchange="readURL(this);">
												</li>		
												<li class="c_orderlist_inputform_value img_margin">
													<div class="form-group" align="center">											      
												      <div class="imgLine">											      											      							 
												        <img id="imgFrame" src="${root }${bookList.book_img }" alt="upload">											        
												      </div>
												    </div>												    
												</li>																						
											</ul>																					
									</div>		
														
									<!--  -->	
									<!--  -->
									<div class="content_box4_form" align="center"> 
										<ul class="content_box4">																	
											<li class="content_li textarea_height">
												<span class="content_title_name">에디터 한마디</span>
												<textarea class="form-control textarea_height" id="inputEditor" name="book_editor">${bookList.book_editor }</textarea>
											</li>
											<li class="content_li textarea_height">
												<span class="content_title_name">목차</span>
												<textarea class="form-control textarea_height" id="inputIntro" name="book_contents">${bookList.book_contents }</textarea>
											</li>	
											<li class="content_li textarea_height">
												<span class="content_title_name">책소개</span>
												<textarea class="form-control textarea_height" id="inputIntro" name="book_intro">${bookList.book_intro }</textarea>
											</li>
											<li class="content_li textarea_height">
												<span class="content_title_name">저자소개</span>
												<textarea class="form-control textarea_height" id="inputAuthor_info" name="book_author_info">${bookList.book_author_info }</textarea>
											</li>	
											<li class="content_li textarea_height">
												<span class="content_title_name">출판사 리뷰</span>
												<textarea class="form-control textarea_height" id="inputPublisher_review" name="book_publisher_review">${bookList.book_publisher_review }</textarea>
											</li>																							
										</ul>	
									</div>
									<!-- 환불, 교환, 반품-->
									    <div class="form-group btn-margin" align="center">
										      <div class="col-lg-10 col-lg-offset-2 col-lg-margin-left" id="btn-margin">
											        <button type="button" class="btn btn-default" onclick="upmove('${root }','${bookList.book_num}','${bookList.category_main_eng }','${pageNumber }')">수정</button>												        
											        <button type="button" class="btn btn-default" id="" onclick="location.href='${root}/admin/book/bookManager_search.do?pageNumber='+${pageNumber}">목록</button>
											        <button type="button" class="btn btn-default" id="">삭제</button>
										      </div>
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