
// Java program to find maximum distance between two same occurrences of a number.
import java.io.*;
import java.util.*;

public class HM5 {
    static int maxDistance(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max_dist = 0;

        for (int i = 0; i < n; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], i);
            } else {
                max_dist = Math.max(max_dist, i - map.get(arr[i]));
            }
        }
        return max_dist;
    }

    public static void main(String args[]) {
        int[] arr = { 3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2 };
        int n = arr.length;
        System.out.println(maxDistance(arr, n));
    }
}
