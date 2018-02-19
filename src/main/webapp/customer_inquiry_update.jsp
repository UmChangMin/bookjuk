<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>1:1문의 수정</title>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<link rel="stylesheet" type="text/css" href="${root}/css/template/basic.css" />
<link rel="stylesheet" type="text/css" href="${root}/css/customer/customer_basic.css" />
<link rel="stylesheet" type="text/css" href="${root}/css/customer/cutomer_inquiry_write.css" />
<script type="text/javascript" src="${root }/js/jquery.js"></script>
<script type="text/javascript" src="${root}/js/customer/customer_inquiry.js"></script>

</head>
<body>

	<%@ include file="/template/search_header.jsp" %>
	<form action="" method="post" onsubmit="return inquiryForm(this)">
	
	<!-- 고객센터 1:1문의 시작 강민아-->
	<div id="customer_all">
		<div class="customer">
		<div class="cutomers">
			<div class="customer_warp">고객센터</div>
			<div class="customer_tab">
				<ul>
					<li><a href="${root}/customer.jsp" class="customer_fna"><img src="${root}/img/customer/question.png">자주하는질문</a></li>
					<li><a href="${root}/customer_notice_list.jsp" class="customer_notice"><img src="${root}/img/customer/information.png">공지사항</a></li>
					<li><a href="#" class="customer_inquiry"><img src="${root}/img/customer/customer_inquiry_pink.png">1:1문의</a></li>
				</ul>
			</div>
			<!-- 내용부분 시작 -->
			<div class="customer_content">
				<div class="customer_inner">
					<!-- inquiry_write 시작-->
					
					<div class="customer_inquiry_write">
						<div class="customer_inquiry_tab">
							<div class="customer_inquiry_title_inner">
								<p>1:1 문의</p>
							</div>
						</div>
					</div><br/><br/><br/>
					
					<!-- 작성 시작 -->
					<div class="customer_inquirys">
						<div class="customer_inquiry_write_content">
							<div class="customer_inquiry_kind">
								<div align="center">문의유형</div>
								<div>
									<ul class="customer_inquiry_select_check">
										<li><input type="radio" name="radio" class="input_chk" value="취소/환불">주문취소</li>
										<li><input type="radio" name="radio" class="input_chk" value="교환">교환</li>
										<li><input type="radio" name="radio" class="input_chk" value="반품/환불">반품/환불</li>
										<li><input type="radio" name="radio" class="input_chk" value="기타문의">기타문의</li>
									</ul>
								</div>
							</div>
							<div class="customer_inquiry_title">
								<div align="center">제목</div>
								<div><input type="text" name="title"></div>
							</div>
							<div class="customer_inquiry_file">
								<div align="center">파일첨부</div>
								<div>
									<input type="file" name="file_name" title="찾아보기">
								</div>
							</div>
							<div class="customer_inquiry_content">
								<div align="center">내용</div>
								<div><textarea id="content" name="content" placeholder="내용을 입력하세요."></textarea></div>
							</div>
						</div>
						
					</div>
					
					<div class="customer_inquiry_btn" align="center">
						<input type="submit" value="등록">&nbsp;
						<input type="reset" value="취소">
					</div>
					<!-- 작성 끝 -->
					<!-- inquiry_write 끝-->	
				</div>
				<!-- 페이지번호 시작 -->
				
				<!-- 페이지번호 끝 -->
			</div>
			<!-- 내용부분 끝 -->
			</div>
		</div>
	</div>
	<!-- 고객센터 1:1문의 끝-->
	</form>
	<%@ include file="/template/footer.jsp" %>
	
</body>
</html>