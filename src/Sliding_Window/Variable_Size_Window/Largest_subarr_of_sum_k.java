package Sliding_Window.Variable_Size_Window;

public class Largest_subarr_of_sum_k {
    public static void main(String[] args) {
        int[] arr = {4,1,1,1,2,3,5};
        int k = 5;
        int i=0;
        int j=0;
        int sum = 0;
        int largestSum = 0;
        while (j < arr.length){
            sum = sum + arr[j];
            if (sum < k) {
                j++;
            } else if (sum == k) {
                int size = j - i + 1;
                largestSum = Math.max(largestSum,size);
                j++;
            }
            if (sum > k){
                while (sum > k){
                    sum = sum - arr[i];
                    i++;

                }
                j++;
            }
        }
        System.out.println(largestSum);
    }
}
