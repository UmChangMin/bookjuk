<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
				<!-- 타이틀 끝 -->
				<!-- 배송조회 리스트 -->
				<div class="Cancel_exchange_refund_box">
					<div class="Cancel_exchange_refund_boxinner">
					
						<!-- 개월수 시작 -->
						<div class="Cancel_exchange_refund_monthbox">
							<div class="Cancel_exchange_refund_month">
								<a class="" href="#">1주일	</a>
								<a class="" href="#">1개월	</a>
								<a class="" href="#">6개월	</a>
								<a class="" href="#">1년</a>
							</div>
							<div class="Cancel_exchange_refund_calendar"> 
								<!-- 제이쿼리ui달력 -->
								<input type="text" id="Cancel_exchange_refund_calendar1"/> ~ <input type="text" id="Cancel_exchange_refund_calendar2">
								
								<p>까지의 주문일자</p>
							</div>				
						</div>
						<!-- 개월수 끝 -->
						
						<!-- 주문일자 타이틀 시작 -->
						<div class="Cancel_exchange_refund_subtitlebox">
							<div class="Cancel_exchange_refund_subtitle">
								<p>주문일자</p>
								<p>도서사진</p>
								<p>도서명</p>
								<p>수량</p>
								<p>금액</p>
								<p>주문처리상태</p>
							</div>
						</div>		
						<!-- 주문일자타이틀 끝 -->
						<div class="Cancel_exchange_refund_listbox">
							<div class="Cancel_exchange_refund_list_text">
								<span>2018-01-13</span>
								<a class="bookname" href="#">도서명</a>
							</div>
							<div class="Cancel_exchange_refund_list_text2">
								<p>1</p>
								<span>18,000</span>
								<a href="">상품준비중</a>
							</div>
							<ul class="Cancel_exchange_refund_listimg">
								<li>
									<a href="#"><img alt="책사진" src="#"></a>
								</li>
							</ul> 
						</div>
						<!-- 2개~ -->
						<div class="Cancel_exchange_refund_listbox2">
							<div class="Cancel_exchange_refund_list_text">
								<span>2018-01-13</span>
								<a class="bookname" href="#">도서명</a>
							</div>
							<div class="Cancel_exchange_refund_list_text2">
								<p>1</p>
								<span>18,000</span>
								<a href="">상품준비중</a>
							</div>
							<ul class="Cancel_exchange_refund_listimg">
								<li>
									<a href="#"><img alt="책사진" src="#"></a>
								</li>
							</ul> 
						</div>
						<div class="Cancel_exchange_refund_Precautions">
								<div>※취소/교환/반품시 주의사항※</div>
							<div class="Cancel_exchange_refund_Precautions_text">
								<p>교환신청은 상품의 결함 및 계약내용과 다를 경우 문제점 발견 후 30일 이내 가능합니다.
								변심반품의 경우 수령 후 7일 이내, 상품의 결함 및 계약내용과 다를 경우 문제점 발견 후
								30일 이내 가능합니다.
								1:1 상담 문의를 통하여 배송조회페이지에서 접수 가능합니다.
								반품처리 절차 : 반품신청 > 접수 > 반품회수 > 회수완료 > 반품완료
								교환처리 절차 : 교환신청 > 접수 > 처리중 > 교환완료
								반품/교환신청건은 접수 이전 상태에서 신청취소가 가능합니다.</p>
							</div>
						</div>
						<div class="Cancel_exchange_refund_contact">
							<input type="button" value="1:1문의">
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>