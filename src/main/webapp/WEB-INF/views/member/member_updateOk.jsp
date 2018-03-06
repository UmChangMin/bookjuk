<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="root" value="${pageContext.request.contextPath}"/>
<script type="text/javascript" src="${root}/js/jquery/jquery.js"></script>
<title>회원수정</title>
</head>
<body>
	<c:if test="${check == 0}">
		<script type="text/javascript">
			alert("회원 정보 수정에 실패하였습니다.");
			location.href="${root}/member/update.do";
			$(location).attr("href","${root}/member/update.do");
		</script>
	</c:if>

	<c:if test="${check > 0}">
		<script type="text/javascript">
			alert("회원 정보 수정에 성공하였습니다.");
			$(location).attr("href","${root}/member/update.do");
		</script>
	</c:if>
</body>
</html>