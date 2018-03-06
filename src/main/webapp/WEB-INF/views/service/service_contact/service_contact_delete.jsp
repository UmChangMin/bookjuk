<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>삭제</title>
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<script type="text/javascript" src="${root}/js/notice/board.js"></script>

</head>
<body>
		
	<c:if test="${check>0 }">
		<script type="text/javascript">
		alert("게시글이 삭제되었습니다.");
		location.href="${root}/service/contact/list.do";
		</script>
	</c:if>

	<c:if test="${check == 0 }">
		<script type="text/javascript">
			alert("게시글이 삭제되지 않았습니다.");
			location.href="${root}/service/contact/list.do";
		</script>
	</c:if>

</body>
</html>