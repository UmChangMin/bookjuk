/**
 * 
 */

$(function(){
	$(".service_contact").css("color","#F15F5F");
});

function contactForm(obj){
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
	
	
	if(obj.contact_subject.value==""){
		alert("제목을 입력하세요");
		obj.title.focus();
		return false;
	}
	
	if(obj.contact_content.value==""){
		alert("내용을 입력하세요");
		obj.content.focus();
		return false;
	}
}

// 삭제
function contactDelete(root,contact_num,currentPage){

	alert("문의 글을 삭제하시겠습니까?");

	var url=root + "/service/contact/delete.do?contact_num="+contact_num+"&pageNumber="+currentPage;
	location.href=url;

}

// 읽기
function readFunction(root, contact_num, currentPage){
	//	alert("ok");
		var url=root + "/service/contact/read.do?contact_num="+contact_num+"&pageNumber="+currentPage;
	//	alert(url);
				
		location.href=url;
}

