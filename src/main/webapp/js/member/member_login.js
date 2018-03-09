/**
 * 
 */
$(function(){
	$(".login_id").focus();
	
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