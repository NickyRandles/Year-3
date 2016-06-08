$("document").ready(function(){
	$("#accordion").accordion({header: "h3", active: 6});
	
	$("#activity01, #activity02, #activity04, #activity05, #activity07").click(function(){
		$(this).animate({height: "300", width: "300"}, 1000, "swing");
	});
	
	$("#activity03, #activity06").click(function(){
		$(this).animate({height: "300", width: "400"}, 1000, "swing");
	});
});