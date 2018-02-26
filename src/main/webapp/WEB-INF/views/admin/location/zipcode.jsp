<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<c:set var="root" value="${pageContext.request.contextPath }"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>우편번호</title>
<link rel="stylesheet" type="text/css" href="${root }/css/admin/location/zipcode.css">	
<link rel="stylesheet" type="text/css" href="${root }/css/admin/commons/main.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script> 
<script type="text/javascript" src="${root}/js/admin/location.js"></script>
</head>
<body>
	<div align="center">
		<!-- 검색라인 -->
		<form action="${root }/admin/location/zipcode.do" method="get">
			<div>
				<ul>
					<li>
						<h3 class="zipcode_margin-top">주소록 검색</h3>
						<input type="text" name="dong" class="dong_width"/>
						<input type="submit" value="검색" class="btn btn-primary"/>
					</li>
				</ul>
			</div>			
		</form>
		<div align="center">
			<c:choose>				
				<c:when test="${zipcodeList.size()==0 }">
					<div>검색된 결과가 없습니다.</div>
				</c:when>
							 
				<c:when test="${zipcodeList.size()>0 }">
					<div align="left" class="zipcode_body">
						<!-- List -->
						<c:forEach var="zipcode" items="${zipcodeList }">
								<ul>
									<li>
										<a href="javascript:sendAddress('${zipcode.zipcode }', '${zipcode.sido }', '${zipcode.gugun }', '${zipcode.dong}', '${zipcode. ri}', '${zipcode.bunji}')">
										${zipcode.zipcode } ${zipcode.sido } ${zipcode.gugun } ${zipcode.dong} ${zipcode. ri} ${zipcode.bunji} </a>
									</li>
								</ul>
						</c:forEach>
					</div>	
				</c:when>
			</c:choose>
		</div>
		
		<div align="center">
			<input type="button" onclick="javascript:self.close()" value="닫기" class="btn btn-default">
		</div>
		
	</div>
</body>
</html>