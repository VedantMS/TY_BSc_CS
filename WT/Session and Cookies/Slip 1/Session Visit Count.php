<?php
    session_start();

    if(!isset($_SESSION['visit_count'])) {
        $_SESSION['visit_count'] = 1;
    }

    else {
        $_SESSION['visit_count']++;
    }

    echo "Session Visit Count: " . $_SESSION['visit_count'];
?>

<html>
    <head>
        <title> Slip 1: Session Visit Count </title>
    </head>
</html>