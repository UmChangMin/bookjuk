/**
 * 
 */

$(function(){
	$(".order_content ul").hide();
	$(".order_content ul").slice(0, 10).show();
	/**//**//**//**//**//**//**//**//**//**/
	/**//**//**//**//**//**//**//**//**//**/
	
	/** 주문일자*/
	
	
	/**//**//**//**//**//**//**//**//**//**/
	/**//**//**//**//**//**//**//**//**//**/
	
	/** 수량, 가격에 따른 연산과 총합구하기 2018-02-14 11:30 김태우 */
	/*var price=$(".content_menulist_title>ul>li:last-child>input").not(".menulist_title");
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
		
		mul+=(count_Int*price_Int);//수량*가격
	}
	
	//연산값	
	$("#inputTotalPrice").val(mul+'원');*/

	$(".nav-item:eq(1)").addClass("active");

	/**//**//**//**//**//**//**//**//**//**/
	/**//**//**//**//**//**//**//**//**//**/
	
    
});	

function read_order(root,order_num) {
	var url=root+"/admin/order/orderManager.do?order_num="+order_num;
	
	location.href=url;
}

$(function() {
	
	  $("#inputKeyword").keyup(function () {
	    var searchTerm = $("#inputKeyword").val();
	    var listItem = $('.order_content').children('ul');
	    var searchSplit = searchTerm.replace(/ /g, "'):containsi('")

	  $.extend($.expr[':'], {'containsi': function(elem, i, match, array){
	        return (elem.textContent||elem.innerText||'').toLowerCase().indexOf((match[3] || "").toLowerCase()) >= 0;
	    }
	  });
	    
	  $(".order_content ul").not(":containsi('"+searchSplit+"')").each(function(e){
	    $(this).attr('visible','false');
	  });
	
	  $(".order_content ul:containsi('"+searchSplit+"')").each(function(e){
	    $(this).attr('visible','true');
	  });
	
	  var jobCount=$('.order_content ul[visible="true"]').length;//검색결과길이
	    $('.counter').text(jobCount + ' 개의 결과');
	    
	  if(jobCount =='0') {	//검색결과
		  $('.no-result').show();
		  $('.pageing').hide();
	  }else {//값이 있으면
		  $(".order_content ul").hide();
		  $('.order_content ul[visible="true"]').show();
	    	$('.no-result').hide();
	    	$('.pageing').hide();
	    	if(jobCount=='10'){
	    		$('.pageing').show();
	    	}
	    }
			});
	});


	function upMove(root,order_num,book_num) {
		var url=root+"/admin/order/orderManager_update.do?order_num="+order_num+"&book_num="+book_num;
		location.href=url;
	}
	
	function delMove(root,order_num,book_num) {
		var url=root+"/admin/order/orderManager_update.do?order_num="+order_num+"&book_num="+book_num;
		location.href=url;
	}















