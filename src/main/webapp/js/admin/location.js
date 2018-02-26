/**
 * 
 */
	/**지도파싱*/
	var arr= new Array();
	
	function goPopup(root){
		// 주소검색을 수행할 팝업 페이지를 호출합니다.
		var url=root+"/admin/location/jusoPopup.do";
		// 호출된 페이지(jusopopup.jsp)에서 실제 주소검색URL(http://www.juso.go.kr/addrlink/addrLinkUrl.do)를 호출하게 됩니다.
		var pop = window.open(url,"pop","width=590,height=420, scrollbars=yes, resizable=yes");  
	}

	function jusoCallBack(roadFullAddr,roadAddrPart1,addrDetail,roadAddrPart2,engAddr, jibunAddr, zipNo, admCd, rnMgtSn, bdMgtSn,detBdNmList,bdNm,bdKdcd,siNm,sggNm,emdNm,liNm,rn,udrtYn,buldMnnm,buldSlno,mtYn,lnbrMnnm,lnbrSlno,emdNo){
		 // 팝업페이지에서 주소입력한 정보를 받아서, 현 페이지에 정보를 등록합니다.
		var addr=document.location_Info.location_addr.value = roadAddrPart1; // 도로명주소

		var detail_addr=document.location_Info.location_addr_detail.value = addrDetail; // 상세주소

		var post=document.location_Info.location_postcode.value = zipNo; // 우편번호
		
		toServer(post, addr,detail_addr);
		
		self.close();
	}
	
	function toServer(post, addr, detail_addr) {
		/*var addr=document.getElementById("inputAddr_detail").value;
		arr.push(addr);*/
		
		var url="https://maps.googleapis.com/maps/api/geocode/json";
		var params="address="+addr+"&key=AIzaSyDT8UWioePDnrx76CcuMrV_2M1FfUY9j0w";
		sendRequest("get",url,fromServer,params);
		
	}
	
	function fromServer() {
		if(xhr.readyState==4 && xhr.status==200){		
			processJson();	
		}
	}
	
	function processJson() {
		
		var obj=JSON.parse(xhr.responseText);
		var lat=obj.results[0].geometry.location.lat;
		var lng=obj.results[0].geometry.location.lng;
		
		//arr.push(lat+","+lng);
		
		var map = new google.maps.Map(document.getElementById("img_area"), {
	          center: {lat:lat, lng:lng},
	          zoom: 14,
	          mapTypeId: 'roadmap'
		  });
		
		 var marker = new google.maps.Marker({
       	  position: {lat:lat, lng:lng},
       	  map: map,
       	  title:'지점'
       	});
		 document.getElementById("input_lat").value=lat;
		 document.getElementById("input_lng").value=lng;			 
		 
		//alert(arr.join("\n"));		 
	}

	/**지도파싱 끝*/
	
	
	
	
/*	*//**주소 읽음*//*
	function zipcodeSearch(root) {
		//alert("root:"+root);
		var url=root+"/admin/location/jusoPopUp.do";
		open(url,"","width=550, height=400, scrollbars=yes");
	}
	
	function sendAddress(zipcode, sido, gugun, ri, bunji){
		var addr=sido+" "+gugun+" "+ri+" "+bunji;	
		opener.document.location_Info.location_postcode.value=zipcode;
		
		opener.document.location_Info.location_addr.value=addr;
		self.close();
	}*/
	
	/**/
	
	

	
	
	
	
	
	
	
	
	
	/**상단 타이틀 메뉴 active ->font-Weight:bold*/
	$(function(){
		$(".nav-item:eq(5)").addClass("active");
	});
	
	
	
	
	
	
	
	
	
	