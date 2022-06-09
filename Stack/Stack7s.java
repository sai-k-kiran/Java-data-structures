// Stock span problem without stack, O(n) time comp

import java.util.Stack;
import java.util.Arrays;

public class Stack7s {
    static void calculateSpan(int price[], int length, int new_array[]) {
        new_array[0] = 1;

        for (int i = 1; i < length; i++) {
            int counter = 1;
            while ((i - counter) >= 0 && price[i] >= price[i - counter]) {
                counter += new_array[i - counter];
            }
            new_array[i] = counter;
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
