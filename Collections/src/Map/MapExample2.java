package Map;

import java.util.HashMap;
import java.util.Arrays;

public class MapExample2 {
    public static void main(String[] args) {
        // Create a HashMap and populate it with some key-value pairs
        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);

        // Print the map
        System.out.println(myMap); // {one=1, two=2, three=3}
    }
}
