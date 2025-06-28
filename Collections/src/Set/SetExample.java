package Set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Create a set
        Set<String> mySet = new HashSet<>();

        // Add elements to the set
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Cherry");
        mySet.add("Banana");

        // Print the set (no duplicates!)
        for (String fruit : mySet) {
            System.out.println(fruit);
        }

        // Try to add "banana" again (should not be added)
        mySet.add("banana");

        // Print the set again
        for (String fruit : mySet) {
            System.out.println(fruit);
        }
    }
}