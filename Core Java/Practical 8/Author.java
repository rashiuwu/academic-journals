import java.util.*;
class Author {
     String firstName;
     String lastName;

    Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
 
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 System.out.println("Author's first name:");
	 String fn=sc.next();
	  System.out.println("Author's last name:");
	String ln=sc.next();
        Author a= new Author(fn,ln);
        System.out.println("First Name: " + a.getFirstName());
        System.out.println("Last Name: " + a.getLastName());
    }
}

