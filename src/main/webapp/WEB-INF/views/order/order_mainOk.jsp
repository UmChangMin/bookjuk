<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<C:set var="root" value="${pageContext.request.contextPath}"/>
<script type="text/javascript" src="${root}/js/jquery.js"></script>
</head>
<body>
<C:choose>
		<C:when test="${check == 0}">
			<script type="text/javascript">
				alert("핸드폰번호와 비밀번호를 다시 확인해 주세요.");
				$(location).attr("href","${root}/order/order_main.do");
			</script>
		</C:when>
		
		<C:when test="${check > 0}">
			<script type="text/javascript">
				window.close();
				$(location).attr("href","${root}/arder/order_list.do");
			</script>
		</C:when>
	</C:choose>
</body>
</html>