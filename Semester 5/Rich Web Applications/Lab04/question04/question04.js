function showHint(str){
if (str.length==0)
  {
  document.getElementById("txtHint").innerHTML="";
  return;
  }
var xhr = false;
if (window.XMLHttpRequest) {
		xhr = new XMLHttpRequest();
	}
	else {
		if (window.ActiveXObject) {
			try {
				xhr = new ActiveXObject("Microsoft.XMLHTTP");
			}
			catch (e) { }
		}
	}
	if (xhr) {
		// when the browser changes state call function setText
			xhr.onreadystatechange = setText;
		// Call the php file with the query string 'q' from the text field
			xhr.open("GET","question04.php?q="+str,true);
		// send the request to the server
			xhr.send(null);
		}
		else {
			alert("Sorry, but I couldn't create an XMLHttpRequest");
		}
function setText() {
	if (xhr.readyState == 4) {
		if (xhr.status == 200) {
			document.getElementById("txtHint").innerHTML=xhr.responseText;
			}}
			}
}
