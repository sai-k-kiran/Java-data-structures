// Sorting array using Stacks

import java.util.Stack;

public class Stack16 {
    public static Stack<Integer> sortArray(Stack<Integer> input) {
        Stack<Integer> tempStack = new Stack<Integer>();

        while (!input.empty()) {
            int temp = input.pop();
            while (!tempStack.empty() && tempStack.peek() < temp) {
                input.push(tempStack.peek());
                tempStack.pop();
            }
            tempStack.push(temp);
        }
        return tempStack;
    }

    static void sortArrayUsingStacks(int[] arr, int n) {
        Stack<Integer> input = new Stack<Integer>();

        for (int i = 0; i < n; i++) {
            input.push(arr[i]);
        }

        Stack<Integer> tmpStack = sortArray(input);

        for (int i = 0; i < n; i++) {
            arr[i] = tmpStack.peek();
            tmpStack.pop();
        }
    }

    public static void main(String[] args) {
        int[] s = { 2, 7, 4, 6, 9 };

        sortArrayUsingStacks(s, s.length);

        for (int i = 0; i < s.length; i++)
            System.out.print(s[i] + " ");
    }
}
