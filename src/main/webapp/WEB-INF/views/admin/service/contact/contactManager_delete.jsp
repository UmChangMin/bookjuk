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
	function deleteChk(contact_num,pageNumber) {
		var btn_check=confirm("정말로 삭제하시겠습니까?");
		var url=""
		if(btn_check==true){
			location.href="/bookjuk/admin/service/contact/contactManager_deleteOk.do?contact_num="+contact_num+"&pageNumber="+pageNumber;			
		}else if(btn_check==false){
			//alert("처음부터 다시 진행해주세요.");
			location.href="/bookjuk/admin/service/contact/contactManager_read.do?contact_num="+contact_num+"&pageNumber="+pageNumber;
		}	
	}
</script>

</head>
<body onload="deleteChk('${contact_num}','${pageNumber }')">
	
</body>
</html>