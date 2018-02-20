/**
 * 
 */

$(function(){
    
	/**//**//**//**//**//**//**//**//**//**/
	/**//**//**//**//**//**//**//**//**//**/
	
	/** 주문일자*/
	
	
	/**//**//**//**//**//**//**//**//**//**/
	/**//**//**//**//**//**//**//**//**//**/
	
	/** 수량, 가격에 따른 연산과 총합구하기 2018-02-14 11:30 김태우 */
	var price=$(".content_menulist_title>ul>li:last-child>input").not(".menulist_title");
	var count=$(".content_menulist_title>ul>li:nth-child(2)>input").not(".menulist_title");
	
	var price_red=price.css("color","red");//구간 체크용
	var count_blue=count.css("color","blue");
	
	//alert(count.length+","+price.length);
	
	var mul=0;
	var tot=0;
	for(i=1;i<=price.length;i++){
		//수량과 가격을 뽑아냄
		var count_val=$(".content_menulist_title>ul:eq("+i+")>li:nth-child(2)>input").not(".menulist_title").val();
		var price_val=$(".content_menulist_title>ul:eq("+i+")>li:last-child>input").not(".menulist_title").val();
		
		//수량과 가격을 integer화 =>연산을 위해
		var count_Int=parseInt(count_val);
		var price_Int=parseInt(price_val);
		
		mul+=(count_Int*price_Int*1000);//수량*가격
	}
	
	//연산값	
	$("#inputTotalPrice").val(mul+'원');
	
	
	
	
	
	
	
	$(".nav-item:eq(1)").addClass("active");
	
	/**//**//**//**//**//**//**//**//**//**/
	/**//**//**//**//**//**//**//**//**//**/
	
    
});	


function search() {
	var Iphone=document.getElementById("inputPhone").value;
	var Iname=document.getElementById("inputName").value;
	var Iemail=document.getElementById("inputEmail").value;
	var IorderDate=document.getElementById("inputOrderDate").value;
	alert(Iphone+","+Iname+","+Iemail+","+IorderDate);
	
}






















