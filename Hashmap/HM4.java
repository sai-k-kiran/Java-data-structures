// JAVA Code For Minimum operation to make all elements equal in array

import java.util.*;

public class HM4 {
    public static int minOperation(int arr[], int n) {
        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (hash.containsKey(arr[i])) {
                hash.put(arr[i], hash.get(arr[i]) + 1);
            } else {
                hash.put(arr[i], 1);
            }
        }
        // put() maps the given key to the value
        // get() method returns the value corresponding to the key

        int max_count = 0;
        Set<Integer> s = hash.keySet();
        // keySet() creates a set of "keys" from a hashmap

        for (int i : s) {
            if (max_count < hash.get(i)) {
                max_count = hash.get(i);
            }
        }

        return (n - max_count);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 5, 2, 3 };
        int n = arr.length;
        System.out.print(minOperation(arr, n));

    }
}
