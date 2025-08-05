package Sliding_Window;

public class Max_Sum_Subarray_Size_K {
    public static void main(String[] args) {
        int[] arr = {2,5,1,8,2,9,1};
        int k = 3;
        int i=0;
        int j = 0;
        int sum = 0;
        int max = 0;
        while (j < arr.length){
            int window = j - i + 1;
            sum = sum + arr[j];
            if (window < k){
                j++;
            }
            else if (window == k) {
                max = Math.max(sum, max);
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        System.out.println(max);
    }
}
