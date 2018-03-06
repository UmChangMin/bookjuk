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
	  
	  $("input[type=checkbox]").prop("checked",true);
	  
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