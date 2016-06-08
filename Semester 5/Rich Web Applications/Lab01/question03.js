window.onload = initImages;

function initImages() {
	for (var i=0; i<document.images.length; i++) {
		document.images[i].ondblclick = newWindow;
	}
}

function newWindow() {
	var imgName = this.id;

	var imgWindow = window.open(imgName + ".html", "imgWin", "width=500,height=280,scrollbars=no");
}
