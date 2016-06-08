var map;
var directionDisplay;
var directionsService = new google.maps.DirectionsService();
var myLatlng = new google.maps.LatLng(53.507276, -6.462870);

function initialise()
{
	directionDisplay = new google.maps.DirectionsRenderer();

	var mapOptions = {
		center: myLatlng,
		zoom: 10
	};

	map = new google.maps.Map(document.getElementById("map-canvas"),
	mapOptions);
	
	var contentString = '<div id="marker">'+
	'<h1>Ratoath Community Centre</h1>'+ 
	'<img src="images/centre.jpg" width="200" height="80" alt="logo"/>'+
	'<p>Ratoath Community Centre celebrates its 7th year this September. Over the past four years thousands of local residents, of all ages, have passed through our doors for all sorts of activities as well as visiting our Venue Theatre.</p>'+
	'Ph: 01-6895600 <br> <a href="mailto:info@ratoathcc.ie">info@ratoathcc.ie</a>' +
	'</div>';

	var infowindow = new google.maps.InfoWindow({
	content: contentString
	});

	var marker = new google.maps.Marker({
		position: myLatlng,
		map: map,
		title: 'Ratoath Community Centre',
		icon: 'images/rcc.jpg'
	});
	
	google.maps.event.addListener(marker, 'click', function() {
		infowindow.open(map,marker);
	});

	directionDisplay.setMap(map);
	directionDisplay.setPanel(document.getElementById('directions-panel'));

	var control = document.getElementById('control');
	control.style.display = 'block';
	map.controls[google.maps.ControlPosition.TOP].push(control);
}

function calcRoute(){
	var start = $("#input").val();
	var end = myLatlng;
	var request = {
		origin: start,
		destination: end,
		travelMode: google.maps.DirectionsTravelMode.DRIVING
	};
	directionsService.route(request, function(response, status){
		if(status == google.maps.DirectionsStatus.OK){
			directionDisplay.setDirections(response);
		}
	});
}	
 
google.maps.event.addDomListener(window, 'load', initialise);