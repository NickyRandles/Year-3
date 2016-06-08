<?php
 $q=$_GET["q"];

$con = mysql_connect('localhost', 'root', 'usbw', 'holidays');
 if (!$con)
   {
   die('Could not connect: ' . mysql_error());
   }

mysql_select_db("holidays", $con);

$sql="SELECT * FROM passengers WHERE id = '".$q."'";

$result = mysql_query($sql);

echo "<table border='1'>
 <tr>
 <th>Passenger name</th>
 <th>Outbound depart from</th>
 <th>Outbound destination</th>
 <th>Outbound depart date</th>
 <th>Outbound depart time</th>
 <th>Outbound arrive time</th>
 <th>Hotel name</th>
 <th>Hotel location</th>
 <th>Stay</th>
 <th>Checkin date</th>
 <th>Checkout date</th>
 <th>Return depart from</th>
 <th>Return destination</th>
 <th>Return depart date</th>
 <th>Return depart time</th>
 <th>Return arrive time</th>
 </tr>";

while($row = mysql_fetch_array($result))
   {
   echo "<tr>";
   echo "<td>" . $row['passengerName'] . "</td>";
   echo "<td>" . $row['outboundDepartFrom'] . "</td>";
   echo "<td>" . $row['outboundDestination'] . "</td>";
   echo "<td>" . $row['outboundDepartDate'] . "</td>";
   echo "<td>" . $row['outboundDepartTime'] . "</td>";
   echo "<td>" . $row['outboundArriveTime'] . "</td>";
   echo "<td>" . $row['hotelName'] . "</td>";
   echo "<td>" . $row['hotelLocation'] . "</td>";
   echo "<td>" . $row['stay'] . "</td>";
   echo "<td>" . $row['checkinDate'] . "</td>";
   echo "<td>" . $row['checkoutDate'] . "</td>";
   echo "<td>" . $row['returnDepartFrom'] . "</td>";
   echo "<td>" . $row['returnDestination'] . "</td>";
   echo "<td>" . $row['returnDepartDate'] . "</td>";
   echo "<td>" . $row['returnDepartTime'] . "</td>";
   echo "<td>" . $row['returnArriveTime'] . "</td>"; 
   echo "</tr>";
   }
 echo "</table>";

mysql_close($con);
 ?>