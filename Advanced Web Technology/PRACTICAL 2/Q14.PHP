<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
    <h1>Rashi Sawardekar Roll No.- 31010924093</h1>
    <h2>Simple Calculator</h2>
    <form method="POST">
        Number 1: <input type="number" name="num1" required><br><br>
        Number 2: <input type="number" name="num2" required><br><br>
        Operation: 
        <select name="operation">
            <option value="add">Addition (+)</option>
            <option value="sub">Subtraction (-)</option>
            <option value="mul">Multiplication (*)</option>
            <option value="div">Division (/)</option>
        </select>
        <br><br>
        <input type="submit" value="Calculate">
    </form>
    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $num1 = $_POST['num1'];
        $num2 = $_POST['num2'];
        $operation = $_POST['operation'];
        $result = 0;

        switch ($operation) {
            case "add":
                $result = $num1 + $num2;
                break;
            case "sub":
                $result = $num1 - $num2;
                break;
            case "mul":
                $result = $num1 * $num2;
                break;
            case "div":
                $result = $num2 != 0 ? $num1 / $num2 : "Cannot divide by zero";
                break;
        }
        echo "<h3>Result: $result</h3>";
    }
    ?>
</body>
</html>
