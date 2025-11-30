import java.util.*;
class Addition {
    int a, b;

    Addition(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int add() {
        return a + b;
    }

    void display() {
        int result = add();
        System.out.println("Addition of " + a + " and " + b + " is: " + result);
    }


    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter two number: ");	
	int num1=sc.nextInt();
	int num2=sc.nextInt();
        Addition obj = new Addition(num1,num2);
        obj.display();
    }
}
