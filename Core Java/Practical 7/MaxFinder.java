import java.util.Scanner;

public class MaxFinder {

public static int max(int a, int b) {
return (a > b) ? a : b;
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter first number: ");
int num1 = scanner.nextInt();

System.out.print("Enter second number: ");
int num2 = scanner.nextInt();

int maximum = max(num1, num2);
System.out.println("Maximum between " + num1 + "and " + num2 + " is: " + maximum);

scanner.close();
}
}