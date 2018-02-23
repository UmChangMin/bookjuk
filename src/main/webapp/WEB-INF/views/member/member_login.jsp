<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="root" value="${pageContext.request.contextPath}"/>
<link type="text/css" rel="stylesheet" href="${root}/css/member/member_login.css"/>
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<script type="text/javascript" src="${root}/js/member/member_regist.js"></script>
<!-- 로그인 뷰: 엄창민  수정:허단비 -->
<title>Insert title here</title>
</head>
<body>
<div id="login_all">
		<!-- container -->
		<div id="login_container">
			<!--  content -->
			<div id="login_content">
				<!-- 로그인 타이틀 -->
				<div class="login_title">
					<h3>로그인</h3>
				</div>
				<!-- 로그인 메인 -->
				<div class="login_main">
					<form action="#" method="post">
						<fieldset>
							<legend>로그인</legend>
							<div class="login_wrap">
								<div class="login_info">
									<div class="login_input">
										<input type="text" placeholder="아이디" maxlength="20" class="login_id"/>
									</div>
									<div class="login_input">
										<input type="password" placeholder="비밀번호" maxlength="20" class="login_pwd"/>
									</div>
								</div>
								<div class="login_mod">
									<div class="login_keep">
										<input type="checkbox">
										<p>로그인유지</p>
									</div>
									<p>
										<a href="#" class="find_id">아이디 찾기</a>
										<em>|</em>
										<a href="#" class="find_pwd">비밀번호 찾기</a>
									</p>
								</div>
								<div class="login_btn">
									<input type="submit" id="submit" value="로그인">
								</div>
							</div>
						</fieldset>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>