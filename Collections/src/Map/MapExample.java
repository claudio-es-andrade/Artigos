package Map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Create a map
        Map<String, Integer> myMap = new HashMap<>();

        // Add key-value pairs to the map
        myMap.put("Apple", 1);
        myMap.put("Banana", 2);
        myMap.put("Cherry", 3);
//        myMap.put("Banana", 4);
        // Print the map
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
