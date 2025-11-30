import java.util.Scanner;

class Number {
    int a, b;
    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
    }
}

interface Arithmetic {
    void add();
    void sub();
}

class Calculation extends Number implements Arithmetic {
    public void add() {
        System.out.println("Addition = " + (a + b));
    }
    public void sub() {
        System.out.println("Subtraction = " + (a - b));
    }
}

public class Main3 {
    public static void main(String[] args) {
        Calculation calc = new Calculation();
        calc.getData();
        calc.add();
        calc.sub();
    }
}
