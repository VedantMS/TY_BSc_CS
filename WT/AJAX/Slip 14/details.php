<?php
    $name = $_GET['q'];

    $conn = pg_connect("host=localhost port=5432 dbname=tybsccs user=postgres password=godspell");
    $data = pg_query($conn, "select * from teacher where tname = '$name';");

    $row = pg_fetch_assoc($data);
    
    echo "Number: " . $row['tno'] . "<br>";
    echo "Name: " . $row['tname'] . "<br>";
    echo "Qualification: " . $row['qua'] . "<br>";
    echo "Salary: " . $row['sal'] . "<br>";
?>