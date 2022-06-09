// Find whether an array is subset of another array

import java.util.Arrays;

public class Array2 {
    public static boolean isSubset(int arr1[], int arr2[], int m, int n) {
        if (m < n) {
            return false;
        }

        int i = 0, j = 0;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                j++;
            } else if (arr1[i] == arr2[j]) {
                j++;
                i++;
            } else if (arr1[i] > arr2[j]) {
                return false;
            }
        }

        if (j < n) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 8, 4, 9, 6, 1 };
        int[] arr2 = { 6, 8, 4 };

        if (isSubset(arr1, arr2, arr1.length, arr2.length)) {
            System.out.println("Array2 is a subset of Array1");
        } else {
            System.out.println("Array2 is not a subset of Array1");
        }
    }
}
