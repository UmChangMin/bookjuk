<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="root" value="${pageContext.request.contextPath}" />
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${root}/css/template/basic.css"/>
<link rel="stylesheet" type="text/css" href="${root}/css/template/header.css"/>
<link rel="stylesheet" type="text/css" href="${root}/css/template/real_time.css"/>
<link rel="stylesheet" type="text/css" href="${root}/jqueryUI/jquery-ui.css">
<script type="text/javascript" src="${root}/js/jquery.js"></script>
<script type="text/javascript" src="${root}/jqueryUI/jquery-ui.js"></script>
<script type="text/javascript" src="${root}/js/main/main_header.js"></script>
</head>
<body>
   <div id="header">
      <div class="header_top">
         <div class="header_top_inner">         
         <c:if test="${member_level == null && member_id==null}">
            <ul class="header_lnb_right">
               <li><a href="javascript:viod(0)" class="openMask" onclick="login('${root}')">로그인</a></li>
               <li><a href="javascript:viod(0)" class="openMask2" onclick="registe('${root}')">회원가입</a></li>
               <li><a href="${root}/order/cart.do">장바구니</a></li>
               <li><a href="javascript:viod(0)" class="openMask3" onclick="orderDelivery('${root}')">주문/배송조회</a></li>
               <li><a href="${root}/service/question.do">고객센터</a></li>
               <li><a href="${root}/location.do">영업점 안내</a></li>
            </ul>
         </c:if>
         
         <c:if test="${member_level eq 'admin'}">
            <ul class="header_lnb_right">
               <li><strong><a href="${root}/admin/sales/salesManager.do">관리자모드</a></strong></li>
               <li><a href="${root}/member/logout.do" class="openMask2">로그아웃</a></li>
               <li><a href="${root}/order/cart.do">장바구니</a></li>
               <li><a href="${root}/order/list.do" class="openMask3">주문/배송조회</a></li>
               <li><a href="${root}/service/question.do">고객센터</a></li>
               <li><a href="${root}/location.do">영업점 안내</a></li>
            </ul>
         </c:if>
         
         <c:if test="${member_level eq 'member'}">
            <ul class="header_lnb_right">
               <li><a href="${root}/member/mypage.do" class="openMask" style="color: #F15F5F">[${member_name}]</a></li>
               <li><a href="${root}/member/logout.do" class="openMask2">로그아웃</a></li>
               <li><a href="${root}/member/mypage.do">마이페이지</a></li>
               <li><a href="${root}/order/cart.do">장바구니</a></li>
               <li><a href="${root}/order/list.do" class="openMask3">주문/배송조회</a></li>
               <li><a href="${root}/service/question.do">고객센터</a></li>
               <li><a href="${root}/location.do">영업점 안내</a></li>
            </ul>
         </c:if>   
         
         </div>
      </div>

      <div class="header_mid_content">
         <div class="header_mid_logo">
            <a href="${root}/main.do"><img
               src="${root}/img/template/header/bookjuk_headlogo.png" /></a>
         </div>
         <div class="header_mid_search">
            <form id="search_form" action="${root}/book/list/search.do" method="get">
					<div class="header_mid_search_inner">
						<input type="text" name="search" id="search_mh" class="search_mh"/>
						<input type="button" class="search_mh_btn"/>
					</div>
			</form>

            <!-- 실시간 시작 -->
            <div id="header_real_time">
               <dl id="hread_rank_list">
                  <dt>실시간 급상승 검색어</dt>
                  <dd>
                     <ol>
                        <li><a href="#">1&nbsp;&nbsp;82년생 김지영</a></li>
                        <li><a href="#">2&nbsp;&nbsp;무례한 사람에게 웃으며 대처하는 법</a></li>
                        <li><a href="#">3&nbsp;&nbsp;일취월장 : 일을 잘하기 위한 8가지 원리</a></li>
                        <li><a href="#">4&nbsp;&nbsp;신경 끄기의 기술</a></li>
                        <li><a href="#">5&nbsp;&nbsp;회색 인간</a></li>
                        <li><a href="#">6&nbsp;&nbsp;살며 사랑하며 배우며</a></li>
                        <li><a href="#">7&nbsp;&nbsp;나미야 잡화점의 기적</a></li>
                        <li><a href="#">8&nbsp;&nbsp;언어의 온도</a></li>
                        <li><a href="#">9&nbsp;&nbsp;말 그릇</a></li>
                        <li><a href="#">10&nbsp;&nbsp;파리의 아파트</a></li>
                     </ol>
                  </dd>
               </dl>
            </div>
            <!-- 실시간 끝 -->
         </div>
      </div>

      <div class="header_mainGnb_wrap">
         <div class="header_mainGnb_inner">
            <div id="header_menu_wrapper" align="center">
               <ul class="header_gnb_list">
                  <li><a href="javascript:void(0);">전체카테고리</a>

                     <div>
                        <div class="header_nav_column" align="center">

                           <ul>
                              <li><h3><a href="${root}/book/list/computer.do" id="header_nav_column_h3">컴퓨터/IT</a></h3></li>
                              <li><a href="${root}/book/list/computer/com.do">컴퓨터공학</a></li>
                              <li><a href="${root}/book/list/computer/network.do">네트워크</a></li>
                              <li><a href="${root}/book/list/computer/security.do">보안/해킹</a></li>
                              <li><a href="${root}/book/list/computer/db.do">데이터베이스</a></li>
                              <li><a href="${root}/book/list/computer/pro.do">프로그래밍언어</a></li>
                              <li><a href="${root}/book/list/computer/graphic.do">그래픽</a></li>
                           </ul>
                        </div>

                        <div class="header_nav_column" align="center">
                           <ul>
                              <li><h3><a href="${root}/book/list/novel.do" id="header_nav_column_h3">소설</a></h3></li>
                              <li><a href="${root}/book/list/novel/modern.do">현대소설</a></li>
                              <li><a href="${root}/book/list/novel/classic.do">고전소설</a></li>
                              <li><a href="${root}/book/list/novel/mystery.do">추리소설</a></li>
                              <li><a href="${root}/book/list/novel/romance.do">로맨스소설</a></li>
                              <li><a href="${root}/book/list/novel/history.do">역사소설</a></li>
                              <li><a href="${root}/book/list/novel/fantasy.do">판타지소설</a></li>
                           </ul>
                        </div>

                        <div class="header_nav_column" align="center">
                           <ul>
                              <li><h3><a href="${root}/book/list/hobby.do" id="header_nav_column_h3">여행/취미</a></h3></li>
                              <li><a href="${root}/book/list/hobby/pet.do">애완동물</a></li>
                              <li><a href="${root}/book/list/hobby/fishmount.do">등산/낚시</a></li>
                              <li><a href="${root}/book/list/hobby/normal.do">취미일반</a></li>
                              <li><a href="${root}/book/list/hobby/domestic.do">국내여행</a></li>
                              <li><a href="${root}/book/list/hobby/abroad.do">해외여행</a></li>
                              <li><a href="${root}/book/list/hobby/theme.do">테마여행</a></li>
                           </ul>
                        </div>
                     </div></li>
                  <li><a href="${root}/book/best.do">베스트셀러</a></li>
                  <li><a href="${root}/book/issue.do">화제의도서</a></li>
                  <li><a href="${root}/book/new.do">신간도서</a></li>
                  <li><a href="${root}/book/discount.do">할인도서</a></li>
               </ul>
            </div>
         </div>
      </div>
   </div>
   <!-- header끝 -->
   
   <!-- 플로팅 메뉴 -->
   <div id="floatMenu" align="center">
      <div class="today_view" align="center">
         <div class="today_title">
            <h3 align="center">최근 본 목록</h3>
         </div>
         <div class="tv_container">
         	<c:if test="${currentList ne null}">
	         	<c:forEach var="currentDto" items="${currentList}" begin="0" end="2">
		            <div class="tv_prod">
		               <a href="${root}/book/list/detail.do?book_num=${currentDto.book_num}"><img src="${root}${currentDto.current_img}"/></a>
		            </div>
	            </c:forEach>
            </c:if>
         </div>
      </div>
      <div class="float_btn">
         <a href="${root}/order/cart.do" class="cart_btn">장바구니</a><br/>
         <a href="#" class="top_btn">TOP</a>
      </div>
   </div>
</body>
</html>