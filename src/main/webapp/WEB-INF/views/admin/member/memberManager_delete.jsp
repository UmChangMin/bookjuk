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
	function deleteChk(root,member_num) {
		var btn_check=confirm("������ �����Ͻðڽ��ϱ�?");
		var url=root+"/admin/member/memberManager";
		
		if(btn_check==true){
			//winOpen(root,member_num);
			//location.href=url+"_deleteOk.do?member_num="+member_num;
			location.href="del_AdminChk.do?member_num="+member_num;
		}else if(btn_check==false){
			alert("ó������ �ٽ� �������ּ���.");
			location.href=url+".do?member_num="+member_num;			
		}	
	}
	
	function winOpen(root,member_num) { 
		window.open(root+"/admin/member/del_AdminChk.do?member_num="+member_num, "", "width=400, height=300, left=500, top=400")
	}
</script>

</head>
<body onload="deleteChk('${root }','${member_num}')">
	
</body>
</html>