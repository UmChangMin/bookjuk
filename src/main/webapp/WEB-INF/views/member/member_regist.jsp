<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="root" value="${pageContext.request.contextPath}"/>
<link type="text/css" rel="stylesheet" href="${root}/css/member/member_regist.css"/>
<link type="text/css" rel="stylesheet" href="${root}/css/member/member_rule1.css"/>
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<script type="text/javascript" src="${root}/js/member/member_regist.js"></script>
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
				
					<h3>회원가입</h3>
				</div>
				<!-- 회원가입 메인 -->
				<div class="registe_main">
					<form action="${root}/member/regist.do" method="post">
						<fieldset>
						<legend>회원가입</legend>
						<div class="registe-wrap">
							<div class="registe-info">
								<div class="registe-input">
									<input type="text" name="member_id" placeholder="아이디" maxlength="20" class="registe_id" oninput="checkId()" id="idChk"/>
								</div>
								<div class="registe-input">
									<input type="password" name="member_password" placeholder="비밀번호" class="registe_pwd" oninput="checkPwd()" id="pwdChk"/>
								</div>
								<div class="registe-input">
									<input type="password" name="member_passwordChk" placeholder="비밀번호 확인" class="registe_pwdChk" oninput="reCheckPwd()" id="rePwdChk"/>
								</div>
							</div>
							<div class="registe-info mt20">
								<div class="registe-input">
									<input type="text" name="member_name" placeholder="이름" class="registe_name" oninput="checkName()" id="nameChk"/>
								</div>
								<div class="registe-input">
									<input type="text" name="member_email" placeholder="이메일" class="registe_email" oninput="checkEmail()" id="emailChk"/>
								</div>
								<div class="registe-input">
									<input type="text" name="member_birth" placeholder="생년월일" class="registe_birthday" oninput="checkBirth()" id="birthChk"/>
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
										<a class="registe_bt" href="javascript:viod(0);" onclick="rule('${root}')">자세히보기</a>
									</div>
								</div>
								<div>
									<div class="registe_checkbox">
										<label>
											<input type="checkbox" id="registe_chk">
										</label>
										<p>개인정보 취급 방침</p>
										<a href="javascript:viod(0);" class="registe_bt" onclick="rule2('${root}')">자세히보기</a>
									</div>
								</div>
								<div>
									<div class="registe_checkbox">
										<label>
											<input type="checkbox" name="member_mailing" id="email_chk">
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