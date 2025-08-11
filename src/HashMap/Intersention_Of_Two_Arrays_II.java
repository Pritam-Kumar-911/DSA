package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Intersention_Of_Two_Arrays_II {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        ArrayList<Integer> arr = new ArrayList<>();
        int freq = 1;
        HashMap<Integer , Integer> Count = new HashMap<>();

        for (int i=0 ; i<nums1.length ; i++){

        Count.put( nums1[i], Count.getOrDefault(nums1[i] , 0) + 1);

        }

        for (int i=0 ; i<nums2.length ; i++){
            if (Count.containsKey(nums2[i])){
                arr.add(nums2[i]);
                Count.put(nums2[i] , Count.get(nums2[i]) - 1);
                if (Count.get(nums2[i]) == 0){
                    Count.remove(nums2[i]);
                }
            }
        }
        int[] arr1 = new int[arr.size()];
        for (int i=0 ; i<arr1.length ; i++){
            arr1[i] = arr.get(i);
        }

    }
}
