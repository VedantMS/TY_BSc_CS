<?php
    $data = $_GET['data'];

    $arr = array("CS", "AIML", "CC", "Sec", "MAT");

    if($data != "") {
        foreach($arr as $a) {
            if(str_contains($a, $data)) {
                echo $a . "<br>";
            }
        }
    }
?>