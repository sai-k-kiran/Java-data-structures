// Minimum delete operations to make all elements of array same

import java.util.Arrays;

public class Arr3 {
    public static void minDelete(int[] arr) {
        int[] freq = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        Arrays.sort(freq);

        System.out.println("Min delete operations: " + (arr.length - freq[freq.length - 1]));
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5, 6 }; // 5

        int[] arr = { 4, 4, 3, 5, 3, 2, 1 }; // 4

        minDelete(arr);
    }
}

/*
 * ALGORITHM
 * Count the element that occurs most in the array(i.e 4 in above ex).
 * Ans is Total elements in array - frequency of most frequent elem
 */