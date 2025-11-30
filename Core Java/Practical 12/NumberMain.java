import java.util.Scanner;

// Custom Exceptions
class OddNumberException extends Exception {
    public OddNumberException(String msg) {
        super(msg);
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String msg) {
        super(msg);
    }
}

class NumberCheck {
    public void checkNumber(int num) throws OddNumberException, NegativeNumberException {
        if(num < 0) {
            throw new NegativeNumberException("Negative number entered!");
        } else if(num % 2 != 0) {
            throw new OddNumberException("Odd number thrown exception!");
        } else {
            System.out.println("Number is even.");
        }
    }
}

class NumberMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        NumberCheck obj = new NumberCheck();
        try {
            obj.checkNumber(num);
        } catch(OddNumberException | NegativeNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
