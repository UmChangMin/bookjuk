/**
 * 
 */


$(function(){
	$(".login_input input").on("focus", function(){
		if($(this).hasClass("login_id")){
			$(this).attr("placeholder","5~12자 영문, 숫자");
			$(this).css("border","1px solid #F15F5F");
		}
		if($(this).hasClass("login_pwd")){
			$(this).attr("placeholder","최소 8자 이상 특수문자 포함");
			$(this).css("border","1px solid #F15F5F");
		}
	});
	
	$(".login_input input").on("blur",function(){
		if($(this).hasClass("login_id")){
			$(this).attr("placeholder","아이디");
			$(this).css("border","1px solid #ccc");
		}
		if($(this).hasClass("login_pwd")){
			$(this).attr("placeholder","비밀번호");
			$(this).css("border","1px solid #ccc");
		}
	});
	
	$("#submit").click(function(){
		if($(".login_id").val() == "") {
	        alert("아이디를 꼭 입력하세요!");	
	        $(".login_id").focus();
	        return false;
	    }
		
		if($(".login_pwd").val() == "") {
	        alert("비밀번호를 꼭 입력하세요!");
	        $(".login_pwd").focus();
	        return false;
	    }
		
		$("form").submit();
	});
});

$(function(){
	$(".order_input input").on("focus", function(){
		if($(this).hasClass("order_phonenumber")){
			$(this).attr("placeholder","'-'제외하고 핸드폰번호를 입력해 주세요");
			$(this).css("border","1px solid #F15F5F");
		}
		if($(this).hasClass("order_pwd")){
			$(this).attr("placeholder","비밀번호를 입력해주세요");
			$(this).css("border","1px solid #F15F5F");
		}
	});
	
	$(".order_input input").on("blur",function(){
		if($(this).hasClass("order_phonenumber")){
			$(this).attr("placeholder","핸드폰 번호");
			$(this).css("border","1px solid #ccc");
		}
		if($(this).hasClass("order_pwd")){
			$(this).attr("placeholder","비밀번호");
			$(this).css("border","1px solid #ccc");
		}
	});
	
	$("#submit").click(function(){
		if($(".order_phonenumber").val() == "") {
	        alert("핸드폰 번호 를 꼭 입력하세요!");	
	        $(".order_phonenumber").focus();
	        return false;
	    }
		
		if($(".order_pwd").val() == "") {
	        alert("비밀번호를 꼭 입력하세요!");
	        $(".order_pwd").focus();
	        return false;
	    }

		$("form").submit();
	});
});