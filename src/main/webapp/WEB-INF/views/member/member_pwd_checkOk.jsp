<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="root" value="${pageContext.request.contextPath}"/>
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<title>회원수정</title>
</head>
<body>
	<c:if test="${member_num == 0}">
		<script type="text/javascript">
			alert("입력하신 비밀번호가 맞지 않습니다.");
			$(location).attr("href","${root}/member/update/check.do");
		</script>
	</c:if>

	<c:if test="${member_num > 0}">
		<script type="text/javascript">
			$(location).attr("href","${root}/member/update.do?member_num=${member_num}");
		</script>
	</c:if>
</body>
</html>