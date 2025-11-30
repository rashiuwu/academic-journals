import java.util.Scanner;

public class MethodOverloading {

public static int square(int num) {
return num * num;
}

public static double square(double num) {
return num * num;
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter an integer: ");
int intNum = scanner.nextInt();

System.out.print("Enter a double: ");
double doubleNum = scanner.nextDouble();

System.out.println("Square of integer " + intNum + "is: " + square(intNum));
System.out.println("Square of double " + doubleNum + " is: " + square(doubleNum));

scanner.close();
}

}