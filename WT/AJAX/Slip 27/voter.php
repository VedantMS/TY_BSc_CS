<?php
    $name = $_GET['name'];
    $age = $_GET['age'];
    $nationality = $_GET['nationality'];

    

    if($age < 18) {
        echo "Voter is not eligible to vote.";
    }

    else if($nationality != "INDIAN") {
        echo "Voter is not eligible to vote.";
    }
    
    else {
        $name = explode(" ", $name);
        
        $flag = true;

        foreach($name as $n) {
            if(ctype_upper($n) == false) {
                echo "Voter is not eligible to vote.";
                $flag = false;
                break;
            }
        }

        if($flag) {
            echo "Voter is eligible to vote.";
        }
    }
?>