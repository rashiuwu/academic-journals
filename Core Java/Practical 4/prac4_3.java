import java.util.Scanner;

public class prac4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();
        int binary = 0, place = 1;

        while (num > 0) {
            int rem = num % 2;
            binary += rem * place;
            place *= 10;
            num /= 2;
        }

        System.out.println("Binary form: " + binary);
    }
}

