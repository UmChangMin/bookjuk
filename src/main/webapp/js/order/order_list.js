/**
 * 
 */	



$(function (){
	$("#Cancel_exchange_refund_calendar1,#Cancel_exchange_refund_calendar2").click(function(){
		
		$("#Cancel_exchange_refund_calendar1,#Cancel_exchange_refund_calendar2").datepicker({
		dateFormat: "yy-mm-dd",
		monthNames: ["1월","2월","3월","4월","5월","6월","7월","8월","9월","10월","11월","12월"],
		dayNamesMin: ["일","월","화","수","목","금","토"]
		});
	});	
});