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
<link rel="stylesheet" type="text/css" href="${root}/css/template/basic.css"/>
<link rel="stylesheet" type="text/css" href="${root}/css/service/service_basic.css"/>
<link rel="stylesheet" type="text/css" href="${root}/css/service/service_contact_write.css"/>
<script type="text/javascript" src="${root }/js/jquery.js"></script>
<script type="text/javascript" src="${root}/jqueryUI/jquery-ui.js"></script>
<script type="text/javascript" src="${root}/js/service/service_contact.js"></script>
</head>
<body>
	<form action="${root}/service/contact/updateOk.do" method="post" onsubmit="return contactForm(this)" enctype="multipart/form-data">
	
	<!-- 고객센터 1:1문의 시작 강민아-->
	<div id="service_all">
	<input type="hidden" value="${serviceContactDto.contact_num}" name="contact_num"/>
	<input type="hidden" value="${pageNumber}" name="pageNumber"/>
		<div class="service">
		<div class="service_sub">
			<div class="service_warp">고객센터</div>
			<div class="service_tab">
				<ul>
					<li><a href="${root}/service/question.do" class="service_fna"><img src="${root}/img/service/question.png">자주하는질문</a></li>
					<li><a href="${root}/service/notice/list.do" class="service_notice"><img src="${root}/img/service/information.png">공지사항</a></li>
					<li><a href="${root}/service/contact/list.do" class="service_contact"><img src="${root}/img/service/service_contact_pink.png">1:1문의</a></li>
				</ul>
			</div>
			<!-- 내용부분 시작 -->
			<div class="service_content">
				<div class="service_inner">
					<!-- inquiry_write 시작-->
					
					<div class="service_contact_write">
						<div class="service_contact_tab">
							<div class="service_contact_title_inner">
								<p>1:1 문의</p>
							</div>
						</div>
					</div><br/><br/><br/>
					
					<!-- 작성 시작 -->
					<div class="service_contacts">
						<div class="service_contact_write_content">
							<div class="service_contact_kind">
								<div align="center">문의유형</div>
								<div>
									<ul class="service_contact_select_check">
										<li><input type="radio" name="contact_type" class="input_chk" value="주문취소">주문취소</li>
										<li><input type="radio" name="contact_type" class="input_chk" value="교환">교환</li>
										<li><input type="radio" name="contact_type" class="input_chk" value="반품/환불">반품/환불</li>
										<li><input type="radio" name="contact_type" class="input_chk" value="기타문의">기타문의</li>
										
									</ul>
									
									<script type="text/javascript">
										
										$("input[name='contact_type']").each(function() {
											if ($(this).val() == "${serviceContactDto.contact_type}") {
												$(this).attr("checked",true);
											}
										}); 
									
									</script>
								</div>
							</div>
							<div class="service_contact_title">
								<div align="center">제목</div>
								<div><input type="text" name="contact_subject" value="${serviceContactDto.contact_subject}"></div>
							</div>
							
							<c:if test="${serviceContactDto.contact_file_size > 0}">
							<div class="service_contact_file">
								<div align="center">파일첨부</div>
								<div>
									<input type="file" name="file" title="찾아보기">
								</div>
							</div>
							</c:if>
							<c:if test="${serviceContactDto.contact_file_size == 0}">
							<div class="service_contact_file">
								<div align="center">파일첨부</div>
								<div>
									<input type="file" name="file" title="찾아보기">
								</div>
							</div>
							</c:if>
							
							<div class="service_contact_content">
								<div align="center">내용</div>
								<div><textarea id="content" name="contact_content" placeholder="내용을 입력하세요.">${serviceContactDto.contact_content}</textarea></div>
							</div>
						</div>
						
					</div>
					
					<div class="service_contact_btn1" align="center">
						<input type="submit" value="등록">&nbsp;
						<input type="button" value="목록" onclick="location.href='${root}/service/contact/list.do?pageNumber=${pageNumber}'"/>
						<input type="reset" value="취소">
					</div>
					<!-- 작성 끝 -->
					<!-- inquiry_write 끝-->	
				</div>
				
			</div>
			<!-- 내용부분 끝 -->
			</div>
		</div>
	</div>
	<!-- 고객센터 1:1문의 끝-->
	</form>
</body>
</html>