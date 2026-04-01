<?php
    $f = fopen("contact.dat", "r");

    echo "<table border = '1'>";
    echo    "<tr>
                <th>Sr. No.</th>
                <th>Name</th>
                <th>Residence Number</th>
                <th>Mobile Number</th>
                <th>Address</th>
            </tr>";

    while(!feof($f)) {
        $row = fgets($f);
        $row = explode(",", $row);
        
        echo "<tr>";

        foreach($row as $value) {
            echo "<td>" . $value . "</td>";
        }

        echo "</tr>";
    }

    echo "</table>";
?>