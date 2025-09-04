package Sorting;

public class Merge_Sorted_Array {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        for (int i=0 ; i<n ; i++){
            if (nums1[i] == 0){
                nums1[i] = nums2[i];
            }
        }
        for (int show : nums1){
            System.out.println(show);
        }
    }
}