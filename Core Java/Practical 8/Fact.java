import java.util.*;
class Fact
{
    int number;
   Fact(int num) {
       number = num;
    }

    int display() {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }


	public static void main(String[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		Fact f=new Fact(num);
		System.out.println("Factorial of " + num + " is: " + f.display());
		
	}

	
}
