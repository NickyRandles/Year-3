$(document).ready(function(){

	$("#ratoathPic").click(function(){
		$(this).animate({ height: "400", width: "500" }, 1000, "swing");
	});
	
	$(".centreAction").click(function(){
		$(this).fadeOut(1000);
	});
});

