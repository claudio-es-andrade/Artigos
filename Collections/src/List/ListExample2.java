package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListExample2 {
    public static void main(String[] args) {
        // Create an ArrayList and populate it with some values
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 2, 3));
        myList.add(4);

        // Sort the list in ascending order
        Collections.sort(myList);

        // Print the sorted list
        System.out.println(myList); // [1, 2, 3, 4]
    }
}