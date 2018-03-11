<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>취소/교환/환불</title>
<link rel="stylesheet" type="text/css"href="${root}/css/order/order_cancle.css" />
<link rel="stylesheet" type="text/css"href="${root}/css/template/basic.css" />
<link rel="stylesheet" type="text/css" href="${root}/jqueryUI/jquery-ui2.css">
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<script type="text/javascript" src="${root}/jqueryUI/jquery-ui2.js"></script>
<script type="text/javascript" src="${root}/js/order/order_cancle.js"></script>
</head>
<body>
	<div class="Cancel_exchange_refund">
		<div class="Cancel_exchange_refund_top">
			<div class="Cancel_exchange_refund_inner">
				<!-- 배송조회 타이틀 시작 -->	
				<div class="Cancel_exchange_refund_title">
						<div class="Cancel_exchange_refund_title2">취소/교환/반품</div>
				</div>
				
				<!-- 내용시작 -->
				<div class="Cancel_exchange_refund_box">
					<!-- 기간조회 시작-->
					<div class="Cancel_exchange_refund_month">
						<div class="Cancel_exchange_refund_month1">기간조회</div>
						<div class="Cancel_exchange_refund_calendar"> 
							<!-- 제이쿼리ui달력 -->
							<form id="search_calendar" action="${root}/order/list/cancle.do" method="get">
								<input type="text" name="start_date" id="Cancel_exchange_refund_calendar1"/> ~ <input type="text" name="end_date" id="Cancel_exchange_refund_calendar2">
								<span>까지의 주문일자</span>
								<button type="button" class="Cancel_exchange_refund_search">조회</button>
							</form>
						</div>
					</div>
					<!-- 기간조회 끝-->
					
					<!-- 본문 contact 시작 -->
					<div class="Cancel_exchange_refund_contact_all">
					<div class="Cancel_exchange_refund_contact" align="center">
						<!-- 타이틀 시작 -->
						<ul>
							<li>주문번호</li>
							<li>접수일자</li>
							<li>상품정보</li>
							<li>전체 주문금액</li>
							<li>상태</li>
							<li>현황</li>
						</ul>
						<!-- 타이틀 끝 -->
					</div>
					
					<!-- 책내용 시작 -->
					<c:forEach items="${orderList}" var="orderDto" begin="${startRow - 1}" end="${endRow - 1}">
					<div class="Cancel_exchange_refund_info" align="center">
						<ul>
							<li>${orderDto.order_num}</li>
							<li><fmt:formatDate value="${orderDto.order_date}" pattern="YYYY/MM/dd"/></li>
							<li class="Cancel_exchange_refund_info_book">
								<div class="Cancel_exchange_refund_info_bookimg"><img alt="${orderDto.order_list}" src="${root}${orderDto.book_img}"></div>
								<div class="Cancel_exchange_refund_info_booktit">
									${orderDto.order_list}
								</div>
							</li>
							<li><fmt:formatNumber value="${orderDto.order_total_price}" pattern="###,###,###"></fmt:formatNumber>&nbsp;원</li>
							<li>${orderDto.order_state}</li>
							<li class="Cancel_exchange_refund_info_book_button">
								<c:choose>
									<c:when test="${orderDto.order_state eq '상품준비중'}">
										<button type="button" id="order_cancle" onclick="location.href='${root}/order/cancle.do?order_num=${orderDto.order_num}&order_total_price=${orderDto.order_total_price}'">취소</button>
									</c:when>
									
									<c:when test="${orderDto.order_state eq '입금대기중'}">
										<button type="button" id="order_cancle" onclick="location.href='${root}/order/cancle.do?order_num=${orderDto.order_num}&order_total_price=${orderDto.order_total_price}'">취소</button>
									</c:when>
									
									<c:when test="${orderDto.order_state eq '주문취소'}"></c:when>
									
									<c:otherwise>
										<button type="button" id="order_exchange" onclick="location.href='${root}/order/exchange.do?order_num=${orderDto.order_num}&order_total_price=${orderDto.order_total_price}'">교환</button>
										<button type="button" id="order_return" onclick="location.href='${root}/order/return.do?order_num=${orderDto.order_num}&order_total_price=${orderDto.order_total_price}'">반품</button>
									</c:otherwise>
								</c:choose>
							</li>
						</ul>
					</div>
					</c:forEach>
					<!-- 책내용 끝 -->
					
					<!-- 주의사항시작 -->
					<div class="Cancel_exchange_refund_Precautions">
							<div>※취소/교환/반품시 주의사항※</div>
							<div>
								<p>교환신청은 상품의 결함 및 계약내용과 다를 경우 문제점 발견 후 30일 이내 가능합니다.<br/>
								변심반품의 경우 수령 후 7일 이내, 상품의 결함 및 계약내용과 다를 경우 문제점 발견 후
								30일 이내 가능합니다.<br/>
								1:1 상담 문의를 통하여 배송조회페이지에서 접수 가능합니다.<br/>
								반품처리 절차 : 반품신청 > 접수 > 반품회수 > 회수완료 > 반품완료<br/>
								교환처리 절차 : 교환신청 > 접수 > 처리중 > 교환완료<br/>
								반품/교환신청건은 접수 이전 상태에서 신청취소가 가능합니다.</p>
							</div>
							<div class="Cancel_exchange_refund_onecontact">
								<a href="${root}/service/contact/list.do">1:1문의</a>
							</div>
					</div>
					<!-- 주의사항 끝 -->
					
					</div>
					
					<!-- 페이지번호 -->
					<div class="Cancel_exchange_refund_page" align="center">
						<c:if test="${endPage > pageCount}">
							<c:set var="endPage" value="${pageCount}"/>
						</c:if>
						
						<c:if test="${startPage > pageBlock}">
							<a href="${root}/order/cancle.do?pageNumber=${startPage - pageBlock}" class="orderCancle_num_before">이전</a>
						</c:if>
						
						<c:forEach var="i" begin="${startPage}" end="${endPage}" >
							<a href="${root}/order/cancle.do?pageNumber=${i}" class="orderCancle_num">${i}</a>
						</c:forEach>
						
						<c:if test="${endPage < pageCount}">
							<a href="${root}/order/cancle.do?pageNumber=${startPage + pageBlock}" class="orderCancle_num_next">다음</a>
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