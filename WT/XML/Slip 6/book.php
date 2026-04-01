<?php
	$xml = simplexml_load_file("book.xml");

	echo "<h1> " . $xml->getName() . "</h1> <br>";

	foreach($xml->book as $book) {
		echo "<h3> Book Details: </h3>";
		
		foreach($book->attributes() as $attr=>$value) {
			echo $attr . ": " . $value . "<br>";
		}
		
		foreach($book->children() as $child=>$value) {
			echo $child . ": " . $value . "<br>";
		}
	}
?>

<html>
    <head>
        <title> Slip 6: Book Details </title>
    </head>
</html>