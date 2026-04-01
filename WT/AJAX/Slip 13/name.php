<?php
    $name = $_GET['q'];

    $names = array("Rohit", "Virat", "Dhoni", "Ashwin", "Harbhajan");

    if($name == "") {
        echo "Stranger, please tell me your name. ";
    }

    else if(in_array($name, $names)) {
	echo "Hello, master " . $name . "! ";
    }

    else {
	echo $name . ", I don't know you! ";
    }
?> 