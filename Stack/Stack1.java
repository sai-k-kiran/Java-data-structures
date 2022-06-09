// Java code for stack implementation

import java.io.*;
import java.util.*;

class Stack1 {
    static void stack_push(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    static void stack_pop(Stack<Integer> stack) {
        System.out.println("Pop Operation:");

        for (int i = 0; i < 5; i++) {
            Integer y = (Integer) stack.pop();
            // int y = stack.pop(); OR YOU CAN DO LIKE THIS
            System.out.println(y);
        }
    }

    static void stack_peek(Stack<Integer> stack) {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
    }

    static void stack_search(Stack<Integer> stack, int element) {
        Integer pos = (Integer) stack.search(element);
        // int pos = stack.search(element); OR YOU CAN DO LIKE THIS

        if (pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " + pos);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        // stack_push(stack);
        // stack_pop(stack);
        // stack_push(stack);
        // stack_peek(stack);
        // stack_search(stack, 2);
        // stack_search(stack, 6);
        stack.add(3); // appends 3 to the top of stack
        stack.add(7);
        stack.add(2);
        stack.add(0, 9); // Adds 9 at 0th index
        System.out.println(stack.empty()); // False

        System.out.println(stack.capacity()); // 10

        System.out.println(stack.peek()); // 2

        System.out.println(stack.pop()); // 2

        System.out.println(stack.contains(9)); // true

        System.out.println(stack);
    }
}
