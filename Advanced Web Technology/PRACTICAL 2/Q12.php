<!DOCTYPE html>
<html>
<head>
    <title>Prime Number Check</title>
</head>
<body>
    <h1>Rashi Sawardekar Roll No.- 31010924093</h1>
    <h2>Prime Number Check</h2>
    <form method="GET">
        Enter a number: <input type="number" name="num" required>
        <input type="submit" value="Check">
    </form>
    <?php
    if (isset($_GET['num'])) {
        $num = $_GET['num'];
        $is_prime = true;

        if ($num < 2) {
            $is_prime = false;
        } else {
            for ($i = 2; $i <= sqrt($num); $i++) {
                if ($num % $i == 0) {
                    $is_prime = false;
                    break;
                }
            }
        }

        echo "<p>$num is " . ($is_prime ? "a prime number." : "not a prime number.") . "</p>";
    }
    ?>
</body>
</html>
