<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>����</title>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<script type="text/javascript" src="${root }/js/admin/service_contact.js"></script>
<script type="text/javascript"></script>
<script type="text/javascript">

	function deleteChk(book_num) {
		var btn_check=confirm("������ �����Ͻðڽ��ϱ�?");
		
		if(btn_check==true){
			location.href="/bookjuk/admin/book/bookManager_deleteOk.do?book_num="+book_num;			
		}else if(btn_check==false){
			//alert("ó������ �ٽ� �������ּ���.");
			location.href="/bookjuk/admin/book/bookManager.do";
		}	
	}
</script>

</head>
<body onload="deleteChk('${book_num}')">
	
</body>
</html>