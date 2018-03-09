/**
 * 
 */
var regexEmail = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/i;

$(function(){
	$(".login_id").focus();
	
	$(".login_input input").on("focus", function(){
		if($(this).hasClass("registe_name")){
			$(this).attr("placeholder","반드시 입력해주세요!");
			$(this).css("border","1px solid #F15F5F");
		}
		if($(this).hasClass("registe_email")){
			$(this).attr("placeholder","반드시 입력해주세요!");
			$(this).css("border","1px solid #F15F5F");
		}
	});
	
	$(".login_input input").on("blur",function(){
		if($(this).hasClass("registe_name")){
			$(this).attr("placeholder","아이디");
			$(this).css("border","1px solid #ccc");
		}
		if($(this).hasClass("registe_email")){
			$(this).attr("placeholder","이메일");
			$(this).css("border","1px solid #ccc");
		}
	});
	
	$("#submit").click(function(){
		if($(".registe_name").val() == "") {
	        alert("이름을 꼭 입력해주세요!");	
	        $(".registe_name").focus();
	        return false;
	    }
		
		if($(".registe_email").val() == "") {
	        alert("이메일을 꼭 입력해주세요!");
	        $(".registe_email").focus();
	        return false;
	    }
		
		if(!regexEmail.test($.trim($(".registe_email").val()))){
			alert("이메일 형식이 잘못되었습니다.");
			$(".registe_email").focus();
			return false;
		}
		
		$("form").submit();
	});
});