<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원탈퇴</title>
<c:set var="root" value="${pageContext.request.contextPath }" />
<link rel="stylesheet" type="text/css" href="${root}/css/template/basic.css"/>
<link rel="stylesheet" type="text/css" href="${root}/css/member/member_delete.css"/>
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<script type="text/javascript" src="${root}/js/member/member_delete.js"></script>
</head>
<body>
	<!-- 회원비밀번호 재확인 시작 강민아-->
	<form action="${root}/member/update/checkOk.do" method="POST">
	
	<div id="memberDelete_all">
		<div class="memberDeletes">
			<div class="memberDelete">
				<div class="memberDelete_warp">비밀번호 재확인</div>

				<div class="memberDelete_user_fire">
					<ul>
						<li>- 회원님의 정보를 안전하게 보호하기 위해 비밀번호를 다시 한 번 확인합니다.</li>
						<li>- 비밀번호는 다른 사람에게 노출되지 않도록 주의해주시기 바랍니다.</li>
					</ul>

				</div><br/><br/>  
				
				
				<!-- 회원비밀번호 재확인 시작 -->
				<div class="memberDelete_start">
					<div class="memberDelete_form">
						<div class="memberDelete_id">
							<div>아이디</div>
							<div>
								<input type="text" value="${member_id}" disabled="disabled"/>
								<input type="hidden" name="member_id" value="${member_id}"/>
							</div>
						</div>
						<div class="memberDelete_pwd">
							<div>비밀번호</div>
							<div>
								<input type="password" name="member_password" placeholder="비밀번호를 입력하세요.">
							</div>
						</div>
					</div>	
					<!-- 버튼 -->
					<div class="memberDelete_btn">
						<input type="submit" value="확인"/>
						<input type="reset" value="취소"/>
					</div>
				</div>
				<!-- 회원비밀번호 재확인 끝 -->
			</div>
		</div>
	</div>
	</form>
</body>
</html>