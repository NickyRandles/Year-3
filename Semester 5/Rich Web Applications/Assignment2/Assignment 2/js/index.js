// Wordpress javascript
function listPosts(data){
	var output = '<ul data-role="listview" data-filter="true">';
	
	$.each(data.posts, function(key, val){
		output += '<li>';
		output += '<a href = "#activityPost" onclick="showPost(' + val.id + ');" data-transition="slide">';
		if(val.thumbnail == null){
			output += '<img src = "images/noImage.jpg" alt="No image available">';
		}
		else{
			output += '<img src = "' + val.thumbnail + '"' + 'alt = "' + val.title +  '">';
		}
		output += '<h3>' + val.title + '</h3>';
		output += '<p>' + val.excerpt + '</p>';
		output += '</a>';
		output += '</li>';
	});
	output += '</ul>';
	
	$('#postList').html(output);
	
}

function showPost(id){
		$.getJSON('http://dereckandnicky.com/wordpress/?json=get_post&post_id=' + id + '&callback=?', function(data){
			var output = '';
			output += '<h3>' + data.post.title + '</h3>';
			output += data.post.content;
	
			$('#post').html(output);
			
			//facebook like button
			var url = data.post.url.substring(39);
			var output2 = '';
			output2 += '<iframe src="//www.facebook.com/plugins/like.php?href=http%3A%2F%2Fdereckandnicky.com%2Fwordpress%2F%3Fp%3D' + url +'&amp;width&amp;layout=button_count&amp;action=like&amp;show_faces=true&amp;share=false&amp;height=21&amp;appId=1734121413479924" scrolling="no" frameborder="0" style="border:none; overflow:hidden; height:21px;" allowTransparency="true"></iframe>';	
			
			$('#like').html(output2);
			
		});
				
}

//Youtube javascript
function listVideos(data){
	var output = '';
	
	for(var i=0; i < data.feed.entry.length; i++){
		var title = data.feed.entry[i].title.$t;
		var thumbnail = data.feed.entry[i].media$group.media$thumbnail[0].url;
		var id = data.feed.entry[i].id.$t.substring(38);
		var description = data.feed.entry[0].media$group.media$description.$t;

		var blocktype = ((i % 2)===1) ? 'b' : 'a';
		
		output += '<div class="ui-block-' + blocktype + '">';
		output += '<a href="#showVideo" data-transition="flip" onclick="playVideo(\'' +  id +'\',\'' + title + '\',\'' + escape(description) + '\')">';
		output += '<h5>' + title + '</h5>';
		output += '<img src="' + thumbnail + '" alt="' + title + '" id="thumbnail">';
		output += '</a>';
		output += '</div>';
	}
	
	$('#videoList').html(output);

}

function playVideo(id, title, description){
	var output = '<iframe width="560" height="315" src="//www.youtube.com/embed/' + id + '" frameborder="0" allowfullscreen></iframe>'
	output += '<h1>' + title + '</h1>';
	output += '<p>' + unescape(description) + '</p>';
	
	$('#video').html(output);
}

//Flickr javascript
function jsonFlickrFeed(data){
	var output = '';
	for(var i = 0; i < data.items.length; i++){
		var url = data.items[i].media.m.substring(0,58);
		var blocktype = ((i % 3)===2) ? 'c':((i % 3)===1) ? 'b' : 'a';
		output += '<div class="ui-block-' + blocktype + '">';
		output += '<a href="#showPhoto" onclick="showPhoto(\'' + url + '\')" data-transition="pop" >';
		output += '<img src="' + url + 'q.jpg">';
		output += '</div>';
	}
	
	$('#photoList').html(output);
}

function showPhoto(url){
		var output = '<a href="#photos">';
		output += '<img src="' + url + 'b.jpg">';
		output += '</a>';
		$('#photo').html(output);
}
