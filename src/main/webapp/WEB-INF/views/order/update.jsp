<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="root" value="${pageContext.request.contextPath}"/>
<link type="text/css" rel="stylesheet" href="${root}/css/member/update.css"/>
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<title>회원정보수정</title>
</head>
<body>
	<div id="update_all">
		<!-- container -->
		<div id="update_container">
			<!-- content -->
			<div id="update_content">
				<!-- 회원정보수정 타이틀 -->
				<div class="update_title">
					<h3>회원정보 수정</h3>
				</div>
				<!-- 회원정보수정 메인 -->
				<div class="update_main">
					<form action="#" method="post">
						<fieldset>
							<legend>회원정보수정</legend>
							<table class="update_info">
								<tr><th colspan="2">회원정보수정</th></tr>
								<tr>
									<th><label>북적북적 ID</label></th>
									<td><strong style="text-align: center">${sessionScope.id}</strong></td>
								</tr>
								<tr>
									<th><label>이름</label></th>
									<td>
										<div class="update_input">
											<input type="text" class="name"/>
										</div>
									</td>
								</tr>
								<tr>
									<th><label>닉네임</label></th>
									<td>
										<div class="update_input">
											<input type="password" class="pwd"/>
										</div>
									</td>
								</tr>
								<tr>
									<th><label>E-mail</label></th>
									<td>
										<div class="update_input">
											<input type="text" class="email"/>
										</div>
									</td>
								</tr>
								<tr>
									<th><label>E-mail 수신</label></th>
									<td align="center">
										<input type="radio" name="email_ok" value="yes"/>YES
										<input type="radio" name="email_ok" value="no"/>NO
									</td>
								</tr>
								<tr>
									<th><label>우편번호</label></th>
									<td><input type="text" name="zipcode"/></td>
								</tr>
								<tr>
									<th><label>상세주소</label></th>
									<td><input type="text" name="address"/></td>
								</tr>
								<tr>
									<th><label>핸드폰 번호</label></th>
									<td>
										<input type="text" name="phone1" size="3"/>-
										<input type="text" name="phone2" size="3"/>-
										<input type="text" name="phone3" size="3"/>
									</td>
								</tr>
								<tr>
									<td align="center" colspan="2">
										<input type="submit" value="수정"/>
										<input type="reset" value="취소"/>
									</td>
								</tr>
							</table>
							<div class="update_info">
								<div class="update_input">
									<input type="text" disabled="disabled"/>
								</div>
								<div class="update_input">
									<input type="text" class="name"/>
								</div>
								<div class="update_input">
									<input type="text" class="pwd"/>
								</div>
								<div class="update_input">
									<input type="text" class="email"/>
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