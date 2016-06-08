// Loading HTML Files
$(document).ready(function() {
   $('#letter-a').click(function() {
     $('#footballTeams').load('a-teams.html');
     return false;
   });
 });