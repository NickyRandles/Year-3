window.onload = initForm;

function initForm() {
	document.getElementById("countrys").selectedIndex = 0;
	document.getElementById("countrys").onchange = populate;
}

function populate() {
	var ireland = new Array("Dublin", "Cork", "Galway");
	var england = new Array("Manchester", "London", "Blackpool");
	var france = new Array("Bordeaux", "Cannes", "Chamonix");

	var countryStr = this.options[this.selectedIndex].value;

	if (countryStr = "1") {

		document.getElementById("citys").options.length = 0;
		for(var i=0; i<3; i++) {
			document.getElementById("citys").options[i] = new Option(ireland[i]);
		}

	else if (countryStr = "2") {

		document.getElementById("citys").options.length = 0;
		for(var i=0; i<3; i++) {
			document.getElementById("citys").options[i] = new Option(england[i]);
		}
	}


	else if (countryStr = "2") {

		document.getElementById("citys").options.length = 0;
		for(var i=0; i<3; i++) {
			document.getElementById("citys").options[i] = new Option(france[i]);
		}
	}
}
	}


