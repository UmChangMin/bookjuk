/**
 * 
 */
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

function usePoint(point, tot_price){
	var use_point = $("#order_point").val();
	if(use_point < 1000){
		alert("1000 Point 이상 사용가능합니다.");
		$("#order_point").val(0);
	}else if(use_point > point){
		alert("보유 Point 보다 많은 Point를 입력하셨습니다.");
		$("#order_point").val(0);
	}else{
		use_point = Math.floor(use_point/10) * 10;
		$("#order_point").val(use_point);
	}
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
	
	$("#btn_order").click(function() {
		if ($("#agree").is(":checked") == false) {
			alert("주문 약관에 동의해주세요.");
			return false;
		} else {
			$("#order").submit();
		}
	});
});

