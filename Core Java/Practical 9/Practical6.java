class Employee {
    String name;
    double basic;

    Employee(String n, double b) {
        name = n;
        basic = b;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basic);
    }
}

class HRA extends Employee {
    HRA(String n, double b) {
        super(n, b);
    }

    void calculateHRA() {
        double hra = 0.2 * basic;
        System.out.println("HRA = " + hra);
    }
}

class DA extends Employee {
    DA(String n, double b) {
        super(n, b);
    }

    void calculateDA() {
        double da = 0.1 * basic;
        System.out.println("DA = " + da);
    }
}

public class Practical6 {
    public static void main(String[] args) {
        HRA e1 = new HRA("Priya", 20000);
        e1.display();
        e1.calculateHRA();

        DA e2 = new DA("Amit", 20000);
        e2.display();
        e2.calculateDA();
    }
}
