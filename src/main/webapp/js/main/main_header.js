/**
 * 
 */

function orderdelivery (root){			//주문,배송 조회

	var url=root+"/order/order_main.do";
	/*alert("제발~"+url);*/
	window.open(url,"","width=630, height=400,left=620px, top=225px,scrollbars=no");
}


function login(root){				//로그인
	var url=root+"/member/login.do";
	/*alert("나와라 로그인"+url);*/
	window.open(url,"","width=550, height=410,left=620px, top=225px,scrollbars=no");
}

function registe(root){				//회원가입
	var url=root+"/member/registe.do";
	/*alert("회원가입이라능"+url);*/
	window.open(url,"","width=550, height=810,left=620px, top=225px");
}		

//window.open창 완료(허단비)

$(function(){
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


//실시간 급상승 (허단비)
$(function (){
	var count = $('#hread_rank_list li').length;
	var height = $('#hread_rank_list li').height();
	
	function step(index){
		$('#hread_rank_list ol').delay(2000).animate({
			 		top: -height * index,
		}, 500, function(){
			step((index+1) %count);
		});
	}
	step(1);
});








