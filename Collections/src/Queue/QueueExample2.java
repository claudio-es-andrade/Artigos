package Queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;

public class QueueExample2 {
    public static void main(String[] args) {
        // Create an ArrayDeque (queue) and populate it with some values
        ArrayDeque<Integer> myQueue = new ArrayDeque<>(Arrays.asList(1, 2, 3));

        // Add another value to the end of the queue
        myQueue.add(4);

        // Print the initial state of the queue (FIFO order)
        System.out.println("Initial queue: " + myQueue); // [1, 2, 3]

        // Remove elements from the front of the queue one by one
        while (!myQueue.isEmpty()) {
            System.out.print(myQueue.poll() + " "); // 1 2 3 4
        }
    }
}
