/**
 * 
 */

	function read_notice(root, noticeNumber, pageNumber) {
		//alert(root+","+noticeNumber+","+pageNumber);
		var move=root+"/admin/service/notice/noticeManager_read.do?notice_num="+noticeNumber+"&pageNumber="+pageNumber;		
		location.href=move;
			
	}
	
	$(function () {
		$(".pagepic").click(function () {
			$(".pagepic").css("color","red");
		});
		
		$(".pagepic").hover(function () {
			$(this).toggleClass("active");
		});
		
	});