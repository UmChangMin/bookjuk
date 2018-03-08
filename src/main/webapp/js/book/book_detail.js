/**
 * 
 */
function cartFunction(obj){
	 confirm("도서가 장바구니에 담겼습니다.\n장바구니로 바로 이동하시겠습니까?");
}

$(function(){
	$(".bookDetail_buy").click(function(){
		var order_id = $("#order_id").val();
		var length = order_id.length;
		var book_num = $(".book_num").val();
		
		if(length > 20){
			$(location).attr('href', "/bookjuk/order/order_non.do?book_num=" + book_num + "&order_id=" + order_id);
		}else{
			$(location).attr('href', "/bookjuk/order/order.do?book_num=" + book_num + "&order_id=" + order_id);
		}
		
	});
	
		// tab메뉴 따라오기
		var tab = $(".bookDetail_tab").offset();
        $( window ).scroll( function() {
          if ( $( document ).scrollTop() > tab.top ) {
            $(".bookDetail_tab").addClass("bookDetail_jbFixed");
          }
          else {
            $(".bookDetail_tab").removeClass("bookDetail_jbFixed");
          }
        });
		
		// tab 클릭시 이동
		$(".bookDetail_scroll_tab li>a:eq(0)").click(function(){
			var position = $(".bookDetail_one_page").offset(); // 위치값
			$("html,body").animate({ scrollTop : position.top }, 200); // 이동
		});
		
		$(".bookDetail_scroll_tab li>a:eq(1)").click(function(){
			var position = $(".bookDetail_second_page").offset(); // 위치값
			$("html,body").animate({ scrollTop : position.top }, 200); // 이동
		});
		
		$(".bookDetail_scroll_tab li>a:eq(2)").click(function(){
			var position = $('.bookDetail_author_intro').offset(); // 위치값
			$("html,body").animate({ scrollTop : position.top }, 200); // 이동
		});
		
		$(".bookDetail_scroll_tab li>a:eq(3)").click(function(){
			var position = $('.bookDetail_one_content').offset(); // 위치값
			$("html,body").animate({ scrollTop : position.top }, 200); // 이동
		});
		
		$(".bookDetail_scroll_tab li>a:eq(4)").click(function(){
			var position = $('.bookDetail_review').offset(); // 위치값
			$("html,body").animate({ scrollTop : position.top }, 200); // 이동
		});
        
        // tab클릭시 pink_bottom 바뀌기 - bookDetail_on
        $( ".bookDetail_scroll_tab li" ).click(function() { 
        	$(this).addClass("bookDetail_on");
        	$(".bookDetail_scroll_tab li").not(this).removeClass("bookDetail_on");
        	
		}); 
        
        // 별점 평균
        var starAvg = $(".bookDetail_rank_user").val();
        
        if(starAvg == 5.0){
        	$(".bookDetail_list_star").css('background-position-y','100%');
        }else if(starAvg < 5.0 && starAvg >= 4.5){
        	$(".bookDetail_list_star").css('background-position-y','90%');
        }else if(starAvg < 4.5 && starAvg >= 4.0){
        	$(".bookDetail_list_star").css('background-position-y','80%');
        }else if(starAvg < 4.0 && starAvg >= 3.5){
        	$(".bookDetail_list_star").css('background-position-y','70%');
        }else if(starAvg < 3.5 && starAvg >= 3.0){
        	$(".bookDetail_list_star").css('background-position-y','60%');
        }else if(starAvg < 3.0 && starAvg >= 2.5){
        	$(".bookDetail_list_star").css('background-position-y','50%');
        }else if(starAvg < 2.5 && starAvg >= 2.0){
        	$(".bookDetail_list_star").css('background-position-y','40%');
        }else if(starAvg < 2.0 && starAvg >= 1.5){
        	$(".bookDetail_list_star").css('background-position-y','30%');
        }else if(starAvg < 1.5 && starAvg >= 1.0){
        	$(".bookDetail_list_star").css('background-position-y','20%');
        }else if(starAvg < 1.0 && starAvg >= 0.5){
        	$(".bookDetail_list_star").css('background-position-y','10%');
        }else if(starAvg < 0.5 && starAvg >= 0.0){
        	$(".bookDetail_list_star").css('background-position-y','0%');
        }
        
    	// 회원 리뷰 별점
		$(".bookDetail_reviewAll_top > li").on("click", function() {			
			var onStar =parseInt($(this).val()); // 최대 값 5
	    	var stars =$(this).parent().children("li.star");	
			
	   	 	for(i=0;i<stars.length;i++){
		      $(stars[i]).removeClass("selected");
		    }
		    
		    for(i=0;i<onStar;i++){
		      $(stars[i]).addClass("selected");
		    }
		    
			var selectedCssClass="selected";
			var rthis=$(this);
			rthis.siblings("."+selectedCssClass).removeClass(selectedCssClass);
			rthis.addClass(selectedCssClass).parent().addClass("change_star");
			
			$("#review_score").val($(this).val());
		});
		
		
		$(".bookDetail_review > .bookdetail_reviewLists").each(function(){
			var starReview = $(this).find("#review_score").val();
			
	        if(starReview == 5.0){
	        	$(this).find(".bookDetail_review_starImg").css('background-position-y','100%');
	        }else if(starReview == 4.0){
	        	$(this).find(".bookDetail_review_starImg").css('background-position-y','79%');
	        }else if(starReview == 3.0){
	        	$(this).find(".bookDetail_review_starImg").css('background-position-y','59%');
	        }else if(starReview == 2.0){
	        	$(this).find(".bookDetail_review_starImg").css('background-position-y','40%');
	        }else if(starReview == 1.0){
	        	$(this).find(".bookDetail_review_starImg").css('background-position-y','20%');
	        }else if(starReview == 0){
	        	$(this).find(".bookDetail_review_starImg").css('background-position-y','0%');
	        }
		});
	});

//회원 리뷰 등록 (AJAX)
function insertReview() {
	var book_num = $("#book_num").val();
	var member_id = $("#member_id").val();
	var review_score = $("#review_score").val();
	var review_content = $("#review_content").val();
	
	$.ajax({
		url : "insertReview.do",
		type : "POST",
		data : "book_num=" + book_num + "&member_id=" + member_id + "&review_score=" + review_score + "&review_content=" + review_content,
		success : function(data) {
			location.reload();
			
			var position = $('.bookDetail_review').offset(); // 위치값
			$("html,body").animate({ scrollTop : position.top }, 200); // 이동
		}
	});
}

function deleteReview(review_num) {
	var result = confirm('정말로 삭제하시겠습니까 ?');

	if(result){
		$.ajax({
			url : "deleteReview.do",
			type : "POST",
			data : "review_num=" + review_num,
			success : function(data) {
				location.reload();
				
				var position = $('.bookDetail_review').offset(); // 위치값
				$("html,body").animate({ scrollTop : position.top }, 200); // 이동
			}
		});
	}	
}

function insertCart(book_num){
	$.ajax({
		url : "insertCart.do",
		type : "POST",
		data : "book_num=" + book_num,
		success : function(data){
			var result = confirm("장바구니로 바로 이동하시겠습니까 ?");
			
			if(result) {location.replace("/bookjuk/order/cart.do");}
		}
	})
}

