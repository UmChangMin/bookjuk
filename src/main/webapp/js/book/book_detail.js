/**
 * 
 */
function cartFunction(obj){
	 confirm("도서가 장바구니에 담겼습니다.\n장바구니로 바로 이동하시겠습니까?");
}

$(function(){
		
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
        
        // 스크롤 이동시 pink_bottom의 변화
        
        
    	// 별점
		$( ".bookDetail_star_rating a" ).click(function() {
		     $(this).parent().children("a").removeClass("star_on");
		     $(this).addClass("star_on").prevAll("a").addClass("star_on");
		     return false;
		});
		
        // 리뷰등록시
        $(".bookDetail_rating_btn_input").click(function(){
        	alert("등록완료");
        });     
	});

