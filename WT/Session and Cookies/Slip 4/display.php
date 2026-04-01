<?php
    session_start();

	echo "<h1> Employee Details </h1>";
	echo "<br> Employee Number: " . $_SESSION['eno'];
	echo "<br> Name: " . $_SESSION['ename'];
	echo "<br> Address: " . $_SESSION['address'];
	echo "<br><br> Basic Salary: ₹" . $_SESSION['basic'];
	echo "<br> Dearness Allowance: ₹" . $_SESSION['da'];
	echo "<br> House Rent Allowance: ₹" . $_SESSION['hra'];
	echo "<br><br> Total Salary: ₹" . ($_SESSION['basic'] + $_SESSION['da'] + $_SESSION['hra']);
?>

<html>
    <head>
        <title> Slip 4.2: Employee Details Display </title>
    </head>
</html>