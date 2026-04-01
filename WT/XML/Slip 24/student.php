<?php
	$data = <<<XML
    <?xml version="1.0" encoding="UTF-8"?>
    <Students>
        <student>
            <rollno>101</rollno>
            <name>Amit Sharma</name>
            <address>Pune</address>
            <college>Fergusson College</college>
            <course>BSc Computer Science</course>
        </student>

        <student>
            <rollno>102</rollno>
            <name>Priya Patil</name>
            <address>Mumbai</address>
            <college>MAEER's MIT Arts, Commerce and Science College</college>
            <course>BCA</course>
        </student>

        <student>
            <rollno>103</rollno>
            <name>Rahul Joshi</name>
            <address>Pune</address>
            <college>Savitribai Phule Pune University</college>
            <course>BSc Computer Science</course>
        </student>

        <student>
            <rollno>104</rollno>
            <name>Rohit Deshmukh</name>
            <address>Aurangabad</address>
            <college>MAEER's MIT Arts, Commerce and Science College</college>
            <course>BSc Data Science</course>
        </student>

        <student>
            <rollno>105</rollno>
            <name>Sneha Kulkarni</name>
            <address>Kolhapur</address>
            <college>Fergusson College</college>
            <course>BBA</course>
        </student>
    </Students>
    XML;

    $fp = fopen("student.xml", "w");
    fwrite($fp, $data);
    fclose($fp);
?>

<html>
	<head>
		<title> Slip 23: Student Details </title>
	</head>

	<body>
		<h1> Student Details </h1>

		<form method = "post">
			Select Course:	<select name = "course">
                                <option> </option>
                                <option value = "BSc Computer Science"> BSc Computer Science </option>
                                <option value = "BSc Data Science"> BSc Data Science </option>
                                <option value = "BBA"> BBA </option>
                                <option value = "BCA"> BCA </option>
                            </select>
            <br><br>
			<input type = "submit" name = "submit" value = "Submit">
		</form>

		<?php
			if(isset($_POST['submit'])) {
				$course = $_POST['course'];
				$xml = simplexml_load_file("student.xml");
				$id = 0;

				foreach($xml->student as $student) {
					if($course == $student->course) {
						if($id == 0) {
                            echo "<h3> Students Details: <h3>";
                        
                            echo "<table border = '1'>";
						
							echo	"<tr>
                                        <th>Roll No.</th>
                                        <th>Name</th>
                                        <th>Address</th>
                                        <th>College</th>
                                        <th>Course</th>
								    </tr>";
						}

						echo "<tr>";
						foreach($student->children() as $child=>$value) {
							echo "<td>" . $value . "</td>";
						}
						echo "</tr>";
						$id++;
					}
				}
			}
		?>
	</body>
</html>
							