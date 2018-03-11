/**
 * 
 */
var regexId = /^[a-z][a-z0-9]{4,12}$/;
var regexPwd = /^.*(?=^.{8,15}$)(?=.*\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*$/;
var regexName = /^[가-힣]{2,4}$/;
var regexEmail = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/i;
var regexBirth = /^[0-9]{6}$/;

function checkPwd(){
	var input = $(".update_pwd").val();

	if(!regexPwd.test($.trim(input))){
		$("#pwdChk").css("border", "1px solid #F15F5F");
	}else{
		$("#pwdChk").css("border", "1px solid #00c73c");
	}
}

function reCheckPwd(){
	var input = $(".update_pwdChk").val();

	if(!regexPwd.test($.trim(input))){
		$("#rePwdChk").css("border", "1px solid #F15F5F");
	}else{
		$("#rePwdChk").css("border", "1px solid #00c73c");
	}
}

function checkName(){
	var input = $(".update_name").val();
	
	if(!regexName.test($.trim(input))){
		$("#nameChk").css("border", "1px solid #F15F5F");
	}else{
		$("#nameChk").css("border", "1px solid #00c73c");
	}
}

function checkEmail(){
	var input = $(".update_email").val();
	
	if(!regexEmail.test($.trim(input))){
		$("#emailChk").css("border", "1px solid #F15F5F");
	}else{
		$("#emailChk").css("border", "1px solid #00c73c");
	}
}

$(function(){
	$(".update_input input").on("focus", function(){
		if($(this).hasClass("update_pwd")){
			$(this).attr("placeholder","최소 8자 이상 특수문자 포함");
			$(this).css("border","1px solid #F15F5F");
		}
		if($(this).hasClass("update_pwdChk")){
			$(this).attr("placeholder","동일한 비밀번호를 입력해주세요");
			$(this).css("border","1px solid #F15F5F");
		}
		
		if($(this).hasClass("update_name")){
			$(this).attr("placeholder","반드시 입력해주세요 ex)2~4글자");
			$(this).css("border","1px solid #F15F5F");
		}
		
		if($(this).hasClass("update_email")){
			$(this).attr("placeholder","반드시 입력해주세요");
			$(this).css("border","1px solid #F15F5F");
		}
		
		if($(this).hasClass("update_postcode")){
			$(this).attr("placeholder","우편번호를 검색해주세요");
			$(this).css("border","1px solid #F15F5F");
		}
		
		if($(this).hasClass("update_addr")){
			$(this).attr("placeholder","주소를 입력해주세요");
			$(this).css("border","1px solid #F15F5F");
		}
		
		if($(this).hasClass("update_addr_detail")){
			$(this).attr("placeholder","상세주소를 입력해주세요");
			$(this).css("border","1px solid #F15F5F");
		}
		
		if($(this).hasClass("update_phone")){
			$(this).attr("placeholder","' - ' 제외하고 핸드폰번호를 입력해주세요");
			$(this).css("border","1px solid #F15F5F");
		}

	});
	
	$(".update_input input").on("blur",function(){
		if($(this).hasClass("update_pwd")){
			$(this).attr("placeholder","비밀번호를 입력해주세요");
			$(this).css("border","1px solid #ccc");
		}
		
		if($(this).hasClass("update_pwdChk")){
			$(this).attr("placeholder","비밀번호를 한번 더 입력해주세요");
			$(this).css("border","1px solid #ccc");
		}
		
		if($(this).hasClass("update_name")){
			$(this).attr("placeholder","이름을 입력해주세요");
			$(this).css("border","1px solid #ccc");
		}
		
		if($(this).hasClass("update_email")){
			$(this).attr("placeholder","이메일을 입력해주세요");
			$(this).css("border","1px solid #ccc");
		}
		
		if($(this).hasClass("update_postcode")){
			$(this).attr("placeholder","우편번호를 검색해주세요");
			$(this).css("border","1px solid #ccc");
		}
		
		if($(this).hasClass("update_addr")){
			$(this).attr("placeholder","주소를 입력해주세요");
			$(this).css("border","1px solid #ccc");
		}
		
		if($(this).hasClass("update_addr_detail")){
			$(this).attr("placeholder","상세주소를 입력해주세요");
			$(this).css("border","1px solid #ccc");
		}
		
		if($(this).hasClass("update_phone")){
			$(this).attr("placeholder","휴대폰 번호를 입력해주세요");
			$(this).css("border","1px solid #ccc");
		}
	});
});

function memberUpdate(obj) {
	if (obj.member_name.value == "") {
		alert("이름을 입력해주세요");
		obj.member_name.focus();
		return false;
	}
	
	if (obj.member_password.value == "") {
		alert("비밀번호를 입력해주세요");
		obj.member_password.focus();
		return false;
	}
	  if($("input[name='member_passwordOk']").val()==""){
          alert("비밀번호를 입력해주세요");
          $("input[name='member_passwordOk']").focus();
          return;
       }
	  
	  if($("input[name='member_password']").val()!=$("input[name='member_passwordOk']").val()){
			alert("비밀번호가 일치하지 않습니다");
			$("input[name='member_password']").focus();
			return;
		}
	
	if (obj.member_email.value == "") {
		alert("이메일을 입력해주세요");
		obj.member_email.focus();
		return false;
	}
}