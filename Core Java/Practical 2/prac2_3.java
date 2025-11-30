import java.util.Scanner;
public class prac2_3 {
       public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter percentage: ");
double marks = sc.nextDouble();
if (marks < 40) {
      System.out.println("Grade: F");
} else if (marks >= 40 && marks < 60) {
   System.out.println("Grade: C");
} else if (marks >= 60 && marks < 80) {
    System.out.println("Grade: B");
} else if (marks >= 80 && marks <= 100) {
    System.out.println("Grade: A");
} else {
   System.out.println("Invalid percentage entered!");
}
}
}
