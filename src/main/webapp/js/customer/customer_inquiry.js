/**
 * 
 */

function inquiryForm(obj){
	//alert("ok");

	var str="";
	$(".input_chk:checked").each(function(i,e){
		str=$(e).val();
	});
	if(str==""){
		alert("문의 유형을 선택하세요.");
		str.focus();
		return false;
	}
	
	
	if(obj.title.value==""){
		alert("제목을 입력하세요");
		obj.title.focus();
		return false;
	}
	
	if(obj.content.value==""){
		alert("내용을 입력하세요");
		obj.content.focus();
		return false;
	}
	
}

function inquiryDelete(obj){
	alert("정말로 삭제하시겠습니까?");
}

$(function(){
	$(".customer_inquiry").css("color","#F15F5F");
});
