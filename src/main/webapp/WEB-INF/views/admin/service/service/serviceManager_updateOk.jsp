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
	<%-- <c:set var="pageNumberV" value="${pageNumber }"/> --%>
	<c:if test="${check>0 }">
		<script type="text/javascript">
			alert("공지사항 작성 완료");
			$(location).attr("href","${root}/admin/service/service/serviceManager.do?pageNumber=1");
		</script>
	</c:if>
	
	<c:if test="${check==0 }">
		<script type="text/javascript">
			alert("작성 에러");
			$(location).attr("href","${root}/admin/service/service/serviceManager.do?pageNumber=1");
		</script>
	</c:if>
</body>
</html>