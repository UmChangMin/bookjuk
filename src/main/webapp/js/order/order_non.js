/**
 * 
 */
var regexPwd = /^.*(?=^.{8,15}$)(?=.*\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*$/;
var regexEmail = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/i;

function focus(num) {
	num = num.replace(/[^0-9]/g, '');
	$("#phone").val(num);
}

function blur(num) {
	num = num.replace(/[^0-9]/g, '');
	var tmp = '';
	tmp += num.substr(0, 3);
	tmp += '-';
	tmp += num.substr(3, 4);
	tmp += '-';
	tmp += num.substr(7);
	$("#phone").val(tmp);
}

function user_focus(user_num) {
	user_num = user_num.replace(/[^0-9]/g, '');
	$("#user_phone").val(user_num);
}

function user_blur(user_num) {
	user_num = user_num.replace(/[^0-9]/g, '');
	var tmp = '';
	tmp += user_num.substr(0, 3);
	tmp += '-';
	tmp += user_num.substr(3, 4);
	tmp += '-';
	tmp += user_num.substr(7);
	$("#user_phone").val(tmp);
}

$(function() {
	$("input#phone").blur(function(){
	    	var num = $("#phone").val();
	    	blur(num)
	});
	$("input#phone").click(function(){
	    	var num = $("#phone").val();
	    	focus(num);
    });
	
	$("input#user_phone").blur(function(){
	    	var user_num = $("#user_phone").val();
	    	user_blur(user_num)
	    });
	$("input#user_phone").click(function(){
	    	var user_num = $("#user_phone").val();
	    	user_focus(user_num);
    });
	
	$(".order_non_input input").on("focus", function(){
		if($(this).hasClass("order_name")){
			$(this).attr("placeholder","반드시 입력해주세요!");
		}
		if($(this).hasClass("order_phone")){
			$(this).attr("placeholder","'-'제외하고 핸드폰번호를 입력해 주세요");
		}
		if($(this).hasClass("order_postcode")){
			$(this).attr("placeholder","반드시 입력해주세요!");
		}
		if($(this).hasClass("order_address")){
			$(this).attr("placeholder","반드시 입력해주세요!");
		}
		if($(this).hasClass("user_name")){
			$(this).attr("placeholder","반드시 입력해주세요!");
		}
		if($(this).hasClass("user_phone")){
			$(this).attr("placeholder","' - ' 제외하고 핸드폰번호를 입력해 주세요");
		}
		if($(this).hasClass("user_email")){
			$(this).attr("placeholder","반드시 입력해주세요!");
		}
		if($(this).hasClass("user_password")){
			$(this).attr("placeholder","최소 8자 이상 특수문자 포함");
		}
		if($(this).hasClass("refund_name")){
			$(this).attr("placeholder","반드시 입력해주세요!");
		}
		if($(this).hasClass("refund_account")){
			$(this).attr("placeholder","반드시 입력해주세요!");
		}
	});
	
	$(".order_non_input input").on("blur",function(){
		if($(this).hasClass("order_name")){
			$(this).attr("placeholder","수령인");
		}
		if($(this).hasClass("order_phone")){
			$(this).attr("placeholder","연락처");
		}
		if($(this).hasClass("order_postcode")){
			$(this).attr("placeholder","우편번호");
		}
		if($(this).hasClass("order_address")){
			$(this).attr("placeholder","주소");
		}
		if($(this).hasClass("user_name")){
			$(this).attr("placeholder","주문자 성함");
		}
		if($(this).hasClass("user_phone")){
			$(this).attr("placeholder","연락처");
		}
		if($(this).hasClass("user_email")){
			$(this).attr("placeholder","이메일");
		}
		if($(this).hasClass("user_password")){
			$(this).attr("placeholder","최소 8자 이상 특수문자 포함");
		}
		if($(this).hasClass("refund_name")){
			$(this).attr("placeholder","예금주");
		}
		if($(this).hasClass("refund_account")){
			$(this).attr("placeholder","환불 계좌번호");
		}
	});
	
	$("#btn_order").click(function() {
		if($("#user_name").val() == "") {
	        alert("주문자 성함를 꼭 입력해주세요!");	
	        $("#user_name").focus();
	        return false;
	    }
		if($("#user_phone").val() == "") {
	        alert("연락처를 꼭 입력해주세요!");	
	        $("#user_phone").focus();
	        return false;
	    }
		if($("#user_email").val() == "") {
	        alert("이메일을 꼭 입력해주세요!");	
	        $("#user_email").focus();
	        return false;
	    }
		if($("#user_password").val() == "") {
	        alert("주문 비밀번호를 꼭 입력해주세요!");	
	        $("#user_password").focus();
	        return false;
	    }
		if($("#name").val() == "") {
	        alert("이름를 꼭 입력해주세요!");	
	        $("#name").focus();
	        return false;
	    }
		if($("#phone").val() == "") {
	        alert("연락처를 꼭 입력해주세요!");	
	        $("#phone").focus();
	        return false;
	    }
		if($("#zipcode").val() == "") {
	        alert("우편번호를 꼭 입력해주세요!");	
	        $("#zipcode").focus();
	        return false;
	    }
		if($("#address1").val() == "") {
	        alert("주소를 꼭 입력해주세요!");	
	        $("#address1").focus();
	        return false;
	    }
		if($(":input[name=order_payment]:radio:checked").is(":checked") == false) {
			alert("결제수단을 체크해주세요!");
			return false;
		}
		if($("#refund_name").val() == "") {
	        alert("환불 예금주를 꼭 입력해주세요!");
	        $("#refund_name").focus();
	        return false;
	    }
		if($("#refund_account").val() == "") {
	        alert("환불 계좌번호를 꼭 입력해주세요!");
	        $("#refund_account").focus();
	        return false;
	    }
		if($("select[name=refund_bank]").val() == "은행명"){
			alert("환불 은행을 선택해주세요!");
			return false;
		}
		
		if(!regexPwd.test($.trim($("#user_password").val()))){
			alert("비밀번호 : 특수문자, 영문 소문자, 숫자 포함, 8~15자 입력해주세요.");
			$("#user_password").focus();
			return false;
		}
		
		if(!regexEmail.test($.trim($("#user_email").val()))){
			alert("이메일 형식이 잘못되었습니다.");
			$("#user_email").focus();
			return false;
		}
		
		if($("#agree").is(":checked") == false) {
			alert("주문 약관에 동의해주세요!");
			return false;
		}else {
			$("#order").submit();
		}
	});
});