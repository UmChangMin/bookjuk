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
		<C:when test="${check==0 }">
			<script type="text/javascript">
				alert("회원가입에 실패하였습니다.");
				$(location).attr("href","${root}/user/member/regist.do");
			</script>
		</C:when>
		
		<C:when test="${check>0 }">
			<script type="text/javascript">
				alert("회원가입 축하드립니다.더 많은 서비스를 이용하시려면 로그인 하세요");
				$(location).attr("href","${root}/user/main/main.do");
			</script>
		</C:when>
	</C:choose>
</body>
</html>