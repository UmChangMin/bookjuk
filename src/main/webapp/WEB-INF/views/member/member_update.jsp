<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="root" value="${pageContext.request.contextPath}"/>
<link rel="stylesheet" type="text/css" href="${root}/css/template/basic.css"/>
<link type="text/css" rel="stylesheet" href="${root}/css/member/member_update.css"/>
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<script type="text/javascript" src="${root}/js/member/member_update.js"></script>
<title>회원정보수정</title>
</head>
<body>
	<!-- 회원수정 시작 강민아-->
	<form action="${root}/member/updateOk.do" method="post" onsubmit="return memberUpdate(this)">
	<input type="hidden" name="member_num" value="${memberDto.member_num}"/>
	<div id="memberUpdate_all">
		<div class="memberUpdates">
			<div class="memberUpdate">
				<div class="memberUpdate_warp">회원정보수정</div>
				<div class="memberUpdate_inner">
					<div class="memberUpdate_necessary">
						<p>필수입력항목</p>
						<div class="memberUpdate_necessary_inner">
							<div class="memberUpdate_id">
								<div>아이디</div>
								<div>
									<input type="text" disabled="disabled" name="member_id" value="${memberDto.member_id}">
								</div>
							</div>
							<div class="memberUpdate_com">
								<div>이름</div>
								<div class="update_input">
									<input type="text" name="member_name" class="update_name" id="nameChk" value="${memberDto.member_name}" oninput="checkName()">
								</div>
							</div>
							<div class="memberUpdate_com">
								<div>비밀번호</div>
								<div class="update_input">
									<input type="password" name="member_password" class="update_pwd" id="pwdChk" value="${memberDto.member_password}" oninput="checkPwd()">
								</div>
							</div>
							<div class="memberUpdate_com">
								<div>비밀번호 확인</div>
								<div class="update_input">
									<input type="password" name="member_passwordOk" class="update_pwdChk" id="rePwdChk" value="${memberDto.member_password}" oninput="reCheckPwd()">
								</div>
							</div>
							
							<div class="memberUpdate_email">
								<div>이메일</div>
								<div class="update_input">
									<input type="text" name="member_email" class="update_email" id="emailChk" value="${memberDto.member_email}" oninput="checkEmail()">
								</div>
							</div>
						</div>
					</div>
					<br/><br/>
					<!-- 선택사항 시작 -->
					<div class="memberUpdate_options">
						<p>선택입력항목</p>
						<div class="memberUpdate_options_inner">
							<div class="memberUpdate_zips">
								<div>우편번호</div>
								<div class="update_input" id="memberUpdate_zip">
									<input type="text" class="update_postcode" id="zipcode" placeholder="우편번호를 검색해주세요" name="member_postcode" value="${memberDto.member_postcode}"><input type="button" value="우편번호" onclick="zipcodeRead('${root}')">
								</div>
							</div>
							
							<div class="memberUpdate_com">
								<div>주소</div>
								<div class="update_input">
									<input type="text" class="update_addr" id="address1" placeholder="주소를 입력해주세요" name="member_address" value="${memberDto.member_address}">
								</div>
								<div class="update_input">
								<input type="text" class="update_addr_detail" id="address2" placeholder="상세주소를 입력해주세요" name="member_address_detail" value="${memberDto.member_address_detail}">
								</div>
							</div>

							<div class="memberUpdate_com">
								<div>휴대폰번호</div>
								<div class="update_input">
									<input type="text" class="update_phone" id="phone" placeholder="휴대폰 번호를 입력해주세요." name="member_phone" value="${memberDto.member_phone}">
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- 선택사항 끝 -->
				<div class="memberDelete_btn" align="center">
					<input type="submit" value="회원수정">
					<input type="reset" value="취소">
				</div>
			</div>
		</div>
	</div>
	</form>
</body>
</html>