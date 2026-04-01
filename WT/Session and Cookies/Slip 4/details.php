<?php
	session_start();
	if(isset($_POST['submit'])) {
		$_SESSION['eno'] = $_POST['eno'];
		$_SESSION['ename'] = $_POST['ename'];
		$_SESSION['address'] = $_POST['address'];
		
		header("Location: earnings.php");
	}
?>

<html>
    <head>
        <title> Slip 4.0: Employee Details </title>
    </head>
    
    <body>
        <h1> Enter Employee Details </h1>

        <form method = "post">
            Enter Employee Number: <input type = "number" name = "eno">
            <br><br>
            Enter Name: <input type = "text" name = "ename">
            <br><br>
            Enter Address: <input type = "text" name = "address">
            <br><br><br><br>
            <input type = "submit" name = "submit" value = "Submit">
        </form>
    </body>
</html>