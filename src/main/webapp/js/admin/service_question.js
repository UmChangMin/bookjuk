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
	
	function delMove(root,questionNumber) {
		url=root+"/admin/service/service/serviceManager_delete.do?question_num="+questionNumber;
		location.href=url;
	}
	
	
	
	$(function () {
		$(".nav-item:eq(4)").addClass("active");
		$(".pagepic").click(function () {
			$(".pagepic").css("color","red");
		});
		
		$(".pagepic").hover(function () {
			$(this).toggleClass("active");
		});
		
	});