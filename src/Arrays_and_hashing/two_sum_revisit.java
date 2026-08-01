package Arrays_and_hashing;

import java.util.*;

public class two_sum_revisit {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        int[] arr = new int[2];
        HashMap<Integer , Integer> hashMap = new HashMap<>();

        for (int i=0 ; i<nums.length ; i++){
            int temp = target - nums[i];
            if (hashMap.containsKey(temp)){

                arr[0] = hashMap.get(temp);

                arr[1] = i;
            }else {
                hashMap.put(nums[i] , i);
            }
        }

    }
}
