<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>삭제</title>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<script type="text/javascript" src="${root }/js/admin/service_contact.js"></script>
<script type="text/javascript"></script>
<script type="text/javascript">

	function deleteChk(question_num) {
		var btn_check=confirm("정말로 삭제하시겠습니까?");
		
		if(btn_check==true){
			location.href="/bookjuk/admin/service/service/serviceManager_deleteOk.do?question_num="+question_num;			
		}else if(btn_check==false){
			//alert("처음부터 다시 진행해주세요.");
			location.href="/bookjuk/admin/service/service/serviceManager_update.do?question_num="+question_num;
		}	
	}
</script>

</head>
<body onload="deleteChk('${question_num}')">
	
</body>
</html>