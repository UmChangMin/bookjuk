<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="root" value="${pageContext.request.contextPath }"/>
<title>게시판</title>
<script src="//code.jquery.com/jquery-3.3.1.min.js"></script>
</head>
<body>
	<c:if test="${check>0 }">
		<script type="text/javascript">
			alert("삭제가 완료되었습니다.");
			$(location).attr("href","${root}/admin/service/service/serviceManager.do");

		</script>
	</c:if>
	
	<c:if test="${check==0 }">
		<script type="text/javascript">
			alert("※삭제오류발생!");
			$(location).attr("href","${root}/admin/service/service/serviceManager.do");
			//?pageNumber=${pageNumber}

		</script>
	</c:if>
</body>
</html>