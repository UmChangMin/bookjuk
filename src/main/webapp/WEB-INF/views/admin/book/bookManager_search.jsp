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
<link rel="stylesheet" type="text/css" href="${root }/css/admin/book/bookManager_search.css">
<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="${root }/js/admin/book.js"></script>
<script type="text/javascript"> 

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
								<div class="content_wrap_body_left">
									
									<div class="content_box">
										<ul class="content_box1">
											<li class="content_box_title">도서정보조회</li>
											<li style="width:800px;">
												<form class="form-horizontal" action="${root }/admin/book/bookManager_search.do">
												  <fieldset>
												  
												    <div class="form-group">											      
												      <div class="col-lg-10">											      											      							 
												        <input type="text" class="form-control input_width" id="inputKeyword" name="keyword" placeholder="검색">											        
												      </div>
												    </div>
												    <span class="counter pull-right"></span>
												    <div class="content_form" align="center">
														<div class="form_style">
															<div class="book_header">
																<ul>
																	<!-- <li class="book_book_num">도서번호</li> -->
																	<li class="book_book_title">도서명</li>
																	<li class="book_book_pub">출판사</li>
																	<li class="book_book_author">저자</li>
																	<li class="book_book_date">발행일</li>																	
																</ul>
																<ul class="warning no-result">
															      <li colspan="4"><i class="fa fa-warning"></i>
															      	결과 값이 없습니다.
															      </li>
															    </ul>
															</div>
															<div class="book_content">																															
																<c:forEach var="book_List" items="${boardList}">
																	<ul id="book_search_value">
																		<%-- <li class="book_book_num">${book_List.book_num }</li> --%>
																		<li class="book_book_title">
																			<a href="javascript:read_book('${root }','${book_List.book_num}','${pageNumber }')">${book_List.book_name }</a>
																		</li>
																		<li class="book_book_pub">${book_List.book_publisher }</li>
																		<li class="book_book_author">${book_List.book_author }</li>
																		<li class="book_book_date">
																			<fmt:formatDate var="book_date" value="${book_List.book_date}" pattern="yy/MM/dd"/>${book_date}
																		</li>
																	</ul>
																</c:forEach>																				
															</div>								
													</div>
													</div>											  
												     <div class="form-group" style="margin-bottom: 30px;">
												      <div class="col-lg-10 col-lg-offset-2 col-lg-margin-left">
<!-- 												        <button type="submit" class="btn btn-primary">조회</button>
												        <button type="reset" class="btn btn-default">취소</button> -->
												        <button type="button" class="btn btn-primary" onclick="location.href='bookManager_input.do'">도서추가</button>
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
							</div>
						</div>
					<!--  -->
					</div>	
					
				</div>

		<!-- wrap 끝 -->

</body>
</html>