<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>사용자 search헤더 </title>
</head>
<body>
	<!-- search_header  -->
	<tiles:insertAttribute name="search_header"/>
	
	<!-- content -->
	<tiles:insertAttribute name="content"/>
	
	<!-- foot  -->
	<tiles:insertAttribute name="footer"/>
</body>
</html>