import java.util.Scanner;

class Number {
    int length, breadth;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextInt();
        System.out.print("Enter breadth: ");
        breadth = sc.nextInt();
    }
}

class Area extends Number {
    void calculate() {
        int area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }
}

public class Practical1 {
    public static void main(String[] args) {
        Area obj = new Area();
        obj.accept();
        obj.calculate();
    }
}
