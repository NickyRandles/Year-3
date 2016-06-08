// Loading HTML Files
$(document).ready(function() {
   $('#letter-a').click(function() {
     $('#footballTeams').load('a-teams.html');
     return false;
   });
 });

 $(document).ready(function() {
   $('#letter-b').click(function() {
     $.getJSON('b-team.json', function(data) {
       $('#footballTeams').empty();
       $.each(data, function(entryIndex, entry) {
         var html = '<div class="entry">';
         html += '<h3 class="team">' + entry['name'] + '</h3>';
         html += '<div class="manager">' + entry['description'] + '</div>';
         html += '</div>';
         html += '</div>';
         $('#footballTeams').append(html);
       });
     });
     return false;
   });
 });

