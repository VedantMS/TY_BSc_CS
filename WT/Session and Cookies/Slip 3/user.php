<?php
    session_start();

    if(!isset($_SESSION['count'])) {
        $_SESSION['count'] = 0;
    }

    if(isset($_POST['submit'])) {
        $user = $_POST['username'];
        $password = $_POST['password'];

        if($user == "Admin" && $password == "admin1234") {
            header("location: welcome.php");
        }

        else if($_SESSION['count'] >= 2) {
            echo "Login not allowed. ";
            exit();
        }

        else {
            echo "Invalid username or password. Please Try again. ";
            echo "<br> Attempt: " . ($_SESSION['count'] + 1);
            $_SESSION['count'] += 1;
        }
    }
?>

<html>
    <head> 
        <title> Slip 3.0: Username and Password </title>
    </head>

    <body>
        <h1> Enter Username and Password </h1>

        <form method = "post">
            Username: <input type = "text" name = "username" id = "username" required>
            <br><br>

            Password: <input type = "password" name = "password" id = "password" required>
            <br><br>

            <input type = "submit" name = "submit" value = "Submit">
        </form>

    </body>
</html>