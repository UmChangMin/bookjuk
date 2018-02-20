/**
 * 
 */

$(function(){
	// 플로팅 메뉴
	var currentPosition = parseInt($("#floatMenu").css("top"));
	
	$("#floatMenu").css("height", "400px");
	$(window).scroll(function() {
		var position = $(window).scrollTop();
		$("#floatMenu").stop().animate({"top":position+currentPosition+"px"},1000);
	});
});

function orderdelivery (root){
	var url=root+"/ordermain.jsp"
	/*alert("제발~"+url);*/
	window.open(url,"","width=650, height=300,left=620px, top=225px");
}





