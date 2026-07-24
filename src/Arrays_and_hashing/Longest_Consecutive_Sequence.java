package Arrays_and_hashing;

import java.util.Arrays;
import java.util.HashSet;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {

        int[] nums = {1,0,1,2};
        int output = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int i=0 ; i<nums.length ; i++) {
            set.add(nums[i]);
        }

//        for (int i=0 ; i< nums.length; i++){
//            int max = 0;
//            if (set.contains(nums[i] - 1)){
//                continue;
//            }else {
//                int length = 1;
//                while (set.contains(nums[i]+length)){
//                    length++;
//                }
//                max = length;
//            }
//            output = Math.max(output , max);
//        }
        for (int num : set) {
            if (set.contains(num - 1)) {
                continue;
            }
            int length = 1;
            while (set.contains(num + length)) {
                length++;
            }
            output = Math.max(output, length);
        }
        System.out.println(output);
    }
}
