package Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a stack
        Stack<String> myStack = new Stack<>();

        // Add elements to the stack (including duplicates)
        myStack.push("Apple");
        myStack.push("Banana");
        myStack.push("Cherry");
        myStack.push("Banana");  // Duplicate!

        // Print the stack
        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }
    }
}
