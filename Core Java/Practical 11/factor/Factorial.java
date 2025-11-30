// Save inside folder 'factor'
package factor;

public class Factorial {
    // Method to calculate and display factorial
    public void calculateFactorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
