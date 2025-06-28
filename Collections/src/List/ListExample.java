package List;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Create a list
        List<String> myList = new ArrayList<>();

        // Add elements to the list
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");
        myList.add("Banana");

        // Print the list
        for (String fruit : myList) {
            System.out.println(fruit);
        }
    }
}
