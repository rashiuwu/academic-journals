import java.util.Scanner;

class BankAccount {
float balance;
String name;

// Method to get account details
void getDetails() {
System.out.println("Account Holder: " + name);
System.out.println("Current Balance: Rs." + balance);
}

// Method to deposit money
void deposit(float amount) {
balance += amount;
System.out.println("Rs." + amount + " deposited successfully.");
}

// Method to withdraw money
void withdraw(float amount) {
if (amount <= balance) {
balance -= amount;
System.out.println("Rs." + amount + " withdrawn successfully.");
} else {
System.out.println("Insufficient balance.");
}
}
}

public class BankSystem {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
BankAccount account = new BankAccount();

// Set up basic details
System.out.print("Enter your name: ");
account.name = sc.nextLine();
System.out.print("Enter initial balance: Rs.");
account.balance = sc.nextFloat();

int choice;
do {
// Menu
System.out.println("\n--- ATM Menu ---");
System.out.println("1. Exit");
System.out.println("2. Get Account Details");
System.out.println("3. Deposit Money");
System.out.println("4. Withdraw Money");
System.out.print("Enter your choice: ");
choice = sc.nextInt();

switch (choice) {
case 1:
System.out.println("Exiting... Thank you!");
break;

case 2:
account.getDetails();
break;

case 3:
System.out.print("Enter amount to deposit: Rs.");
float depositAmount = sc.nextFloat();
account.deposit(depositAmount);
break;

case 4:
System.out.print("Enter amount to withdraw: Rs.");
float withdrawAmount = sc.nextFloat();
account.withdraw(withdrawAmount);
break;

default:
System.out.println("Invalid choice. Please try again.");
}

} while (choice != 1); // Loop runs until user selects Exit
}
}