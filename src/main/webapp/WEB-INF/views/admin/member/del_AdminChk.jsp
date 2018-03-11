<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="root" value="${pageContext.request.contextPath }"/>
<title>관리자 확인</title>
<script type="text/javascript">
	function moveDel(root,member_num) {
		var pw=document.getElementById("member_password").value;
		//alert(pw);
		
		var url=root+"/admin/member/memberManager_deleteOk.do?member_num="+member_num+"&member_password="+pw;
		location.href=url;
	}
</script>
</head>
<body>
	<div>
		<h3>정확한 확인을 위해 관리자의 비밀번호를 입력하여 주세요.</h3>
		<form action="${root }/admin/member/memberManager_deleteOk.do" method="post">
						
			<input type="password" id="member_password" name="member_password" placeholder="관리자 비밀번호"/>
			<button type="button" class="btn btn-primary" id="selected" onclick="moveDel('${root}','${member_num}')">입력</button>
			
		</form>
	</div>
</body>
</html>