$(document).ready(function(){
	
	setInterval("imageRotator()", 2000);

	$("#table tr:even").addClass("color01");
	$("#table tr:odd").addClass("color02");
	
	$("#table tr").hover(
	function() {
		$(this).toggleClass("highlight");
	}
	);
	

	var $firstPara = $('p:eq(4)');
	$firstPara.hide();

	$('a.more').click(function(){

		$firstPara.slideToggle('slow');
		var $link = $(this);

		if ( $link.text() == "Read More" ) {
			$link.text('Read Less');      
		} 
		else {
			$link.text('Read More');
		}
		return false;
	});
	
	var $speech = $('div.speech');
	var defaultSize = $speech.css('fontSize');
	
	$('#switcher button').click(function() {
		var num = parseFloat( $speech.css('fontSize'), 10 );
		switch (this.id) {
			case 'switcher-large':
			num *= 1.1;      
			break;
			case 'switcher-small':
			num /= 1.1;
			break;
			default:
			num = parseFloat(defaultSize, 10);        
		}
		
		$speech.animate({fontSize: num + 'px'}, 'slow');
	});
		  
});
			
	
	function imageRotator(){
		
		var currPhoto = $("#photoShow div.current");
		var nextPhoto = currPhoto.next();
		
		if(nextPhoto.length == 0)
		{
			nextPhoto = $("#photoShow div:first")
		}
		
		currPhoto.removeClass('current').addClass('previous');
		
		nextPhoto.css({ opacity: 0.0 }).addClass('current').animate({ opacity: 1.0 }, 2000,
		function() {
			currPhoto.removeClass('previous');
		});
	}