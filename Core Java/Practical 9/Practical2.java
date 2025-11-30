import java.util.Scanner;

class Number {
    int a, b;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
    }
}

class CAdd extends Number {
    void add() {
        System.out.println("Addition = " + (a + b));
    }
}

class Sub extends CAdd {
    void sub() {
        System.out.println("Subtraction = " + (a - b));
    }
}

public class Practical2 {
    public static void main(String[] args) {
        Sub obj = new Sub();
        obj.accept();
        obj.add();
        obj.sub();
    }
}
