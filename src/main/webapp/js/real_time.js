$(function() {
    var count = $('#hread_rank_list li').length;
    var height = $('#hread_rank_list li').height();

    function step(index) {
        $('#hread_rank_list ol').delay(2000).animate({
            top: -height * index,
        }, 500, function() {
            step((index + 1) % count);
        });
    }

    step(1);
});