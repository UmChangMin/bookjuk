<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="root" value="${pageContext.request.contextPath}"/>
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<title>로그인</title>
</head>
<body>
	<c:if test="${member_level != null && member_name!=null}">
		
		<c:set var="member_name" value="${member_name}" scope="session"/>
		<c:set var="member_level" value="${member_level}" scope="session"/>
		<c:set var="member_id" value="${member_id}" scope="session"/>
		<c:if test="${cart eq 'cart'}">
		<script type="text/javascript">
			/* alert("로그인 성공하셨습니다."); */
			window.close();
			opener.location.replace("${root}/order/order.do?order_id=${member_id}");		//부모창 새로고침			
		</script>
		</c:if>
		<script type="text/javascript">
			/* alert("로그인 성공하셨습니다."); */
			window.close();
			opener.location.reload();		//부모창 새로고침
		</script>
		
	</c:if>
	
	<c:if test="${member_level == null && member_name==null}">
		<script type="text/javascript">
			alert("아이디와 비밀번호를 확인하세요");
			$(location).attr("href","${root}/member/login.do");
		</script>
	</c:if>
</body>
</html>