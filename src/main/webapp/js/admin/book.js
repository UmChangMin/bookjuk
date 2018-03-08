/**
 * 
 */
function readURL(input){ 
		if(input.files&&input.files[0]){ 
			var reader=new FileReader(); 
			reader.onload=function(e){ 
				$("#imgFrame").attr("src", e.target.result); 
			} 
			reader.readAsDataURL(input.files[0]); 
		} 
	} 
	
	function read_book(root,book_num,pageNumber) {
		var url=root+"/admin/book/bookManager.do?book_num="+book_num+"&pageNumber="+pageNumber;
		
		location.href=url;
	}
	
	
	$(function(){
		$(".nav-item:eq(3)").addClass("active");
		
	});
	
	/**/
	$(function() {
	  $("#inputKeyword").keyup(function () {
	    var searchTerm = $("#inputKeyword").val();
	    var listItem = $('.book_content').children('ul');
	    var searchSplit = searchTerm.replace(/ /g, "'):containsi('")
	    
	  $.extend($.expr[':'], {'containsi': function(elem, i, match, array){
	        return (elem.textContent||elem.innerText||'').toLowerCase().indexOf((match[3] || "").toLowerCase()) >= 0;
	    }
	  });
	    
	  $(".book_content ul").not(":containsi('"+searchSplit+"')").each(function(e){
	    $(this).attr('visible','false');
	  });
	
	  $(".book_content ul:containsi('"+searchSplit+"')").each(function(e){
	    $(this).attr('visible','true');
	  });
	
	  var jobCount=$('.book_content ul[visible="true"]').length;//검색결과길이
	    $('.counter').text(jobCount + ' 개의 결과');
	
	  if(jobCount =='0') {	//검색결과
		  $('.no-result').show();
		  $('.pageing').hide();
	  }else {//값이 있으면
	    	$('.no-result').hide();
	    	$('.pageing').hide();
	    	if(jobCount=='10'){
	    		$('.pageing').show();
	    	}
	    }
			});
	});
	
	
	/**/
	
	/* function search(root) {		
		
		var keywordVal=$("#inputKeyword").val();
		
		var keyword="keyword="+keywordVal;
		var url=root+"/admin/book/bookManager_searchKeyword.do";
		
		
		
		$.ajax({
		    type: "post",
		    dataType: "json",
		    url: url,	
		    data:keyword,
		    success: function(data) {
		    //	alert(data[0]);
		      /* for (var i = 0; i < data.length; i++) {
		        alert("ok:"+data[i].name);
		      } 
		    }
		  });
	} */