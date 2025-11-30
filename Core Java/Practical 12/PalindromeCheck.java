import java.util.Scanner;

class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        System.out.println("Length of string: " + str.length());
        
        String rev = new StringBuilder(str).reverse().toString();
        
        if(str.equalsIgnoreCase(rev)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
