<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>주문/배송조회</title>
<link rel="stylesheet" type="text/css"href="${root}/css/order/order_list.css" />
<link rel="stylesheet" type="text/css"href="${root}/css/template/basic.css" />
<link type="text/css" rel="stylesheet" href="${root}/jqueryUI/jquery-ui2.css"/>
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<script type="text/javascript" src="${root}/jqueryUI/jquery-ui2.js"></script>
<script type="text/javascript" src="${root}/js/order/order_list.js"></script>
</head>
<body>
	<div class="order">
		<div class="order_top">
			<div class="order_inner">
				<!-- 배송조회 타이틀 시작 -->	
				<div class="order_title">
						<div class="order_title2">배송조회</div>
				</div>
				
				<!-- 내용시작 -->
				<div class="order_box">
					<!-- 기간조회 시작-->
					<div class="order_month">
						<div class="order_month1">기간조회</div>
						<div class="order_calendar"> 
							<!-- 제이쿼리ui달력 -->
							<form id="search_calendar" action="${root}/order/list.do" method="get">
								<input type="text" name="start_date" id="order_calendar1"/> ~ <input type="text" name="end_date" id="order_calendar2">
								<span>까지의 주문일자</span>
								<button type="button" class="order_search">조회</button>
							</form>
						</div>
					</div>
					<!-- 기간조회 끝-->
					
					<!-- 본문 contact 시작 -->
					<div class="order_contact_all">
					<div class="order_contact" align="center">
						<!-- 타이틀 시작 -->
						<ul>
							<li>주문번호</li>
							<li>접수일자</li>
							<li>상품정보</li>
							<li>전체 수량</li>
							<li>전체 주문금액</li>
							<li>상태</li>
						</ul>
						<!-- 타이틀 끝 -->
					</div>
					
					<!-- 책내용 시작 -->
					<c:forEach items="${orderList}" var="orderDto" begin="${startRow - 1}" end="${endRow - 1}">
					<div class="order_info" align="center">
						<ul>
							<li>${orderDto.order_num}</li>
							<li><fmt:formatDate value="${orderDto.order_date}" pattern="YYYY/MM/dd"/></li>
							<li class="order_info_book">
								<div class="order_info_bookimg"><img alt="${orderDto.order_list}" src="${root}${orderDto.book_img}"></div>
								<div class="order_info_booktit">
									${orderDto.order_list}
								</div>
							</li>
							<li>${orderDto.amount_list}</li>
							<li><fmt:formatNumber value="${orderDto.order_total_price}" pattern="###,###,###"></fmt:formatNumber>&nbsp;원</li>
							<li>${orderDto.order_state}</li>
						</ul>
					</div>
					</c:forEach>
					<!-- 책내용 끝 -->
					<!-- 주의사항시작 -->
					<div class="order_Precautions">
							<div>※배송 조회시 주의사항※</div>
							<div>
								<p>교환신청은 상품의 결함 및 계약내용과 다를 경우 문제점 발견 후 30일 이내 가능합니다.<br/>
								변심반품의 경우 수령 후 7일 이내, 상품의 결함 및 계약내용과 다를 경우 문제점 발견 후 30일 이내 가능합니다.<br/>
								<strong>비회원이신 경우</strong> 고객센터의 전화문의로 반품, 교환, 주문취소 접수 가능합니다.<br/>
							</div>
							<div class="order_onecontact">
								<a href="${root}/service/contact/list.do">031-482-2148</a>
							</div>
					</div>
					<!-- 주의사항 끝 -->
					
					</div>
					
					<!-- 페이지번호 -->
					<div class="order_page">
						<c:if test="${endPage > pageCount}">
							<c:set var="endPage" value="${pageCount}"/>
						</c:if>
						
						<c:if test="${startPage > pageBlock}">
							<a href="${root}/order/list.do?pageNumber=${startPage - pageBlock}" class="orderList_num_before">이전</a>
						</c:if>
						
						<c:forEach var="i" begin="${startPage}" end="${endPage}" >
							<a href="${root}/order/list.do?pageNumber=${i}" class="orderList_num">${i}</a>
						</c:forEach>
						
						<c:if test="${endPage < pageCount}">
							<a href="${root}/order/list.do?pageNumber=${startPage + pageBlock}" class="orderList_num_next">다음</a>
						</c:if>
					</div>
					<!-- 페이지 번호 끝 -->
					<!-- 본문 contact 끝 -->
				</div>
				<!-- 내용끝 -->
				<!-- 타이틀 끝 -->
				<!-- 배송조회 리스트 -->
			</div>
		</div>
	</div>

</body>
</html>