class Add {
    void getResult(int x, int y) {
        System.out.println("Addition = " + (x + y));
    }
}

class Multiply extends Add {
    @Override
    void getResult(int x, int y) {
        System.out.println("Multiplication = " + (x * y));
    }
}

class Divide extends Multiply {
    @Override
    void getResult(int x, int y) {
        if (y != 0)
            System.out.println("Division = " + (x / y));
        else
            System.out.println("Division by zero not possible.");
    }
}

public class Practical3 {
    public static void main(String[] args) {
        Add a = new Add();
        a.getResult(20, 10);

        Multiply m = new Multiply();
        m.getResult(20, 10);

        Divide d = new Divide();
        d.getResult(20, 10);
    }
}
