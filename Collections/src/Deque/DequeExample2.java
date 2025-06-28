package Deque;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;

public class DequeExample2 {
    public static void main(String[] args) {
        // Create an ArrayDeque (double-ended queue) and populate it with some values
        ArrayDeque<Integer> myDeque = new ArrayDeque<>(Arrays.asList(1, 2, 3));

        // Add another value to the end of the deque
        myDeque.add(4);

        // Print the initial state of the deque (FIFO order)
        System.out.println("Initial deque: " + myDeque); // [1, 2, 3]

        // Add another value to the front of the deque
        myDeque.addFirst(0);

        // Print the updated state of the deque (FIFO order)
        System.out.println("Updated deque: " + myDeque); // [0, 1, 2, 3]

        // Remove elements from both ends of the deque one by one
        while (!myDeque.isEmpty()) {
            if (myDeque.size() > 1) {
                System.out.print(myDeque.pollLast() + " "); // 2 3
            } else {
                System.out.println(myDeque.poll()); // 0
            }
        }
    }
}
