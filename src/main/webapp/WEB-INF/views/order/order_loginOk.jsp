<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<script type="text/javascript" src="${root}/js/jquery.js"></script>
</head>
<body>
	<c:choose>
		<c:when test="${order_num == 0}">
			<script type="text/javascript">
				alert("입력 정보를 다시 확인해주세요.");
				$(location).attr("href","${root}/order/login.do");
			</script>
		</c:when>
		
		<c:when test="${order_num > 0}">
			<script type="text/javascript">
				window.close();
				opener.location.replace("${root}/order/list.do?order_num=${order_num}");
			</script>
		</c:when>
	</c:choose>
</body>
</html>