/**
 * 
 */

function couponFunction(root){
	var member_id = $("#member_id").val();
	var url=root+"/member/coupon.do?member_id="+member_id;
	window.open(url,"","width=650, height=260,left=620px, top=225px");
}

function pointFunction(root){
	var member_id = $("#member_id").val();
	var url=root+"/member/point.do?member_id="+member_id;
	window.open(url,"","width=650, height=210,left=620px, top=225px");
}