/**
 * 
 */
$(function(){ 
	  $('.bt_up').click(function(){ 
	    var n = $('.bt_up').index(this);
	    var num = $(".amount:eq("+n+")").val();
	    num = $(".amount:eq("+n+")").val(num*1+1); 
	  });
	  $('.bt_down').click(function(){ 
	    var n = $('.bt_down').index(this);
	    var num = $(".amount:eq("+n+")").val();
	    num = $(".amount:eq("+n+")").val(num*1-1); 
	  });
	  
	  /*$("input[type=checkbox]").prop("checked",true);*/
	  
	  $("#checkbox_all").click(function(){
		 if($("#checkbox_all").prop("checked")){
			 $("input[type=checkbox]").prop("checked",true);
		 }else{
			 $("input[type=checkbox]").prop("checked",false);
		 }
	  });
	  
	  $(".cart_btn_delete").click(function(){
		 $("input[name=chkObj]:checked").each(function(i, elements){
			 index = $(elements).index("input[name=chkObj]");
			 var book_num = $("input[name=chkObj]").eq(index).parent().find(".cart_book_num").val();
			 $.ajax({
				 url : "deleteCart.do",
				 type : "GET",
				 data : "book_num=" + book_num,
				 success : function(data){
				 }
			 })
		 })
		 alert("선택한 상품이 삭제되었습니다.");
		 location.reload();
	  });
	
	$(".cart_btn_non_order").click(function(){
		var check = $("input[name=chkObj]:checked").val();
		var member_level = $("#member_level").val();
		 
		if(check == null){
			alert("장바구니가 비어있습니다.");
			return false;
		}else if(member_level != "none"){
			alert("회원 주문하기를 이용해주세요.");
			return false;
		}else if(member_level == "none"){
			$("#non_order_submit").submit();
		}
	});
	  
	$(".cart_btn_order").click(function(){
		var check = $("input[name=chkObj]:checked").val();
		var member_level = $("#member_level").val();
			
		if(check == null){
			alert("장바구니가 비어있습니다.");
			return false;
		}else if(member_level == "none"){
			alert("회원이 아닙니다. 비회원 주문하기를 이용해주세요.");
			return false;
		}else{
			$("#order_submit").submit();
		}
	});
})
	
function updateAmount(book_num, index){
	var amount = $(".amount:eq(" + index + ")").val();
    
	$.ajax({
		url : "updateAmount.do",
		type : "GET",
		data : "book_num=" + book_num + "&cart_amount=" + amount,
		success : function(data){
			location.reload();
		}
	})
}