/**
 * 
 */
	/**지도파싱*/
	var arr= new Array();
	
	function toServer() {
		var addr=document.getElementById("inputAddr_detail").value;
		arr.push(addr);
		
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
	
	
	
	
	/**주소 읽음*/
	function zipcodeSearch(root) {
		//alert("root:"+root);
		var url=root+"/admin/location/zipcode.do";
		open(url,"","width=550, height=400, scrollbars=yes");
	}
	
	/**상단 타이틀 메뉴 active ->font-Weight:bold*/
	$(function(){
		$(".nav-item:eq(5)").addClass("active");
	});