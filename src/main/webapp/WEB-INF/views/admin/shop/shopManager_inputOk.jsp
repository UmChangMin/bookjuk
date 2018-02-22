<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<c:set var="root" value="${pageContext.request.contextPath }"></c:set>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>영업점 추가</title>
</head>
<body>
	<c:choose>
		<c:when test="${check==0 }">
		<script type="text/javascript">
			alert("추가 실패.");
 			location.href="${root}/admin/shop/shopManager_search.do";			
		</script>
		</c:when>
		<c:when test="${check>0 }">
		<script type="text/javascript">
			alert("추가 완료.");
			location.href="${root}/admin/shop/shopManager_search.do";
		</script>
		</c:when>
	</c:choose>
</body>
</html>