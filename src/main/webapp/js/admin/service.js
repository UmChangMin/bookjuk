/**
 * 
 */

$(function(){
    
    /** 초기화 처리*/

    // 0번지가 펼쳐져 있도록 처리
    $(".collapsible:eq(0) a").addClass("selected"); //첫번째 항목만 selected 클래스를 적용
    $(".collapsible").not(":eq(0)").find(".content_value").hide(); //첫번째 항목 이외의 content를 숨김
    
    /** a태그에 대한 클릭 이벤트 처리 */
    $(".collapsible>.title>a").click(function() {            
        $(this).toggleClass("selected");
        //클릭된 나 자신을 제외한 나머리 링크들은 slected 클래스를 무조건 제거
        $(".collapsible>.title>a").not(this).removeClass("selected"); 

        // 펼칠 내용 영역 선택- 현재 선택된 것의 부모
        var select=$(this).parents(".collapsible").find(".content_value");

        // 나머지 내용 영역을 선택- 타이틀 a태그가 아닌 자식들의 부모
        var other=$(".collapsible>.title>a").not(this).parents(".collapsible").find(".content_value");

        // 애니메이션으로 열고 닫기 처리
        select.slideToggle(300);
        other.slideUp(300);
        
        // 링크 페이지 이동 중지
        return false;
    });  
    
    /*service 글쓰기*/
    $(function () {
		$("#accordion").accordion({
			collapsible: true
		});
	});
    
});

