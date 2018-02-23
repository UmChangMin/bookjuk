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
<script type="text/javascript" src="${root}/js/member/member.js"></script>
</head>
<body>
	<!-- 회원탈퇴 시작 강민아-->
	<form action="" method="post" onsubmit="return memberDelete(this)">
	<div id="memberDelete_all">
		<div class="memberDeletes">
			<div class="memberDelete">
				<div class="memberDelete_warp">회원탈퇴</div>

				<div class="memberDelete_user_fire">
					<ul>
						<li>- 회원 탈퇴 버튼을 클릭하시면 회원님의 주문, 결제등의 개인 정보 기록을 삭제하므로 신중하게 선택해
							주세요.</li>
						<li>- 재가입시 탈퇴 전에 구매했던 주문 정보등은 복구되지 않습니다.</li>
					</ul>

				</div><br/>
				
				
				<!-- 회원탈퇴 시작 -->
				<div class="memberDelete_start">
					<div class="memberDelete_form">
						<div class="memberDelete_id">
							<div>아이디</div>
							<div>
								<input type="text" disabled="disabled">
							</div>
						</div>
						<div class="memberDelete_pwd">
							<div>비밀번호</div>
							<div>
								<input type="password" name="password" placeholder="비밀번호를 입력하세요.">
							</div>
						</div>
					</div>	
					<!-- 버튼 -->
					<div class="memberDelete_btn">
						<input type="submit" value="회원탈퇴"/>
						<input type="reset" value="취소"/>
					</div>
				</div>
				<!-- 회원탈퇴 끝 -->
			</div>
		</div>
	</div>
	</form>
</body>
</html>