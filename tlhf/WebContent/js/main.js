$(document).ready(function(){
    var lookHeight = $(window).height();
    var htmlHeight = parseInt($("html").css("height"));
    var sliderHeight;
    if(lookHeight>htmlHeight){
        sliderHeight = lookHeight-116;
        $(".slider-left").eq(0).css("height",sliderHeight);
        $(".content").eq(0).css("height",sliderHeight);
    }else{
        sliderHeight = parseInt($(".content").eq(0).css("height"));
        $(".slider-left").eq(0).css("height",sliderHeight);
    }
});

$(function(){
    $(".left-nav").accordion({
        //accordion: true,
        speed: 500,
        closedSign: '[+]',
        openedSign: '[-]'
    });
});
