<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<C:set var="root" value="${pageContext.request.contextPath}"/>
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<title>로그인</title>
</head>
<body>
	<C:if test="${member_level != null && member_name!=null}">
		
		<C:set var="member_name" value="${member_name}" scope="session"/>
		<C:set var="member_level" value="${member_level}" scope="session"/>
		<C:set var="member_id" value="${member_id}" scope="session"/>
	
		<script type="text/javascript">
			alert("로그인 성공하셨습니다.");
			window.close();
			opener.location.reload();		//부모창 새로고침			
		</script>
	</C:if>
	
	<C:if test="${member_level != null && member_name==null}">
		<script type="text/javascript">
			alert("아이디와 비밀번호를 확인하세요");
			$(location).attr("href","${root}/login.do");
		</script>
	</C:if>
</body>
</html>