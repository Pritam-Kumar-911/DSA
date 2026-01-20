package Sorting;

public class Sum_of_taget {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] arr = new int[2];

        int i=0;
        int j=nums.length-1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            } else {
                arr[0] = i;
                arr[1] = j;
                break;
            }
        }
        for (int num : arr){
            System.out.printf("%d,",num);
        }
    }
}
