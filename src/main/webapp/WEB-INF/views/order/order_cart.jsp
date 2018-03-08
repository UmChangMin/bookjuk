<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:set var="root" value="${pageContext.request.contextPath}" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="${root}/css/order/order_cart.css"/>
<link type="text/css" rel="stylesheet" href="${root}/css/template/basic.css"/>
<link type="text/css" rel="stylesheet" href="${root}/jqueryUI/jquery-ui.css"/>
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<script type="text/javascript" src="${root}/jqueryUI/jquery-ui.js"></script>
<script type="text/javascript" src="${root}/js/order/order_cart.js"></script>
<title>장바구니</title>
</head>
<body>	
	<div id="cart_all">
		<!-- container -->
		<div id="cart_container">
			<!-- content -->
			<div id="cart_content">
				<!-- 장바구니 타이틀 -->
					<div class="cart_heading">
						<ol class="cart_process">
							<li>
								<h3 class="cart_process_1">01</h3> <span>장바구니</span>
								<h3>></h3>
							</li>
							<li>
								<h3 class="cart_process_2">02</h3> <span>주문/결제</span>
								<h3>></h3>
							</li>
							<li>
								<h3 class="cart_process_3">03</h3> <span>주문완료</span>
								<h3></h3>
							</li>
						</ol>
						<h3 class="cart_basket">장바구니</h3>
					</div>
				<div class="cart_sub">
					<!-- 장바구니 테이블 -->
					<div class="cart_table_box">
						<table class="cart_table_list">
							<caption>장바구니 항목</caption>
							<colgroup>
								<col width="30px">
								<col width="538px">
								<col width="70px">
								<col width="130px">
								<col width="100px">
								<col width="130px">
							</colgroup>
							<thead>
								<tr>
									<th scope="col">
										<input type="checkbox" id="checkbox_all" class="checkbox_all">
										<label for="checkbox_all" class="blind">전체 상품선택</label>
									</th>
									<th scope="col"><strong>상품정보</strong></th>
									<th scope="col">수량</th>
									<th scope="col">판매가</th>
									<th scope="col">배송비</th>
									<th scope="col">합계</th>
								</tr>
							</thead>
							<tfoot>
								<tr>
									<td colspan="3">&nbsp;</td>
									<td colspan="3" class="tot bg_point2">
										<dl>
									<dt class="cart_blind">결제정보</dt>
									<dd>
										<ul>
											<li>
												<strong>총 상품금액</strong>
												<p><em class="totalOrderAmount"><fmt:formatNumber pattern="###,###,###" value="${tot_price}"/></em> 원</p>
											</li>
											<li>
												<strong>배송비</strong>
												<p><em class="totalDeliveryAmount"><fmt:formatNumber pattern="###,###,###" value="${tot_delivery}"/></em> 원</p>
											</li>
											<li>
												<strong>적립 예상 금액</strong>
												<p><em class="totalPointAmount"><fmt:formatNumber pattern="###,###,###" value="${tot_point}"/></em> 원</p>
											</li>
										</ul>
									</dd>
									<dd style="margin-top:22px;">
										<ul>
											<li>
												<strong style="font-weight: bold; color: rgb(241, 95, 95)">결제금액</strong>
												<p style="color: rgb(241, 95, 95)"><em class="subTotal"><fmt:formatNumber pattern="###,###,###" value="${tot_price}"/></em> 원</p>
											</li>
										</ul>
									</dd>
								</dl>
									</td>
								</tr>
							</tfoot>
							<tbody>
								<c:if test="${cartList == null}">
									<tr>
										<td colspan="6"><strong style="font-size: 1.5em;">장바구니에 담긴 상품이 없습니다.</strong></td>
									</tr>
								</c:if>
								<c:forEach items="${cartList}" var="cartDto" varStatus="index">
									<tr>
										<td>
											<input type="checkbox" name="chkObj" id="checkbox" class="cart_order_checkbox">
											<input type="hidden" name="book_num" class="cart_book_num" value="${cartDto.book_num}"/>
											<label for="checkbox" class="cart_blind">상품선택</label>
										</td>
										<td>
											<div class="cart_product_info">
												<img alt="${cartDto.book_name}" src="${root}${cartDto.book_img}">
												<span>${cartDto.book_name}</span>
											</div>
										</td>
										<td>
											<input type="text" name="amount" value="${cartDto.cart_amount}" class="amount"/><a class="bt_up">▲</a><a class="bt_down">▼</a><br/>
											<a href="javascript:updateAmount(${cartDto.book_num}, ${index.index})" id="${cartDto.book_num}" class="btn_pd_edit">변경</a>
										</td>
										<td>
											<strong><fmt:formatNumber pattern="###,###,###" value="${cartDto.product_disprice}"/>원</strong><br/>
											<span><fmt:formatNumber pattern="###,###" value="${cartDto.product_point}"/></span><b class="point">P</b>
										</td>
										<td>
											<c:if test="${cartDto.product_delivery == 0}"><span>무료배송</span></c:if>
											<c:if test="${cartDto.product_delivery > 0}"><span><fmt:formatNumber value="${cartDto.product_delivery}" pattern="###,###,###"/></span></c:if>
										</td>
										<td>
											<strong><fmt:formatNumber pattern="###,###,###" value="${cartDto.product_disprice * cartDto.cart_amount}"/>원</strong>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
					<div class="cart_btn_section" align="center">
						<button type="button" onclick="location='${root}/main.do'" class="cart_btn_home">쇼핑 계속하기</button>
						<button type="button" class="cart_btn_delete">선택상품 삭제하기</button>
						<input type="hidden" id="member_level" value="${member_level}"/>
						<form action="${root}/order/order_non.do" id="non_order_submit" method="post">
							<input type="hidden" name="order_id" value="${order_id}">
							<button class="cart_btn_non_order">비회원 주문하기</button>
						</form>
						<form action="${root}/order/order.do" id="order_submit" method="post">
							<input type="hidden" name="order_id" value="${order_id}">
							<button class="cart_btn_order">회원 주문하기</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>