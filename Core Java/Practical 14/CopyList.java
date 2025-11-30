import java.util.*;

class CopyList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Mango");

        List<String> list2 = new ArrayList<>(list1);

        System.out.println("List1: " + list1);
        System.out.println("List2 (copied): " + list2);
    }
}
