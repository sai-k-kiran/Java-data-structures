// Sort a stack using a temporary stack

import java.util.Stack;

public class Stack13 {
    public static void sortStack(Stack<Integer> input) {

        Stack<Integer> tempStack = new Stack<Integer>();

        while (!input.isEmpty()) {
            int temp = input.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > temp) { // NOTE
                int topOfTemp = tempStack.pop();
                input.push(topOfTemp);
            }
            tempStack.push(temp);
        }
        System.out.println(tempStack);
    }

    public static void main(String[] args) {
        Stack<Integer> input = new Stack<Integer>();

        input.add(2);
        input.add(1);
        input.add(4);
        input.add(3);

        System.out.println(input);

        sortStack(input);
    }
}

// NOTE - this equation gives asc order sorting.
// For desc order, change the arrow