import java.util.Scanner;

public class CountNo {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] numbers = new int[10];

System.out.println("Enter 10 numbers:");
for (int i = 0; i < 10; i++) {
numbers[i] = sc.nextInt();
}

int positiveCount = 0;
int negativeCount = 0;
int zeroCount = 0;

for (int num : numbers) {
if (num > 0) {
positiveCount++;
} else if (num < 0) {
negativeCount++;
} else {
zeroCount++;
}
}

System.out.println("Positive numbers count: " +
positiveCount);
System.out.println("Negative numbers count: " +
negativeCount);
System.out.println("Zero count: " + zeroCount);

sc.close();
}
}