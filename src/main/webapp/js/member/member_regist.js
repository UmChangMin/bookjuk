

function rule(root){
	var url = root+"/user/member/rule1.do";
	//alert("자세히보기");
	window.open(url,"","width=730, height=800,left=620px, top=100px,scrollbars=no");
}


function rule2(root){
	var url = root+"/user/member/rule2.do";
	/*alert("나와주세여");*/
	window.open(url,"","width=730, height=360,left=620px, top=100px,scrollbars=no");
}

$(function(){
	$(".registe-input input").on("focus", function(){
		if($(this).hasClass("registe_id")){
			$(this).attr("placeholder","5~12자 영문, 숫자");
			$(this).css("border","1px solid #F15F5F");
		}
		if($(this).hasClass("registe_pwd")){
			$(this).attr("placeholder","최소 8자 이상 특수문자 포함");
			$(this).css("border","1px solid #F15F5F");
		}
		if($(this).hasClass("registe_pwdChk")){
			$(this).attr("placeholder","동일한 비밀번호를 입력해주세요");
			$(this).css("border","1px solid #F15F5F");
		}
		
		if($(this).hasClass("registe_name")){
			$(this).attr("placeholder","이름을 반드시 입력해주세요");
			$(this).css("border","1px solid #F15F5F");
		}
		
		if($(this).hasClass("registe_email")){
			$(this).attr("placeholder","이메일 을 반드시 입력해주세요");
			$(this).css("border","1px solid #F15F5F");
		}
		
		if($(this).hasClass("registe_birthday")){
			$(this).attr("placeholder","생년월일 을 반드시 입력해주세요");
			$(this).css("border","1px solid #F15F5F");
		}
		
	});
	
	$(".registe-input input").on("blur",function(){
		if($(this).hasClass("registe_id")){
			$(this).attr("placeholder","아이디");
			$(this).css("border","1px solid #ccc");
		}
		if($(this).hasClass("registe_pwd")){
			$(this).attr("placeholder","비밀번호");
			$(this).css("border","1px solid #ccc");
		}
		
		if($(this).hasClass("registe_pwdChk")){
			$(this).attr("placeholder","비밀번호확인");
			$(this).css("border","1px solid #ccc");
		}
		
		if($(this).hasClass("registe_name")){
			$(this).attr("placeholder","이름");
			$(this).css("border","1px solid #ccc");
		}
		
		if($(this).hasClass("registe_email")){
			$(this).attr("placeholder","이메일");
			$(this).css("border","1px solid #ccc");
		}
		
		if($(this).hasClass("registe_birthday")){
			$(this).attr("placeholder","생년월일");
			$(this).css("border","1px solid #ccc");
		}
	});
	
	$("#submit").click(function(){
		if($(".registe_id").val() == "") {
	        alert("아이디를 꼭 입력하세요!");	
	        $(".registe_id").focus();
	        return false;
	    }
		
		if($(".registe_pwd").val() == "") {
	        alert("비밀번호를 꼭 입력하세요!");
	        $(".registe_pwd").focus();
	        return false;
	    }
		if($(".registe_pwdChk").val() == "") {
	        alert("동일한 비밀번호를 입력하세요!");
	        $(".registe_pwdChk").focus();
	        return false;
	    }
		if($(".registe_name").val() == "") {
	        alert("이름을 꼭 입력하세요!");
	        $(".registe_name").focus();
	        return false;
	    }
		if($(".registe_email").val() == "") {
	        alert("이메일을 꼭 입력하세요!");
	        $(".registe_email").focus();
	        return false;
	    }
		if($(".registe_birthday").val() == "") {
	        alert("생년월일을 꼭 입력하세요!");
	        $(".registe_birthday").focus();
	        return false;
	    }
		$("form").submit();
	});
});


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
	
	$("#registe_chk_all").click(function (){
		//만약 전체 선택 체크박스가 
		if($("#registe_chk_all").prop("checked")){
			//해당화면에 전체 체크박스들을 체크해준다.
			$("input[type=checkbox]").prop("checked",true);
			//전체선택 체크박스가 해제된 경우
		}else{
			//해당 화면에 모든 체크 박스들을 해제
			$("input[type=checkbox]").prop("checked",false);
		}
	});
});