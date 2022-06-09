// Next Greater Frequency Element

import java.util.Stack;

public class Stack10 {

    public static void NGF(int[] input) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(0);

        int[] arr = new int[input.length];

        int[] freq = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i < input.length; i++) {
            freq[input[i]]++;
        }

        for (int i = 1; i < input.length; i++) {
            if (freq[input[s.peek()]] > freq[input[i]]) {
                s.push(i);
            } else {
                while (!s.isEmpty() && freq[input[s.peek()]] < freq[input[i]]) {
                    arr[s.peek()] = input[i];
                    s.pop();
                }
                s.push(i);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 2, 2, 11, 3, 3 };
        NGF(arr);
    }
}
