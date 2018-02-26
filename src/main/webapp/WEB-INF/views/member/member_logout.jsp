<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="root" value="${pageContext.request.contextPath}"/>
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<title>Insert title here</title>
</head>
<body>
	<c:remove var="member_id" scope="session"/>
	<c:remove var="member_level" scope="session"/>
	<script type="text/javascript">
		alert("로그아웃 되었습니다.");
		$(location).attr("href","${root}/main.do");
	</script>
</body>
</html>