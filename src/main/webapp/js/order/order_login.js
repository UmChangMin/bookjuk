/**
 * 
 */
function focus(num) {
	num = num.replace(/[^0-9]/g, '');
	$(".order_phone").val(num);
}

function blur(num) {
	num = num.replace(/[^0-9]/g, '');
	var tmp = '';
	tmp += num.substr(0, 3);
	tmp += '-';
	tmp += num.substr(3, 4);
	tmp += '-';
	tmp += num.substr(7);
	$(".order_phone").val(tmp);
}

$(function(){
	$(".order_name").focus();
	
	$("input.order_phone").blur(function(){
    	var num = $(".order_phone").val();
    	blur(num)
	});
	$("input.order_phone").click(function(){
	    	var num = $(".order_phone").val();
	    	focus(num);
	});
	
	$(".order_input input").on("focus", function(){
		if($(this).hasClass("order_name")){
			$(this).attr("placeholder","반드시 입력해주세요!");
			$(this).css("border","1px solid #F15F5F");
		}
		if($(this).hasClass("order_phone")){
			$(this).attr("placeholder","' - ' 제외하고 핸드폰번호를 입력해 주세요");
			$(this).css("border","1px solid #F15F5F");
		}
		if($(this).hasClass("order_pwd")){
			$(this).attr("placeholder","최소 8자 이상 특수문자 포함");
			$(this).css("border","1px solid #F15F5F");
		}
	});
	
	$(".order_input input").on("blur",function(){
		if($(this).hasClass("order_name")){
			$(this).attr("placeholder","이름");
			$(this).css("border","1px solid #ccc");
		}
		if($(this).hasClass("order_phone")){
			$(this).attr("placeholder","핸드폰 번호");
			$(this).css("border","1px solid #ccc");
		}
		if($(this).hasClass("order_pwd")){
			$(this).attr("placeholder","주문 비밀번호");
			$(this).css("border","1px solid #ccc");
		}
	});
	
	$("#order_btn").click(function(){
		if($(".order_name").val() == "") {
	        alert("이름을 꼭 입력하세요!");	
	        $(".order_name").focus();
	        return false;
	    }
		if($(".order_phone").val() == "") {
	        alert("핸드폰 번호를 꼭 입력하세요!");
	        $(".order_phone").focus();
	        return false;
	    }
		if($(".order_pwd").val() == "") {
	        alert("주문 비밀번호를 꼭 입력하세요!");
	        $(".order_pwd").focus();
	        return false;
	    }
		
		$("form").submit();
	});
});