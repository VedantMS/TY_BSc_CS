<html>
    <head>
        <title> Slip 2.1 : Preferences Display </title>
    </head>
    
    <body>
        <h1> Selected Preferences </h1>
        
        <?php
            echo "Font Style: " . $_COOKIE['font'] . "<br>";
            echo "Font Size: " . $_COOKIE['fontsize'] . "<br>";
            echo "Font Color: " . $_COOKIE['fontcolor'] . "<br>";
            echo "Background Color: " . $_COOKIE['bgcolor'] . "<br>";
        ?>
        <br><br>
        <a href = "apply.php"> Apply Preferences </a>
    </body>
</html>