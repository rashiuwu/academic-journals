import java.util.Scanner;

class Book {
    String author, name;
    float price;

    void getDetails(Scanner sc) {
        System.out.print("Enter Author Name: ");
        author = sc.nextLine();
        System.out.print("Enter Book Name: ");
        name = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextFloat();
        sc.nextLine();  // consume leftover newline after reading float
    }

    void displayDetails() {
        System.out.println("Author: " + author + ", Book: " + name + ", Price: Rs." + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[3];

        for (int i = 0; i < 3; i++) {
            books[i] = new Book();
            System.out.println("\nEnter details of Book " + (i + 1));
            books[i].getDetails(sc);
        }

        System.out.println("\nBook Information:");
        for (int i = 0; i < 3; i++) {
            books[i].displayDetails();
        }
        sc.close();
    }
}
