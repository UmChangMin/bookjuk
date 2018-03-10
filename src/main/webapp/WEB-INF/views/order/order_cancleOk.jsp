<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="root" value="${pageContext.request.contextPath}"/>
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${order_state eq '교환요청중'}">
			<script type="text/javascript">
				alert("교환 요청이 완료되었습니다. 1:1문의 게시판에 교환 요청 게시글 작성해주세요.");
				$(location).attr("href","${root}/service/contact/write.do");
			</script>
		</c:when>
		
		<c:when test="${order_state eq '반품요청중'}">
			<script type="text/javascript">
				alert("반품 요청이 완료되었습니다. 1:1문의 게시판에 반품 요청 게시글 작성해주세요.");
				$(location).attr("href","${root}/service/contact/write.do");
			</script>
		</c:when>
		
		<c:when test="${order_state eq '주문취소'}">
			<script type="text/javascript">
				alert("주문이 취소되었습니다.");
				$(location).attr("href","${root}/order/list/cancle.do");
			</script>
		</c:when>
	</c:choose>
</body>
</html>