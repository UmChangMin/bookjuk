<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>        
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>타이틀메뉴</title>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script> 
 <link rel="stylesheet" type="text/css" href="${root }/css/commons/main.css">
</head>
<body>
	<div class="header" align="center">
			<nav class="navbar navbar-expand-lg navbar-light bg-light">
			  <a class="navbar-brand" href="#">
			  	<img src="${root}/img/logo/bookjuk_headlogo.png">
			  </a>
			  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor03" aria-controls="navbarColor03" aria-expanded="false" aria-label="Toggle navigation" style="">
			    <span class="navbar-toggler-icon"></span>
			  </button>
			
			  <div class="collapse navbar-collapse" id="navbarColor03">
			   <ul class="navbar-nav mr-auto">
			      <li class="nav-item">
			        <a class="nav-link" href="${root }/admin/sales/salesManager.do">영업관리 <span class="sr-only">(current)</span></a>
			      </li>
			      <li class="nav-item">
			        <a class="nav-link" href="${root }/admin/order/orderManager.do">주문관리</a>
			      </li>
			      <li class="nav-item">
			        <a class="nav-link" href="${root }/admin/customer/customerManager.do">고객관리</a>
			      </li>
			      <li class="nav-item">
			        <a class="nav-link" href="${root }/admin/book/bookManager.do">도서관리</a>
			      </li>
	        	  <li class="nav-item">
			        <a class="nav-link" href="${root }/admin/service/service/serviceManager.do">고객센터관리</a>
			      </li>
			      <li class="nav-item">
			        <a class="nav-link" href="${root }/admin/shop/shopManager.do">영업점관리</a>
			      </li>
			    </ul>			  
			  </div>
			</nav>
		</div>
		<!-- 타이틀메뉴 끝 -->
</body>
</html>