abstract class Sum {
    abstract void sumOfTwo(int a, int b);
    abstract void sumOfThree(int a, int b, int c);
}

class Calculate extends Sum {
    void sumOfTwo(int a, int b) {
        System.out.println("Sum of Two = " + (a + b));
    }
    void sumOfThree(int a, int b, int c) {
        System.out.println("Sum of Three = " + (a + b + c));
    }
}

public class Main4 {
    public static void main(String[] args) {
        Calculate obj = new Calculate();
        obj.sumOfTwo(10, 20);
        obj.sumOfThree(5, 15, 25);
    }
}
