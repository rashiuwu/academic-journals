<!DOCTYPE html>
<html>
<head>
    <title>SQL Connection</title>
</head>
<body>
    <h1>Rashi Sawardekar Roll No.- 31010924093</h1>
    <h2>Database Connection Status</h2>
    <?php
    $servername = "localhost"; // Change if necessary
    $username = "root"; // Change if necessary
    $password = ""; // Change if necessary
    $dbname = "contact_db"; // Replace with your database name

    // Create connection
    $conn = new mysqli($servername, $username, $password, $dbname);

    // Check connection
    if ($conn->connect_error) {
        die("<p>Connection failed: " . $conn->connect_error . "</p>");
    }
    echo "<p>Connected successfully to the database.</p>";

    // Close connection
    $conn->close();
    ?>
</body>
</html>
