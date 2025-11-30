import java.util.*;

class prac2_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int sum = n1 + n2 + n3;
        double avg = sum / 3.0;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }
}
