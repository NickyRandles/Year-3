$(document).ready(function(){
	$('li').hover(function(){
		$(this).find('ul>li').stop().fadeToggle(1000);
	});

	$('#email').click(function(){
		$("#email").animate({height: "50px", width: "100px"}, 2000, 'easeInOutElastic');
	});
});
