// Minimum delete operations to make all elements of array same
// See Arr3.java for same program using only array

import java.util.*;

public class HM3 {
    public static int minDelete(int[] arr, int n) {

        HashMap<Integer, Integer> s = new HashMap<>();

        for (int i = 0; i < n; i++) {
            s.put(arr[i], s.getOrDefault(arr[i], 0) + 1);
        }
        int maxF = 0;
        for (Map.Entry<Integer, Integer> entry : s.entrySet()) {
            maxF = Math.max(maxF, entry.getValue());
        }
        return n - maxF;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 4, 4, 3, 3, 3, 4 };
        int n = arr.length;

        System.out.println("Min delete operations: " + minDelete(arr, n));
    }
}
// Map.Entry<Integer, Integer> entry : s.entrySet()
// We are creating a set view of the hashmap s.

// maxF = Math.max(maxF, entry.getValue())
// This line finds the max frequency 