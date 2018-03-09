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
<script type="text/javascript" src="${root}/js/member/member_find_id.js"></script>
<title>Insert title here</title>

</head>
<body>
<div id="login_all">
		<!-- container -->
		<div id="login_container">
			<!--  content -->
			<div id="login_content">
				<!-- 아이디찾기 타이틀 -->
				<div class="login_title">
					<h3>아이디찾기</h3>
				</div>
				<!-- 아이디찾기 메인 -->
				<div class="login_main">
					<form action="${root}/member/findId.do" method="post">
						<fieldset>
							<div class="login_wrap">
								<div class="login_info">
									<div class="login_input">
										<input type="text" name="member_name" placeholder="이름" class="registe_name" />
									</div>
									<div class="login_input">
										<input type="text" name="member_email" placeholder="이메일" class="registe_email" />
									</div>
								</div>
								<div class="login_btn">
									<input type="submit" id="submit" value="확인" >
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