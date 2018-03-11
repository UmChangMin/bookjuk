/**
 * 
 */
function zipcodeRead(root){
	   // 주소검색을 수행할 팝업 페이지를 호출합니다.
	   var url=root+"/member/zipcode.do";
	   // 호출된 페이지(jusopopup.jsp)에서 실제 주소검색URL(http://www.juso.go.kr/addrlink/addrLinkUrl.do)를 호출하게 됩니다.
	   var pop = window.open(url,"pop","width=590,height=420, scrollbars=yes, resizable=yes");
	}

function jusoCallBack(roadFullAddr,roadAddrPart1,addrDetail,roadAddrPart2,engAddr, jibunAddr, zipNo, admCd, rnMgtSn, bdMgtSn,detBdNmList,bdNm,bdKdcd,siNm,sggNm,emdNm,liNm,rn,udrtYn,buldMnnm,buldSlno,mtYn,lnbrMnnm,lnbrSlno,emdNo){
   
   $("#zipcode").val(zipNo);
   $("#address1").val(roadAddrPart1);
   $("#address2").val(addrDetail);

   self.close();
}

function memberDelete(obj){
	if (obj.member_password.value == "") {
		alert("비밀번호를 입력해주세요");
		obj.member_password.focus();
		return false;
	}
}