import java.util.Scanner;

class Room {

int roomNo;
String roomType;
float roomArea;
boolean ACmachine;


public void setData(int roomNo, String roomType, float roomArea, boolean ACmachine) {
this.roomNo = roomNo;
this.roomType = roomType;
this.roomArea = roomArea;
this.ACmachine = ACmachine;
}


public void displayData() {
System.out.println("Room Number: " + roomNo);
System.out.println("Room Type: " + roomType);
System.out.println("Room Area: " + roomArea + " sq.ft");
System.out.println("AC Available: " + (ACmachine ? "Yes" : "No"));
}


public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Room myRoom = new Room();


System.out.print("Enter Room Number: ");
int number = sc.nextInt();
sc.nextLine(); 

System.out.print("Enter Room Type (e.g., Single/Double): ");
String type = sc.nextLine();

System.out.print("Enter Room Area (in sq.ft): ");
float area = sc.nextFloat();

System.out.print("Is AC Available? (true/false): ");
boolean ac = sc.nextBoolean();


myRoom.setData(number, type, area, ac);
System.out.println("\n--- Room Details ---");
myRoom.displayData();
}
}