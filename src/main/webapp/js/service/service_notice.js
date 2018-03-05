/**
 * 
 */
$(function() {

	$(".service_notice").css("color", "#F15F5F");
});

function readFunction(root,notice_num,currentPage){
	var url=root + "/service/notice/read.do?notice_num="+notice_num+"&pageNumber="+currentPage;

	//	alert(url);
				
	location.href=url;
}