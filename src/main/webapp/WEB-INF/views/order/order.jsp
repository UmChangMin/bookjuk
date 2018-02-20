<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="root" value="${pageContext.request.contextPath}"/>
<link type="text/css" rel="stylesheet" href="${root}/css/order/order.css"/>
<link type="text/css" rel="stylesheet" href="${root}/css/template/basic.css"/>
<title>회원 주문</title>
</head>
<body>
	<div id="order_all">
		<!-- container -->
		<div id="order_container">
			<!-- content -->
			<div id="order_content">
				<!-- 주문/결제 타이틀 -->
				<div class="order_heading">
					<ol class="order_process">
						<li>
							<h3 class="order_process_1">01</h3> <span>장바구니</span>
							<h3>></h3>
						</li>
						<li>
							<h3 class="order_process_2">02</h3> <span>주문/결제</span>
							<h3>></h3>
						</li>
						<li>
							<h3 class="order_process_3">03</h3> <span>주문완료</span>
							<h3></h3>
						</li>
					</ol>
					<h3 class="order_basket">주문/결제</h3>
				</div>
					<div class="order_sub">
					<!-- 주문 테이블 -->
					<table class="order_tb_products">
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
							<tr>
								<td>
									<div class="order_product_info">
										<img alt="말의 품격" src="http://image.kyobobook.co.kr/images/book/large/772/l9788997092772.jpg">
										<a href="#">말의 품격</a>
									</div>
								</td>
								<td>
									<div class="order_product_amount">
										<span>1</span>
									</div>
								</td>
								<td>
									<div class="order_product_price">
										<strong>13,500원</strong><br/>
										<span>750</span><b class="point">P</b>
									</div>
								</td>
								<td>
									<div class="order_product_delfee">
										<span>무료배송</span>
									</div>
								</td>
								<td>
									<div class="order_product_total">
										<strong><span>13,500</span>원</strong>
									</div>
								</td>
							</tr>
							<tr>
								<td>
									<div class="order_product_info">
										<img alt="말의 품격" src="http://image.kyobobook.co.kr/images/book/large/772/l9788997092772.jpg">
										<a href="#">말의 품격</a>
									</div>
								</td>
								<td>
									<div class="order_product_amount">
										<span>1</span>
									</div>
								</td>
								<td>
									<div class="order_product_price">
										<strong>13,500원</strong><br/>
										<span>750</span><b class="point">P</b>
									</div>
								</td>
								<td>
									<div class="order_product_delfee">
										<span>무료배송</span>
									</div>
								</td>
								<td>
									<div class="order_product_total">
										<strong><span>13,500</span>원</strong>
									</div>
								</td>
							</tr>
						</tbody>
					</table>
					<!-- 배송지 정보 -->
					<div class="order_destination_wrap">
						<div class="order_deliver_wrap">
							<div class="order_title">
								<h3>01</h3>
								<h4>배송지정보</h4>
							</div>
							<div class="order_name">
								<label>수령인</label>
								<input type="text" id="name" value=""/>
							</div>
							<div class="order_phone">
								<label>연락처</label>
								<input type="text" id="phone1" value=""/> - <input type="text" id="phone2" value=""/> - <input type="text" id="phone3" value=""/>
							</div>
							<div class="order_address">
								<label>배송지 주소</label>
								<input type="text" id="zipcode" value=""/><button id="btn_zipcode">우편번호</button><br/>
								<input type="text" id="address1" value=""/><input type="text" id="address2" value=""/>
							</div>
							<div class="order_memo">
								<label>배송메모</label>
								<input type="text" id="memo" value=""/>
							</div>
						</div>
					</div>
					<!-- 할인 및 적립금 -->
					<div class="order_discount_wrap">
						<div class="order_discount_info">
							<div class="order_title">
								<h3>02</h3>
								<h4>할인 및 적립</h4>
							</div>
							<table class="order_tb_discount">
								<colgroup>
									<col width="100px">
									<col>
								</colgroup>
								<tbody class="order_discountPriceInfo">
									<tr>
										<th>생일축하 쿠폰</th>
										<td>
											<div class="input_area">
												<input name="birthDayCouponPrice" id="birth_coupon" value="164,700" title="생일쿠폰금액" disabled="disabled">
												<span class="order_measure">원</span>
											</div>
											<button class="btn_coupon">쿠폰사용</button>
											<ul class="use_list">
												<li>
													(사용가능 쿠폰 : <em>1</em>장 |
												</li>
												<li style="margin-left: 5px;">
													보유 쿠폰 : <em>1</em>장)
												</li>
											</ul>
										</td>
									</tr>
									<tr>
										<th>배송비 쿠폰</th>
										<td>
											<div class="input_area">
												<input name="deliveryCouponPrice" id="delivery_coupon" value="0" title="생일쿠폰금액" disabled="disabled">
												<span class="order_measure">원</span>
											</div>
											<button class="btn_coupon disable" disabled="disabled">쿠폰사용</button>
											<ul class="use_list">
												<li>
													(사용가능 쿠폰 : <em>0</em>장 |
												</li>
												<li style="margin-left: 5px;">
													보유 쿠폰 : <em>0</em>장)
												</li>
											</ul>
										</td>
									</tr>
									<tr>
										<th>Point</th>
										<td>
											<div class="input_area">
												<input name="birthDayCouponPrice" id="birth_coupon" value="0" title="생일쿠폰금액" disabled="disabled">
												<span class="order_measure">원</span>
											</div>
											<button class="btn_coupon">전액사용</button>
											<ul class="use_list">
												<li>
													(사용가능 포인트 : <em class="pointcol">697</em>원)
												</li>
											</ul>
										</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
					<!-- 결제 정보 -->
					<div class="order_payment_wrap">
						<div class="order_payment_info">
							<div class="order_title">
								<h3>03</h3>
								<h4>결제정보</h4>
							</div>
							<div class="order_payment_list">
								<strong>결제수단</strong>
								<div class="payment_option payment_select">
									<ul class="payment_list">
										<li>
											<input type="radio" name="sel_payment"><label>신용카드(체크)</label>
										</li>
										<li>
											<input type="radio" name="sel_payment"><label>실시간 계좌이체</label>
										</li>
										<li>
											<input type="radio" name="sel_payment"><label>무통장 입금</label>
										</li>
									</ul>
								</div>
							</div>
							<div class="order_refund">
								<div class="order_refund_info">
									<strong>환불계좌정보</strong>
									<span>입력하신 환불정보는 환불처리 이외의 목적으로는 이용되지 않으며 환불대상이 아닌 환불정보는 1개월 후 파기됩니다.</span>
								</div>
								<div class="order_refund_name">
									<strong>예금주</strong>
									<input type="text" id="refund_name"/>
								</div>
								<div class="order_refund_bankinfo">
									<strong>계좌번호</strong>
									<select name="bank">
										<option>은행명</option>
										<option value="국민은행">국민은행</option>
										<option value="신한은행">신한은행</option>
										<option value="SC은행">SC은행</option>
										<option value="우리은행">우리은행</option>
										<option value="농협">농협</option>
									</select>
									<input type="text">
								</div>
							</div>
							<div class="order_agree_wrap">
								<h3>주문동의</h3>
								<span>주문할 상품의 상품명, 가격, 배송 정보에 동의하십니까?</span>
								<div class="order_agree_required">
									<input type="checkbox" name="agree"/><span> 확인동의 (전자상거래법 제 8조 2항)</span>
								</div>
							</div>
						</div>
						<!-- 결제 총 금액 -->
						<div class="order_price">
							<div class="order_price_sum">
								<h4>결제금액</h4>
								<div class="total_price">
									<span>111,111</span><h5>원</h5>
								</div>
								<ul class="calc_list">
									<li>
										<strong>총 상품금액</strong>
										<p><em id="totalOrderPrice">111,111</em>원</p>
									</li>
									<li>
										<strong>배송비</strong>
										<p><em id="totalDeliveryFee">0</em>원</p>
									</li>
									<li>
										<strong>할인금액</strong>
										<p><em id="totalDiscountPrice">0</em>원</p>
									</li>
									<li>
										<strong>포인트 사용금액</strong>
										<p><em id="totalPointPrice">0</em>원</p>
									</li>
									<li>
										<strong style="margin-top: 15px; color: #F15F5F;">적립예상금액</strong>
									</li>
									<li>
										<p style="float: left; color: #F15F5F;">Point <em id = point style="font-size: 1.25em">2,250</em> 적립예정</p>
									</li>
								</ul>
							</div>
						</div>
					</div>
					<div class="order_payment_agree">
						<button id="btn_cart">장바구니 가기</button>
						<button id="btn_order" onclick="location='${root}/order/complete.bjbj'">결제하기</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>