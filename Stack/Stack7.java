// Stock span problem, O(n) time comp

import java.util.Stack;
import java.util.Arrays;

public class Stack7 {
    static void calculateSpan(int price[], int length, int new_array[]) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(0);
        new_array[0] = 1;

        for (int i = 1; i < length; i++) {
            while (!st.isEmpty() && price[st.peek()] <= price[i]) {
                st.pop();
            }

            new_array[i] = (st.isEmpty()) ? (i + 1) : (i - st.peek());
            st.push(i);
        }
    }

    static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int price[] = { 10, 4, 5, 90, 120, 80 };
        int n = price.length;
        int S[] = new int[n];

        calculateSpan(price, n, S);
        printArray(S);
    }
}
