/**
 * 
 */

	function read_contact(root, contact_num, pageNumber) {
		//alert(root+","+contactNumber+","+pageNumber);
		var move=root+"/admin/service/contact/contactManager_read.do?contact_num="+contact_num+"&pageNumber="+pageNumber;		
		location.href=move;
			
	}
	
	function deleteMove(root,contact_num,pageNumber) {
		url=root+"/admin/service/contact/contactManager_delete.do?contact_num="+contact_num+"&pageNumber="+pageNumber;
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