/**
 * 
 */

function orderdelivery (root){			//주문,배송 조회

	var url=root+"/order/main.do";
	/*alert("제발~"+url);*/
	window.open(url,"","width=630, height=400,left=620px, top=225px,scrollbars=no");
}


function login(root){				//로그인
	var url=root+"/member/login.do";
	/*alert("나와라 로그인"+url);*/
	window.open(url,"","width=550, height=410,left=620px, top=225px,scrollbars=no");
}

function registe(root){				//회원가입
	var url=root+"/member/regist.do";
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


//베스트셀러,화제의 도서,신간도서,할인도서

$(function (){
   
   $(".main_banner_button > input:eq(0)").hover(function() {
		$(".main_banner_list_div > div:not(:eq(0))").hide();
		$(".main_banner_list_div > div").eq(0).show();
	});
   
   $(".main_banner_button > input:eq(1)").hover(function() {
		$(".main_banner_list_div > div:not(:eq(1))").hide();
		$(".main_banner_list_div > div").eq(1).show();
	});  
   
   $(".main_banner_button > input:eq(2)").hover(function() {
		$(".main_banner_list_div > div:not(:eq(2))").hide();
		$(".main_banner_list_div > div").eq(2).show();
	});  
   
   $(".main_banner_button > input:eq(3)").hover(function() {
		$(".main_banner_list_div > div:not(:eq(3))").hide();
		$(".main_banner_list_div > div").eq(3).show();
	}); 
   

   
});
/*
$(function (){
	
	var book_new = ["너와 함께한 모든 길이 좋았다","공존을 위한 길 고양이 안내서","거의 모든 재난에서 살아남는 법","기네스 세계기록 2018","안티포렌식","한 권으로 끝내는 포토샵","허단비","강민아","김태우","엄창민"];
	
	$(".header_SearchString").autocomplete({
		source : book_new,
		minLength:2,
		select : function(event,ui){
			console.log(ui.item);
		},
		focus : function (event,ui){
			return false;
			//event.preventDefault();
		}
	});
});*/











