 $(document).ready(function() {
   $('#letter-c a').click(function() {
     $.get('c-team.php', {'term': $(this).text()}, function(data) {
       $('#footballTeams').html(data);
     });
     return false;
   });
 });

