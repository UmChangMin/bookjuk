/**
 * 
 */

	$(function (){
		//전체선택 체크박스 클릭
		$("#checkbox_All").click(function (){
			//만약 전체 선택 체크박스가 
			if($("#checkbox_All").prop("checked")){
				//해당화면에 전체 체크박스들을 체크해준다.
				$("input[type=checkbox]").prop("checked",true);
				//전체선택 체크박스가 해제된 경우
			}else{
				//해당 화면에 모든 체크 박스들을 해제
				$("input[type=checkbox]").prop("checked",false);
			}
		});
		
		$("#order_calendar1,#order_calendar2").datepicker({
			dataFormat: "yyyy-mm-dd",
			monthNames:["1월","2월","3월","4월","5월","6월","7월","8월","9월","10월","11월","12월"],
			dayNamesMin: ["일","월","화","수","목","금","토"] 
		});
		
		$("#Cancel_exchange_refund_calendar1,#Cancel_exchange_refund_calendar2").datepicker({
			dataFormat: "yyyy-mm-dd",
			monthNames:["1월","2월","3월","4월","5월","6월","7월","8월","9월","10월","11월","12월"],
			dayNamesMin: ["일","월","화","수","목","금","토"] 
		});
		
	});