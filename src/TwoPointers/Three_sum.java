package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_sum {
    public static void main(String[] args) {
         int[] nums = {-1,0,1,2,-1,-4};
         List<List<Integer>> list = new ArrayList<>();


         Arrays.sort(nums);

         for(int i=0 ; i<nums.length ; i++){
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int left = i+1;
            int right = nums.length-1;
            
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] == 0) {
                    
                    List<Integer> newList = new ArrayList<>();
                    newList.add(nums[i]);
                    newList.add(nums[left]);
                    newList.add(nums[right]);
                    list.add(newList);
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }
                else if(nums[i] + nums[left] + nums[right] > 0){
                    right--;
                }else{
                    left++;
                }
            }
         }
         System.out.println(list);
    }
}
