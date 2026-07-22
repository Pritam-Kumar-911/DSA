package Arrays_and_hashing;

import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {
        int[] nums  = {3,2,4};
        int target = 6;
        int[] arr = new int[2];

        HashMap<Integer , Integer> map = new HashMap<>();

        for (int i=0 ; i<nums.length ; i++){
            int complement = target - nums[i];

            if (map.containsKey(complement)){
                arr[1] = i;
                arr[0] = map.get(complement);
            }else {
                map.put(nums[i] , i );
            }

        }
        for (int ar : arr){
            System.out.print(ar);
        }
    }
}
