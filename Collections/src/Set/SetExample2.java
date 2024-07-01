package Set;

import java.util.HashSet;
import java.util.Arrays;

public class SetExample2 {
    public static void main(String[] args) {
        // Create a HashSet and populate it with some values
        HashSet<Integer> mySet = new HashSet<>(Arrays.asList(1, 2, 3));
        mySet.add(4);

        // Print the set (no particular order)
        System.out.println(mySet); // {1, 2, 3, 4}
    }
}
