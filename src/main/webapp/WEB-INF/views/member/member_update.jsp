<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="root" value="${pageContext.request.contextPath}"/>
<link rel="stylesheet" type="text/css" href="${root}/css/template/basic.css"/>
<link type="text/css" rel="stylesheet" href="${root}/css/member/member_update.css"/>
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<script type="text/javascript" src="${root}/js/member/member.js"></script>
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
								<div>
									<input type="text" name="member_name" value="${memberDto.member_name}">
								</div>
							</div>
							<div class="memberUpdate_com">
								<div>비밀번호</div>
								<div>
									<input type="password" name="member_password" value="${memberDto.member_password}">
								</div>
							</div>
							<div class="memberUpdate_com">
								<div>비밀번호 확인</div>
								<div>
									<input type="password" name="member_passwordOk" value="${memberDto.member_password}">
								</div>
							</div>
							
							<div class="memberUpdate_email">
								<div>이메일</div>
								<div>
									<input type="text" name="member_email" value="${memberDto.member_email}">
									<!-- <span>&nbsp;@</span>
									<select>
										<option value="">선택하세요.</option>
										<option value="naver.com">naver.com</option>
										<option value="nate.com">nate.com</option>
										<option value="gmail.com">gmail.com</option>
										<option value="daum.net">daum.net</option>
									</select> -->
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
								<div class="memberUpdate_zip">
									<input type="text" id="zipcode" placeholder="우편번호를 검색 하세요" name="member_postcode" value="${memberDto.member_postcode}"><input type="button" value="우편번호" onclick="zipcodeRead('${root}')">
								</div>
							</div>
							
							<div class="memberUpdate_com">
								<div>주소</div>
								<div>
									<input type="text" id="address1" placeholder="주소를 입력하세요" name="member_address" value="${memberDto.member_address}">
								</div>
								<div>
								<input type="text" id="address2" placeholder="상세주소를 입력하세요" name="member_address_detail" value="${memberDto.member_address_detail}">
								</div>
							</div>

							<div class="memberUpdate_com">
								<div>휴대폰번호</div>
								<div>
									<input type="text" placeholder=" - 빼고 입력하세요." name="member_phone" value="${memberDto.member_phone}">
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