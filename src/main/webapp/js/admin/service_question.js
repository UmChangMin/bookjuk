/**
 * 
 */

	function read_question(root, questionNumber, pageNumber) {
		//alert(root+","+questionNumber+","+pageNumber);
		var move=root+"/admin/service/service/serviceManager_read.do?question_num="+questionNumber+"&pageNumber="+pageNumber;		
		location.href=move;			
	}
	
	function upMove(root, questionNumber, pageNumber) {
		//alert(root+","+questionNumber+","+pageNumber);
		var move=root+"/admin/service/service/serviceManager_update.do?question_num="+questionNumber+"&pageNumber="+pageNumber;		
		location.href=move;			
	}
	
	function deleteMove(root,question_num,pageNumber) {
		url=root+"/admin/service/service/serviceManager_delete.do?service_num="+service_num+"&pageNumber="+pageNumber;
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