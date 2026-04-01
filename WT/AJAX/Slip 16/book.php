<?php
    $title = $_GET['q'];
    $xml = simplexml_load_file("book.xml");

    foreach($xml->book as $book) {
        if($title == $book->title) {
            echo "<h3> Book Details: </h3>";

            foreach($book->children() as $child=>$value) {
                echo $child . ": " . $value . "<br>";
            }

            break;
        }
    }
?>