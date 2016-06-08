<?php

$entries = array(
  'CHELSEA' => array(
    'definition' => 'Chelsea Football Club are an English football club based in Fulham, London. Founded in 1905.',
  ),

	'CRYSTAL PALACE' => array(
	 'definition' => 'Crystal Palace Football Club is an English professional football club based in South Norwood, London.',
  ),
);

if (isset($entries[strtoupper($_REQUEST['term'])])) {
  $entry = $entries[strtoupper($_REQUEST['term'])];

  $html = '<div class="entry">';

  $html .= '<h3 class="term">';
  $html .= strtoupper($_REQUEST['term']);
  $html .= '</h3>';

  $html .= '<div class="definition">';
  $html .= $entry['definition'];

  $html .= '</div>';

  $html .= '</div>';

  print($html);
}
