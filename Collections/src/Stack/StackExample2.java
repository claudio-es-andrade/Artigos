package Stack;

import java.util.ArrayDeque;
import java.util.Collections;

public class StackExample2 {
    public static void main(String[] args) {
        // Create an ArrayDeque (stack) and populate it with some values
        ArrayDeque<Integer> myStack = new ArrayDeque<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        // Print the initial state of the stack (LIFO order)
        System.out.println("Initial stack: " + myStack); // [3, 2, 1]

        // Remove elements from the top of the stack one by one
        while (!myStack.isEmpty()) {
            System.out.print(myStack.pop() + " "); // 3 2 1
        }
    }
}
