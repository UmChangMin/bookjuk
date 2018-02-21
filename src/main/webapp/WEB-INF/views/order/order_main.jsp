<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>주문/배송조회</title>
<link rel="stylesheet" type="text/css"href="${root}/css/template/basic.css" />
<link rel="stylesheet" type="text/css"href="${root}/css/order/order_main.css" />
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<script type="text/javascript" src="${root}/js/registe/registe.js"></script>
<!-- 주문배송조회 뷰:허단비 -->
</head>
<body>
<div id="order">
		<div id="order_container">

			<div id="order_content">
			
				<div class="order_title">
					<img alt="닫기" src="${root}/img/main/cancel.png"  onclick='self.close()' class="order_close">
					<h3>주문배송조회</h3>
				</div>

				<div class="order_main">
					<form action="#" method="post">
						<div class="order_wrap">
							<div class="order_info">
								<div class="order_input">
									<input type="text" placeholder="핸드폰 번호" maxlength="20" class="order_phonenumber"/>
								</div>
								<div class="order_input">
									<input type="password" placeholder="비밀번호" maxlength="20" class="order_pwd"/>
								</div>
							</div>
							<br/>
							<div class="order_btn">
								<input type="submit" id="order_btn" value="확인">
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>