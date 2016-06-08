window.onload = makeRequest;
var xhr = false;

function makeRequest() {

	if (window.XMLHttpRequest) {
	// code for IE7+, Firefox, Chrome, Opera, Safari


		xhr = new XMLHttpRequest();
	}
	else {

		if (window.ActiveXObject) {
		// code for IE6, IE5

			try {
				xhr = new ActiveXObject("Microsoft.XMLHTTP");
			}
			catch (e) { }
		}
	}
	// if xhr contains a value
	if (xhr) {
	// if there is a change of state calls function showContents
		xhr.onreadystatechange = showContents;
	// Uses the GET command to get the invoice.json file, true is for asynchronous
		xhr.open("GET", "http://localhost:8080/Lab04/question02/invoice.json", true);
	// Sends the request
		xhr.send(null);
	}
	else {
	// put an error message into the body with id "updateArea" on HTML document
		document.getElementById("updateArea").innerHTML = "Sorry, but I couldn't create an XMLHttpRequest";
	}
}

function showContents() {
// if readystate = 4 => complete
	if (xhr.readyState == 4) {
	// if status = 200 => ok
		if (xhr.status == 200) {
		// get the response, ie xml file
			var jsondata = eval("("+xhr.responseText+")"); //retrieve result as an JavaScript object
			var rssentries=jsondata.invoice
			var output='<div>';
			output += '<h1>Invoice No: ' + rssentries.invoiceNo + '</h1>';
			output += '<p><b>Date: </b>' + rssentries.date + '</p>';
			output += '<p><b>Customer: </b><br>';
			output += rssentries.customer + '<br>';
			output += rssentries.address + '<br></p>';
			output += '<table border="1">';
			output += '<tr>';
			output += '<th>Name</th>';
			output += '<th>Quantity</th>';
			output += '<th>Amount</th>';
			output += '</tr>';
			output += '<tr>';
			output += '<td>' + rssentries.order01.name + '</td>';
			output += '<td>' + rssentries.order01.quantity + '</td>';
			output += '<td>' + rssentries.order01.amount + '</td>';
			output += '</tr>';
			output += '<tr>';
			output += '<td>' + rssentries.order02.name + '</td>';
			output += '<td>' + rssentries.order02.quantity + '</td>';
			output += '<td>' + rssentries.order02.amount + '</td>';
			output += '</tr>';
			output += '<table>';
			output += '</div>';
		}
		else {
			var output = "There was a problem with the request " + xhr.status;
		}
		// display the xml details in the "updateArea"
		document.getElementById("updateArea").innerHTML = output;
	}
}
