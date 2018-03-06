<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="root" value="${pageContext.request.contextPath }"/>
<title>게시판</title>
</head>
<body>
	
	<c:if test="${check > 0 }">
		<script type="text/javascript">
			alert("글쓰기가 완료 되었습니다.");
			location.href="${root}/service/contact/list.do";
		</script>
	</c:if>
	
	<c:if test="${check==0}">
		<script type="text/javascript">
			alert("글쓰기가 정상처리 되지 않았습니다.");
			location.href="${root}/service/contact/write.do";
		</script>
	</c:if>

</body>
</html>