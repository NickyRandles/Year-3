$(document).ready(function() {
  $('form').submit(function() {
    $.get('d-team.php', $(this).serialize(), function(data) {
      $('#footballTeams').html(data);
    });
    return false;
  });
});

