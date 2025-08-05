package Sliding_Window.Variable_Size_Window;

public class Max_Ascending_Subarray_Sum {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 5, 10, 50};
        int i = 0;
        int j = 0;
        int sum = nums[0];
        int max = nums[0];

        while (j < nums.length - 1) { // avoid index out of bounds
            if (nums[j + 1] > nums[j]) {
                j++;
                sum += nums[j];
            } else {
                max = Math.max(max, sum);
                j++;
                sum = nums[j]; // reset sum to current element
            }
        }

        max = Math.max(max, sum); // check at the end
        System.out.println(max);
    }
}
