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
 <link rel="stylesheet" type="text/css" href="${root }/css/admin/order/orderManager_search.css">
 <link rel="stylesheet" type="text/css" href="${root }/css/admin/commons/main.css">
 <script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
 <script type="text/javascript" src="${root }/js/admin/order.js"></script>
</head>   

<body>
	<!-- 타이틀메뉴 시작 -->
	<div class="all">
		
		<!-- wrap시작 -->
			<div class="wrap">
				<div class="content_wrap">
					<div class="content_title">주문관리</div>
					
					<div class="content">
						<ul>
							<li class="content_part content_part_move1">
							<div class="content_wrap_body_left">
								
								<div class="content_box">
									<ul class="content_box1">
										<li class="content_box_title">주문정보조회</li>
										<li class="" style="width:800px;">
										
											<!-- 주문정보조회 -->
											<form class="form-horizontal" action="${root }/admin/order/orderManager_search.do">
												  <fieldset>
												  
												    <div class="form-group">											      
												      <div class="col-lg-10">											      											      							 
												        <input type="text" class="form-control input_width" id="inputKeyword" name="keyword" placeholder="검색">											        
												      </div>
												    </div>
												    <span class="counter pull-right"></span>
												    <div class="content_form" align="center">
														<div class="form_style">
															<div class="order_header">
																<ul>
																	<li class="order_order_num">주문번호</li>
																	<li class="order_order_id">고객ID</li>
																	<li class="order_order_date">주문날짜</li>
																	<li class="order_order_status">주문상태</li>
																	<li class="order_order_price">주문총금액</li>															
																</ul>
																<ul class="warning no-result">
															      <li colspan="4"><i class="fa fa-warning"></i>
															      	결과 값이 없습니다.
															      </li>
															    </ul>
															</div>
															<div class="order_content">																															
																<c:forEach var="order_List" items="${boardList}">
																	<ul id="order_search_value">
																		<%-- <li class="order_order_num">${order_List.order_num }</li> --%>
																		<li class="order_order_num">
																			<a href="javascript:read_order('${root }','${order_List.order_num}')">${order_List.order_num }</a>
																		</li>
																		<li class="order_order_id">${order_List.order_id }</li>
																		<li class="order_order_date">
																			<fmt:formatDate var="order_date" value="${order_List.order_date}" pattern="yy/MM/dd"/>${order_date}
																		</li>
																		<li class="order_order_status">${order_List.order_state }</li>
																		<li class="order_order_price">${order_List.order_total_price }</li>
																	</ul>
																</c:forEach>																				
															</div>								
													</div>
													</div>											  
												     <div class="form-group" style="margin-bottom: 30px;">
												      <div class="col-lg-10 col-lg-offset-2 col-lg-margin-left">
<!-- 												        <button type="submit" class="btn btn-primary">조회</button>
												        <button type="reset" class="btn btn-default">취소</button> -->
												        <!-- <button type="button" class="btn btn-primary" onclick="location.href='orderManager_input.do'"></button> -->
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