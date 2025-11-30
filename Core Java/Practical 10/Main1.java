import java.util.Scanner;

abstract class Number {
    int a, b;

    void acceptNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
    }

    abstract void calculate();
}

class Add extends Number {
    void calculate() {
        System.out.println("Addition = " + (a + b));
    }
}

class Sub extends Number {
    void calculate() {
        System.out.println("Subtraction = " + (a - b));
    }
}

public class Main1 {
    public static void main(String[] args) {
        Add addObj = new Add();
        addObj.acceptNumbers();
        addObj.calculate();

        Sub subObj = new Sub();
        subObj.acceptNumbers();
        subObj.calculate();
    }
}
