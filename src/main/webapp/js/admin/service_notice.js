/**
 * 
 */

	function read_notice(root, noticeNumber, pageNumber) {
		//alert(root+","+noticeNumber+","+pageNumber);
		var move=root+"/admin/service/notice/noticeManager_read.do?notice_num="+noticeNumber+"&pageNumber="+pageNumber;		
		location.href=move;			
	}
	
	function upMove(root, noticeNumber, pageNumber) {
		//alert(root+","+noticeNumber+","+pageNumber);
		var move=root+"/admin/service/notice/noticeManager_update.do?notice_num="+noticeNumber+"&pageNumber="+pageNumber;		
		location.href=move;			
	}
	
	function deleteMove(root,notice_num,pageNumber) {
		url=root+"/admin/service/notice/noticeManager_delete.do?notice_num="+notice_num+"&pageNumber="+pageNumber;
		location.href=url;
	}
	
	
	
	$(function () {
		$(".pagepic").click(function () {
			$(".pagepic").css("color","red");
		});
		
		$(".pagepic").hover(function () {
			$(this).toggleClass("active");
		});
		
	});