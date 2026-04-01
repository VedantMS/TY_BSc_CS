<?php
    if(isset($_POST['submit'])) {
        setcookie("font", $_POST['font'], time() + 3600);
        setcookie("fontsize", $_POST['fontsize'], time() + 3600);
        setcookie("fontcolor", $_POST['fontcolor'], time() + 3600);
        setcookie("bgcolor", $_POST['bgcolor'], time() + 3600);

        header("location: display.php");
    }
?>

<html>
    <head>
        <title> Slip 2.0 : Preferences </title>
    </head>
    
    <body>
        <h1> Select Preferences </h1>
        
        <form method = "post">
            Font Style: <select name = "font">
                            <option value = "Arial"> Arial </option>
                            <option value = "Times New Roman"> Times New Roman </option>
                            <option value = "Courier New"> Courier New </option>
                        </select>
            <br><br>
            Font Size: <input type = "number" name = "fontsize">
            <br><br>
            Font Color: <input type = "color" name = "fontcolor">
            <br><br>
            Background Color: <input type = "color" name = "bgcolor">
            <br><br><br><br>
            <input type = "submit" value = "Submit" name = "submit">
        </form>
</html>