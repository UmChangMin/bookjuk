/**
 * 
 */
	/*	$(".bookDetail_mid_image_show>a").replaceWith("<img src='${root}/img/bookList/grid_pink.png'>"); 
		$(".bookDetail_mid_list_show").replaceWith("<img src='${root}/img/bookList/list_var.png'>");
		*/
		
$(function(){
	
	// 리스트 보기 방식 변경
	$(".bookDetail_mid_list_show").click(function(){
		$(".bookList_mid_content2").attr("style","display:none");
		$(".bookList_mid_content1").attr("style","display:block");
	});
	
	$(".bookDetail_mid_image_show").click(function(){
		$(".bookList_mid_content2").attr("style","display:block");
		$(".bookList_mid_content1").attr("style","display:none");
	});	
	
/*	$(".bookDetail_mid_image_show").click(function(){
		if($(".bookList_mid_content2").css("display") == "none"){
			$(".bookList_mid_content2").show();
		} else {
		    $(".bookList_mid_content2").hide();
		}
	});
	*/


});