<?php

$entries = array(
  'Derby County F.C.' => array(
    'desc' => 'Founded in 1884',
  ),
  'Doncaster Rovers F.C.' => array(
    'desc' => 'Founded in 1879',
  ),


);

foreach ($entries as $term => $entry) {
  if (strpos($term, strtoupper($_REQUEST['term']))
      !== FALSE) {
    $html = '<div class="entry">';

    $html .= '<h3 class="term">';
    $html .= $term;
    $html .= '</h3>';

    $html .= '<div class="desc">';
    $html .= $entry['desc'];
    $html .= '</div>';

    }
    $html .= '</div>';

    $html .= '</div>';

    print($html);
  }