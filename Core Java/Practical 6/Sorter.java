import java.util.Arrays;
import java.util.Collections;

public class Sorter {
private Integer[] data;

public Sorter(Integer[] data) {
this.data = data;
}

public void asec() {
Arrays.sort(data);
}

public void desc() {
Arrays.sort(data, Collections.reverseOrder());
}

public void display() {
for (int num : data) {
System.out.print(num + " ");
}
System.out.println();
}

public static void main(String[] args) {
Integer[] numbers = {5, 2, 9, 1, 7};

Sorter sorter = new Sorter(numbers);

System.out.print("Original data: ");
sorter.display();

sorter.asec();
System.out.print("Sorted ascending: ");
sorter.display();

sorter.desc();
System.out.print("Sorted descending: ");
sorter.display();
}
}