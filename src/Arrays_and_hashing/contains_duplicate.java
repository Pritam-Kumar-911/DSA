package Arrays_and_hashing;

import java.util.Arrays;
import java.util.HashSet;

public class contains_duplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3};
        boolean flag = false;

        HashSet<Integer> set = new HashSet<>();

        for (int i=0 ; i<nums.length ; i++){
            if (set.contains(nums[i])){
                flag = true;
            }
            set.add(nums[i]);
        }
        System.out.println(flag);
    }
}
