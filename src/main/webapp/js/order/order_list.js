/**
 * 
 */

$(function (){
	$("#order_calendar1").datepicker({
		dateFormat: "yy-mm-dd",
		monthNames:["1월","2월","3월","4월","5월","6월","7월","8월","9월","10월","11월","12월"],
		dayNamesMin: ["일","월","화","수","목","금","토"],
		onClose: function(selectedDate) {    
            $("#order_calendar2").datepicker("option", "minDate", selectedDate);
        } 
	});
	
	$("#order_calendar2").datepicker({
		dateFormat: "yy-mm-dd",
		monthNames:["1월","2월","3월","4월","5월","6월","7월","8월","9월","10월","11월","12월"],
		dayNamesMin: ["일","월","화","수","목","금","토"],
		onClose: function(selectedDate) {
            $("#order_calendar1").datepicker("option", "maxDate", selectedDate);
        }
	});
	
	$(".order_search").click(function(){
		var start_date = $("#order_calendar1").val();
		var end_date = $("#order_calendar2").val();
		
		if(start_date != "" && end_date != ""){
			end_date = end_date + 1;
			$("#search_calendar").submit();
		}else{
			alert("날짜를 입력해주세요.");
			return false;
		}
	})
});