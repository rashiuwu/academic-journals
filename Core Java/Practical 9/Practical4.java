class A {
    int x, y;

    A(int a, int b) {
        x = a;
        y = b;
    }

    void display() {
        System.out.println("Values from Class A: x = " + x + ", y = " + y);
    }
}

class B extends A {
    int z;

    B(int a, int b, int c) {
        super(a, b);
        z = c;
    }

    @Override
    void display() {
        System.out.println("Values from Class B: x = " + x + ", y = " + y + ", z = " + z);
    }
}

public class Practical4 {
    public static void main(String[] args) {
        A obj1 = new A(10, 20);
        obj1.display();

        B obj2 = new B(10, 20, 30);
        obj2.display();
    }
}
