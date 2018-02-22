<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="root" value="${pageContext.request.contextPath}"/>
<link type="text/css" rel="stylesheet" href="${root}/css/member/registe.css"/>
<link type="text/css" rel="stylesheet" href="${root}/css/member/rule1.css"/>
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<script type="text/javascript" src="${root}/js/member/registe.js"></script>

<!-- 회원가입 뷰 :엄창민 , 수정: 허단비  -->
<title>Insert title here</title>
</head>
<body>
	<div id="registe_all">
		<!-- container -->
		<div id="registe_container">
			<!-- content -->
			<div id="registe_content">
				<!-- 회원가입 타이틀 -->
				<div class="registe_title">
				<img alt="닫기" src="${root}/img/main/cancel.png"  onclick='self.close()'>
					<h3>회원가입</h3>
				</div>
				<!-- 회원가입 메인 -->
				<div class="registe_main">
					<form action="#" method="post">
						<fieldset>
						<legend>회원가입</legend>
						<div class="registe-wrap">
							<div class="registe-info">
								<div class="registe-input">
									<input type="text" name="id" placeholder="아이디" maxlength="20" class="registe_id" />
								</div>
								<div class="registe-input">
									<input type="password" name="pwd" placeholder="비밀번호" class="registe_pwd" />
								</div>
								<div class="registe-input">
									<input type="password" name="pwdChk" placeholder="비밀번호 확인" class="registe_pwdChk" />
								</div>
							</div>
							<div class="registe-info mt20">
								<div class="registe-input">
									<input type="text" name="name" placeholder="이름" class="registe_name" />
								</div>
								<div class="registe-input">
									<input type="text" name="email" placeholder="이메일" class="registe_email" />
								</div>
								<div class="registe-input">
									<input type="text" name="email" placeholder="생년월일" class="registe_birthday" />
								</div>
							</div>
							<div class="registe_check">
								<div>
									<div class="registe_checkbox">
										<label>
											<input type="checkbox" id="registe_chk_all">
										</label>
										<p>전체 동의</p>
									</div>
								</div>
								<div>
									<div class="registe_checkbox">
										<label>
											<input type="checkbox" id="registe_chk">
										</label>
										<p>이용약관 동의</p>
										<a class="registe_bt" href="" onclick="rule('${root}')">자세히보기</a>
									</div>
								</div>
								<div>
									<div class="registe_checkbox">
										<label>
											<input type="checkbox" id="registe_chk">
										</label>
										<p>개인정보 취급 방침</p>
										<a href="#" class="registe_bt" onclick="rule2('${root}')">자세히보기</a>
									</div>
								</div>
								<div>
									<div class="registe_checkbox">
										<label>
											<input type="checkbox" id="registe_chk">
										</label>
										<p>이메일 수신 동의</p>
									</div>
								</div>
							</div>
							<div class="registe_btn">
								<input type="submit" id="submit" value="가입하기"/>
							</div>
						</div>
					</fieldset>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>