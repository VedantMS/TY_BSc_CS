<?php
	$data = <<<XML
	<?xml version = "1.0" encoding = "UTF-8"?>
	<CricketTeams>
		<Team country = "Australia">
			<player>David Warner</player>
			<runs>7500</runs>
			<wickets>10</wickets>
		</Team>

		<Team country = "Australia">
			<player>Steve Smith</player>
			<runs>9000</runs>
			<wickets>20</wickets>
		</Team>
	</CricketTeams>
	XML;

	$fp = fopen("cricket.xml", "w");
	fwrite($fp, $data);
	fclose($fp);
?>

<?php
	$xml = simplexml_load_file("cricket.xml");

	$team = $xml->addChild("Team");
	$team->addAttribute("country", "India");
	$team->addChild("player", "Virat kohli");
	$team->addChild("runs", "14000");
	$team->addChild("wickets", "8");

	$team = $xml->addChild("Team");
	$team->addAttribute("country", "India");
	$team->addChild("player", "Sachin Tendulkar");
	$team->addChild("runs", "18426");
	$team->addChild("wickets", "154");

	$xml->asXML("cricket.xml");

    echo "Data added successfully to cricket.xml";
?>

<html>
    <head>
        <title> Slip 25: Cricket Teams </title>
    </head>
</html>