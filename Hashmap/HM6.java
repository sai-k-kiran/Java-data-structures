/* Java program to Check if a given array contains duplicate
   elements within k distance from each other */

import java.util.*;

public class HM6 {
    static boolean checkDuplicatesWithinK(int arr[], int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return true;
            } else {
                set.add(arr[i]);
            }

            if (i >= k) {
                set.remove(arr[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 3, 4, 2, 8, 6 };
        if (checkDuplicatesWithinK(arr, 3))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
