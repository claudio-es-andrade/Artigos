package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        // Create a double-ended queue (deque)
        Deque<String> myDeque = new ArrayDeque<>();

        // Add elements to the deque
        myDeque.addFirst("Apple");
        myDeque.addLast("Banana");
        myDeque.addLast("Cherry");
        myDeque.addLast("Banana");

        // Print the deque (FIFO at both ends)
        while (!myDeque.isEmpty()) {
            String firstElement = myDeque.peekFirst();
            if (myDeque.size() > 1) { // verificar se a fila possui mais de um elemento
                myDeque.pollLast();
            } else {
                myDeque.pollFirst();
            }
            System.out.println(firstElement);
        }
    }
}