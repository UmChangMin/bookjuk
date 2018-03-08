<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>마이페이지</title>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<link rel="stylesheet" type="text/css" href="${root}/css/template/basic.css"/>
<link rel="stylesheet" type="text/css" href="${root}/css/member/member_mypage.css"/>
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<script type="text/javascript" src="${root}/js/member/member_mypage.js"></script>
<script type="text/javascript" src="${root}/js/service/service_contact.js"></script>

</head>
<body>
	<!-- 마이페이지 시작 강민아-->
	<div id="myPage_all">
		<div class="myPages">
			<div class="myPage">
				<div class="myPage_warp">마이페이지</div>
					<div class="myPage_title">
						<ul>
							<li>
								<img class="myPage_first" src="${root}/img/myPage/my.png" width="100" height="100">	
							</li>
							<li>
								<div class="myPage_top"><img src="${root}/img/myPage/point.png" width="28" height="28"><span>포인트</span></div>
								<p class="myPage_mid">0 POINT</p>
								<div class="myPage_bot">
									<a href="javascript:pointFunction('${root}')">내역보기 &gt;</a>
								</div>
							</li>
							<li>
								<div class="myPage_top"><img src="${root}/img/myPage/coupon.png" width="28" height="28"><span>쿠폰</span></div>
								<p class="myPage_mid">0 장</p>
								<div class="myPage_bot">
									<a href="javascript:couponFunction('${root}')">내역보기 &gt;</a>
								</div>
								<!-- 내역 보기 시작 -->
								
								<!-- 내역 보기 끝 -->
							</li>
						</ul>
					</div>
					<div class="myPage_bottom">
						<div>
							<ul>
								<li>
									<h4>도서 주문 관리</h4>
									<ul>
										<li><a href="${root}/order/list.do">주문 / 배송 조회</a></li>
										<li><a href="${root}/order/cancle.do">취소 / 교환 / 반품 조회</a></li>
									</ul>
								</li>
								<li>
									<h4>회원 정보 관리</h4>
									<ul>
										<li><a href="${root}/member/update.do">회원정보수정</a></li>
										<li><a href="${root}/member/delete.do">회원탈퇴</a></li>
									</ul>
								</li>
							</ul>
						</div>	
					</div>
				<div class="myPage_warp2">나의 문의 내역</div>
				<div class="myPage_title1">
					<c:if test="${fn:length(ServiceContactList)==0}">
						<div class="service_non2" align="center" style="color: #666;">문의 게시글이 존재하지 않습니다. 1:1문의로 궁금증을 해결하세요.</div>
					</c:if>
					
					<c:if test="${fn:length(ServiceContactList)>0}">
					<!-- 1:1문의 타이틀 시작-->
					<div class="myPage_customer_inquiry_list_content">
						<div align="center">글번호</div>
						<div align="center">제목</div>
						<div align="center">등록일</div>
						<div align="center">답변</div>
					</div>
					<!-- 1:1문의 타이틀 끝-->
					
					<!-- 1:1문의 답변 리스트 시작-->
					<c:forEach var="ServiceContactDto" items="${ServiceContactList}">
					<div class="myPage_customer_inquiry_list_content_list">
						<div align="center">${ServiceContactDto.rnum}</div>
						<div><a href="javascript:readFunction('${root}','${ServiceContactDto.contact_num}','${pageNumber}')">${ServiceContactDto.contact_subject}</a></div>
						<div align="center">
								<fmt:formatDate var="contact_date" value="${ServiceContactDto.contact_date}" pattern="yyyy-MM-dd"/>${contact_date}
							</div>
						<div align="center">${ServiceContactDto.contact_answer_whether}</div>
					</div>
					</c:forEach>
					</c:if>
					 <!-- 1:1문의 답변 리스트 끝-->
					 
					 <!-- 페이지번호 시작 -->
					 <c:if test="${fn:length(ServiceContactList)>0}">
					<div class="myPage_customer_inquiry_list_pagenate">
						<c:set var="pageCount"
										value="${count / boardSize + (count % boardSize == 0 ? 0:1)}" />
									<c:set var="pageBlock" value="${5}" />

									<fmt:parseNumber var="rs"
										value="${(pageNumber - 1) / pageBlock}" integerOnly="true" />

									<c:set var="startPage" value="${rs * pageBlock + 1}" />

									<c:set var="endPage" value="${startPage + pageBlock - 1}" />

									<c:if test="${endPage > pageCount}">
										<c:set var="endPage" value="${pageCount}"></c:set>
									</c:if>

									<c:if test="${startPage > pageBlock}">
										<a href="${root}/member/mypage.do?pageNumber=${startPage - pageBlock}">[이전]</a>
									</c:if>
									
									<c:forEach var="i" begin="${startPage}" end="${endPage}">
										<a href="${root}/member/mypage.do?pageNumber=${i}" class="myPage_customer_inquiry_list_btn">${i}</a> 
									</c:forEach>
									
									<c:if test="${endPage < pageCount}">
										<a href="${root}/member/mypage.do?pageNumber=${startPage + pageBlock}">[다음]</a>
									</c:if>
					</div>
					</c:if>
					<!-- 페이지 번호 끝 -->
				</div>
			</div>
		</div>
	</div>
</body>
</html>