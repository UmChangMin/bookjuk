<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>1:1문의 읽기</title>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<link rel="stylesheet" type="text/css" href="${root}/css/template/basic.css" />
<link rel="stylesheet" type="text/css" href="${root}/css/customer/customer_basic.css" />
<link rel="stylesheet" type="text/css" href="${root}/css/customer/cutomer_inquiry_read.css" />
<script type="text/javascript" src="${root }/js/jquery.js"></script>
<script type="text/javascript" src="${root}/js/customer/customer_inquiry.js"></script>

</head>
<body>
	<!-- 고객센터 1:1문의 시작 강민아-->
	<div id="customer_all">
		<div class="customer">
		<div class="cutomers">
			<div class="customer_warp">고객센터</div>
			<div class="customer_tab">
				<ul>
					<li><a href="${root}/customer/customer.do" class="customer_fna"><img src="${root}/img/customer/question.png">자주하는질문</a></li>
					<li><a href="${root}/customer/notice/list.do" class="customer_notice"><img src="${root}/img/customer/information.png">공지사항</a></li>
					<li><a href="${root}/customer/inquiry/list.do" class="customer_inquiry"><img src="${root}/img/customer/customer_inquiry_pink.png">1:1문의</a></li>
				</ul>
			</div>
			<!-- 내용부분 시작 -->
			<div class="customer_content">
			
				<div class="cutomer_title">
					<div class="customer_content01"><span>제목</span></div>
					<div class="customer_content02"><div>주문취소입니다.</div></div>
				</div>
				
				<div class="cutomer_kind">
					<div class="customer_content01"><span>문의유형</span></div>
					<div class="customer_content02"><div>주문취소</div></div>
				</div>
				
				<div class="customer_inquiry_content">
					<div class="customer_content01"><span>내용</span></div>
					<div class="customer_content02"><div>내용.내용.내용.2MB 이하의 이미지파일 및 5MB 이하의 *hwp, *doc, *docx 확장자만 첨부 가능합니다.2MB 이하의 이미지2MB 이하의 이미지파일 및 5MB 이하의 *hwp, *doc, *docx 확장자만 첨부 가능합니다.2MB 이하의 이미지2MB 이하의 이미지파일 및 5MB 이하의 *hwp, *doc, *docx 확장자만 첨부 가능합니다.2MB 이하의 이미지파일 및 5MB 이하의 *hwp, *doc, *docx 확장자만 첨부 가능합니다.</div></div>
				</div>
				
				<!-- 답변이 완료되었을 경우 시작 && 답변 대기중이면 보이지 않아야 함 -->
				<div class="customer_inquiry_answer">
					<div class="customer_content01"><span>답변</span></div>
					<div class="customer_content02"><div>내용.내용.내용.2MB 이하의 이미지파일 및 5MB 이하의 *hwp, *doc, *docx 확장자만 첨부 가능합니다.2MB 이하의 이미지2MB 이하의 이미지파일 및 5MB 이하의 *hwp, *doc, *docx 확장자만 첨부 가능합니다.2MB 이하의 이미지2MB 이하의 이미지파일 및 5MB 이하의 *hwp, *doc, *docx 확장자만 첨부 가능합니다.2MB 이하의 이미지파일 및 5MB 이하의 *hwp, *doc, *docx 확장자만 첨부 가능합니다.</div></div>
				</div>
				<!-- 답변이 완료되었을 경우 끝 -->
				
				
			</div>
			<!-- 내용부분 끝 -->

			<!-- 버튼시작 -->
			<div class="customer_inquiry_button" align="center">
				<input type="button" value="수정" onclick="location.href='${root}/customer/inquiry/update.do'"/>
				<input type="button" value="목록" onclick="location.href='${root}/customer/inquiry/list.do'"/>
				<input type="button" value="삭제" onclick="inquiryDelete()"/><!-- alert창 띄우고 삭제하시겠습니까? -->
			</div>
			<!-- 버튼 끝 -->
			</div>
		</div>
	</div>
	<!-- 고객센터 1:1문의 끝-->
</body>
</html>