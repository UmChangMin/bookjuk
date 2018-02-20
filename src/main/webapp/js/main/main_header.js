/**
 * 
 */

function orderdelivery (root){

	var url=root+"/order/orderMain.do";
	/*alert("제발~"+url);*/
	window.open(url,"","width=630, height=400,left=620px, top=225px,scrollbars=no");
}


function login(root){
	var url=root+"/member/login.do";
	/*alert("나와라 로그인"+url);*/
	window.open(url,"","width=550, height=410,left=620px, top=225px,scrollbars=no");
}

function registe(root){
	var url=root+"/member/registe.do";
	/*alert("회원가입이라능"+url);*/
	window.open(url,"","width=550, height=810,left=620px, top=225px");
}

$(document).ready(function() {
		// 분야별 베스트
		$(".best_box > div:not(:first)").hide();
		$(".best_cate > li").mouseenter(function() {
			var li_idx = $(this).index();
			$(".best_box > div").hide();
			$(".best_box > div").eq(li_idx).show();
		});
		
		// 플로팅 메뉴
		var currentPosition = parseInt($("#floatMenu").css("top"));
		
		$("#floatMenu").css("height", "400px");
		$(window).scroll(function() {
			var position = $(window).scrollTop();
			$("#floatMenu").stop().animate({"top":position+currentPosition+"px"},1000);
		});
		
	});











