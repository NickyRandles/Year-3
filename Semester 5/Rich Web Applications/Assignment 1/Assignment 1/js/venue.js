$(document).ready(function() {

	var json = "";

	$('#option01').click(function(){
		json = "json/event01.json";
	}); 
	
	$('#option02').click(function(){
		json = "json/event02.json";
	}); 
	
	$('#option03').click(function(){
		json = "json/event03.json";
	}); 
	
	$('#option04').click(function(){
		json = "json/event04.json";
	}); 

  $('#container a').click(function() {
    $.getJSON(json, function(data) {
      $('#info').empty();
      $.each(data, function(entryIndex, entry) {
        var html = '<div class="entry">';
        html += '<h1 class="name">' + entry['name'] + '</h1>';
		html += '<img src ="' + entry['image'] + '">';
        html += '<h2 class="date">' + entry['date'] + '</h2>';
		html += '<h3 class="price">' + entry['price'] + '</h3>';
        if (entry['description']) {
          $.each(entry['description'], function(lineIndex, line) {
            html += '<p class="paragraph">' + line + '</p>';
          });
        }
        html += '</div>';
        $('#info').append(html);
      });
    });
    return false;
  });
});