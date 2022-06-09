// Given an array A[] and a number x, check for pair in A[] with sum as x 
// Program also outputs possible permutations of all possible pairs

import java.util.HashSet;

public class HM2 {

    public static void pairs(int[] arr, int sum) {
        HashSet<Integer> s = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int temp = sum - arr[i];

            if (s.contains(temp)) {
                System.out.println("Pairs for sum " + sum + " are: " + temp + " & " + arr[i]);
            }
            s.add(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 4, 9 };
        int x = 11;

        pairs(arr, x);
    }

}
