<?php
	$dom = new DOMDocument();
	$dom->load("movie.xml");

	echo "<h1> Movie Details </h1>";

	foreach($dom->getElementsByTagName("Movie") as $movie) {
        echo "<br><br> <b> Movie Details: </b> <br>";
		echo "Movie Name: " . $movie->getElementsByTagName("MovieTitle")->item(0)->nodeValue;
		echo "<br> Actor Name: " . $movie->getElementsByTagName("ActorName")->item(0)->nodeValue;
	}
?>

<html>
    <head>
        <title> Slip 7: Movie Details </title>
    </head>
</html>