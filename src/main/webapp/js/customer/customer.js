/**
 * 
 */

$(function(){
	$(".customer_total").click(function(){
		$(this).find(".customer_answer").show();
		$(".customer_total").not(this).find(".customer_answer").hide();
		$(".customer_answer>div").css({
			borderBottom : "1px solid #d4d5d6"
		});
	});
	
	$(".customer_fna").css("color","#F15F5F");
 });