// Find top k (or most frequent) numbers in a stream

import java.util.*;

public class HM8 {
    static int find(int[] arr, int ele) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == ele)
                return i;
        return -1;
    }

    static void kTop(int[] a, int n, int k) {
        int[] top = new int[k + 1];
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < k + 1; i++)
            freq.put(i, 0);

        for (int m = 0; m < n; m++) {
            if ((freq.containsKey(a[m]))) {
                freq.put(a[m], freq.get(a[m]) + 1);
            } else
                freq.put(a[m], 1);

            top[k] = a[m];

            int i = find(top, a[m]);
            i -= 1;

            while (i >= 0) {
                if (freq.get(top[i]) < freq.get(top[i + 1])) {
                    int temp = top[i];
                    top[i] = top[i + 1];
                    top[i + 1] = temp;
                } else if ((freq.get(top[i]) == freq.get(top[i + 1])) && (top[i] > top[i + 1])) {
                    int temp = top[i];
                    top[i] = top[i + 1];
                    top[i + 1] = temp;
                } else
                    break;
                i -= 1;
            }
            for (int j = 0; j < k && top[j] != 0; ++j)
                System.out.print(top[j] + " ");
        }
    }

    public static void main(String args[]) {
        int k = 4;
        int[] arr = { 1, 3, 4, 2, 5, 2 };
        int n = arr.length;
        kTop(arr, n, k);
    }
}
