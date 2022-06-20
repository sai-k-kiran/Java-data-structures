// Find the largest sub array with equal no. of 0's and 1's

import java.util.HashMap;

public class HM10 {
    public static void subArraySum(int[] arr){
        int curSum =0;
        int end = -1;
        int largest = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? -1 : 1;
        }

        for(int i = 0; i < arr.length; i++){
            curSum += arr[i];

            if(curSum == 0){
                largest = i +1;
                end = i;
            }
            if(map.containsKey(curSum)){
                if(largest < i - map.get(curSum)){
                    largest = i - map.get(curSum);
                    end = i;
                }
            } else
                map.put(curSum, i);
        }

        if(end == -1){
            System.out.println("No sub array found");
        }else{
            int ending = end - largest + 1;
            System.out.println(ending+ ", " +end);
        }
        
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 1, 0, 1, 1 };

        subArraySum(arr);
    }
}
