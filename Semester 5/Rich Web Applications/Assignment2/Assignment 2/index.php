<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
	<title>Ratoath Community Centre</title>
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
	<script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
	<script src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
	<link rel="stylesheet" href="css/index.css" />
	<link rel="stylesheet" href="css/theme01.min.css" />
	<link rel="stylesheet" href="css/jquery.mobile.icons.min.css" />
	<script src="js/index.js" type="text/javascript"></script>
	<script src = "https://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
    <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?sensor=true"></script>
	<script type="text/javascript" src="js/location.js"></script>
	<link rel="apple-touch-icon-precomposed" sizes="57x57" href="images/icon-57x57.png" />
	<link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/icon-72x72.png" />
	<link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/icon-114x114.png" />
	<link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/icon-144x144.png" />


</head>
<body>
	<div id="fb-root"></div>
	<script>(function(d, s, id) {
	  var js, fjs = d.getElementsByTagName(s)[0];
	  if (d.getElementById(id)) return;
	  js = d.createElement(s); js.id = id;
	  js.src = "//connect.facebook.net/en_GB/sdk.js#xfbml=1&appId=1734121413479924&version=v2.0";
	  fjs.parentNode.insertBefore(js, fjs);
	}(document, 'script', 'facebook-jssdk'));</script>

	<!-- Start of Page: Home -->
	<div id="home" data-role="page">
		<div data-role="header" data-position="fixed">
			<h1>Home</h1>
			<a href="#" data-icon="home" data-iconpos="notext">Home</a>
			<a href="#info" data-icon="info" data-iconpos="notext" data-rel="dialog">Info</a>
		</div>
		<div data-role="content">
			<div data-role="controlgroup">
				<a href="#about" data-role="button" class="ui-btn ui-btn-icon-left ui-icon-about">About</a>
				<a href="#activities" data-role="button" class="ui-btn ui-btn-icon-left ui-icon-activities">Activities</a>
				<a href="#videos" data-role="button" class="ui-btn ui-btn-icon-left ui-icon-videos">Videos</a>
				<a href="#photos" data-role="button" class="ui-btn ui-btn-icon-left ui-icon-photos">Photos</a>
				<a href="#contact" data-role="button" class="ui-btn ui-btn-icon-left ui-icon-contact">Contact Us</a>
			</div>
				<div id="socialMedia">
					<h3>Follow us on social media</h3>
					<hr>
					<a href="https://twitter.com/venuetheatrato" class="twitter-follow-button" data-show-count="false" data-size="large">Follow 							@venuetheatrato</a>
					<script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);}}(document, 'script', 'twitter-wjs');</script>
	
					<div class="fb-like-box" data-href="https://www.facebook.com/pages/Ratoath-Community-Centre/115381095147369?fref=ts" data-colorscheme="light" data-show-faces="true" data-header="true" data-stream="false"data-width="50" data-show-border="true"></div>
				</div>
		</div>
		<div data-role="footer">
			&copy; Ratoath Community Centre
		</div>
	</div>
	<!-- End of Page: Home -->
	
	<!-- Start of Page: About -->
	<div id="about" data-role="page">
		<div data-role="header" data-position="fixed">
			<h1>About</h1>
			<a href="#home" data-icon="home" data-iconpos="notext">Home</a>
			<a href="#info" data-icon="info" data-iconpos="notext" data-rel="dialog">Info</a>
		</div>
		<div data-role="content">
			<div data-role="collapsible-set">
				<div data-role="collapsible">
					<a href="#ratoathPicture" data-rel="dialog"><img src="images/ratoath.jpg" alt="Picture of Ratoath"></a>
					<h3>About Ratoath</h3>
					<p>Ratoath is currently the third largest village in County Meath. It is also a thriving village, which has seen a 683% growth between the census of 1996 and 2006 (recording a population of 3,064 and 7,249 respectively).</p>
				</div>
				<div data-role="collapsible">
					<a href="#centrePicture" data-rel="dialog"><img src="images/centre.jpg" alt="Picture of Centre"></a>
					<h3>About Ratoath CC</h3>
					<p>Ratoath Community Centre celebrates its 7th year this September. Over the past four years thousands of local residents, of all ages, have passed through our doors for all sorts of activities as well as visiting our Venue Theatre.</p>
				</div>				
			</div>
		</div>
		<div data-role="footer" data-theme="b" data-position="fixed">
			<div data-role="navbar">
				<ul>
					<li><a href="#" data-role="button" data-theme="a" class="ui-btn ui-btn-icon-top ui-icon-about">About</a></li>
					<li><a href="#activities" data-role="button" class="ui-btn ui-btn-icon-top ui-icon-activities">Activities</a></li>
					<li><a href="#videos" data-role="button" class="ui-btn ui-btn-icon-top ui-icon-videos">Videos</a></li>
					<li><a href="#photos" data-role="button" class="ui-btn ui-btn-icon-top ui-icon-photos">Photos</a></li>
					<li><a href="#contact" data-role="button" class="ui-btn ui-btn-icon-top ui-icon-contact">Contact</a></li>
				</ul>
			</div>
		</div>
	</div>
	<!-- End of Page: About -->
		
	<!-- Start of Page: Activities -->
	<div id="activities" data-role="page">
		<div data-role="header" data-position="fixed">
			<h1>Activities</h1>
			<a href="#home" data-icon="home" data-iconpos="notext">Home</a>
			<a href="#info" data-icon="info" data-iconpos="notext" data-rel="dialog">Info</a>
		</div>
		<div data-role="content" id="postList">

		</div>
		<div data-role="footer" data-theme="b" data-position="fixed">
			<div data-role="navbar">
				<ul>
					<li><a href="#about" data-role="button" class="ui-btn ui-btn-icon-top ui-icon-about">About</a></li>
					<li><a href="#" data-role="button" data-theme="a" class="ui-btn ui-btn-icon-top ui-icon-activities">Activities</a></li>
					<li><a href="#videos" data-role="button" class="ui-btn ui-btn-icon-top ui-icon-videos">Videos</a></li>
					<li><a href="#photos" data-role="button" class="ui-btn ui-btn-icon-top ui-icon-photos">Photos</a></li>
					<li><a href="#contact" data-role="button" class="ui-btn ui-btn-icon-top ui-icon-contact">Contact</a></li>
				</ul>
			</div>
		</div>
	</div>
	<!-- End of Page: Activities -->
	
		<!-- Start of Page: Activity post -->
	<div id="activityPost" data-role="page">
		<div data-role="header" data-position="fixed">
			<h1>Activity</h1>
			<a href="#" data-role="button" data-icon="back" data-rel="back" data-iconpos="notext">Back</a>
		</div>
		<div data-role="content" id="container">
			<div id="post">
			</div>
			<div id="like">
			</div>
			<div id="tweet">
				<a href="https://twitter.com/share" class="twitter-share-button" data-url="http://dereckandnicky.com/#activities" data-text="Check out these cool activities at Ratoath Community Centre">Tweet</a>
				<script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);}}(document, 'script', 'twitter-wjs');</script>
			</div>
		</div>
	</div>
	<!-- End of Page: Activity post -->
	
	<!-- Start of Page: Videos -->
	<div id="videos" data-role="page">
		<div data-role="header" data-position="fixed">
			<h1>Videos</h1>
			<a href="#home" data-icon="home" data-iconpos="notext">Home</a>
			<a href="#info" data-icon="info" data-iconpos="notext" data-rel="dialog">Info</a>
		</div>
		<div data-role="content">
			<div class="ui-grid-a" id="videoList">
			</div>
		</div>
		<div data-role="footer" data-theme="b" data-position="fixed">
			<div data-role="navbar">
				<ul>
					<li><a href="#about" data-role="button" class="ui-btn ui-btn-icon-top ui-icon-about">About</a></li>
					<li><a href="#activities" data-role="button" class="ui-btn ui-btn-icon-top ui-icon-activities">Activities</a></li>
					<li><a href="#" data-role="button" data-theme="a" class="ui-btn ui-btn-icon-top ui-icon-videos">Videos</a></li>
					<li><a href="#photos" data-role="button" class="ui-btn ui-btn-icon-top ui-icon-photos">Photos</a></li>
					<li><a href="#contact" data-role="button" class="ui-btn ui-btn-icon-top ui-icon-contact">Contact</a></li>
				</ul>
			</div>
		</div>
	</div>
	<!-- End of Page: Videos -->
	
	<!-- Start of Page: Show video -->
	<div id="showVideo" data-role="page">
		<div data-role="header" data-position="fixed">
			<h1>Video</h1>
			<a href="#" data-role="button" data-icon="back" data-rel="back" data-iconpos="notext">Back</a>
		</div>
		<div data-role="content" id="video">
		</div>
	</div>
	<!-- End of Page: Show video -->
	
	<!-- Start of Page: Photos -->
	<div id="photos" data-role="page">
		<div data-role="header" data-position="fixed">
			<h1>Photos</h1>
			<a href="#home" data-icon="home" data-iconpos="notext">Home</a>
			<a href="#info" data-icon="info" data-iconpos="notext" data-rel="dialog">Info</a>
		</div>
		<div data-role="content">
			<div class="ui-grid-c" id="photoList">
			</div>
		</div>
		<div data-role="footer" data-theme="b" data-position="fixed">
			<div data-role="navbar">
				<ul>
					<li><a href="#about" data-role="button" class="ui-btn ui-btn-icon-top ui-icon-about">About</a></li>
					<li><a href="#activities" data-role="button" class="ui-btn ui-btn-icon-top ui-icon-activities">Activities</a></li>
					<li><a href="#videos" data-role="button" class="ui-btn ui-btn-icon-top ui-icon-videos">Videos</a></li>
					<li><a href="#" data-role="button" data-theme="a" class="ui-btn ui-btn-icon-top ui-icon-photos">Photos</a></li>
					<li><a href="#contact" data-role="button" class="ui-btn ui-btn-icon-top ui-icon-contact">Contact</a></li>
				</ul>
			</div>
		</div>
	</div>
	<!-- End of Page: Photos -->
		
	<!-- Start of Page: Show photo -->
	<div id="showPhoto" data-role="page">
		<div data-role="header" data-position="fixed">
			<h1>Photo</h1>
			<a href="#" data-role="button" data-icon="back" data-rel="back" data-iconpos="notext">Back</a>
		</div>
		<div data-role="content">
			<div id="photo">
			</div>
		</div>
	</div>
	<!-- End of Page: Show photo -->
	
	<!-- Start of Page: Contact -->
	<div id="contact" data-role="page" data-theme="a">
		<div data-role="header" data-position="fixed">
			<h1>Contact</h1>
			<a href="#home" data-icon="home" data-iconpos="notext">Home</a>
			<a href="#info" data-icon="info" data-iconpos="notext" data-rel="dialog">Info</a>
		</div>
		<div data-role="content">
			<div data-role="collapsible-set">
				<div data-role="collapsible" data-collapsed="false">
					<h3>Location</h3>
					<div id = "map-canvas">
					</div>
					<div id = "control">
						<b>Please enter you location:</b>
						<input type = "text" id = "input">
						<input type = "button" value = "Enter" onclick = "calcRoute();">	
					</div>
					<div data-role="collapsible-set">
						<div data-role="collapsible">
							<h3>Directions</h3>
							<div id = "directions-panel">
							</div>
						</div>	
					</div>
				</div>	
				<div data-role="collapsible">
					<h3>Phone</h3>
					<div data-role="collapsible-set">
						<div data-role="collapsible">
							<h3>Telephone number</h3>
							<p>01-6895600</p>
						</div>
						<div data-role="collapsible">
							<h3>Fax number</h3>
							<p>01-6895601 </p>
						</div>
					</div>

				</div>	
				<div data-role="collapsible">
					<h3>Email</h3>
					<form action="#formComplete" method="post">
						<div data-role="fieldcontain">
							<label for="firstName">First Name:</label>
							<input type="text" name="firstName" id="firstName">
						</div>
						<div data-role="fieldcontain">
							<label for="lastName">Last Name:</label>
							<input type="text" name="lastName" id="lastName">
						</div>	
						<div data-role="fieldcontain">
							<label for="email">Email Address:</label>
							<input type="text" name="email" id="email">	
						</div>						
						<div data-role="fieldcontain">
							<label for="subject">Subject:</label>
							<input type="text" name="subject" id="subject">	
						</div>
						<div data-role="fieldcontain">	
							<label for="message">Message:</label>
							<textarea name="message" id="message"></textarea>
						</div>
						<div data-role="fieldcontain">
							<label for="rating">Rate our app:</label>
							<input type="range" name="rating" id="rating" min="1" max="10" value="5">	
						</div>	
						<div data-role="fieldcontain" id="buttons">
							<input type="submit" name="submit" id="submit" value="Submit" data-inline="true">
							<input type="reset" name="reset" id="reset" value="Reset"  data-inline="true">
						</div>			
					</form>
				</div>									
			</div>
		</div>
		<div data-role="footer" data-theme="b" data-position="fixed">
			<div data-role="navbar">
				<ul>
					<li><a href="#about" data-role="button" class="ui-btn ui-btn-icon-top ui-icon-about">About</a></li>
					<li><a href="#activities" data-role="button" class="ui-btn ui-btn-icon-top ui-icon-activities">Activities</a></li>
					<li><a href="#videos" data-role="button" class="ui-btn ui-btn-icon-top ui-icon-videos">Videos</a></li>
					<li><a href="#photos" data-role="button" class="ui-btn ui-btn-icon-top ui-icon-photos">Photos</a></li>
					<li><a href="#" data-role="button" data-theme="a" class="ui-btn ui-btn-icon-top ui-icon-contact">Contact</a></li>
				</ul>
			</div>
		</div>
	</div>
	<!-- End of Page: Contact -->


	<!-- Start of Page: Form Completion -->
	<div id="formComplete" data-role="page">
		<div data-role="header">
			<h1>Form status</h1>
		</div>
		<div data-role="content">
		<?php				
			if(isset($_POST['firstName']) && isset($_POST['lastName']) && isset($_POST['email']) && isset($_POST['subject']) && isset($_POST['message']) && isset($_POST['rating'])){
				$first_name = $_POST['firstName'];
				$last_name = $_POST['lastName'];
				$email = $_POST['email'];
				$subject = $_POST['subject'];
				$rating = $_POST['rating'];
				$message = $_POST['message'];
				
				$full = 'Rated your app: ' . $rating  . "\r\n" . 'Message: ' . $message;
		
				
				if(!empty($first_name) && !empty($last_name) && !empty($email) && !empty($subject) && !empty($message)){
					$to = 'b00058026@student.itb.ie';
					$headers = 'From: '.$email;
					if(mail($to, $subject, $full, $headers)){
						echo 'Thank you for your email, we will be in contact with you soon';
					}
					
					else{
						echo 'Sorry an error has occured. Please try again later';
					}
				}
				
				else{
					echo 'All fields must be filled.';
				}
			}
			
		?>	

		</div>
	</div>
	<!-- End of Page: Centre Picture -->
	
	<!-- Start of Page: Info -->
	<div id="info" data-role="page">
		<div data-role="header">
			<h1>Information</h1>
		</div>
		<div data-role="content">
			<p>This web application contains all the informtion you need to keep up to date with Ratoath Community Centre.</p>
			<a href="#" data-role="button" data-icon="back" data-rel="back" data-inline="true">Back</a>
			<a href="#home" data-role="button" data-icon="home" data-inline="true">Home</a>
		</div>
	</div>
	<!-- End of Page: Info -->
	
	<!-- Start of Page: Ratoath Picture -->
	<div id="ratoathPicture" data-role="page">
		<div data-role="header">
			<h1>Ratoath</h1>
		</div>
		<div data-role="content">
			<img src="images/ratoath.jpg" alt="Picture of Ratoath">
			<a href="#" data-role="button" data-icon="back" data-rel="back">Back</a>
		</div>
	</div>
	<!-- End of Page: Ratoath Picture -->
	
	<!-- Start of Page: Centre Picture -->
	<div id="centrePicture" data-role="page">
		<div data-role="header">
			<h1>Centre</h1>
		</div>
		<div data-role="content">
			<img src="images/centre.jpg" alt="Picture of Centre">
			<a href="#" data-role="button" data-icon="back" data-rel="back">Back</a>		
		</div>
	</div>
	<!-- End of Page: Centre Picture -->
	
	<!-- WordPress api -->
	<script src="http://dereckandnicky.com/wordpress/?json=recentstories&callback=listPosts" type="text/javascript"></script>
	<!-- Youtube api -->
	<script src="http://gdata.youtube.com/feeds/users/Topposcout/uploads?alt=json-in-script&max-results=10&callback=listVideos" type="text/javascript"></script>
	<!-- Flickr api -->	
	<script src="http://api.flickr.com/services/feeds/photos_public.gne?id=129037756@N04&format=json" type="text/javascript"></script>


</body>
</html>
