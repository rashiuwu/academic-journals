<!DOCTYPE html>
<html>
<head>
    <title>Display Name and Email</title>
</head>
<body>
    <h1>Rashi Sawardekar Roll No.- 31010924093</h1>
    <h2>Enter Name and Email</h2>
    <form method="POST">
        Name: <input type="text" name="name" required><br><br>
        Email: <input type="email" name="email" required><br><br>
        <input type="submit" value="Submit">
    </form>
    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $name = $_POST['name'];
        $email = $_POST['email'];
        echo "<h3>Entered Details:</h3>";
        echo "Name: $name <br>";
        echo "Email: $email <br>";
    }
    ?>
</body>
</html>
