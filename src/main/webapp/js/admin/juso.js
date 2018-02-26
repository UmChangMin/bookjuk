/**
 * 
 */

function goPopup(root){

	// 주소검색을 수행할 팝업 페이지를 호출합니다.
	var url=root+"/admin/location/jusoPopUp.do";
	// 호출된 페이지(jusopopup.jsp)에서 실제 주소검색URL(http://www.juso.go.kr/addrlink/addrLinkUrl.do)를 호출하게 됩니다.
	var pop = window.open(url,"pop","width=590,height=420, scrollbars=yes, resizable=yes"); 

}



function jusoCallBack(roadFullAddr,roadAddrPart1,addrDetail,roadAddrPart2,engAddr, jibunAddr, zipNo, admCd, rnMgtSn, bdMgtSn,detBdNmList,bdNm,bdKdcd,siNm,sggNm,emdNm,liNm,rn,udrtYn,buldMnnm,buldSlno,mtYn,lnbrMnnm,lnbrSlno,emdNo){

	    // 팝업페이지에서 주소입력한 정보를 받아서, 현 페이지에 정보를 등록합니다.
		document.location_Info.location_addr.value = roadAddrPart1; // 도로명주소

		document.location_Info.location_addr_detail.value = addrDetail; // 상세주소

		document.location_Info.location_postcode.value = zipNo; // 우편번호

		self.close();

}