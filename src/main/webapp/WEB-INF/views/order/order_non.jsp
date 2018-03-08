<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="root" value="${pageContext.request.contextPath}"/>
<link type="text/css" rel="stylesheet" href="${root}/css/order/order_non.css"/>
<link type="text/css" rel="stylesheet" href="${root}/css/template/basic.css"/>
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<script type="text/javascript" src="${root}/js/order/order_zipcode.js"></script>
<script type="text/javascript" src="${root}/js/order/order.js"></script>
<title>비회원 주문</title>
</head>
<body>
	<div id="order_non_all">
		<!-- container -->
		<div id="order_non_container">
			<!-- content -->
			<div id="order_non_content">
				<!-- 주문/결제 타이틀 -->
				<div class="order_non_heading">
					<ol class="order_non_process">
						<li>
							<h3 class="order_non_process_1">01</h3> <span>장바구니</span>
							<h3>></h3>
						</li>
						<li>
							<h3 class="order_non_process_2">02</h3> <span>주문/결제</span>
							<h3>></h3>
						</li>
						<li>
							<h3 class="order_non_process_3">03</h3> <span>주문완료</span>
							<h3></h3>
						</li>
					</ol>
					<h3 class="order_non_basket">주문/결제</h3>
				</div>
					<div class="order_non_sub">
					<!-- 주문 테이블 -->
					<table class="order_non_tb_products">
						<caption>주문내역</caption>
						<colgroup>
							<col width="568px">
							<col width="70px">
							<col width="130px">
							<col width="100px">
							<col width="130px">
						</colgroup>
						<thead>
							<tr>
								<th scope="col">상품정보</th>
								<th scope="col">수량</th>
								<th scope="col">판매가</th>
								<th scope="col">배송비</th>
								<th scope="col">합계</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${cartList}" var="cartDto">
								<tr>
									<td>
										<div class="order_non_product_info">
											<img alt="${cartDto.book_name}" src="${root}${cartDto.book_img}">
											<span>${cartDto.book_name}</span>
										</div>
									</td>
									<td>
										<div class="order_non_product_amount">
											<span>${cartDto.cart_amount}</span>
										</div>
									</td>
									<td>
										<div class="order_non_product_price">
											<strong><fmt:formatNumber pattern="###,###,###" value="${cartDto.product_disprice}"/>원</strong><br/>
											<del><fmt:formatNumber pattern="###,###" value="${cartDto.product_point}"/></del><b class="point">P</b>
										</div>
									</td>
									<td>
										<div class="order_non_product_delfee">
											<span><fmt:formatNumber pattern="###,###" value="${cartDto.product_delivery}"/></span>
										</div>
									</td>
									<td>
										<div class="order_non_product_total">
											<strong><span><fmt:formatNumber pattern="###,###,###" value="${cartDto.product_disprice * cartDto.cart_amount}"/></span>원</strong>
										</div>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					<!-- 배송지 정보 -->
					<form action="${root}/order/complete.do" method="post" id="order">
					<div class="order_non_destination_wrap">
						<div class="order_non_deliver_wrap">
							<div class="order_non_title">
								<h3>01</h3>
								<h4>배송지정보</h4>
							</div>
							<div class="order_non_name">
								<strong>수령인</strong>
								<input type="text" name="order_name" id="name" value=""/>
							</div>
							<div class="order_non_phone">
								<strong>연락처</strong>
								<input type="text" name="order_phone" id="phone" maxlength="13" value=""/>
							</div>
							<div class="order_non_address">
								<strong>배송지 주소</strong>
								<input type="text" name="order_postcode" id="zipcode" value=""/><button type="button" id="btn_zipcode" onclick="zipcodeRead('${root}')">우편번호</button><br/>
								<input type="text" name="order_address" id="address1" value=""/><input type="text" name="order_address_detail" id="address2" value=""/>
							</div>
							<div class="order_non_memo">
								<strong>배송메모</strong>
								<input type="text" name="order_memo" id="memo" value=""/>
							</div>
						</div>
						<!-- 주문자 정보 -->
						<div class="order_non_userinfo_wrap">
							<div class="order_non_userinfo">
								<div class="userinfo_title">
									<h3>02</h3>
									<h4>주문자 정보</h4>
								</div>
								<div class="userinfo_name">
									<strong>주문자 성함</strong>
									<input type="text" name="nonmember_name" id="user_name" value=""/>
								</div>
								<div class="userinfo_phone">
									<strong>연락처</strong>
									<input type="text" name="nonmember_phone" id="user_phone" value=""/>
								</div>
								<div class="userinfo_address">
									<strong>이메일</strong>
									<input type="text" name="nonmember_email" id="user_email" value=""/>
								</div>
								<div class="userinfo_password">
									<strong>주문 비밀번호</strong>
									<input type="password" name="nonmember_password" id="user_password" value=""/>
								</div>
							</div>
							<div class="info_dsc">
								<p>추후 주문내역 조회시 필요한 정보입니다.</p>
								<p style="color: red;">분실시 확인이 어려우니 꼭 기억해주세요.</p>
							</div>
						</div>
					</div>
					<div class="order_non_payment_wrap">
						<!-- 결제정보 -->
						<div class="order_non_payment_info">
							<div class="order_non_title">
								<h3>03</h3>
								<h4>결제정보</h4>
							</div>
							<div class="order_non_payment_list">
								<strong>결제수단</strong>
								<div class="payment_option payment_select">
									<ul class="payment_list">
										<li>
											<label class="radio-inline">
												<input type="radio" name="order_payment" value="card" hidden>
												<span class="radio-style"></span>
											</label>
											<label>신용카드(체크)</label>
										</li>
										<li>
											<label class="radio-inline">
												<input type="radio" name="order_payment" value="card" hidden>
												<span class="radio-style"></span>
											</label>
											<input type="radio" name="order_payment" value="account" hidden><label>실시간 계좌이체</label>
										</li>
										<li>
											<label class="radio-inline">
												<input type="radio" name="order_payment" value="card" hidden>
												<span class="radio-style"></span>
											</label>
											<input type="radio" name="order_payment" value="mutong" hidden><label>무통장 입금</label>
										</li>
									</ul>
								</div>
							</div>
							<div class="order_non_refund">
								<div class="order_non_refund_info">
									<strong>환불계좌정보</strong>
									<span>입력하신 환불정보는 환불처리 이외의 목적으로는 이용되지 않으며 환불대상이 아닌 환불정보는 1개월 후 파기됩니다.</span>
								</div>
								<div class="order_non_refund_name">
									<strong>예금주</strong>
									<input type="text" name="refund_name" id="refund_name"/>
								</div>
								<div class="order_non_refund_bankinfo">
									<strong>계좌번호</strong>
									<select name="refund_bank">
										<option>은행명</option>
										<option value="국민은행">국민은행</option>
										<option value="신한은행">신한은행</option>
										<option value="SC은행">SC은행</option>
										<option value="우리은행">우리은행</option>
										<option value="농협">농협</option>
									</select>
									<input name="refund_account" type="text">
								</div>
							</div>
							<div class="order_non_agree_wrap">
								<h3>주문동의</h3>
								<span>주문할 상품의 상품명, 가격, 배송 정보에 동의하십니까?</span>
								<div class="order_non_agree_required">
									<label class="checkbox-inline"><input type="checkbox" id="agree" name="checkbox" hidden/><span class="checkbox-style"></span></label><span> 확인동의 (전자상거래법 제 8조 2항)</span>
								</div>
							</div>
						</div>
						<!-- 결제 총 금액 -->
						<div class="order_non_price">
							<div class="order_non_price_sum">
								<h4>결제금액</h4>
								<div class="total_price">
									<span><fmt:formatNumber pattern="###,###,###" value="${tot_price}"/>&nbsp;</span><h5>원</h5>
								</div>
								<ul class="calc_list">
									<li>
										<strong>총 상품금액</strong>
										<p><em id="totalOrderPrice"><fmt:formatNumber pattern="###,###,###" value="${tot_price}"/></em>원</p>
									</li>
									<li>
										<strong>배송비</strong>
										<p><em id="totalDeliveryFee"><fmt:formatNumber pattern="###,###,###" value="${tot_delivery}"/></em>원</p>
									</li>
									<li>
										<strong>할인금액</strong>
										<p><em id="totalDiscountPrice">0</em>원</p>
									</li>
									<li>
										<strong style="margin-top: 15px; color: #F15F5F;">회원 주문시 혜택</strong>
										
									</li>
									<li>
										<p style="float: left; color: #F15F5F;">Point <em id = point style="font-size: 1.25em"><fmt:formatNumber pattern="###,###,###" value="${tot_point}"/></em> 적립가능</p>
									</li>
									<li>
										<button type="button" id="btn_regist">회원가입</button>
									</li>
								</ul>
							</div>
						</div>
					</div>
					<div class="order_non_payment_agree">
						<input type="hidden" name="order_coupon" value="no">
						<input type="hidden" name="order_id" value="${order_id}">
						<input type="hidden" name="order_list" value="${order_list}">
						<input type="hidden" name="amount_list" value="${amount_list}">
						<input type="hidden" name="order_total_price" value="${tot_price}">
						<input type="hidden" name="order_total_point" value="0">
						<button type="button" id="btn_cart" onclick="location='${root}/order/cart.do'">장바구니 가기</button>
						<button id="btn_order">결제하기</button>
					</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>