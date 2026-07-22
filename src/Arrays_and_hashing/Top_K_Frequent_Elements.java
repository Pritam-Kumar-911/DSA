package Arrays_and_hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Top_K_Frequent_Elements {
    public static void main(String[] args) {
        int[] nums = {4,1,-1,2,-1,2,3};
        int k = 2;

        int[] arr = new int[k];

        HashMap<Integer , Integer> map = new HashMap<>();

        for (int i=0 ; i<nums.length ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }

        System.out.println(map);

        ArrayList<Integer> arrayList = new ArrayList<>();


        arrayList.addAll(map.keySet());
        arrayList.sort((a, b) -> map.get(b).compareTo(map.get(a)));

        System.out.println(arrayList);

        List<Integer> arr1 = arrayList.subList(0 , k);

        System.out.println(arr1);

        int[] newArr = new int[arr1.size()];


        for (int i=0 ; i < newArr.length ; i++){
            newArr[i] = arr1.get(i);
        }

        for (int ans : newArr){
            System.out.println(ans);
        }
    }
}
