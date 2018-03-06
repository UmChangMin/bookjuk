<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="root" value="${pageContext.request.contextPath}"/>
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<title>회원 탈퇴</title>
</head>
<body>
	<c:if test="${check > 0}">
		<c:remove var="member_name" scope="session"/>
		<c:remove var="member_level" scope="session"/>
		<c:remove var="member_id" scope="session"/>
		
		<script type="text/javascript">
			alert("회원탈퇴가 완료되었습니다.");
			$(location).attr("href","${root}/index.jsp");
		</script>
	</c:if>

	<c:if test="${check == 0}">
		<script type="text/javascript">
			alert("회원탈퇴 실패하였습니다.");
			$(location).attr("href","${root}/member/delete.do");
		</script>
	</c:if>
	
</body>
</html>