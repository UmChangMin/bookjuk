<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="root" value="${pageContext.request.contextPath}"/>
<title>Insert title here</title>
</head>
<body>
	<c:if test = "${id == null}">
		<script type="text/javascript">
			alert("ID 찾기에 실패하였습니다.");
			location.replace("${root}/member/findId.do");
		</script>
	</c:if>
		
	<c:if test="${id != null}">
		<script type="text/javascript">
			alert("ID는 ${id}입니다.");
			location.replace("${root}/member/login.do");
		</script>
	</c:if>
</body>
</html>