<?php
    session_start();

	if(isset($_POST['submit'])) {
		$_SESSION['basic'] = $_POST['basic'];
		$_SESSION['da'] = $_POST['da'];
		$_SESSION['hra'] = $_POST['hra'];
		
		header("Location: display.php");
	}
?>

<html>
    <head>
        <title> Slip 4.1: Employee Earnings </title>
    </head>
    <body>
        <h1> Enter Employee Earnings </h1>

        <form method = "post">
            Enter Basic Salary: <input type = "number" name = "basic">
            <br><br>
            Enter Dearness Allowance: <input type = "number" name = "da">
            <br><br>
            Enter House Rent Allowance: <input type = "number" name = "hra">
            <br><br><br><br>
            <input type = "submit" name = "submit" value = "Submit">
        </form>
    </body>
</html>
		