// Java program to print next greater element using stack

import java.util.Stack;
import java.util.Arrays;

public class Stack9 {

    static int[] NGE(int input[], int len) {

        int[] result = new int[input.length];
        Arrays.fill(result, -1);

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < input.length; i++) {
            while (!s.isEmpty() && input[s.peek()] < input[i]) {
                result[s.pop()] = input[i];
            }
            s.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 2, 25 };
        int n = arr.length;

        int[] as = NGE(arr, n);

        for (int i = 0; i < as.length; i++) {
            System.out.print(as[i] + ", ");
        }

        // System.out.println(NGE(arr, n));
    }
}
