

function rule(root){
	var url = root+"/member/rule1.do";
	//alert("자세히보기");
	window.open(url,"","width=730, height=800,left=620px, top=100px,scrollbars=no");
}


function rule2(root){
	var url = root+"/member/rule2.do";
	/*alert("나와주세여");*/
	window.open(url,"","width=730, height=360,left=620px, top=100px,scrollbars=no");
}

function checkId() {
    var inputed = $('.registe_id').val();
    $.ajax({
        data : {id : inputed},
        url : "checkId.do",
        type : "POST",
        success : function(data) {
            if(inputed=="" && data=='0') {
                $("#idChk").css("border","1px solid #F15F5F");
            } else if (data == '0') {
                $("#idChk").css("border","1px solid #00c73c");
            } else if (data == '1') {
                $("#idChk").css("border","1px solid #F15F5F");
            } 
        }
    });
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
			$(this).attr("placeholder","반드시 입력해주세요. ex)2~4글자");
			$(this).css("border","1px solid #F15F5F");
		}
		
		if($(this).hasClass("registe_email")){
			$(this).attr("placeholder","반드시 입력해주세요.");
			$(this).css("border","1px solid #F15F5F");
		}
		
		if($(this).hasClass("registe_birthday")){
			$(this).attr("placeholder","반드시 입력해주세요. ex)900827");
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

    $("#registe_chk_all").click(function (){
		if($("#registe_chk_all").prop("checked")){
			$("input[type=checkbox]").prop("checked",true);
		}else{
			$("input[type=checkbox]").prop("checked",false);
		}
	});
	
	$("#submit").click(function(){
		var regexId = /^[a-z][a-z0-9]{4,12}$/;
		var regexPwd = /^.*(?=^.{8,15}$)(?=.*\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*$/;
		var regexName = /^[가-힣]{2,4}$/;
		var regexEmail = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/i;
		var regexBirth = /^[0-9]{6}$/;
		
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
		if($(".registe_pwd").val() != $(".registe_pwdChk").val()) {
            alert("입력한 비밀번호가 일치하지 않습니다.");
            $(".registe_pwd").val("");
            $(".registe_pwdChk").val("");
            $(".registe_pwd").focus();
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
		
		if(!regexId.test($.trim($(".registe_id").val()))){
			alert("아이디 : 첫글자 반드시 영문 소문자 포함, 5~12자 입력해주세요.");
			$(".registe_id").focus();
			return false;
		}
		
		if(!regexPwd.test($.trim($(".registe_pwd").val()))){
			alert("비밀번호 : 특수문자, 영문 소문자, 숫자 포함, 8~15자 입력해주세요.");
			$(".registe_pwd").focus();
			return false;
		}
		
		if(!regexName.test($.trim($(".registe_name").val()))) {
            alert("이름 : 2~4 글자를 입력해주세요.");
            $(".registe_name").focus();
            return false;
        }
		
		if(!regexEmail.test($.trim($(".registe_email").val()))){
			alert("이메일 형식이 잘못되었습니다.");
			$(".registe_email").focus();
			return false;
		}
		
		if(!regexBirth.test($.trim($(".registe_birthday").val()))){
			alert("생년월일 : 숫자 6글자 입력해주세요.");
			$(".registe_birthday").focus();
			return false;
		}
		
		if($("#email_chk").is(":checked") == true){
			
		}
		
		if($("#registe_chk").is(":checked") == false){
			alert("이용약관 및 개인정보 취급 방침 동의해주세요.");
			return false;
		}else{
			$("form").submit();
		}
		
	});
});
