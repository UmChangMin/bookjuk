/**
 * 
 */

$(function(){
	$(".service_total").click(function(){
		$(this).find(".service_answer").show();
		$(".service_total").not(this).find(".service_answer").hide();
		$(".service_answer>div").css({
			borderBottom : "1px solid #d4d5d6"
		});
	});
	
	$(".service_fna").css("color","#F15F5F");
 });