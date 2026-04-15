<html>
    <head>
        <title> Slip 2.2 : Preferences Apply </title>
    </head>
    
    <body style = "font-style: <?php echo $_COOKIE['font']; ?>;
                    font-size: <?php echo $_COOKIE['fontsize']; ?>px;
                    color: <?php echo $_COOKIE['fontcolor']; ?>;
                    background-color: <?php echo $_COOKIE['bgcolor']; ?>;">

        <h1> Applied Preferences </h1>
        
        <?php
            echo "Font Style: " . $_COOKIE['font'] . "<br>";
            echo "Font Size: " . $_COOKIE['fontsize'] . "<br>";
            echo "Font Color: " . $_COOKIE['fontcolor'] . "<br>";
            echo "Background Color: " . $_COOKIE['bgcolor'] . "<br>";
        ?>
    </body>
</html>