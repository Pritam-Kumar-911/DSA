
package Arrays_and_hashing;

import java.util.HashMap;
import java.util.HashSet;

public class contains_duplicate_II {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        boolean flag = false;

        HashMap<Integer , Integer> hashmap = new HashMap<>();

        for (int i=0 ; i < nums.length ; i++){
            if (hashmap.containsKey(nums[i])){
                int ans = hashmap.get(nums[i]);
                System.out.println(i - ans);
                if (i - ans <= k){
                    flag = true;
                }
                hashmap.put(nums[i] , i);
            }else {
                hashmap.put(nums[i] , i);
            }
        }
        System.out.println(flag);
    }
}
