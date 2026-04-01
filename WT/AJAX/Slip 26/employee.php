<?php
	$name = $_GET['q'];
	$conn = pg_connect("host=localhost port=5432 dbname=tybsccs user=postgres password=godspell");
	$data = pg_query($conn, "select * from employee where ename = '$name';");
	$row = pg_fetch_assoc($data);

	echo "Employee Number: " . $row['eno'] . "<br>";
	echo "Name: " . $row['ename'] . "<br>";
	echo "Designation: " . $row['designation'] . "<br>";
	echo "Salary: " . $row['salary'];
?>