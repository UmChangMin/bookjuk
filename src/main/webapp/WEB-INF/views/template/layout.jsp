<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>북적북적</title>
</head>
<body>

	<!-- main layout -->
	<!--  header -->
	<tiles:insertAttribute name="mainheader"/>
	
	<!-- content -->
	<tiles:insertAttribute name="content"/>

	
	<!-- footer  -->
	<tiles:insertAttribute name="footer"/>
</body>
</html>