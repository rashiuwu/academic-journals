class StudentPersonal {
    String name;
    int age;
    String address;

    StudentPersonal(String n, int a, String addr) {
        name = n;
        age = a;
        address = addr;
    }

    void displayPersonal() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

class StudentEducational extends StudentPersonal {
    String course;
    double percentage;

    StudentEducational(String n, int a, String addr, String c, double p) {
        super(n, a, addr);
        course = c;
        percentage = p;
    }

    void displayEducational() {
        displayPersonal();
        System.out.println("Course: " + course);
        System.out.println("Percentage: " + percentage + "%");
    }
}

public class Practical5 {
    public static void main(String[] args) {
        StudentEducational s = new StudentEducational("Rashi", 19, "Mumbai", "BSc IT", 98.5);
        s.displayEducational();
    }
}
