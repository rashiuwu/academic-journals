<!DOCTYPE html>
<html>
<head>
    <title>Voting Eligibility</title>
</head>
<body>
    <h1>Rashi Sawardekar Roll No.- 31010924093</h1>
    <h2>Check Voting Eligibility</h2>
    <form method="POST">
        Enter Age: <input type="number" name="age" required><br><br>
        <input type="submit" value="Check">
    </form>
    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $age = $_POST['age'];
        if ($age >= 18) {
            echo "<h3>You are eligible to vote.</h3>";
        } else {
            echo "<h3>You are not eligible to vote.</h3>";
        }
    }
    ?>
</body>
</html>
