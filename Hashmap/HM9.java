// Find the subarray with the given sum

import java.util.HashMap;

public class HM9 {
    public static void subArraySum(int[] arr, int sum){
        int curSum =0;
        int start = 0;
        int end = -1;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            curSum += arr[i];
            if(curSum - sum == 0){
                start = 0;
                end = i;
                break;
            }
            if(map.containsKey(curSum - sum)){
                start = map.get(curSum - sum) +1;
                end = i;
                break;
            }
            map.put(curSum, i);
        }
        if(end == -1){
            System.out.println("No sub array found");
        }else{
            System.out.println(start+ ", " +end);
        }
        
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, -5, 15, -10, 5};

        subArraySum(arr, 35);
    }
}
