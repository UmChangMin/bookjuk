/**
 * 
 */

	function read_contact(root, contact_num, pageNumber) {
		//alert(root+","+contactNumber+","+pageNumber);
		var move=root+"/admin/service/contact/contactManager_read.do?contact_num="+contact_num+"&pageNumber="+pageNumber;		
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