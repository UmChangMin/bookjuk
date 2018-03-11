/**
 * 
 */

$(function(){
		$(".nav-item:eq(2)").addClass("active");
	});

function UpMove(root,member_num) {
	url=root+"/admin/member/memberManager_update.do?member_num="+member_num;
	location.href=url;
}

function DelMove(root,member_num) {
	url=root+"/admin/member/memberManager_delete.do?member_num="+member_num;
	location.href=url;
}

function BackMove(root) {
	url=root+"/admin/member/memberManager_search.do";
	location.href=url;
}