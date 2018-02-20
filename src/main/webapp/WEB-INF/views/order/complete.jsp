<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="root" value="${pageContext.request.contextPath}"/>
<link type="text/css" rel="stylesheet" href="${root}/css/order/complete.css"/>
<link type="text/css" rel="stylesheet" href="${root}/css/template/basic.css"/>
<title>Insert title here</title>
</head>
<body>	
	<div id="complete_all">
		<!-- container -->
		<div id="complete_container">
			<!-- content -->
			<div id="complete_content">
				<!-- 장바구니 타이틀 -->
					<div class="complete_heading">
						<ol class="complete_process">
							<li>
								<h3 class="complete_process_1">01</h3> <span>장바구니</span>
								<h3>></h3>
							</li>
							<li>
								<h3 class="complete_process_2">02</h3> <span>주문/결제</span>
								<h3>></h3>
							</li>
							<li>
								<h3 class="complete_process_3">03</h3> <span>주문완료</span>
								<h3></h3>
							</li>
						</ol>
						<h3 class="complete_basket">주문완료</h3>
					</div>
					<!-- 주문완료 -->
					<div class="complete_sub">
						<div class="order_result_info">
							<h3 class="result_title">주문이 성공적으로 접수 되었습니다.</h3>
							<div class="oredr_info">
								<strong>주문번호(13552618651)</strong>
								<span class="order_col">|</span>
								" XXX 고객님, 감사합니다. "
								<a href="" id="btn_blue"><strong>주문내역 상세보기</strong></a>
							</div>
							<div class="sub_text">
								주문내역 및 배송에 관한 안내는 주문/배송조회 에서 확인 가능합니다.
							</div>
						</div>
						<!-- 배송지 정보 -->
						<div class="complete_info">
							<div class="complete_info_wrap">
								<div class="order_num">
									<label>주문번호</label>
									<span>13552618651</span>
								</div>
								<div class="order_adress_info">
									<label>배송지 정보</label>
									<input type="text" disabled="disabled" id="name" value="강민아"><br/>
									<input type="text" disabled="disabled" id="phone" value="010-XXXX-XXXX"><br/>
									<input type="text" disabled="disabled" id="address" value="(15208) 경기도 안산시 상록구 오리물길 XX">
								</div>
								<div class="order_payment_info">
									<label>결제 정보</label>
									<input type="text" disabled="disabled" id="card" value="신용카드"><br/>
									<input type="text" disabled="disabled" id="card_num" value="국민카드  9495-9400-XXXX-4511"><br/>
									<input type="text" disabled="disabled" id="month" value="일시불"><br/>
									<input type="text" disabled="disabled" id="price" value="40,500원">
								</div>
							</div>
							<!-- 결제 총 금액 -->
							<div class="complete_price">
								<div class="complete_price_sum">
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
										<li style="border-bottom: 1px solid #e2e2e2; padding-bottom:20px; margin-bottom: 20px;">
											<strong>포인트 사용금액</strong>
											<p><em id="totalPointPrice">0</em>원</p>
										</li>
										<li>
											<div class="total_price">
												<span>111,111</span><h5>원</h5>
											</div>
											<h4>결제금액</h4>
										</li>
										<li>
											<p style="color: #F15F5F;">Point <em id = "point">2,250</em> 적립예정</p>
										</li>
									</ul>
								</div>
							</div>
							
								<!-- 배송지 정보 -->
						<div class="complete_info">
							<div class="complete_info_wrap">
								<div class="order_num">
									<label>주문번호</label>
									<span>13552618651</span>
								</div>
								<div class="order_adress_info">
									<label>배송지 정보</label>
									<input type="text" disabled="disabled" id="name" value="강민아"><br/>
									<input type="text" disabled="disabled" id="phone" value="010-XXXX-XXXX"><br/>
									<input type="text" disabled="disabled" id="address" value="(15208) 경기도 안산시 상록구 오리물길 XX">
								</div>
								<div class="order_payment_info">
									<label>결제 정보</label>
									<input type="text" disabled="disabled" id="card" value="무통장 입금"><br/>
									<input type="text" disabled="disabled" id="card_num" value="입금은행  : 국민은행 (57451235968)"><br/>
									<input type="text" disabled="disabled" id="month" value="예금주 : 허단비"><br/>
									<input type="text" disabled="disabled" id="price" value="입금기한 : 2018.01.19">
								</div>
							</div>
							<!-- 결제 총 금액 -->
							<div class="complete_price">
								<div class="complete_price_sum">
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
										<li style="border-bottom: 1px solid #e2e2e2; padding-bottom:20px; margin-bottom: 20px;">
											<strong>포인트 사용금액</strong>
											<p><em id="totalPointPrice">0</em>원</p>
										</li>
										<li>
											<div class="total_price">
												<span>111,111</span><h5>원</h5>
											</div>
											<h4>결제금액</h4>
										</li>
										<li>
											<p style="color: #F15F5F;">Point <em id = "point">2,250</em> 적립예정</p>
										</li>
									</ul>
								</div>
							</div>
						</div>
							
							<!-- 배송지 정보 -->
						<div class="complete_info">
							<div class="complete_info_wrap">
								<div class="order_num">
									<label>주문번호</label>
									<span>13552618651</span>
								</div>
								<div class="order_adress_info">
									<label>배송지 정보</label>
									<input type="text" disabled="disabled" id="name" value="강민아"><br/>
									<input type="text" disabled="disabled" id="phone" value="010-XXXX-XXXX"><br/>
									<input type="text" disabled="disabled" id="address" value="(15208) 경기도 안산시 상록구 오리물길 XX">
								</div>
								<div class="order_payment_info">
									<label>결제 정보</label>
									<input type="text" disabled="disabled" id="card" value="실시간 계좌이체"><br/>
									<input type="text" disabled="disabled" id="card_num" value="국민은행"><br/>
									<input type="text" disabled="disabled" id="account_price" value="40,500원">
								</div>
							</div>
							<!-- 결제 총 금액 -->
							<div class="complete_price">
								<div class="complete_price_sum">
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
										<li style="border-bottom: 1px solid #e2e2e2; padding-bottom:20px; margin-bottom: 20px;">
											<strong>포인트 사용금액</strong>
											<p><em id="totalPointPrice">0</em>원</p>
										</li>
										<li>
											<div class="total_price">
												<span>111,111</span><h5>원</h5>
											</div>
											<h4>결제금액</h4>
										</li>
										<li>
											<p style="color: #F15F5F;">Point <em id = "point">2,250</em> 적립예정</p>
										</li>
									</ul>
								</div>
							</div>
						</div>
						<div class="complete_btn">
							<button id="btn_main" onclick="redirect:location.href='http://localhost:8081/projectbjbj/index.jsp'">쇼핑 계속하기</button>
							<button id="btn_cart">장바구니</button>
							<button id="btn_order_detail">주문내역 상세보기</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>