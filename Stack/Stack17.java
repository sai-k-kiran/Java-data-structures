// Delete array elements which are smaller than next or become smaller
// Delete the i+1 element if i elem is smaller than i+1 element

// [5,2,4,3,7] --> see that 2 < 4, so delete 4. 
// 5 is not smaller than 2, so dont delete 5

import java.util.Stack;

public class Stack17 {
    public static void deleteElements(int[] input, int k) {
        Stack<Integer> s = new Stack<Integer>();

        s.push(input[0]);
        int count = 0;

        for (int i = 1; i < input.length; i++) {
            while (!s.empty() && s.peek() < input[i] && count < k) {
                s.pop();
                count++;
            }
            s.push(input[i]);
        }

        int m = s.size();
        int[] v = new int[m];

        for (int i = m - 1; i >= 0; i--) {
            v[i] = s.pop();
        }

        for (Integer x : v) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 4, 3, 7 };
        deleteElements(arr, 2);
    }
}
