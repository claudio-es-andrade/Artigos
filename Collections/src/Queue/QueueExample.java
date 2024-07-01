package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a queue
        Queue<String> myQueue = new LinkedList<>();

        // Add elements to the queue (including duplicates)
        myQueue.add("Apple");
        myQueue.add("Banana");
        myQueue.add("Cherry");
        myQueue.add("Banana");  // Duplicate!

        // Print the queue
        while (!myQueue.isEmpty()) {
            System.out.println(myQueue.poll());
        }
    }
}
