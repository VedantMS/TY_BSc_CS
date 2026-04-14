<?php
    $conn = pg_connect("host=localhost port=5432 dbname=tybsccs user=postgres password=godspell");

    $username = $_GET['username'];
    $password = $_GET['password'];

    $data = pg_query($conn, "select * from uname where username = '$username' and password = '$password';");
    
    $row = pg_fetch_assoc($data);

    if($row) {
        echo "Login Successful. ";
    }

    else {
        echo "Invalid Username or Password. ";
    }
?>