import java.util.Scanner;

// Custom Exception
class AgeNotValidException extends Exception {
    public AgeNotValidException(String msg) {
        super(msg);
    }
}

class AgeCheck {
    public void checkAge(String name, int age) throws AgeNotValidException {
        if(age < 18) {
            throw new AgeNotValidException("Age is not valid for the driving license.");
        } else {
            System.out.println("Hello " + name + ", your age is successfully accepted.");
        }
    }
}

class AgeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        AgeCheck obj = new AgeCheck();
        try {
            obj.checkAge(name, age);
        } catch(AgeNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
