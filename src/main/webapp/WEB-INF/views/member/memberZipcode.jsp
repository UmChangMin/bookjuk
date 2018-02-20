<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="root" value="${pageContext.request.contextPath}"/>
<title>우편번호 검색</title>
<link rel="stylesheet" type="text/css" href="${root}/css/template/basic.css" />
<link rel="stylesheet" type="text/css" href="${root}/css/member/memberZipcode.css" />
<script type="text/javascript" src="${root }/js/jquery.js"></script>
</head>
<body>
	<!-- 우편번호 시작 강민아-->
	<div align = "center">
		<form action ="" method="post">
			<div id="membnerZipcode">
				<div class="membnerZipcode_title">검색할 동 또는 읍 명을 입력해주세요.</div>

				<div class="membnerZipcode_search">
					<input type="text" name="dong" size="50" /> 
					<input type="submit" value="검색" />
				</div>

			</div>
		</form>
	</div>
	
	 <div align="center">
		<div>
			<c:choose>
				<c:when test="">
					<div>검색된 결과가 없습니다.</div>
				</c:when>
				
				<c:when test="">
					<div><div align="center">아래의 우편번호를 클릭하세요.</div></div>
					<c:forEach var="zipcode" items="">
						<div>
							<div>
								<a href="javascript:"></a>
							</div>
						</div>
					</c:forEach>
				</c:when>
			</c:choose>
		</div>
	</div> 
	<br/>
	<div align="center">
		<a href="javascript:self.close()">닫기</a>
	</div>
</body>
</html>